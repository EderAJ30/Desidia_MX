package ederaj30.desidiamx.services;

import ederaj30.desidiamx.dtos.AlbumUpdateDto;
import ederaj30.desidiamx.entities.Album;

public interface AlbumService {
    public abstract Album crearAlbum(Album album);

    public abstract Iterable<Album> listarTodosLosAlbumes();

    public abstract Album buscarAlbumPorId(Integer idAlbum);

    public abstract Album actualizarAlbum (Integer idAlbum, Album album);

    public abstract Album actualizarParcialAlbum (Integer idAlbum, AlbumUpdateDto dto);

    public abstract Album eliminarAlbum (Integer idAlbum);
}
