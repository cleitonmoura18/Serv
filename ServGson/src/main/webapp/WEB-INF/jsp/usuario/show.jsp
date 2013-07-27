<head>
	<title>Usuario [show]</title>
</head>
<body>
	<p>
		<b>Name:</b>
		${usuario.name}
	</p>

	<a href="${pageContext.request.contextPath}/usuarios/${usuario.id}/edit">Edit</a>
	<a href="${pageContext.request.contextPath}/usuarios">Back</a>
</body>