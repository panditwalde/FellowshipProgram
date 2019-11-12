package com.dao;

import java.util.List;

import javax.sql.DataSource;

import com.model.AddRecordModel;
import com.model.LoginModel;

public interface AddRecordDao {
	public boolean isAddRecord(AddRecordModel addmodel);
	public List<AddRecordModel > GetAllRecord();
	public boolean isdeleterecord(String email);
	
	public void isupdaterecord(AddRecordModel add);
	public List<AddRecordModel> findUserById(int id);
	
	public AddRecordModel getEmpId(int id);
	public  void  GetSearch(int id);
	
	
	public abstract boolean authenticateUser(LoginModel userBean);
	


}
