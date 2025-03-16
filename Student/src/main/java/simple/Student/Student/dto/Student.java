package simple.Student.Student.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //table
public class Student {
@Id //primary key
@GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerate the value for st_id
private int st_id;
private String st_name;
private String st_dept;
public int getSt_id() {
	return st_id;
}
public void setSt_id(int st_id) {
	this.st_id = st_id;
}
public String getSt_name() {
	return st_name;
}
public void setSt_name(String st_name) {
	this.st_name = st_name;
}
public String getSt_dept() {
	return st_dept;
}
public void setSt_dept(String st_dept) {
	this.st_dept = st_dept;
}
}
