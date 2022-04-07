package com.sapient.trg.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//import org.codehaus.jackson.map.annotate.JsonSerialize;


@XmlRootElement(name = "employee")
@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Employee {
	private Integer empno;
	private String ename;
	//@JsonSerialize(using=DateSerializer.class)
	private Date hiredate;
	private String job;
	private Double sal;
	private Integer deptno;
	
	

	
	
	
}
