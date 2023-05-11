package com.Duda.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Duda.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
