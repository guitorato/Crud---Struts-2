package br.com.soc.exame.action;

import java.sql.ResultSet;


import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.bean.Exame;
import br.com.soc.exame.dao.Dao;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620917L;
	private String nome="";
	private String cpf="";
	private String telefone="";
	private String email="";
	private String resultado="";
	private String msg = "";
	ResultSet rs = null;
	Dao dao = new Dao();
	String submitType;
	Exame exame = new Exame();

	@Override
	public String execute() throws Exception {
		try {
			if (submitType.equals("updatedata")) {
				rs = dao.fetchExame(exame.getId());
				if (rs != null) {
					while (rs.next()) {
						nome = rs.getString("nome");
						cpf = rs.getString("cpf");
						telefone = rs.getString("telefone");
						email = rs.getString("email");
						resultado = rs.getString("resultado");
					}
				}
			} else {
				int i = dao.updateExame(nome, cpf, telefone, email, resultado);
				if (i > 0) {
					msg = "Record Updated Successfuly";
				} else {
					msg = "error";
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "UPDATE";
	}

}
