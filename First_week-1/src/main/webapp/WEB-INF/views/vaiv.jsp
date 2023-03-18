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
</head>
<body>


  
  <div>
    <div class="card">
      <div class="card-header">기자회견 조회하기</div>
      <div class="card-body">
        <form target="_blank" action='/vaiv' >
          <div class="form-group">
            <div class="row">
              <div class="col">
                <input type="text" name="from_date" id="from_date" class="form-control" placeholder='yyyy-dd-yy'>
              </div>
              <div class="col">
                <input type="text" name="to_date" id="to_date" class="form-control" placeholder="yyyy-dd-yy">
              </div>
              <div class="m_col">
                <input type="text" name="name" id="name" class="form-control">
              </div>
              <div class="m_col">
                <input type="text" name="party" id="party" class="form-control">
              </div>
              <div class="m_col">
                <button type="submit" class="btn btn-primary">조회</button>
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
      
      <div id="timeline"></div>
      
      
    </div>
  </div>
</body></html>