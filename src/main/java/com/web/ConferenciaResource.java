package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Conferencia;
import com.service.ConferenciaService;

@RestController
@RequestMapping("/api")
public class ConferenciaResource {

  @Autowired
  ConferenciaService conferenciaService;

  // Get All Conferences
  @GetMapping("/conferencias")
  public List<Conferencia> getAllConferencias() {
      return conferenciaService.findAll();
  }

  // Create a new Conference
  @PostMapping("/conferencias")
  public Conferencia createConferencia(@Valid @RequestBody Conferencia conferencia) {
      return conferenciaService.save(conferencia);
  }

  // Get a Single Conference
  @GetMapping("/conferencias/{id}")
  public Conferencia getConferenciaById(@PathVariable(value = "id") Long conferenciaId) {
      return conferenciaService.findById(conferenciaId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Conference
  @PutMapping("/conferencias/{id}")
  public Conferencia updateConferencia(@PathVariable(value = "id") Long conferenciaId,
                                          @Valid @RequestBody Conferencia conferenciaDetails) {

      Conferencia conferencia = conferenciaService.findById(conferenciaId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      conferencia.setConferenciaName(conferenciaDetails.getConferenciaName());
      return conferenciaService.save(conferencia);
  }

  // Delete a Conference
  @DeleteMapping("/conferencias/{id}")
  public ResponseEntity<?> deleteConferencia(@PathVariable(value = "id") Long conferenciaId) {
      Conferencia conferencia = conferenciaService.findById(conferenciaId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      conferenciaService.delete(conferencia);

      return ResponseEntity.ok().build();
  }

}
