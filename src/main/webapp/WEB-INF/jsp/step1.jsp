<%@ page language="java"%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<html>
<head>
    <title>Step 1</title>
</head>
<body>
	Step 1: <bean:write name="step1Form" property="value"/> <br/>
    <html:form action="step2">
        <html:submit>Till step2</html:submit>
    </html:form>
</body>
</html>
