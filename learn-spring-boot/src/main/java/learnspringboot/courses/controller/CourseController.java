package learnspringboot.courses.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import learnspringboot.courses.bean.Course;
import learnspringboot.courses.repository.CourseRepository;

@RestController
public class CourseController {
	@Autowired
	private CourseRepository repository;
	
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course>getAllCourses(){
		return repository.findAll();
		
		//return Arrays.asList(new Course(1, "Nauci Spring", "Marko Saponja"), 
		//		new Course(2, "Kako nauciti Spring Boot", "Marko Saponja"));
	}
	@GetMapping("/courses/{id}")
	public Course getCourseDetails(@PathVariable long id){
		Optional<Course> course = repository.findById(id);
		if(course.isEmpty()) {
			throw new RuntimeException("Course not found with id " + id);
		}
		return course.get();
	}		
	
	
	
	
	
	
	
}