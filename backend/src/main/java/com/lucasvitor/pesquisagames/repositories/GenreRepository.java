package com.lucasvitor.pesquisagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasvitor.pesquisagames.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long>{

}
