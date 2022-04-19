package com.example.album.Service;


import com.example.album.DB.IAlbumRepository;
import com.example.album.Models.Album;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Service
@RequiredArgsConstructor
@Slf4j
public class AlbumService implements IAlbumService {

    @Autowired
    IAlbumRepository iAlbumRepository;
    Calendar calendar;
    Date date;
    String baseUrl = "https://jsonplaceholder.typicode.com/";

    @Override
    public List<Album> getAllAlbum() {
        String url = baseUrl + "albums/";
        RestTemplate restTemplate = new RestTemplate();
        Album[] albums = restTemplate.getForObject(url, Album[].class);
        return Arrays.asList(albums);
    }

    @Override
    public Album getAlbum(int transactionId){
        Album album = iAlbumRepository.findByTransactionId(transactionId);
        return  album;
    }

    @Override
    public void insertAlbums(List<Album> albums) {
        iAlbumRepository.saveAll(albums);
    }


}
