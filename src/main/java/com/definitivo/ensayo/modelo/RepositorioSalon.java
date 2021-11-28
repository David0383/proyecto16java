/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.definitivo.ensayo.modelo;


import com.definitivo.ensayo.vista.InterfaceSalon;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
/**
 *
 * @autor Jeison Hernandez
 * */

@Repository
public class RepositorioSalon {
    
    @Autowired
    private InterfaceSalon crud;

    public List<Salon> getAll(){
        return (List<Salon>) crud.findAll();
    }

    public Optional<Salon> getPartyRoom(int id){
        return crud.findById(id);
    }

    public Salon save(Salon partyRoom){
        return crud.save(partyRoom);
    }
    public void delete(Salon partyRoom){
        crud.delete(partyRoom);
    }
    
}
