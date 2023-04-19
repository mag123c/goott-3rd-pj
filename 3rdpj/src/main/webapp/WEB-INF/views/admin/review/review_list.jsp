<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>리뷰 목록</title>
</head>
<body>
<h1>리뷰 목록</h1>
<p>
  <form>
      <input type="text" placeholder="검색" name="keyword" value="${keyword}">
      <input type="submit" value="검색">
  </form>
</p>
<table>
  <thead>
  <tr>
    <th>번호</th>
    <th>사진</th>
    <th>작성자</th>
    <th>삭제여부</th>
    <th>최초등록일</th>
    <th>업데이트날짜</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="row" items="${data}">
    <tr>
      <td>${row.review_idx}</td>
      <td>
        <a href="/admin/reviewdetail?review_idx=${row.review_idx}">
          <img src="${row.review_img}" height="200px" width="200px" style="border: 1px solid red";>
        </a>
      </td>
      <td>${row.user_id}</td>
      <td>y/n</td>
      <td>
        <fmt:parseDate value="${row.create_date}" pattern="yyyy-MM-dd'T'HH:mm:ss" var="create_date" />
        <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${create_date}"/>
      </td>
      <td>
        <fmt:parseDate value="${row.update_date}" pattern="yyyy-MM-dd'T'HH:mm:ss" var="update_date" />
        <fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${update_date}"/>
      </td>
    </tr>
  </c:forEach>
  </tbody>
</table>

</body>
</html>
