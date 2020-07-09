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
		
		<label>Nome</label><br />      
		<input type="text" name="nome" value='<s:property value="nome"/>'><br />  
		
		<label>CPF</label><br />  
		<input type="number"  name="cpf" value='<s:property value="cpf"/>'><br />  
		           
		<label>EMAIL</label><br />  
		<input type="email" name="email" value='<s:property value="email"/>'><br />  
		
		<label>Telefone</label><br />  
		<input type="tel" name="telefone" value='<s:property value="telefone"/>'><br />  
		
		<label for="resultado">Resultado:</label><br />  
			<select name="resultado" <s:property value="resultado"/>>
				  <option value="CONFIRMADO">CONFIRMADO</option>
				  <option value="NEGADO">NEGADO</option>
				 
			</select><br />  <br />  
		
		
		
		<button name="submitType" value="update" type="submit" 
			onclick="return confirm('DESEJA FAZER ALTERAÇÃO DOS DADOS?')">ATUALIZAR</button>
		
	</form>
	
	<s:if test="ctr>0">
		<span style="color: red;"><s:property value="msg" /></span>
	</s:if>
	<s:else>
		<span style="color: red;"><s:property value="msg" /></span>
	</s:else>
</body>
</html>