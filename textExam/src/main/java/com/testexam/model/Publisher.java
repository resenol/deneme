package com.testexam.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Publisher")
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class Publisher {
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	@Column(name = "image_url")
	private String imageUrl;
	@Column(name = "url")
	private String url;
	@Column(name = "name")
	private String name;
}