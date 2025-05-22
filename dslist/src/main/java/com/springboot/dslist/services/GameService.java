package com.springboot.dslist.services;

import com.springboot.dslist.Entity.Game;
import com.springboot.dslist.dto.GameMinDTO;
import com.springboot.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;

    }
}
