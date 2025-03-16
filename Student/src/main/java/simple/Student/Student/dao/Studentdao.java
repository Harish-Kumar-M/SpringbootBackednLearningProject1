package simple.Student.Student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import simple.Student.Student.dto.Student;
import simple.Student.Student.repo.Studentrepo;

@Repository // It represents it as dao class
public class Studentdao {
	@Autowired
	Studentrepo repo;
	
	public Student saveStudent(Student s)
	{
		return repo.save(s);
	}
	 public List<Student> getStudent()
	 {
		 return repo.findAll();
	 }
}
