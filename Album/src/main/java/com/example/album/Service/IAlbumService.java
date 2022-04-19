package com.example.album.Service;

import com.example.album.Models.Album;

import java.util.List;

public interface IAlbumService {

    public List<Album> getAllAlbum();

    public Album getAlbum(int transactionId);

    public void insertAlbums(List<Album> albums);

}
