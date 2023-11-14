package com.devthalisson.dslist.repositories;

import com.devthalisson.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
