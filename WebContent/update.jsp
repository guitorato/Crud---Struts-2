<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>SOC - Teste EXAME</h2>
	<s:form action="updateExame.action" method="post" >
		
		
		<s:textfield label="Nome" name="nome" />
		<s:textfield label="CPF" name="cpf" />
		
		<s:textfield label="Telefone" name="telefone" />
		<s:textfield label="Email" name="email" />
		<s:textfield label="Resultado" name="resultado" />
				
		<s:submit cssClass="button-register" value="Atualizar" />
	
	</s:form>
	
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>