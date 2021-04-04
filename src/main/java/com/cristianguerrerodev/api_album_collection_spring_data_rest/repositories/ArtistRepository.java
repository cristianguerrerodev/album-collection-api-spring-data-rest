package com.cristianguerrerodev.api_album_collection_spring_data_rest.repositories;

import com.cristianguerrerodev.api_album_collection_spring_data_rest.model.Artist;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface ArtistRepository extends JpaRepository<Artist, Long> {

    @RestResource(path = "findArtistByName", rel = "findArtistByName")
    public Page<Artist> findArtistByName(@Param("name") String name, Pageable p);

    @RestResource(path = "findArtistByAlbumListTitleContains", rel = "findArtistByAlbumListTitleContains")
    public Page<Artist> findArtistByAlbumListTitleContains(@Param("albumTitle") String albumTitle, Pageable p);

    @RestResource(path = "findArtistBySongListTitleContains", rel = "findArtistBySongListTitleContains")
    public Page<Artist> findArtistBySongListTitleContains(@Param("songTitle") String songTitle, Pageable p);
}
