package com.springboot.dslist.repositories;

import com.springboot.dslist.Entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {



}
