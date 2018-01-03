package com.willetserver.willetserver.model;

import java.util.List;

public class ServiceResponseObject {
	private List<Product> mobiles;
	private FilterValues filterValues = new FilterValues();
	
	// Just setting some dummy values. Only Product list will be fetched from DB.
	public ServiceResponseObject() {
		filterValues.brands = new Brand[7];
		filterValues.brands[0] = new Brand(0, "Apple");
		filterValues.brands[1] = new Brand(1, "Blackberry");
		filterValues.brands[2] = new Brand(2, "HTC");
		filterValues.brands[3] = new Brand(3, "Huawei");
		filterValues.brands[4] = new Brand(4, "LG");
		filterValues.brands[5] = new Brand(5, "Motorola");
		filterValues.brands[6] = new Brand(6, "Samsung");
		
		filterValues.price = new Price(30000, 80000);
	}
	public List<Product> getMobiles() {
		return mobiles;
	}
	public void setMobiles(List<Product> mobiles) {
		this.mobiles = mobiles;
	}
	public FilterValues getFilterValues() {
		return filterValues;
	}
	public void setFilterValues(FilterValues filterValues) {
		this.filterValues = filterValues;
	}
}
class FilterValues {
	Brand [] brands;
	Price price;
	public Brand[] getBrands() {
		return brands;
	}
	public void setBrands(Brand[] brands) {
		this.brands = brands;
	}
	public Price getPrice() {
		return price;
	}
	public void setPrice(Price price) {
		this.price = price;
	}
}
class Brand {
	int brandId;
	String brandName;
	public Brand (int brandId, String brandName) {
		this.brandId = brandId;
		this.brandName = brandName;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
}
class Price {
	int maxValue;
	int minValue;
	public Price (int maxValue, int minValue) {
		this.maxValue = maxValue;
		this.minValue = minValue;
	}
	public int getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	public int getMinValue() {
		return minValue;
	}
	public void setMinValue(int minValue) {
		this.minValue = minValue;
	}
}
