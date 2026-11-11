package com.system.StudentData.Repository;

import com.system.StudentData.Model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface course_repo extends JpaRepository<Courses, String>{
}
