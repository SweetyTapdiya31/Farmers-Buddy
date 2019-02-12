package com.lti.entity.crop;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.lti.entity.Farmer;
@Entity
public class FarmerCropSell {
	@Id
	@GeneratedValue
	private int cropId;
	public int getCropId() {
		return cropId;
	}
	public void setCropId(int cropId) {
		this.cropId = cropId;
	}
	private String cropType;
	private String cropName;
	private String fertilizerType;
	private int quantity;
	private int priceperquintal;
	private String soilpHCertificate;
	
	@ManyToOne
	@JoinColumn(name="id") 
	private Farmer farmer;
	public int getPriceperquintal() {
		return priceperquintal;
	}
	public void setPriceperquintal(int priceperquintal) {
		this.priceperquintal = priceperquintal;
	}
	public String getCropType() {
		return cropType;
	}
	public void setCropType(String cropType) {
		this.cropType = cropType;
	}
	public String getCropName() {
		return cropName;
	}
	public void setCropName(String cropName) {
		this.cropName = cropName;
	}
	public String getFertilizerType() {
		return fertilizerType;
	}
	public void setFertilizerType(String fertilizerType) {
		this.fertilizerType = fertilizerType;
	}
	public int getQuantity() {
		return quantity;
	}
	public String getSoilpHCertificate() {
		return soilpHCertificate;
	}
	public void setSoilpHCertificate(String soilpHCertificate) {
		this.soilpHCertificate = soilpHCertificate;
	}
	public void setQuantity(int quantity) {
		quantity = quantity;
	}
	public Farmer getFarmer() {
		return farmer;
	}
	public void setFarmer(Farmer farmer) {
		this.farmer = farmer;
	}
	

}
