package com.cristianguerrerodev.api_album_collection_spring_data_rest.repositories;

import com.cristianguerrerodev.api_album_collection_spring_data_rest.model.Album;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface AlbumRespository extends JpaRepository<Album, Long> {

    @RestResource(path = "findAlbumByArtistName", rel = "findAlbumByArtistName")
    public Page<Album> findAlbumByArtistNameIgnoreCase(@Param("artistName") String artistName, Pageable p);

    @RestResource(path = "titleStartsWith", rel = "titleStartsWith")
    public Page<Album> findByTitleStartsWithIgnoreCase(@Param("title") String title, Pageable p);

    @RestResource(path = "findAlbumByGenre", rel = "findAlbumByGenre")
    public Page<Album> findAlbumByGenreIgnoreCase(@Param("genre") String genre, Pageable p);

    @RestResource(path = "findAlbumByYear", rel = "findAlbumByYear")
    public Page<Album> findAlbumByYear(@Param("year") int year, Pageable p);

    @RestResource(path = "findAlbumByYearLessThan", rel = "findAlbumByYearLessThan")
    public Page<Album> findAlbumByYearLessThan(@Param("year") int year, Pageable p);

    @RestResource(path = "findAlbumByYearGreaterThan", rel = "findAlbumByYearGreaterThan")
    public Page<Album> findAlbumByYearGreaterThan(@Param("year") int year, Pageable p);

    @RestResource(path = "findAlbumByLabelName", rel = "findAlbumByLabelName")
    public Page<Album> findAlbumByLabelName(@Param("labelName") String labelName, Pageable p);

    @RestResource(path = "findAlbumBySongListTitleContains", rel = "findAlbumBySongListTitleContains")
    public Page<Album> findAlbumBySongListTitleContains(@Param("songTitle") String songTitle, Pageable p);
}
