<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!!!
</h1>

<P>  The time on the server is ${serverTime}. </P>
<ul>
	<li><a href="<c:url value='/echo' />">エコーアプリケーションへ</a></li>
</ul>
</body>
</html>
