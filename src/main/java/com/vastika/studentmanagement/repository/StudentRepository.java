package com.vastika.studentmanagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vastika.studentmanagement.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
