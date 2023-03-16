package com.ogurek.helloplant.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Table(name = "usr")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String login;
	private String password;
	
	@ManyToOne()
    @JoinColumn(name="role_id")
	private Role role;
	
	@ManyToMany
	@JoinTable(
			name = "usr_plant",
			joinColumns = @JoinColumn(name="usr_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(name = "plant_id", referencedColumnName = "id"))
	private Set<Plant> plants = null;

	public User(String name, String login, String password) {
		this.name = name;
		this.login = login;
		this.password = encrypt(password);
	}

//	public void addPlant(Plant plant) {
//		this.plants.add(plant);
//	}

	private String encrypt(String password) {
		// TO-DO
		return password;
	}
}