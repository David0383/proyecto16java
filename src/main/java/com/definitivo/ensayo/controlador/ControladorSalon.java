/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.definitivo.ensayo.controlador;


import com.definitivo.ensayo.modelo.Salon;
import com.definitivo.ensayo.modelo.ServiciosSalon;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USUARIO
 */
@RestController
@RequestMapping("/api/Partyroom")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})

public class ControladorSalon {
     @Autowired
    private ServiciosSalon servicio;
    @GetMapping("/all")
    public List<Salon> getPartyRoom(){
        return servicio.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Salon> getPartyRoom(@PathVariable("id") int partyRoomId) {
        return servicio.getPartyRoom(partyRoomId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Salon save(@RequestBody Salon partyRoom) {
        return servicio.save(partyRoom);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Salon update(@RequestBody Salon partyRoom) {
        return servicio.update(partyRoom);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("id") int partyRoomId) {
        return servicio.deletePartyRoom(partyRoomId);
    } 
}
