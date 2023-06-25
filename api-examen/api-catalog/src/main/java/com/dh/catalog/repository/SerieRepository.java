package com.dh.catalog.repository;

import com.dh.catalog.model.serie.Serie;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SerieRepository extends MongoRepository<Serie, String> {

  @Query("{'genre': ?0}")
  List<Serie> findAllByGenre(String genre);
}
