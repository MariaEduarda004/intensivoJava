package com.Duda.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Duda.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
