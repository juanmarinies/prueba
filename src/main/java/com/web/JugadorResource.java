package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Jugador;
import com.service.JugadorService;

@RestController
@RequestMapping("/api")
public class JugadorResource {
  
  @Autowired
  JugadorService jugadorService;

  // Get All Players
  @GetMapping("/jugadores")
  public List<Jugador> getAllJugadores() {
      return jugadorService.findAll();
  }

  // Create a new Player
  @PostMapping("/jugadores")
  public Jugador createJugador(@Valid @RequestBody Jugador jugador) {
      return jugadorService.save(jugador);
  }

  // Get a Single Player
  @GetMapping("/jugadores/{id}")
  public Jugador getJugadorById(@PathVariable(value = "id") Long jugadorId) {
      return jugadorService.findById(jugadorId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Player
  @PutMapping("/jugadores/{id}")
  public Jugador updateJugador(@PathVariable(value = "id") Long jugadorId,
                                          @Valid @RequestBody Jugador jugadorDetails) {

      Jugador jugador = jugadorService.findById(jugadorId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      jugador.setJugadorName(jugadorDetails.getJugadorName());
      return jugadorService.save(jugador);
  }

  // Delete a Player
  @DeleteMapping("/jugadores/{id}")
  public ResponseEntity<?> deleteJugador(@PathVariable(value = "id") Long jugadorId) {
      Jugador jugador = jugadorService.findById(jugadorId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      jugadorService.delete(jugador);

      return ResponseEntity.ok().build();
  }
}
