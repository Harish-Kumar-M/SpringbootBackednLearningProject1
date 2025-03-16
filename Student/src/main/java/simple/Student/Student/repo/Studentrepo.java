package simple.Student.Student.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import simple.Student.Student.dto.Student;

public interface Studentrepo extends JpaRepository<Student, Integer> {


}
//this is the super class for dao,controller
// this is interface