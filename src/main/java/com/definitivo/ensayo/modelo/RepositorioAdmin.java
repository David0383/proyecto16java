package com.definitivo.ensayo.modelo;

import com.definitivo.ensayo.vista.InterfaceAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

/**
 *
 * @autor Jeison Hernandez
 * */

@Repository
public class RepositorioAdmin {
     @Autowired
     private InterfaceAdmin crud;
     public List<Admin> getAll(){
          return (List<Admin>) crud.findAll();
     }
     public Optional<Admin> getAdmin(int id){
          return crud.findById(id);
     }

     public Admin save(Admin admin){
          return crud.save(admin);
     }
     public void delete(Admin admin){
          crud.delete(admin);
     }


}
