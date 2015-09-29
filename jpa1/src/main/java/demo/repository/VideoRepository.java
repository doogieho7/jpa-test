package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.entity.Video;

public interface VideoRepository extends CrudRepository<Video, Long> {

}
