package com.turntabl.desks.controller;

import com.turntabl.desks.model.Desks;
import com.turntabl.desks.repository.DeskRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
 class DeskController {
     private final DeskRepository repository;

     DeskController(DeskRepository repository){
         this.repository = repository;
     }

     Desks desks = new Desks("available", "Advantage Place");
     Desks desks2 = new Desks("available", "Sonnidom");

     @GetMapping("/desks/{location}")
     ResponseEntity<Desks> getDesk(){
         return ResponseEntity.ok(desks);
     }


     //@PostMapping("")

}
