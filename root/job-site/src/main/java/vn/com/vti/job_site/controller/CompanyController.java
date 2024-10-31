package vn.com.vti.job_site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import vn.com.vti.job_site.entity.CompanyCustom;
import vn.com.vti.job_site.mapper.CompanyCustomMapper;

@Controller
@RequestMapping("company")
public class CompanyController{
	
	@Autowired
	private CompanyCustomMapper companyCustomMapper;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<CompanyCustom> companyList = companyCustomMapper.selectAll();
		model.addAttribute("companies", companyList);
		return "company/companyList";
	}
}