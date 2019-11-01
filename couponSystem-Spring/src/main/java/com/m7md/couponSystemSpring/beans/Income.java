/**
 * 
 */
package com.m7md.couponSystemSpring.beans;

import java.sql.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.m7md.couponSystemSpring.enums.IncomeType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author scary
 *
 */
@Entity
@Table(name = "Income")
@AllArgsConstructor
@NoArgsConstructor
public @Data class Income {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	@Basic(optional = false)
	private long id;
	@Column
	@Basic(optional = false)
	private String name;
	@Column
	@Basic(optional = false)
	private Date date;
	@Column
	@Basic(optional = false)
	private IncomeType description;
	@Column
	@Basic(optional = false)
	private double amount;
	@Column
	@Basic(optional = true)
	private long companyId;
	@Column
	@Basic(optional = true)
	private long customerId;
}
