package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import dao.AdminRepository;
import entities.Admin;


@Controller
//@SessionAttributes("adminEmail")
public class AdminController {
	
	@Autowired
	AdminRepository adminRepository;
	
	
	
	@RequestMapping(value="/createadmin",method = RequestMethod.GET)
	public String showCreateAdminPage(ModelMap model)
	{
		return "createadmin";
	}
	
	@RequestMapping(value="/createadmin",method = RequestMethod.POST)
	public String showCreateAdminPage(ModelMap model,Admin admin)
	{
		adminRepository.save(admin);
		model.put("status", "ok");
		return "createadmin";
	}
	
}