package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.entity.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {

}
