package br.com.soc.exame.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.soc.exame.bean.Exame;
import br.com.soc.exame.config.DbConection;

public class Dao {
	
	
	public int registerExame(String nome, String cpf, String telefone, String email, String resultado) throws Exception {
		int i = 0;
		try {
			String sql = "INSERT INTO EXAME (NOME,CPF,TELEFONE,EMAIL,RESULTADO) VALUES (?,?,?,?,?)";
			PreparedStatement ps = DbConection.getConnection().prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, cpf);
			ps.setString(3, telefone);
			ps.setString(4, email);
			ps.setString(5, resultado);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			return i;
		} finally {
			if (DbConection.getConnection() != null) {
				DbConection.getConnection().close();
			}
		}
	}


	public ResultSet readExame() throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT NOME,CPF,TELEFONE,EMAIL,RESULTADO FROM EXAME";
			PreparedStatement ps = DbConection.getConnection().prepareStatement(sql);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (DbConection.getConnection() != null) {
				DbConection.getConnection().close();
			}
		}
	}

	
	public ResultSet fetchExame(String cpf) throws SQLException, Exception {
		ResultSet rs = null;
		try {
			String sql = "SELECT NOME,CPF,TELEFONE,EMAIL,RESULTADO FROM EXAME WHERE CPF=?";
			PreparedStatement ps = DbConection.getConnection().prepareStatement(sql);
			ps.setString(1, cpf);
			rs = ps.executeQuery();
			return rs;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (DbConection.getConnection() != null) {
				DbConection.getConnection().close();
			}
		}
	}

	
	public int updateExame(String nome, String cpf,String telefone,String email,String resultado)
			throws SQLException, Exception {
		DbConection.getConnection().setAutoCommit(false);
		int i = 0;
		try {
			String sql = "UPDATE EXAME SET NOME=?,TELEFONE=?,EMAIL=? ,RESULTADO=? WHERE CPF=?";
			PreparedStatement ps = DbConection.getConnection().prepareStatement(sql);
			ps.setString(1, nome);
			ps.setString(2, telefone);
			ps.setString(3, email);
			ps.setString(4, resultado);
			ps.setString(5, cpf);

			
			ps.executeUpdate();
			
			
			
			return i;
			
		} catch (Exception e) {
			e.printStackTrace();
			DbConection.getConnection().rollback();
				return 0;
		} finally {
			if (DbConection.getConnection() != null) {
				DbConection.getConnection().close();
			}
		}
		
	}


	public int deleteExame(String cpf) throws SQLException, Exception {
		int i = 0;
		  try {
		   String sql="delete from exame where cpf=?";
		   PreparedStatement ps= DbConection.getConnection().prepareStatement(sql);
		   ps.setString(1, cpf);
			i = ps.executeUpdate();
			return i;
		} catch (Exception e) {
			e.printStackTrace();
			DbConection.getConnection().rollback();
			return 0;
		} finally {
			if (DbConection.getConnection() != null) {
				DbConection.getConnection().close();
			}
		}
	}
}

