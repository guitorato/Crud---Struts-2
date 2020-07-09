<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Cadastrar - Exame</title>
<style type="text/css">
.button-register {background-color: green;color: white;}
.button-report {background-color: #000000;color: white;margin-left: 30%;}
</style>
</head>
<body>
	<h2>SOC - Teste EXAME</h2>
	<a href=readExame><button class="button-report" type="button">EXAMES</button></a>
	<s:form action="registerExame.action" method="post">
		<hr />
		
		<s:textfield label="Nome" name="nome" />
		<s:textfield type="number" label="CPF" name="cpf" />
		<s:textfield label="Telefone" name="telefone" />
		<s:textfield type="email" label="Email" name="email" />
		<s:select name = "resultado" label = "Resultado"
            list = "{'CONFIRMADO','NEGADO'}" />
				
		<s:submit cssClass="button-register" value="Registrar" />
		
	</s:form>
	<s:if test="ctr>0">
		<span style="color: green;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>