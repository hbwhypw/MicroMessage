    <%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
        <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
<script src="../../ueditor.parse.js" type="text/javascript"></script>
<script>
        uParse('.content',{
            'rootPath': '../'
        })
</script>
<%
request.setCharacterEncoding("utf-8");
response.setCharacterEncoding("utf-8");
String title = request.getParameter("title");
String author = request.getParameter("author");
String summary = request.getParameter("summary");
String content = request.getParameter("myEditor");



response.getWriter().println("第1个编辑器的值");
response.getWriter().println("<div class='content'>title " + title + "</div>");
response.getWriter().println("<div class='content'>author " + author + "</div>");
response.getWriter().println("<div class='content'>summary " + summary + "</div>");
response.getWriter().println("<div class='content'>content " + content + "</div>");

%>