package com.lucasvitor.pesquisagames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucasvitor.pesquisagames.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long>{

}
