package com.cydeo.repository;

import com.cydeo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.stream.Stream;

public interface CourseRepository extends JpaRepository<Course,Long> {

    //Find all courses by category
    List<Course> findByCategory(String category);

    //find all courses by categories and order the entities by name
    List<Course> findByCategoryOrderByName(String category);

    //checks if a course with the supplied name exists Return true if exists, false if not
    boolean existsByName(String name);

    int countByCategory(String category);

    List<Course> findByNameStartingWith(String name);

    Stream<Course> streamAllByCategory(String category);


}
