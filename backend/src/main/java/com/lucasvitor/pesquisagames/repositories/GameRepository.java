package com.lucasvitor.pesquisagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasvitor.pesquisagames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
