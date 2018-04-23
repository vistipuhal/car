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
@Table(name = "BUS_DATA")
@EntityListeners(AuditingEntityListener.class)
public class BusData {

	@Column
	@Id
	@Getter @Setter private String busNum;
	@Column
	@Getter @Setter private String tyreFl;// = new TyreData[6];
	@Column
	@Getter @Setter private String tyreFr;
	@Column
	@Getter @Setter private String tyreRrr;		//Rear right right
	@Column
	@Getter @Setter private String tyreRrl;
	@Column
	@Getter @Setter private String tyreRll;
	@Column
	@Getter @Setter private String tyreRlr;
	@Override
	public String toString() {
		return "BusData [busNum=" + busNum + ", tyreFl=" + tyreFl + ", tyreFr=" + tyreFr + ", tyreRrr=" + tyreRrr
				+ ", tyreRrl=" + tyreRrl + ", tyreRll=" + tyreRll + ", tyreRlr=" + tyreRlr + "]";
	}

	
}
