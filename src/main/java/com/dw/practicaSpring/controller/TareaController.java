package com.dw.practicaSpring.controller;


import model.Tarea;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/tareas")
public class TareaController {

    private List<Tarea> tareas = new ArrayList<Tarea>();

    public TareaController() {
    tareas.add(new Tarea(1, "tarea", false));
    tareas.add(new Tarea(2, "tarea", true));
    }


    @GetMapping
    public List<Tarea> getTareas() {
        return tareas;

    }

    @GetMapping("/{id}")
    public Tarea obtenerPorId(@PathVariable Long id){
        return
        tareas.stream().filter(tarea -> tarea.getId() == id).findFirst().orElse(null);
    }

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea nueva) {
        tareas.add(nueva);
        return nueva;
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        tareas.removeIf(tarea -> tarea.getId() == id);
    }


}


