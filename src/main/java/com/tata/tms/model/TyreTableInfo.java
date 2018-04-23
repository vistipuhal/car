//package com.tata.tms.model;
//
//import java.util.Date;
//
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import javax.persistence.Column;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "TYRE_DATA")
//@EntityListeners(AuditingEntityListener.class)
//public class TyreTableInfo {
//
//	@Getter @Setter 
//	@Column(name="TYRE_NUM") 
//	@Id
//	private String tyreNum;
//	
//	@Getter @Setter 
//	@Column(name="MANUFAC_DATE") 
//	private Date manufacDate;
//	
//	@Getter @Setter 
//	@Column(name="BUS_NUM") 
//	private String busNum;
//	
//	@Getter @Setter 
//	@Column(name="BUS_POS") 
//	private String busPos;
//	
//	@Getter @Setter 
//	@Column(name="FIT_DATE") 
//	private Date fitDate;
//	
//	@Getter @Setter 
//	@Column(name="KMS") 	
//	private double kms;
//	
//	@Getter @Setter 
//	@Column(name="TYRE_TEMP") 
//	private double tyreTemp;
//	
//	@Getter @Setter 
//	@Column(name="TYRE_PRESS") 	
//	private double tyrePress;
//	
//	@Getter @Setter 
//	@Column(name="NSD1") 	
//	private double nsd1;				//taking nsd at three locations
//
//	@Getter @Setter 
//	@Column(name="NSD2") 
//	private double nsd2;
//	
//	@Getter @Setter 
//	@Column(name="NSD3") 
//	private double nsd3;
//		
//	@Getter @Setter 
//	@Column(name="KMS_FIT") 	
//	private String kmsFit;
//
//	@Getter @Setter 
//	@Column(name="KMS_REMOVE") 
//	private String kmsRemove;
//
//	@Getter @Setter 
//	@Column(name="TYRE_CONDITION") 	
//	private String tyreCondition;
//	
//	@Override
//	public String toString() {
//		return "TyreData [tyreNum=" + tyreNum + ", manufacDate=" + manufacDate + ", busNum=" + busNum + ", busPos="
//				+ busPos + ", fitDate=" + fitDate + ", kms=" + kms + ", tyreTemp=" + tyreTemp + ", tyrePress="
//				+ tyrePress + /*", nsd1=" + Arrays.toString(nsd) +*/ ", tyreCondition=" + tyreCondition + "]";
//	}
//
//
//
//}
