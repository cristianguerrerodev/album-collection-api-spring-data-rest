package com.cristianguerrerodev.api_album_collection_spring_data_rest.repositories;

import com.cristianguerrerodev.api_album_collection_spring_data_rest.model.Label;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource
public interface LabelRepository extends JpaRepository<Label, Long> {

    @RestResource(path = "findLabelByName", rel = "findLabelByName")
    Page<Label> findLabelByName(@Param("name") String name, Pageable p);

    @RestResource(path = "findLabelByAlbumListTitleContains", rel = "findLabelByAlbumListTitleContains")
    Page<Label> findLabelByAlbumListTitleContains(@Param("albumTitle") String albumTitle, Pageable p);
}
