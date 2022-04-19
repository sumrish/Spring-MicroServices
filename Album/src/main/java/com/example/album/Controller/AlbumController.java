package com.example.album.Controller;

import com.example.album.Models.Album;
import com.example.album.Service.AlbumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/album")
public class AlbumController {

    private final AlbumService albumService;

    @GetMapping(path = "/getAllAlbums/")
    public List<Album> getAlbums() {
            List<Album> albums = albumService.getAllAlbum();
            albumService.insertAlbums(albums);
            return albums;

    }

    @GetMapping(path = "/getAlbum/")
    public Album getAlbum(@RequestParam int id)
    {
            Album album = albumService.getAlbum(id);
            return album;
    }



}
