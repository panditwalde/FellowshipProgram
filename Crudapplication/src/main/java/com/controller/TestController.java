package com.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.omg.CORBA.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.AddRecordModel;
import com.model.LoginModel;
import com.services.AddRecordService;

@Controller
public class TestController {

	@Autowired
	AddRecordService addrecordservice;

	@Autowired
	
	@RequestMapping("/")
	public String loginpage() {
		return "login";
	}

	@RequestMapping("/valid")
	public String validatelogin(LoginModel logmodel, Map<String, String> map)

	{
		Boolean b = addrecordservice.authenticateUser(logmodel);
		

		if (b) {
			return "master";
		} else {
			map.put("msg", "Invalid username & password");
			return "login";
		}
	}

	@RequestMapping("/addrecord")
	public String addrecord() {
		return "addrecord";
	}

	@RequestMapping("insert")
	public String SetToDb(AddRecordModel addmodel, Map<String, String> map) {

		boolean b = addrecordservice.isAddRecord(addmodel);

		if (b) {
			map.put("msg", "Data insert in Database..");
		} else {
			map.put("msg", "Data not add in Database...");
		}
		return "addrecord";
	}

	@RequestMapping("view")
	public String ViewAllRecord(Map<String, List> map) {

		List<AddRecordModel> list = addrecordservice.GetAllRecord();
		map.put("regData", list);
		
		return "viewrecord";
	}

	@RequestMapping("deleterecord")
	public String deleterecord(HttpServletRequest request, Map<String, List> map) {
		String useremail = request.getParameter("email");
		boolean b = addrecordservice.isdeleterecord(useremail);
		if (b) {
			List<AddRecordModel> list = addrecordservice.GetAllRecord();
			map.put("regData", list);
		}

		return "viewrecord";

	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView model = new ModelAndView("/userupdate");
		
		AddRecordModel emp = addrecordservice.getEmpId(id);
		model.addObject("userForm", emp);

		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("/userupdate") AddRecordModel emp) {
		if (emp != null) {
			addrecordservice.isupdaterecord(emp);
		} else {
			addrecordservice.isupdaterecord(emp);
		}
		return new ModelAndView("redirect:/view");
	}

	@RequestMapping("searchdata")
	public String Search(Map<String, List> map, HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		List<AddRecordModel> list = (List<AddRecordModel>) addrecordservice.findUserById(id);
	
		map.put("regData", list);
		
		return "SearchPage";
	}

	@RequestMapping("searc")
	public String searchpage(Map<String, List> map) {
		List<AddRecordModel> list = addrecordservice.GetAllRecord();
		map.put("regData", list);
		return "SearchPage";
	}

	@RequestMapping("logout")
	public String logout() {
		return "login";
	}

	@RequestMapping("home")
	public String home() {
		return "master";
	}

	@RequestMapping("del")
	public String delete(Map<String, List> map) {
		List<AddRecordModel> list = addrecordservice.GetAllRecord();
		map.put("regData", list);
		return "Delete";
	}

	@RequestMapping("up")
	public String update(Map<String, List> map) {
		List<AddRecordModel> list = addrecordservice.GetAllRecord();
		map.put("regData", list);
		return "Update";
	}

}
