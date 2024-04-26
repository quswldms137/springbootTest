<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>detail Page</h1>
    <hr>
    <div>
        <table border="1">
            <tr>
                <th>bno</th><th>title</th><th>content</th><th>writer</th><th>regdate</th>
            </tr>
            <c:forEach var="dto" items="${list}">
            <tr>
                <td>${dto.bno}</td>
                <td>${dto.title}</td>
                <td>${dto.content}</td>
                <td>${dto.writer}</td>
                <td>${dto.regdate}</td>
                <td><a href="delete?bno=${dto.bno}">삭제</a></td>
            </tr>
            </c:forEach>
        </table>
    </div>
    
    <a href="list">목록보기</a>
</body>
</html>    