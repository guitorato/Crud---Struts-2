package br.com.soc.exame.action;

import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.dao.Dao;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 2139116285823340125L;
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	private String resultado;
	private String msg = "";
	Dao dao = new Dao();
	int ctr = 0;

	@Override
	public String execute() throws Exception {
		dao = new Dao();

		try {
			ctr = dao.registerExame(nome, cpf, telefone, email, resultado);
			if (ctr > 0) {
				msg = "Registration Successfull";
			} else {
				msg = "Some error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "REGISTER";
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

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public int getCtr() {
		return ctr;
	}

	public void setCtr(int ctr) {
		this.ctr = ctr;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
