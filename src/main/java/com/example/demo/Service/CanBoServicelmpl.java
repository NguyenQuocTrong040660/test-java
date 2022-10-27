package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CanBo;
import com.example.demo.Repository.CanBoRepository;

@Service
public class CanBoServicelmpl implements CanBoSerVice {

	@Autowired
	private CanBoRepository canBoRepository;
	
	@Override
	public List<CanBo> getAllCanBo() {
		
		return canBoRepository.findAll();
	}

	@Override
	public CanBo saveCanBo(CanBo canBo) {
		
		return canBoRepository.save(canBo);
	}

	@Override
	public CanBo getCanBo(Integer id) {

		 Optional<CanBo> CanBoOption = canBoRepository.findById(id);
		 if(CanBoOption.isPresent()) {
			 return CanBoOption.get();
		 }
			throw new RuntimeException("not find by id entity Category!!");
		
		
	}

	@Override
	public void deleteCanBo(Integer id) {
		canBoRepository.deleteById(id);

	}

	@Override
	public CanBo updateCanBo(CanBo canBo) {
		
		return canBoRepository.save(canBo);
	}

}
