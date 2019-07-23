package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Directivo;
import com.service.DirectivoService;

@RestController
@RequestMapping("/api")
public class DirectivoResource {

  @Autowired
  DirectivoService directivoService;

  // Get All Directives
  @GetMapping("/directivos")
  public List<Directivo> getAllDirectivos() {
      return directivoService.findAll();
  }

  // Create a new Directive
  @PostMapping("/directivos")
  public Directivo createDirectivo(@Valid @RequestBody Directivo directivo) {
      return directivoService.save(directivo);
  }

  // Get a Single Directive
  @GetMapping("/directivos/{id}")
  public Directivo getDirectivoById(@PathVariable(value = "id") Long directivoId) {
      return directivoService.findById(directivoId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Directive
  @PutMapping("/directivos/{id}")
  public Directivo updateDirectivo(@PathVariable(value = "id") Long directivoId,
                                          @Valid @RequestBody Directivo directivoDetails) {

      Directivo directivo = directivoService.findById(directivoId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      directivo.setDirectivoName(directivoDetails.getDirectivoName());
      return directivoService.save(directivo);
  }

  // Delete a Directive
  @DeleteMapping("/directivos/{id}")
  public ResponseEntity<?> deleteDirectivo(@PathVariable(value = "id") Long directivoId) {
      Directivo directivo = directivoService.findById(directivoId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      directivoService.delete(directivo);

      return ResponseEntity.ok().build();
  }
}
