/**
 * 
 */
package com.m7md.couponSystemSpring.beans;

import java.util.ArrayList;
import java.util.List;

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
@Table(name = "customers")
@AllArgsConstructor
public @Data class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private long id;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String email;
	@Column
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Coupon> coupons = new ArrayList<Coupon>();

	public Customer(int id, String firstName, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}

	public Customer(int id) {
		super();
		this.id = id;
	}

	public Customer() {
		super();
	}

	public Customer(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

}
