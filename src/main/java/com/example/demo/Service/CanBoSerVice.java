package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo.Entity.CanBo;

public interface CanBoSerVice {
	
	
			List<CanBo> getAllCanBo();
			
			//save 1 entity(khoa)
			CanBo saveCanBo(CanBo canBo);
			
			//get 1 entity(khoa) thong qua id
			CanBo getCanBo(Integer id);
			
			//delete 1 doi tuong thong qua id
			void deleteCanBo(Integer id);
			
			//update 1 entity(khoa) 
			CanBo updateCanBo(CanBo canBo);
	

}
