package newExample.learnspringboot.course.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import newExample.learnspringboot.course.bean.Course;

@RestController
public class CourseController {
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course>getAllCourses(){
		return Arrays.asList(new Course(1, "Nauci Spring", "Marko Saponja"), 
				new Course(2, "Kako nauciti Spring Boot", "Marko Saponja"));
	}
	@GetMapping("/courses/1")
	public Course getCoursDetails(){
		return new Course(1, "Nauci Spring", "Marko Saponja"); 
	}		
	
}