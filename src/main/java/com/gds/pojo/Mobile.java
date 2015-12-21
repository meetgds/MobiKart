package com.gds.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")
public class Mobile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int product_id;

	@Column(name = "company")
	private String comp;

	@Column(name = "model")
	private String model;

	@Column(name = "cam_res")
	private int cam_res;

	@Column(name = "colors")
	private String colors;

	@Column(name = "screen_size")
	private Double screen_size;

	@Column(name = "os")
	private String os;

	public Mobile() {
	}

	public Mobile(String comp, String model, int cam_res, String colors, Double screen_size, String os) {
		super();
		this.comp = comp;
		this.model = model;
		this.cam_res = cam_res;
		this.colors = colors;
		this.screen_size = screen_size;
		this.os = os;
	}

	public int getProduct_id() {
		return product_id;
	}

	public String getComp() {
		return comp;
	}

	public String getModel() {
		return model;
	}

	public int getCam_res() {
		return cam_res;
	}

	public String getColors() {
		return colors;
	}

	public Double getScreen_size() {
		return screen_size;
	}

	public String getOs() {
		return os;
	}

	@Override
	public String toString() {
		return "MobilePhone [product_id=" + product_id + ", comp=" + comp + ", model=" + model + ", cam_res=" + cam_res
				+ ", colors=" + colors + ", screen_size=" + screen_size + ", os=" + os + "]";
	}

}
