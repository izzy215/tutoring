<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<META http-equiv="Content-Type" content="text/html; charset=utf-8">


<style>
</style>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://unpkg.com/d3-milestones/build/d3-milestones.css">
<script src="https://unpkg.com/d3-milestones/build/d3-milestones.min.js"></script>
 <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
 <style>
 #timeline { min-width: 550px;
 			min-height: 550px; }
 
 </style>
<script>

  
  $(document).ready(function(){
	  $('body').on('.milestones__group__label-horizontal',)
	  
	 // 버튼 클릭 이벤트 핸들러 등록
	    $("button").click(function(){
	    	
	    	const fromdate = $('#from_date').val();
	    	const todate = $('#to_date').val();
	    	const name = $('#name').val();
	    	const party = $('#party').val();
	    	
	    	const data = 
	    		{from_date:fromdate,
	    			to_date:todate,
	    			name:name,
	    			party:party}
	    		//`from_data=${fromdate}&to_data=${todate}&name=${name}&party=${party}`

	    	console.log(data)
	    	let title = "전체 타임라인"
	    		if (name){
	    			title = name+" 기자회견 타임라인"
	    		}else if(party){
	    			title = party+" 기자회견 타임라인";
	    		}else if(fromdate){
	    			title = fromdate+" 이후 타임라인";
	    		}else if(todate){
	    			title = todate + " 이전 타임라인";
	    		}else if(fromdate&&todate){
	    			title = fromdate+"~"+todate+" 타임라인";
	    		}
	    		
	    	
	    	
	        // AJAX 요청 보내기
	        $.ajax({
	            url: "${pageContext.request.contextPath}/vaiv2",
	            type: "post",
	            data:data,
	            dataType: "json",
	            success: function(response){
	                console.log(response);
	                $('span').remove();
	                $('#title').text(title);
	                console.log(response);
	                
	                milestones('#timeline')
	                .mapping({
	                  'timestamp': 'year',
	                  'text': 'title'
	                })
	                .parseTime('%Y')
	                .aggregateBy('year')
	                .render([
	                  { year: 789, title: 'Vikings begin attacks on England.' },
	                  { year: 840, title: 'Vikings found Dublin in Ireland.' },
	                  { year: 1050, title: 'The city of Oslo is founded in Norway.' },
	                  { year: 1066, title: 'Battle of Hastings.' }
	                ]);
	                $('.milestones__group__label-horizontal').css({"width":"40px"})
	                
	            },
	            error: function(jqXHR, textStatus, errorThrown){
	                // 요청이 실패한 경우 처리할 코드
	                console.log("AJAX 요청 실패: " + textStatus + " - " + errorThrown);
	            }
	        });
	    });
	});
</script>

</head>
<body>


  
  <div>
    <div class="card">
      <div class="card-header">기자회견 조회하기</div>
      <div class="card-body">
        <form target="_blank" >
          <div class="form-group">
            <div class="row">
              <div class="col">
                <input type="text" id="from_date" name="from_date" id="from_date" class="form-control" placeholder='yyyy-dd-yy'>
              </div>
              <div class="col">
                <input type="text" id="to_date" name="to_date" id="to_date" class="form-control" placeholder="yyyy-dd-yy">
              </div>
              <div class="m_col">
                <input type="text" id="name" name="name" id="name" class="form-control" placeholder="이름">
              </div>
              <div class="m_col">
                <input type="text" id="party" name="party" id="party" class="form-control" placeholder="정당">
              </div>
              <div class="m_col">
                <button type="button" class="btn btn-primary">조회</button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </div>
    <div id="title" style="text-align:center;font-size:16px;font-weight:bold;margin:12px 0px">
    
      <span>타임라인 제목 영역</span>
    
    </div>
    
    <div id="wrapper" style="overflow:auto;height:600px">
      
      <div id="timeline" ></div>
      
      
    </div>
  </div>
</body></html>