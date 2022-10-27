package com.example.demo.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table
@Entity
public class ChucVu {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Column(columnDefinition = "nvarchar(100)")
	private String chucVu;


	@OneToMany(mappedBy = "chucVu")
	private List<CanBo> canBo;


	
	public ChucVu() {
		super();
	}



	public ChucVu(Integer id, String chucVu) {
		super();
		this.id = id;
		this.chucVu = chucVu;
	}



	public ChucVu(Integer id, String chucVu, List<CanBo> canBo) {
		super();
		this.id = id;
		this.chucVu = chucVu;
		this.canBo = canBo;
	}



	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getChucVu() {
		return chucVu;
	}



	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}



	public List<CanBo> getCanBo() {
		return canBo;
	}



	public void setCanBo(List<CanBo> canBo) {
		this.canBo = canBo;
	}



	@Override
	public String toString() {
		return "ChucVu [id=" + id + ", chucVu=" + chucVu + ", canBo=" + canBo + "]";
	}
	
	
	


	
}
