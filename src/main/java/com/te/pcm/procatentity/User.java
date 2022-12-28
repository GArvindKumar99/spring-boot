package com.te.pcm.procatentity;

import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="user_tab")
public class User {
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	private String name;
	private String username;
	private String password;
	@ElementCollection
	@CollectionTable(name="rolestab",joinColumns=@JoinColumn(name="id"))
	@Column(name="role")
	private Set<String> roles;
	
}
