package br.com.soc.exame.action;


import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.dao.Dao;

public class DeleteAction extends ActionSupport {

	private static final long serialVersionUID = -146601914103585418L;
	int id; 
	String msg;
	Dao dao = new Dao();

	@Override
	public String execute() throws Exception {
		try {
			int isDeleted = dao.deleteExame(id);;
			if (isDeleted > 0) {
				msg = "Record deleted successfully";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "DELETE";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

