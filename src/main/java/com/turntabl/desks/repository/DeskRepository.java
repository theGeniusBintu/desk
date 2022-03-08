package com.turntabl.desks.repository;

import com.turntabl.desks.model.Desks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeskRepository extends JpaRepository<Desks, String> {

}
