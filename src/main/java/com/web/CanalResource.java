package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Canal;
import com.service.CanalService;

@RestController
@RequestMapping("/api")
public class CanalResource {
  
  @Autowired
  CanalService canalService;

  // Get All Canals
  @GetMapping("/canales")
  public List<Canal> getAllCanales() {
      return canalService.findAll();
  }

  // Create a new Canal
  @PostMapping("/canales")
  public Canal createCanal(@Valid @RequestBody Canal canal) {
      return canalService.save(canal);
  }

  // Get a Single Canal
  @GetMapping("/canales/{id}")
  public Canal getCanalById(@PathVariable(value = "id") Long canalId) {
      return canalService.findById(canalId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Canal
  @PutMapping("/canales/{id}")
  public Canal updateCanal(@PathVariable(value = "id") Long canalId,
                                          @Valid @RequestBody Canal canalDetails) {

      Canal canal = canalService.findById(canalId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      canal.setCanalName(canalDetails.getCanalName());
      return canalService.save(canal);
  }

  // Delete a Canal
  @DeleteMapping("/canales/{id}")
  public ResponseEntity<?> deleteAutorDTO(@PathVariable(value = "id") Long canalId) {
      Canal canal = canalService.findById(canalId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      canalService.delete(canal);

      return ResponseEntity.ok().build();
  }

}
