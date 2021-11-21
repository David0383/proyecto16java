/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.definitivo.ensayo.modelo;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class ServiciosSalon {
     @Autowired
    private RepositorioSalon metodosCrud;

    public List<Salon> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Salon> getPartyRoom(int partyRoomId) {
        return metodosCrud.getPartyRoom(partyRoomId);
    }

    public Salon save(Salon partyRoom){
        if(partyRoom.getId()==null){
            return metodosCrud.save(partyRoom);
        }else{
            Optional<Salon> e=metodosCrud.getPartyRoom(partyRoom.getId());
            if(e.isPresent()){
                return metodosCrud.save(partyRoom);
            }else{
                return partyRoom;
            }
        }
    }

    public Salon update(Salon partyRoom){
        if(partyRoom.getId()!=null){
            Optional<Salon> e=metodosCrud.getPartyRoom(partyRoom.getId());
            if(!e.isPresent()){
                if(partyRoom.getOwner()!=null){
                    e.get().setOwner(partyRoom.getOwner());
                }
                if(partyRoom.getCapacity()!=null){
                    e.get().setCapacity(partyRoom.getCapacity());
                }/*
                if(partyRoom.getCategoryId()!=null){
                    e.get().setCategoryId(partyRoom.getCategoryId());
                }*/
                if(partyRoom.getName()!=null){
                    e.get().setName(partyRoom.getName());
                }
                if(partyRoom.getCategory()!=null){
                    e.get().setCategory(partyRoom.getCategory());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return partyRoom;
            }
        }else{
            return partyRoom;
        }
    }


    public boolean deletePartyRoom(int partyRoomId) {
        Boolean aBoolean = getPartyRoom(partyRoomId).map(partyRoom -> {
            metodosCrud.delete(partyRoom);
            return true;
        }).orElse(false);
        return aBoolean;
    }
}
