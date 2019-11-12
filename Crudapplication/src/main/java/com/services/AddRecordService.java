package com.services;

import java.util.List;

import javax.sql.DataSource;

import com.model.AddRecordModel;
import com.model.LoginModel;

public interface AddRecordService {
	
	
	public boolean isAddRecord(AddRecordModel addmodel);
	public List<AddRecordModel > GetAllRecord();
	public boolean isdeleterecord(String email);	
	public List< AddRecordModel>  findUserById(int id);
	public void isupdaterecord(AddRecordModel add);
	public AddRecordModel getEmpId(int id);
	
	public  void  GetSearch(int id);
	
	public abstract boolean authenticateUser(LoginModel userBean);
	

}

