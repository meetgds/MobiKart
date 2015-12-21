package com.gds.pojo;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "comp_id")
	private int comp_id;
	
	@Column(name = "comp_name")
	private String comp_name;
	
	@Column(name = "logo")
	private byte[] logo;
	
	public Company() {
	}

	public Company(String comp_name, byte[] logo) {
		super();
		this.comp_name = comp_name;
		this.logo = logo;
	}

	public int getComp_id() {
		return comp_id;
	}

	public String getComp_name() {
		return comp_name;
	}

	public byte[] getLogo() {
		return logo;
	}

	@Override
	public String toString() {
		return "Company [comp_id=" + comp_id + ", comp_name=" + comp_name + ", logo=" + Arrays.toString(logo) + "]";
	}
	
	
	
	

}
