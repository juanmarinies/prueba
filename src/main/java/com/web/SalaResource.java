package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Sala;
import com.service.SalaService;

@RestController
@RequestMapping("/api")
public class SalaResource {
      
  @Autowired
  SalaService salaService;

  // Get All Rooms
  @GetMapping("/salas")
  public List<Sala> getAllSalas() {
      return salaService.findAll();
  }

  // Create a new Room
  @PostMapping("/salas")
  public Sala createSala(@Valid @RequestBody Sala sala) {
      return salaService.save(sala);
  }

  // Get a Single Room
  @GetMapping("/salas/{id}")
  public Sala getSalaById(@PathVariable(value = "id") Long salaId) {
      return salaService.findById(salaId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Room
  @PutMapping("/salas/{id}")
  public Sala updateSala(@PathVariable(value = "id") Long salaId,
                                          @Valid @RequestBody Sala salaDetails) {

      Sala sala = salaService.findById(salaId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      sala.setSalaName(salaDetails.getSalaName());
      return salaService.save(sala);
  }

  // Delete a Room
  @DeleteMapping("/salas/{id}")
  public ResponseEntity<?> deleteSala(@PathVariable(value = "id") Long salaId) {
      Sala sala = salaService.findById(salaId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      salaService.delete(sala);

      return ResponseEntity.ok().build();
  }
}
