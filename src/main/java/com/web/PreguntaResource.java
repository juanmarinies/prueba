package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Pregunta;
import com.service.PreguntaService;

@RestController
@RequestMapping("/api")
public class PreguntaResource {
  
    
  @Autowired
  PreguntaService preguntaService;

  // Get All Questions
  @GetMapping("/preguntas")
  public List<Pregunta> getAllPreguntas() {
      return preguntaService.findAll();
  }

  // Create a new Question
  @PostMapping("/preguntas")
  public Pregunta createPregunta(@Valid @RequestBody Pregunta pregunta) {
      return preguntaService.save(pregunta);
  }

  // Get a Single Question
  @GetMapping("/preguntas/{id}")
  public Pregunta getPreguntaById(@PathVariable(value = "id") Long preguntaId) {
      return preguntaService.findById(preguntaId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Question
  @PutMapping("/preguntas/{id}")
  public Pregunta updatePregunta(@PathVariable(value = "id") Long preguntaId,
                                          @Valid @RequestBody Pregunta preguntaDetails) {

      Pregunta pregunta = preguntaService.findById(preguntaId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      pregunta.setPreguntas(preguntaDetails.getPreguntas());
      return preguntaService.save(pregunta);
  }

  // Delete a Question
  @DeleteMapping("/preguntas/{id}")
  public ResponseEntity<?> deletePregunta(@PathVariable(value = "id") Long preguntaId) {
      Pregunta pregunta = preguntaService.findById(preguntaId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      preguntaService.delete(pregunta);

      return ResponseEntity.ok().build();
  }
}