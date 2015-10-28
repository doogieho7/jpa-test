package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.entity.Video;


public interface VideoRepository extends JpaRepository<Video, Long> {

}
