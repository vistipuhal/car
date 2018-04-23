package com.tata.tms.dto;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TYRE_DATA")
@EntityListeners(AuditingEntityListener.class)
public class TyreData {

	@Getter @Setter 
	@Id
	@Column/*(name = "TYRE_NUM")*/
	private String tyreNum;
	
	@Getter @Setter 
	@Column/*(name = "MANUFAC_DATE")*/
	private Date manufacDate;
	
	@Getter @Setter 
	@Column/*(name = "BUS_NUM")*/
	private String busNum;
	
	@Getter @Setter 
	@Column/*(name = "BUS_POS")*/
	private String busPos;
	
	@Getter @Setter 
	@Column
	private Date fitDate;
	
	@Getter @Setter 
	@Column
	private double kms;
	
	@Getter @Setter 
	@Column
	private double tyreTemp;
	
	@Getter @Setter 
	@Column
	private double tyrePress;
	
	@Getter @Setter 
	@Column
	private double nsd1;				//taking nsd at three locations

	@Getter @Setter 
	@Column
	private double nsd2;
	
	@Getter @Setter 
	@Column
	private double nsd3;
	
	//	@Getter @Setter private double[] nsd;
	
	@Getter @Setter 
	@Column
	private int kmsFit;

	@Getter @Setter 
	@Column
	private int kmsRemoved;

	@Getter @Setter 
	@Column
	private String tyreCondition;

	@Override
	public String toString() {
		return "TyreData [tyreNum=" + tyreNum + ", manufacDate=" + manufacDate + ", busNum=" + busNum + ", busPos="
				+ busPos + ", fitDate=" + fitDate + ", kms=" + kms + ", tyreTemp=" + tyreTemp + ", tyrePress="
				+ tyrePress + ", nsd1=" + nsd1 + ", nsd2=" + nsd2 + ", nsd3=" + nsd3 + ", kmsFit=" + kmsFit
				+ ", kmsRemoved=" + kmsRemoved + ", tyreCondition=" + tyreCondition + "]";
	}
	
	


}
