package com.system.StudentData.Repository;

import com.system.StudentData.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface student_repo extends JpaRepository<Student, String> {

    public Student findByUsernameAndPassword(String username, String password);
}
