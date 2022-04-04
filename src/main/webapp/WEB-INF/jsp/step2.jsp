<%@ page language="java"%>
<%@ taglib prefix="bean" uri="http://jakarta.apache.org/struts/tags-bean" %>
<%@ taglib prefix="html" uri="http://jakarta.apache.org/struts/tags-html" %>
<html>
<head>
    <title>Step 2</title>
</head>
<body>
    Step 2: <bean:write name="step2Form" property="value"/><br/>
    <html:form action="step1">
        <html:submit>Till step1</html:submit>
    </html:form>
</body>
</html>
