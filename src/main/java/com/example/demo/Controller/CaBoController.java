package com.example.demo.Controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.example.demo.Entity.CanBo;
import com.example.demo.Entity.ChucVu;
import com.example.demo.Repository.ChucVuRepository;
import com.example.demo.Service.CanBoSerVice;

@Controller
@RequestMapping("/home")
public class CaBoController {

	@Autowired
	private CanBoSerVice canBoSerVice;
	
	@Autowired
	private ChucVuRepository chucVuRepository;
	
    //Add
	@GetMapping("/can-bo")
	public String updateCategory(Model model) {
		
			model.addAttribute("body", getBody("add-canbo"));

			return "index";
		 

	}
	
	@PostMapping("/can-bo")
	public String saveCanBo(Model model,@RequestParam("name")String name,
			@RequestParam("gender")byte gender, @RequestParam("address")String address, 
			@RequestParam("phone")String phone, @RequestParam("email")String email  ) {
		
		    CanBo canBo = new CanBo(null, name,gender,address,phone,email);
		    CanBo canBoSave= canBoSerVice.saveCanBo(canBo);
		    if(canBoSave!=null) {
		    	
                
				return "redirect:/home/";
		    }
		    else {
		    	 model.addAttribute("message", "Save khong thanh cong");
              model.addAttribute("body", getBody("add-canbo"));
              return "index";
		    }
		    

	}
	
	
	//update
	@GetMapping("/update-can-bo")
	public String updateCategory(Model model, @RequestParam("id") Integer id) {
		
			CanBo canBo = canBoSerVice.getCanBo(id);
			model.addAttribute("canBo", canBo);
			model.addAttribute("body", getBody("update-canbo"));

			return "index";
		 

	}
	
	@PostMapping("/update-can-bo")
	public String updateSaveCanBo(Model model, @RequestParam("id") Integer id,@RequestParam("name")String name,
			@RequestParam("gender")byte gender, @RequestParam("address")String address, 
			@RequestParam("phone")String phone, @RequestParam("email")String email ) {
		
			CanBo canBo = canBoSerVice.getCanBo(id);
			canBo.setId(id);
			canBo.setName(name);
			canBo.setGender(gender);
			canBo.setAddress(address);
			canBo.setPhone(phone);
			canBo.setEmail(email);
			CanBo canBoupdate  =canBoSerVice.updateCanBo(canBo);
			if(canBoupdate!=null) {
				model.addAttribute("body", getBody("home"));
				return "redirect:/home/";
			}else {
				model.addAttribute("message", "Khong thanh cong");
				model.addAttribute("body", getBody("update-canbo"));
				return "index";
			}
			
	}
	
	@GetMapping("/update-can-bo-chuc-vu")
	public String updateChucVu(Model model, @RequestParam("id") Integer id) {
		
		CanBo canBo = canBoSerVice.getCanBo(id);
		model.addAttribute("canBo", canBo);
		
		List<ChucVu> listChucVu= chucVuRepository.findAll();
		model.addAttribute("listChucVu", listChucVu);
		
		
		model.addAttribute("body", getBody("update-chuc-vu"));

		return "index";
	 

}
	
	///update-can-bo-chuc-vu
	@PostMapping("/update-can-bo-chuc-vu")
	public String updateSaveChucVu(Model model, @RequestParam("id") Integer id,@RequestParam("chucVu") Integer chucVu,
			@RequestParam("dateBoNhiem") String dateBoNhiem) {
		
		CanBo canBo = canBoSerVice.getCanBo(id);
		ChucVu getCV= new ChucVu();
		Optional<ChucVu> chucVuOption=  chucVuRepository.findById(chucVu);
		if(chucVuOption.isPresent()) {
			getCV=chucVuOption.get();
		}
		
		Date date = Date.valueOf(dateBoNhiem);
		
		canBo.setChucVu(getCV);
		canBo.setDateBoNhiem(date);
		
		canBoSerVice.updateCanBo(canBo);
		
		return "redirect:/home/";
	 

}
	
	
	@GetMapping("/canbo-delete")
	public String DeleteCanBo(Model model, @RequestParam("id") Integer id) {
		canBoSerVice.deleteCanBo(id);
		return "redirect:/home/";
			
			
	}
	

	public static String getBody(String body) {
		return body + ".jsp";

	}
	
	public static Date convertStringToDate(String dateString)  {
		Date date = Date.valueOf(dateString);
		return date;
	}

	public static Date convertJavaDateToSqlDate(Date javaDate) {
		Date sqlDate = new Date(javaDate.getTime());
		return sqlDate;
	}


}
