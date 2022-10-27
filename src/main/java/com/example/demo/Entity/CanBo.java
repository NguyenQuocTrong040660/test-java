package com.example.demo.Entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class CanBo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(columnDefinition = "nvarchar(200)")
	private String name;

	private byte gender;

	@Column(columnDefinition = "nvarchar(200)")
	private String address;

	private String phone;

	private String email;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idChucVu", nullable = true)
	private ChucVu chucVu;
	
	private Date dateBoNhiem;
	

	public CanBo() {
		super();
	}



	public CanBo(Integer id, String name, byte gender, String address, String phone, String email) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}



	public CanBo(Integer id, String name, byte gender, String address, String phone, String email, ChucVu chucVu) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.chucVu = chucVu;
	}

	


	public Date getDateBoNhiem() {
		return dateBoNhiem;
	}



	public void setDateBoNhiem(Date dateBoNhiem) {
		this.dateBoNhiem = dateBoNhiem;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public byte getGender() {
		return gender;
	}



	public void setGender(byte gender) {
		this.gender = gender;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public ChucVu getChucVu() {
		return chucVu;
	}



	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}



	@Override
	public String toString() {
		return "CanBo [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", phone=" + phone
				+ ", email=" + email + ", chucVu=" + chucVu + ", dateBoNhiem=" + dateBoNhiem + "]";
	}



	
	
	
	
	

}
