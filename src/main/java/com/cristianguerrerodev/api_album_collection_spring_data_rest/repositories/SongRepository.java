package com.cristianguerrerodev.api_album_collection_spring_data_rest.repositories;

import com.cristianguerrerodev.api_album_collection_spring_data_rest.model.Song;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface SongRepository extends JpaRepository<Song, Long> {

    @RestResource(path = "findSongByTitle", rel = "findSongByTitle")
    public Page<Song> findSongByTitle(@Param("title") String title, Pageable p);

    @RestResource(path = "findSongByLengthLessThan", rel = "findSongByLengthLessThan")
    public Page<Song> findSongByLengthLessThan(@Param("length") float length, Pageable p);

    @RestResource(path = "findSongByLengthGreaterThan", rel = "findSongByLengthGreaterThan")
    public Page<Song> findSongByLengthGreaterThan(@Param("length") float length, Pageable p);

    @RestResource(path = "findSongByAlbumTitle", rel = "findSongByAlbumTitle")
    public Page<Song> findSongByAlbumTitle(@Param("albumTitle") String albumTitle, Pageable p);

    @RestResource(path = "findSongByArtistName", rel = "findSongByArtistName")
    public Page<Song> findSongByArtistName(@Param("artistName") String artistName, Pageable p);
}
