<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Update</title>
</head>
<body>
	<h2>SOC - Teste EXAME</h2>
		<a href=readExame><button class="button-report" type="button">EXAMES</button></a>
		<hr />
		
	<form action=updateExame method="post">
		<pre>
		<label>Nome</label>        
		<input type="text" name="nome" value='<s:property value="nome"/>'>
		
		<label>CPF</label>
		<input type="text"  name="cpf" value='<s:property value="cpf"/>'>
		           
		<label>EMAIL</label>
		<input type="text" name="email" value='<s:property value="email"/>'>
		
		<label>Telefone</label>
		<input type="tel" name="telefone" value='<s:property value="telefone"/>'>
		
		<label for="resultado">Resultado:</label>
			<select name="resultado" <s:property value="resultado"/>>
				  <option value="CONFIRMADO">confirmado</option>
				  <option value="NEGADO">Negado</option>
				 
			</select>
		
		
		
		
		
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