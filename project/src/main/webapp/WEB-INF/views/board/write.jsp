<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="pageNav" tagdir="/WEB-INF/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글쓰기</title>
<script type="text/javascript">
$(function(){
   $("#cancelBtn").click(function(){
      history.back();
      });
});
</script>
</head>
<body>
<!-- SB Admin2의 내용 출력 구조 -->
<div class="card shadow md-4">
   <div class="car-header py-3">
      게시판 글쓰기 폼
   </div>
   <div class="card-body">
      <form action="write.do" method="post" id="writeForm">
         <input type="hidden" name="perPageNum" value="${param.perPageNum }">
         <div class="form-group">
            <label for="title">제목</label>
            <input class="form-control" id="title" name="title">
         </div>
         <div class="form-group">
            <label for="writer">작성자</label>
            <input class="form-control" id="writer" name="writer">
         </div>
         <div class="form-group">
            <label for="content">내용</label>
            <textarea class="form-control" id="content" name="content"></textarea>
         </div>
         <div class="form-group">
            <label for="pw">비밀번호</label>
            <input class="form-control" id="pw" name="pw" type="password">
         </div>
         <div class="form-group">
            <label for="pw2">비밀번호 확인</label>
            <input class="form-control" id="pw" name="pw" type="password">
         </div>
         <button class="btn btn-info">등록</button>
         <button class="btn btn-info" type="reset">새로입력</button>
         <button class="btn btn-info" type="button" id="cancelBtn">취소</button>
      </form>
   </div>
</div>

</body>
</html>