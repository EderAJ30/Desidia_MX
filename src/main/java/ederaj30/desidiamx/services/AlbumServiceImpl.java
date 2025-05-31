package ederaj30.desidiamx.services;

import ederaj30.desidiamx.dtos.AlbumUpdateDto;
import ederaj30.desidiamx.entities.Album;
import ederaj30.desidiamx.mappers.AlbumMapper;
import ederaj30.desidiamx.repositories.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService{

    @Autowired
    private AlbumRepository albumRepository;
    private AlbumMapper albumMapper;

    @Override
    public Album crearAlbum(Album album) {
        return albumRepository.save(album);
    }

    @Override
    public Iterable<Album> listarTodosLosAlbumes() {
        return albumRepository.findAll();
    }

    @Override
    public Album buscarAlbumPorId(Integer idAlbum) {
        return albumRepository.findById(idAlbum).orElse(null);
    }

    @Override
    public Album actualizarAlbum(Integer idAlbum, Album album) {
        Optional<Album> albumActual = albumRepository.findById(idAlbum);
        if (albumActual.isPresent()) {
            Album tmp = albumActual.get();
            tmp.setIdAlbum(album.getIdAlbum());
            tmp.setArtista(album.getArtista());
            tmp.setCoverUrl(album.getCoverUrl());
            tmp.setGenero(album.getGenero());
            tmp.setFechaLanzamiento(album.getFechaLanzamiento());
            tmp.setTitulo(album.getTitulo());
            return albumRepository.save(tmp);
        }else {
            return null;
        }
    }

    @Override
    public Album actualizarParcialAlbum(Integer idAlbum, AlbumUpdateDto dto) {
        Album album = albumRepository.findById(idAlbum).orElseThrow(() -> new RuntimeException("Venta no encontrada"));
        albumMapper.updateAlbumFromDto(dto, album);
        return albumRepository.save(album);
    }

    @Override
    public Album eliminarAlbum(Integer idAlbum) {
        Album album = albumRepository.findById(idAlbum).orElseThrow(() -> new RuntimeException("Álbum no encontrado con ID: " + idAlbum));
        albumRepository.deleteById(idAlbum);
        return album;
    }
}
