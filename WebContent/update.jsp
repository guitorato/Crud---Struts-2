<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>SOC - Teste EXAME</h2>
	<form action=updateExame method="post">
		<pre>
<b>Nome:         </b><input type="text" name="nome" value='<s:property value="nome"/>'>
		
<b>CPF:  </b><input type="text" name="cpf" value='<s:property value="cpf"/>'>
		
<b>Email:        </b><input type="email"  name="uemail" value='<s:property value="email"/>'>
		            <input type="hidden" name="uemailhidden" value='<s:property value="uemail"/>'>
				
<b>Telefone:  </b><input type="text" name="telefone" value='<s:property value="telefone"/>'>

<b>Resultado:  </b><input type="text" name="resultado" value='<s:property value="resultado"/>'>		
		
		<button name="submitType" value="update" type="submit">Update</button>
		</pre>
	</form>
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>