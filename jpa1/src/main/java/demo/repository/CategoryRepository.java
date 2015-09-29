package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.entity.Category;
import demo.entity.Member;

public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
