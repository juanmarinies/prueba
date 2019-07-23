package com.web;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.domain.Equipo;
import com.service.EquipoService;

@RestController
@RequestMapping("/api")
public class EquipoResource {
  
  @Autowired
  EquipoService equipoService;

  // Get All Teams
  @GetMapping("/equipos")
  public List<Equipo> getAllEquipos() {
      return equipoService.findAll();
  }

  // Create a new Team
  @PostMapping("/equipos")
  public Equipo createEquipo(@Valid @RequestBody Equipo equipo) {
      return equipoService.save(equipo);
  }

  // Get a Single Team
  @GetMapping("/equipos/{id}")
  public Equipo getEquipoById(@PathVariable(value = "id") Long equipoId) {
      return equipoService.findById(equipoId);
              //.orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));
  }

  // Update a Team
  @PutMapping("/equipos/{id}")
  public Equipo updateEquipo(@PathVariable(value = "id") Long equipoId,
                                          @Valid @RequestBody Equipo equipoDetails) {

      Equipo equipo = equipoService.findById(equipoId);
            //  .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      equipo.setEquipoName(equipoDetails.getEquipoName());
      return equipoService.save(equipo);
  }

  // Delete a Team
  @DeleteMapping("/equipos/{id}")
  public ResponseEntity<?> deleteEquipo(@PathVariable(value = "id") Long equipoId) {
      Equipo equipo = equipoService.findById(equipoId);
             // .orElseThrow(() -> new ResourceNotFoundException("AutorDTO", "id", autorDTOId));

      equipoService.delete(equipo);

      return ResponseEntity.ok().build();
  }
}
