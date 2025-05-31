package ederaj30.desidiamx.mappers;

import ederaj30.desidiamx.dtos.AlbumUpdateDto;
import ederaj30.desidiamx.entities.Album;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel= "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)

public interface AlbumMapper {
    void updateAlbumFromDto(AlbumUpdateDto dto, @MappingTarget Album target);
}
