package demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import demo.entity.Album;


public interface AlbumRepository extends JpaRepository<Album, Long> {

}
