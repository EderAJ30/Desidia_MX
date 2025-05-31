package ederaj30.desidiamx.controllers;

import ederaj30.desidiamx.entities.Album;
import ederaj30.desidiamx.services.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api/albumes")
public class AlbumController {

    @Autowired
    private AlbumService albumService;
    private static String URI_LOCAL = "http://localhost:8080";

    //todos
    @GetMapping("/")
    public ResponseEntity<Iterable<Album>> getAlbum() {
        return new ResponseEntity<>(albumService.listarTodosLosAlbumes(), HttpStatus.OK);
    }

    //solo uno con id
    @GetMapping("/{id}")
    public ResponseEntity<Album> getAlbum(@PathVariable Integer id) {
        return new ResponseEntity<>(albumService.buscarAlbumPorId(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Album> createAlbum(@RequestBody Album album) throws URISyntaxException {
        return new ResponseEntity<>(albumService.crearAlbum(album), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Album>updateAlbum(@PathVariable Integer id, @RequestBody Album album) {
        return new ResponseEntity<>(albumService.actualizarAlbum(id, album), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Album> deleteAlbum(@PathVariable Integer id) {
        albumService.eliminarAlbum(id);
        return null;
    }

}
