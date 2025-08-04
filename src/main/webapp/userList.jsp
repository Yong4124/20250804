<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원 목록</title>
</head>
<body>
<h2>회원 목록</h2>
<table border="1" cellpadding="5" cellspacing="0">
    <tr>
        <th>이름</th>
        <th>주소</th>
        <th>이메일</th>
        <th>전화번호</th>
    </tr>
<%
    String jdbcURL = "jdbc:mysql://localhost:3305/user_db?useUnicode=true&characterEncoding=UTF-8";
    String dbUser = "root";
    String dbPassword = "1234";

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
        stmt = conn.createStatement();
        rs = stmt.executeQuery("SELECT username, address, email, cel FROM users");

        while (rs.next()) {
%>
    <tr>
        <td><%= rs.getString("username") %></td>
        <td><%= rs.getString("address") %></td>
        <td><%= rs.getString("email") %></td>
        <td><%= rs.getString("cel") %></td>
    </tr>
<%
        }
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<tr><td colspan='4'>목록 조회 중 오류: " + e.getMessage() + "</td></tr>");
    } finally {
        try {
            if (rs != null) rs.close();
            if (stmt != null) stmt.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
</table>

<br>
<a href="index.jsp">← 메인으로 돌아가기</a>
</body>
</html>
