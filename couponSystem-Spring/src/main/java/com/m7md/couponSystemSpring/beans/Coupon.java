/**
 * 
 */
package com.m7md.couponSystemSpring.beans;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.couponSystem.beans.Category;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * @author scary
 *
 */
@Entity
@Table(name = "coupons")
public @Data class Coupon {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column
	private long id;
	@Column(name = "category_id")
	private int companyId;
	@Column
	@Enumerated(EnumType.STRING)
	private Category category;
	@Column
	private String title;
	@Column
	private String description;
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date startDate;
	@Column
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date endDate;
	@Column
	private int amount;
	@Column
	private double price;
	@Column
	private String image;

	public Coupon(int id, int company, Category category, String title, String description, Date startDate,
			Date endDate, int amount, double price, String image) {
		super();
		this.id = id;
		this.companyId = company;
		this.category = category;
		this.title = title;
		this.description = description;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amount = amount;
		this.price = price;
		this.image = image;
	}

	public Coupon(int id) {
		super();
		this.id = id;
	}

	public Coupon() {
		super();
	}

	public Coupon(String title) {
		super();
		this.title = title;
	}

}
