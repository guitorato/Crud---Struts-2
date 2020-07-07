package br.com.soc.exame.action;

import java.sql.ResultSet;


import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.bean.Exame;
import br.com.soc.exame.dao.Dao;

public class UpdateAction extends ActionSupport {

	private static final long serialVersionUID = -1905974197186620917L;
	private int id = 0;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public String getSubmitType() {
		return submitType;
	}

	public void setSubmitType(String submitType) {
		this.submitType = submitType;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
