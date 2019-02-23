<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>入力画面</h2>
	<form:form modelAttribute="echoForm">
		<div>ユーザ名を入力してください。</div>
		<div>
			<form:input path="userName"/>
			<form:errors path="userName"/>
		</div>
		<div>パスワードを入力してください。</div>
		<div>
			<form:input path="password"/>
			<form:errors path="password"/>
		</div>
		<div>
			<form:button>送信</form:button>
		</div>
	</form:form>
</body>
</html>