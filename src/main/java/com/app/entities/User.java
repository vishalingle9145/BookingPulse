package com.app.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class User extends BaseEntity {

	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "phone_no")
	private String phoneNo;

	@Enumerated(EnumType.STRING)
	private Role role;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private  List<Bookings> bookings;

}
