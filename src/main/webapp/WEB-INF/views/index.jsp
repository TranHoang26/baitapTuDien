<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title></title>
</head>
<body>
<h2>Dictionary</h2>


<h2>Tra cứu từ điển Anh - Việt</h2>
<form action="dictionaly" method="get">
    <label for="word">Nhập từ tiếng Anh:</label>
    <input type="text" id="word" name="word" ><br><br>
    <input type="submit" value="Tra cứu">
</form>



<h2>Kết quả tra cứu</h2>
<c:if test="${not empty meaning}">
    <p>Nghĩa của từ <b>${word}</b>: ${meaning}</p>
</c:if>
<c:if test="${not empty message}">
    <p>${message}</p>
</c:if>
<a href="/">Quay lại</a>
</body>
</html>