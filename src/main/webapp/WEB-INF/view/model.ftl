<!DOCTYPE html>
<html>
<head lang="zh">
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="../../resources/css/webModel.css">
    <title><#if title??>${title} <#else> </#if></title>
</head>
<body>
    <h3>
        <#if title??>${title} <#else> </#if>
    </h3>
    <#if uuid??>${uuid}<#else> </#if>
    <span class="time">${date?string("yyyy-MM-dd")} </span>
    <span class="author">${author}</span>
    <#if content??>${content}<#else>when-missing.</#if>
</body>
</html>