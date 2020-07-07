<%@taglib prefix="s" uri="/struts-tags"%>

<html>
<head>
<title>Exames</title>
<style>
table, td, th {border: 1px solid black;}
table {border-collapse: collapse;width: 60%;}
th {height: 30px;}
.button-update {background-color: #008CBA;color: white;}
.button-delete {background-color: red;color: white;}
</style>
</head>
<body>
	<h2>SOC - Teste EXAME</h2>
	<div style="margin-top: 40px;">
		<s:if test="noData==true">
			<table>
				<thead>
					<tr style="background-color: #E0E0E1;">
						<th>C�digo</th>
						<th>Nome</th>
						<th>CPF</th>
						<th>Email</th>
						<th>Telefone</th>
						<th>Resultado</th>
						<th>Action</th>
					</tr>
				</thead>
				<s:iterator value="exames">
					<tr>
						<td><s:property value="id" /></td>
						<td><s:property value="nome" /></td>
						<td><s:property value="cpf" /></td>
						<td><s:property value="email" /></td>
						<td><s:property value="telefone" /></td>
						<td><s:property value="resultado" /></td>
						<td>
							<a href="updatedetails.action?submitType=updatedata&id=<s:property value="id"/>">
								<button class="button-update">Update</button>
							</a>
							<a href="deleterecord.action?id=<s:property value="id"/>">
								<button class="button-delete">Delete</button>
							</a>
						</td>
					</tr>
				</s:iterator>
			</table>
		</s:if>
		<s:else>
			<div style="color: red;">No Data Found.</div>
		</s:else>
	</div>
</body>
</html>