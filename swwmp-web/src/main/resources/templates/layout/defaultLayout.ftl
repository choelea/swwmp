<#assign base = request.contextPath />
<#macro myLayout>
<!DOCTYPE html>
	<html lang="zh-CN">
	<head>
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="author" content="fyunli">
	
	    <base id="base" href="${base}">
	    <title>Spring Boot - hello</title>
	
	    <!-- Bootstrap core CSS -->
	    <link href="//cdn.jsdelivr.net/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	    <link href="${base}/css/main.css" rel="stylesheet">
	
	    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
	    <script src="//cdn.jsdelivr.net/html5shiv/3.7.3/html5shiv.min.js"></script>
	    <script src="//cdn.jsdelivr.net/respond/1.4.2/respond.min.js"></script>
	    <![endif]-->
	</head>
    <body style="width:100%;height:100%">
      <table border="1" cellspacing="0" cellpadding="0" style="width:100%;height:100%">
        <tr>
          <td colspan="2">
            <#include "header.ftl"/>
          </td>
        </tr>
        <tr>
          <td>
            <#include "menu.ftl"/>
          </td>
          <td>
            <#nested/>
          </td>
        </tr>
        <tr>
          <td colspan="2">
            <#include "footer.ftl"/>
          </td>
        </tr>
      </table>
	<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
	<script src="//cdn.jsdelivr.net/ie10-viewport/1.0.0/ie10-viewport.min.js"></script>
	<script src="//cdn.jsdelivr.net/jquery/1.12.1/jquery.min.js"></script>
	<script src="//cdn.jsdelivr.net/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    </body>
  </html>
</#macro>