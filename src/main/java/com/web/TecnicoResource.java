package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Tecnico;
import com.service.TecnicoService;

@RestController
@RequestMapping("/api")
public class TecnicoResource {
        
  @Autowired
  TecnicoService tecnicoService;

  // Get All DTS
  @GetMapping("/tecnicos")
  public List<Tecnico> getAllSalas() {
      return tecnicoService.findAll();
  }

  // Create a new DT
  @PostMapping("/tecnicos")
  public Tecnico createTecnico(@Valid @RequestBody Tecnico tecnico) {
      return tecnicoService.save(tecnico);
  }

  // Get a Single DT
  @GetMapping("/tecnicos/{id}")
  public Tecnico geTecnicoById(@PathVariable(value = "id") Long tecnicoId) {
      return tecnicoService.findById(tecnicoId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a DT
  @PutMapping("/tecnicos/{id}")
  public Tecnico updateTecnico(@PathVariable(value = "id") Long tecnicoId,
                                          @Valid @RequestBody Tecnico tecnicoDetails) {

      Tecnico tecnico = tecnicoService.findById(tecnicoId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      tecnico.setTecnicoName(tecnicoDetails.getTecnicoName());
      return tecnicoService.save(tecnico);
  }

  // Delete a DT
  @DeleteMapping("/tecnicos/{id}")
  public ResponseEntity<?> deleteTecnico(@PathVariable(value = "id") Long tecnicoId) {
      Tecnico tecnico = tecnicoService.findById(tecnicoId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      tecnicoService.delete(tecnico);

      return ResponseEntity.ok().build();
  }

}
