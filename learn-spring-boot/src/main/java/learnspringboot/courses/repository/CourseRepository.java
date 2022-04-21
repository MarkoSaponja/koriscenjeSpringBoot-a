package learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
