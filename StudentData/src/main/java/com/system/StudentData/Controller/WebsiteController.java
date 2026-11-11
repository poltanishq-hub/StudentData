package com.system.StudentData.Controller;


import com.system.StudentData.Model.Student;
import com.system.StudentData.Repository.course_repo;
import com.system.StudentData.Repository.student_login_details_repo;
import com.system.StudentData.Repository.student_profile_repo;
import com.system.StudentData.Repository.student_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class WebsiteController {

    @GetMapping("/login")
    public String login(Model model) {
        return "login";
    }

    @Autowired
    private student_login_details_repo student_login_details_repo;
    @Autowired
    private student_profile_repo student_profile_repo;
    @Autowired
    private course_repo course_repo;
    @Autowired
    private student_repo student_repo;

    public Student findByUsernameAndPassword(String username, String password) {
        Student student_by_username = student_repo.findById(username).orElse(null);
        if(student_by_username != null && student_by_username.getPassword().equals(password)) {
            return student_by_username;
        }
        return null;
    }

    @PostMapping("/login")
    public String loginUser(
            @RequestParam String username,
            @RequestParam String password,
            Model model){

        Student student = student_repo.findByUsernameAndPassword(username, password);
        if(student == null){
            model.addAttribute("error", "Invalid username or password");
            return "login";
        }

        return "redirect:/dashboard";
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "register";
    }

    @PostMapping("/register")
    public String registerStudent(
            @RequestParam String name,
            @RequestParam String student_id,
            @RequestParam int age,
            @RequestParam String username,
            @RequestParam String password,
            Model model) {

        Student student = new Student(name, student_id, age, username, password);

        if(student_repo.existsById(username)){
            model.addAttribute("error", "Student already exists");
            return "register";
        }
        student_repo.save(student);
        return "redirect:/login";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model) {
        return "dashboard";
    }

}
