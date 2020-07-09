package br.com.soc.exame.action;


import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.dao.Dao;

public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = -146601914103585418L;
	String cpf;
	String msg;
	Dao dao = new Dao();

	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteExame(cpf);;
			if (isDeleted > 0) {
				msg = "DELETADO COM SUCESSO";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
	}

	

	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}

