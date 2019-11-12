package com.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.model.AddRecordModel;
import com.model.LoginModel;
import com.services.AddRecordService;

@Repository("AddRecordDao")
public class AddRecordDaoImp implements AddRecordDao {

	@Autowired
	JdbcTemplate template;
	List<AddRecordModel> list;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	DataSource datasource;

	public DataSource getDatasource() {
		return datasource;
	}

	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
	}

	public boolean isAddRecord(AddRecordModel addmodel) {

		int value = template.update("insert into stu values('0',?,?,?,?,?,?)", new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {

				ps.setString(1, addmodel.getFirstname());
				ps.setString(2, addmodel.getLastname());
				ps.setString(3, addmodel.getEmail());
				ps.setString(4, addmodel.getPhone());
				ps.setString(5, addmodel.getPassword());
				ps.setString(6, addmodel.getGender());

			}

		});
		if (value > 0) {
			return true;
		} else {
			return false;
		}
	}

	public List<AddRecordModel> GetAllRecord() {
		list = template.query("select*from stu", new RowMapper() {

			@Override
			public AddRecordModel mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub

				AddRecordModel record = new AddRecordModel();
				record.setId(rs.getInt(1));
				record.setFirstname(rs.getString(2));

				record.setLastname(rs.getString(3));
				record.setEmail(rs.getString(4));
				record.setPhone(rs.getString(5));
				record.setPassword(rs.getString(6));
				record.setGender(rs.getString(7));

				return record;
			}

		});
		return list;
	}

	@Override
	public boolean isdeleterecord(String email) {
		int value = template.update("delete from stu where Email=?", new Object[] { email });
		if (value > 0) {
			return true;
		} else {
			return false;
		}

	}

	
	@Override
	public List<AddRecordModel> findUserById(int id) {
		// TODO Auto-generated method stub

		list = template.query("select*from stu where Id='"+id+"'", new RowMapper() {

			@Override
			public AddRecordModel mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub

				
				AddRecordModel record = new AddRecordModel();
				record.setId(rs.getInt(1));
				record.setFirstname(rs.getString(2));

				record.setLastname(rs.getString(3));
				record.setEmail(rs.getString(4));
				record.setPhone(rs.getString(5));
				record.setPassword(rs.getString(6));
				record.setGender(rs.getString(7));
               //   System.out.println("yesssssssssssssssssssss");
				return record;
			}

		});
		return list;
	}

	@Override
	public AddRecordModel getEmpId(int id) {
		// TODO Auto-generated method stub
		String sql = "select * from stu where id = ?";
		AddRecordModel emp = template.queryForObject(sql, new Object[] { id }, new RowMapper<AddRecordModel>()

		{
			@Override
			public AddRecordModel mapRow(ResultSet rs, int rowNum) throws SQLException {

				AddRecordModel emp = new AddRecordModel();
				emp.setId(rs.getInt("id"));
				emp.setFirstname(rs.getString(2));

				emp.setLastname(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setPhone(rs.getString(5));
				emp.setPassword(rs.getString(6));
				emp.setGender(rs.getString(7));

				return emp;
			}

		});
		return emp;

	}

	@Override
	public void GetSearch(int id) {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings("deprecation")
	public boolean authenticateUser(LoginModel userBean){
		boolean userExists = false;
		int rowcount = template.queryForInt("select count(*) from stu " +
				" where Email = ? and Password = ?",
				userBean.getUsername(),userBean.getPassword());
		if(rowcount==1){
			userExists = true;
		}
		return userExists;
	}

	@Override
	public void isupdaterecord(AddRecordModel emp) {
		// TODO Auto-generated method stub
		String sql="update stu set Firstname='"+emp.getFirstname()+"', Lastname='"+emp.getLastname()+"',Email='"+emp.getEmail()+"',Phone='"+emp.getPhone()+"',Password='"+emp.getPassword()+"',Gender='"+emp.getGender()+"' where id='"+emp.getId()+"'";
		
		  template.update(sql);
		
	}

	
}
