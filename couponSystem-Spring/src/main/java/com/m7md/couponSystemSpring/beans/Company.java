/**
 * 
 */
package com.m7md.couponSystemSpring.beans;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author scary
 *
 */
@Entity
@Table(name = "companies")
@AllArgsConstructor
public @Data class Company {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String password;
	@Access(AccessType.PROPERTY)
	@OneToMany(cascade = CascadeType.ALL)
	private List<Coupon> coupons = new ArrayList<Coupon>();

	public Company(int id, String name, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
	}

	public Company(long id) {
		super();
		this.id = id;
	}

	public Company() {
		super();
	}

}
