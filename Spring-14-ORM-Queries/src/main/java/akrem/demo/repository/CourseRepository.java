package akrem.demo.repository;

import akrem.demo.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {


       //find all course by category

    List<Course> findByCategory(String category);
    @Query("select e from Course e where e.category= ?1 order by e.name")
    List<Course> getBycategory(String category);

    boolean existsByName(String name);

    int countByCategory(String category);

    @Query("SELECT c from Course c where c.category = :category and c.rating > :rating")
    List<Course> getAllByCategoryAndRatingGreaterThan(@Param("category") String category, @Param("rating") int rating);











}
