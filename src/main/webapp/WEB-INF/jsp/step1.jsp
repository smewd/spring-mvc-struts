<%@ page language="java"%>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<html> 
	<head>
		<title>Step 1</title>
	</head>
	<body>
	    <html:link action="/step2">step 2</html:link>

		<html:form action="/test">
            <html:submit property="action">button_step2</html:submit>
		</html:form>
	</body>
</html>