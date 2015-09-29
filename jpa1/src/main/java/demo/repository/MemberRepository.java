package demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import demo.entity.Member;


public interface MemberRepository extends CrudRepository<Member, Long> {
	List<Member> findByNameAndAgeLessThan(String name, int age);
	
	List<Member> findByNameAndAgeLessThanOrderByAgeDesc(String name, int age);
}
