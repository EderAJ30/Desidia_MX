package ederaj30.desidiamx.repositories;

import ederaj30.desidiamx.entities.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumRepository extends JpaRepository<Album, Integer> {
    //public Album findAlbumById(Integer idAlbum);
    //public Album deleteAlbumById(Integer idAlbum);
}
