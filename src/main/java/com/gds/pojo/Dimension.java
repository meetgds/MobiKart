package com.gds.pojo;

public class Dimension {
	
	private double width;
	private double height;
	private double thickness;
	private double weight;
	public Dimension(double width, double height, double thickness, double weight) {
		super();
		this.width = width;
		this.height = height;
		this.thickness = thickness;
		this.weight = weight;
	}
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	public double getThickness() {
		return thickness;
	}
	public double getWeight() {
		return weight;
	}
	@Override
	public String toString() {
		return "Dimension [width=" + width + ", height=" + height + ", thickness=" + thickness + ", weight=" + weight
				+ "]";
	}
	
	

}
