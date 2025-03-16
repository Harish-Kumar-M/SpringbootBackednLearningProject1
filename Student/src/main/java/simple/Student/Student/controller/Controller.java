package simple.Student.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import simple.Student.Student.dao.Studentdao;
import simple.Student.Student.dto.Student;

@RestController
@RequestMapping("stu")
public class Controller {

	@Autowired
	private Studentdao con;

	
	@PostMapping("save")
	public Student saveStu(@RequestBody  Student s)
	{
		return con.saveStudent(s);
	}
	
	@GetMapping("get")
	//@QueryMapping
	public List<Student> getstu()
	{
		return con.getStudent();
	}
}
