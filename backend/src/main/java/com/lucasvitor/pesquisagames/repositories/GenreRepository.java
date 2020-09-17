package com.lucasvitor.pesquisagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lucasvitor.pesquisagames.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
