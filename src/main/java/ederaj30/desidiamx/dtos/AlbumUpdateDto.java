package ederaj30.desidiamx.dtos;

import java.time.LocalDate;
import java.util.Objects;

public class AlbumUpdateDto {
    private String titulo;
    private String artista;
    private LocalDate fechaLanzamiento;
    private String genero;
    private String coverUrl;

    public AlbumUpdateDto () {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    public AlbumUpdateDto(String titulo, String artista, LocalDate fechaLanzamiento, String genero, String coverUrl) {
        this.titulo = titulo;
        this.artista = artista;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.coverUrl = coverUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        AlbumUpdateDto that = (AlbumUpdateDto) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(artista, that.artista) && Objects.equals(fechaLanzamiento, that.fechaLanzamiento) && Objects.equals(genero, that.genero) && Objects.equals(coverUrl, that.coverUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista, fechaLanzamiento, genero, coverUrl);
    }

    @Override
    public String toString() {
        return "albumUpdateDto{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", genero='" + genero + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                '}';
    }
}
