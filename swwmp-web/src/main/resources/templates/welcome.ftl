<#import "layout/defaultLayout.ftl" as layout>
<@layout.myLayout>
<div class="container">
    <div class="page-header">
        <h1>Sprint Boot: Hello</h1>
    </div>

    <div>
        Date: ${time?date}
        <br>
        Time: ${time?time}
        <br>
        Message: ${message}
    </div>
    <ul>
    	<@testDirective>
			<#list testList as item>
				<li>${item}</li>
			</#list>
		</@testDirective>
    </ul>
</div>

</@layout.myLayout>
