package com.lucasvitor.pesquisagames.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasvitor.pesquisagames.dto.RecordDTO;
import com.lucasvitor.pesquisagames.dto.RecordInsertDTO;
import com.lucasvitor.pesquisagames.entities.Game;
import com.lucasvitor.pesquisagames.entities.Record;
import com.lucasvitor.pesquisagames.repositories.GameRepository;
import com.lucasvitor.pesquisagames.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert(RecordInsertDTO dto) {
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		entity = repository.save(entity);
		
		return new RecordDTO(entity);
	}
	@Transactional(readOnly = true)
	public Page<RecordDTO> findByMoments(Instant minDate, Instant maxDate, PageRequest pageRequest){
		return repository.findByMoments(minDate, maxDate, pageRequest).map(x -> new RecordDTO(x));
		}
	

}
