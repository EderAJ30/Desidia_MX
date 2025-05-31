package ederaj30.desidiamx.entities;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "albumes")
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_album")
    private Integer idAlbum;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "artista", nullable = false, length = 150)
    private String artista;

    @Column(name = "fecha", nullable = false)
    private LocalDate fechaLanzamiento;

    @Column(name = "genero", length = 80, nullable = false)
    private String genero;

    @Column(name = "cover_url", length = 255, nullable = false)
    private String coverUrl;

    public Album() {

    }

    public Album(Integer idAlbum, String titulo, String artista, LocalDate fechaLanzamiento, String genero, String coverUrl) {
        this.idAlbum = idAlbum;
        this.titulo = titulo;
        this.artista = artista;
        this.fechaLanzamiento = fechaLanzamiento;
        this.genero = genero;
        this.coverUrl = coverUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(idAlbum, album.idAlbum) && Objects.equals(titulo, album.titulo) && Objects.equals(artista, album.artista) && Objects.equals(fechaLanzamiento, album.fechaLanzamiento) && Objects.equals(genero, album.genero) && Objects.equals(coverUrl, album.coverUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAlbum, titulo, artista, fechaLanzamiento, genero, coverUrl);
    }

    public Integer getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(Integer idAlbum) {
        this.idAlbum = idAlbum;
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

    @Override
    public String toString() {
        return "Album{" +
                "idAlbum=" + idAlbum +
                ", titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", fechaLanzamiento=" + fechaLanzamiento +
                ", genero='" + genero + '\'' +
                ", coverUrl='" + coverUrl + '\'' +
                '}';
    }
}
