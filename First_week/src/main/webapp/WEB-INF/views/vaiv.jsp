<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"><html><head><META http-equiv="Content-Type" content="text/html; charset=utf-8"><style></style></head><body><u></u>

  
    
    
    
  
  <div>
    <div class="m_card">
      <div class="m_card-header">기자회견 조회하기</div>
      <div class="m_card-body">
        <form target="_blank">
          <div class="m_form-group">
            <div class="m_row">
              <div class="m_col">
                <input type="text" name="from_date" id="m_from_date" class="m_form-control">
              </div>
              <div class="m_col">
                <input type="text" name="to_date" id="m_to_date" class="m_form-control">
              </div>
              <div class="m_col">
                <input type="text" name="name" id="m_name" class="m_form-control">
              </div>
              <div class="m_col">
                <input type="text" name="party" id="m_party" class="m_form-control">
              </div>
              <div class="m_col">
                <button type="submit" class="m_btn m_btn-primary">조회</button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </div>
    <div id="m_title" style="text-align:center;font-size:16px;font-weight:bold;margin:12px 0px">
      <span>타임라인 제목 영역</span>
    </div>
    
    <div id="m_wrapper" style="overflow:auto;height:600px">
      
      <div id="m_timeline"></div>
    </div>
  </div>
</body></html>