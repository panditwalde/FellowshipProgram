package com.services;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.AddRecordDao;
import com.model.AddRecordModel;
import com.model.LoginModel;

@Service("AddRecordService")
public class AddRecordServiceImp implements AddRecordService {
	@Autowired
	AddRecordDao addrecorddao;

	public AddRecordDao getAddrecorddao() {
		return addrecorddao;
	}

	public void setAddrecorddao(AddRecordDao addrecorddao) {
		this.addrecorddao = addrecorddao;
	}

	@Override
	public boolean isAddRecord(AddRecordModel addmodel) {
		// TODO Auto-generated method stub
		return addrecorddao.isAddRecord(addmodel);
	}

	@Override
	public List<AddRecordModel> GetAllRecord() {
		// TODO Auto-generated method stub
		return addrecorddao.GetAllRecord();
	}

	@Override
	public boolean isdeleterecord(String email) {
		// TODO Auto-generated method stub
		return addrecorddao.isdeleterecord(email);
	}

	
	@Override
	public AddRecordModel getEmpId(int id) {
		return addrecorddao.getEmpId(id);
	}

	@Override
	public List<AddRecordModel> findUserById(int id) {
		// TODO Auto-generated method stub
	//	System.out.println("yesssssssss");
		return (List<AddRecordModel>) addrecorddao.findUserById(id);
	}

	@Override
	public void GetSearch(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean authenticateUser(LoginModel userBean) {
		// TODO Auto-generated method stub

		return addrecorddao.authenticateUser(userBean);

	}

	@Override
	public void isupdaterecord(AddRecordModel add) {
		// TODO Auto-generated method stub
		addrecorddao.isupdaterecord(add);	
		
	}

}
