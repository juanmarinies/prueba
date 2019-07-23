package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Periodista;
import com.service.PeriodistaService;

@RestController
@RequestMapping("/api")
public class PeriodistaResource {
  
  @Autowired
  PeriodistaService periodistaService;

  // Get All Journalists
  @GetMapping("/periodistas")
  public List<Periodista> getAllPeriodistas() {
      return periodistaService.findAll();
  }

  // Create a new Journalist
  @PostMapping("/periodistas")
  public Periodista createPeriodista(@Valid @RequestBody Periodista periodista) {
      return periodistaService.save(periodista);
  }

  // Get a Single Journalist
  @GetMapping("/periodistas/{id}")
  public Periodista getPeriodistaById(@PathVariable(value = "id") Long periodistaId) {
      return periodistaService.findById(periodistaId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Journalist
  @PutMapping("/periodistas/{id}")
  public Periodista updatePeriodista(@PathVariable(value = "id") Long periodistaId,
                                          @Valid @RequestBody Periodista periodistaDetails) {

      Periodista periodista = periodistaService.findById(periodistaId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      periodista.setPeriodistaName(periodistaDetails.getPeriodistaName());
      return periodistaService.save(periodista);
  }

  // Delete a Journalist
  @DeleteMapping("/periodistas/{id}")
  public ResponseEntity<?> deletePeriodista(@PathVariable(value = "id") Long periodistaId) {
      Periodista periodista = periodistaService.findById(periodistaId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      periodistaService.delete(periodista);

      return ResponseEntity.ok().build();
  }
}