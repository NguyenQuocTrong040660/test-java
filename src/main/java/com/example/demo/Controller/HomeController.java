package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Entity.CanBo;
import com.example.demo.Service.CanBoSerVice;



@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private CanBoSerVice canBoSerVice;
	
	@GetMapping("/")
	public String Home(Model model) {

		List<CanBo> listCanBo = canBoSerVice.getAllCanBo();

		/*for (CanBo item : listCanBo) {
			System.out.println(item);
			
		}*/
		
		model.addAttribute("listCanBo",listCanBo );
		model.addAttribute("body", getBody("home"));
		return "index";

	}

	public static String getBody(String body) {
		return body + ".jsp";
	}

}
