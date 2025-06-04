package ederaj30.desidiamx.mappers;

import ederaj30.desidiamx.dtos.AlbumUpdateDto;
import ederaj30.desidiamx.entities.Album;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-03T23:39:30-0600",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Red Hat, Inc.)"
)
@Component
public class AlbumMapperImpl implements AlbumMapper {

    @Override
    public void updateAlbumFromDto(AlbumUpdateDto dto, Album target) {
        if ( dto == null ) {
            return;
        }

        if ( dto.getTitulo() != null ) {
            target.setTitulo( dto.getTitulo() );
        }
        if ( dto.getArtista() != null ) {
            target.setArtista( dto.getArtista() );
        }
        if ( dto.getFechaLanzamiento() != null ) {
            target.setFechaLanzamiento( dto.getFechaLanzamiento() );
        }
        if ( dto.getGenero() != null ) {
            target.setGenero( dto.getGenero() );
        }
        if ( dto.getCoverUrl() != null ) {
            target.setCoverUrl( dto.getCoverUrl() );
        }
    }
}
