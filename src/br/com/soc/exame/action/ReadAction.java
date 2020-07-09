package br.com.soc.exame.action;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

import br.com.soc.exame.bean.Exame;
import br.com.soc.exame.dao.Dao;

public class ReadAction extends ActionSupport {

	private static final long serialVersionUID = 6329394260276112660L;
	ResultSet rs = null;
	Exame exame = null;
	List<Exame> exames = null;
	Dao dao = new Dao();
	private boolean noData = false;

	@Override
	public String execute() throws Exception {
		try {
			exames = new ArrayList<Exame>();
			rs = dao.readExame();
			int i = 0;
			if (rs != null) {
				while (rs.next()) {
					i++;
					exame = new Exame();
					exame.setNome(rs.getString("NOME"));
					exame.setCpf(rs.getString("CPF"));
					exame.setEmail(rs.getString("EMAIL"));
					exame.setTelefone(rs.getString("TELEFONE"));
					exame.setResultado(rs.getString("RESULTADO"));
					exames.add(exame);
				}
			}
			if (i == 0) {
				noData = false;
			} else {
				noData = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "READ";
	}

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public Exame getExame() {
		return exame;
	}

	public void setExame(Exame exame) {
		this.exame = exame;
	}

	public List<Exame> getExames() {
		return exames;
	}

	public void setExames(List<Exame> exames) {
		this.exames = exames;
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}

	public boolean isNoData() {
		return noData;
	}

	public void setNoData(boolean noData) {
		this.noData = noData;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
