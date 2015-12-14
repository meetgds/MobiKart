package com.gds.pojo;

import java.util.List;

public class MobilePhone {

	private int product_id;
	private String comp;
	private String model;
	private int cam_res;
	private List<String> colors;
	private Double screen_size;
	private String os;
	public MobilePhone(int product_id, String comp, String model, int cam_res,
			List<String> colors, Double screen_size, String os) {
		super();
		this.product_id = product_id;
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
	public List<String> getColors() {
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
		return "MobilePhone [product_id=" + product_id + ", comp=" + comp
				+ ", model=" + model + ", cam_res=" + cam_res + ", colors="
				+ colors + ", screen_size=" + screen_size + ", os=" + os + "]";
	}
	
	
}
