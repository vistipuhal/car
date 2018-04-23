//package com.tata.tms.model;
//
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.EntityListeners;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//import org.springframework.data.jpa.domain.support.AuditingEntityListener;
//
//import lombok.Getter;
//import lombok.Setter;
//
//@Entity
//@Table(name = "BUS_DATA")
//@EntityListeners(AuditingEntityListener.class)
//public class BusTableInfo {
//
//	
//	@Id
//	@Getter @Setter 
//	@Column(name="BUS_NUM") 
//	private String busNum;
//	
//	@Getter @Setter @Column(name="TYRE_FL") 
//	private String tyreFl;// = new TyreData[6];
//	
//	@Getter @Setter @Column(name="TYRE_FR") 
//	private String tyreFr;
//	
//	@Getter @Setter @Column(name="TYRE_RRR") 
//	private String tyreRrr;		//Rear right right
//	
//	@Getter @Setter @Column(name="TYRE_RRL") 
//	private String tyreRrl;
//	
//	@Getter @Setter @Column(name="TYRE_RLL")
//	private String tyreRll;
//	
//	@Getter @Setter @Column(name="TYRE_RLR") 
//	private String tyreRlr;
//	
//	@Override
//	public String toString() {
//		return "BusData [busNum=" + busNum + ", tyreFl=" + tyreFl + ", tyreFr=" + tyreFr + ", tyreRrr=" + tyreRrr
//				+ ", tyreRrl=" + tyreRrl + ", tyreRll=" + tyreRll + ", tyreRlr=" + tyreRlr + "]";
//	}
//
//	
//}
