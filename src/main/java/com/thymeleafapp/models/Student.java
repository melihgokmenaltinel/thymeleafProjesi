package com.thymeleafapp.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	
	@Id
 	private Integer id;
	
	private String name;
	private String department;
	private String updatedBy;
	
 	@DateTimeFormat(pattern="yyyy-MM-dd")
 	private LocalDate updatedOn;
 
}
