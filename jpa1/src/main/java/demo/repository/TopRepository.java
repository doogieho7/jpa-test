package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.entity.Top;


public interface TopRepository extends JpaRepository<Top, Integer> {

}
