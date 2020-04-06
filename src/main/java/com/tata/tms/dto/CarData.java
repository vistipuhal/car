package com.tata.tms.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CAR_DATA")
@EntityListeners(AuditingEntityListener.class)
public class CarData {

	@Column
	@Id
	@Getter @Setter private String carId;
	@Column
	@Getter @Setter private String carName;
	@Column
	@Getter @Setter private String manufactName;
	@Column
	@Getter @Setter private String model;	
	@Column
	@Getter @Setter private String manufactYear;
	@Column
	@Getter @Setter private String color;
	@Override
	public String toString() {
		return "CarData [carId=" + carId + ", carName=" + carName + ", manufactName=" + manufactName + ", model="
				+ model + ", manufactYear=" + manufactYear + ", color=" + color + "]";
	}
	public String getCarId() {
		return carId;
	}
	public void setCarId(String carId) {
		this.carId = carId;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getManufactName() {
		return manufactName;
	}
	public void setManufactName(String manufactName) {
		this.manufactName = manufactName;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufactYear() {
		return manufactYear;
	}
	public void setManufactYear(String manufactYear) {
		this.manufactYear = manufactYear;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
}
