package com.joy.repository;

import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Getter
@Entity
@ToString
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Integer id;
	@Column
	private String name;
	@Column(name = "team_name")
	private String teamName;
	@CreationTimestamp
	@Column(name = "created_at")
	private Timestamp createdAt;
	@UpdateTimestamp
	@Column(name = "modified_at")
	private Timestamp modifiedAt;

	public User() {}

	private User(String name, String teamName) {
		this.name = name;
		this.teamName = teamName;
	}

	public static User create(String name, String team) {
		return new User(name, team);
	}
}
