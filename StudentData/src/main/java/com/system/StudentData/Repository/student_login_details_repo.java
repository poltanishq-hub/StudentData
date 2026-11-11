package com.system.StudentData.Repository;

import com.system.StudentData.Model.Student_Login_Details;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface student_login_details_repo extends JpaRepository<Student_Login_Details, String> {
}
