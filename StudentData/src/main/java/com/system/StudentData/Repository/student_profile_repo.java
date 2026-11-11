package com.system.StudentData.Repository;

import com.system.StudentData.Model.Student_Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface student_profile_repo extends JpaRepository<Student_Profile, String> {
}
