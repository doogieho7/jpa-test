package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.entity.ThreeCategory;


public interface ThreeCategoryRepository extends JpaRepository<ThreeCategory, Integer> {

}
