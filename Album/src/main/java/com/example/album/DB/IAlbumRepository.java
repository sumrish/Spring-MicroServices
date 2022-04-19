package com.example.album.DB;

import com.example.album.Models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IAlbumRepository extends JpaRepository<Album, Integer> {
    Album findByTransactionId(int transaction_id);
}
