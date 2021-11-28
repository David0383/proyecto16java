package com.definitivo.ensayo.modelo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

/**
 *
 * @autor Jeison Hernandez
 * */

@Service
public class ServiciosAdmin {
    @Autowired
    private RepositorioAdmin metodosCrud;
    private Object Admin;

    public List<Admin> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Admin> getClient(int adminId) {
        return metodosCrud.getAdmin(adminId);
    }

    public Admin save(Admin admin){
        if(admin.getIdAdmin()==null){
            return metodosCrud.save(admin);
        }else{
            Optional<Admin> e= metodosCrud.getAdmin(admin.getIdAdmin());
            if(e.isPresent()){
                return metodosCrud.save(admin);
            }else{
                return admin;
            }
        }
    }

    public Admin update(Admin admin){
        if(admin.getIdAdmin()!=null){
            Optional<Admin> e= metodosCrud.getAdmin(admin.getIdAdmin());
            if(!e.isPresent()){
                if(admin.getName()!=null){
                    e.get().setName(admin.getName());
                }
                if(admin.getEmail()!=null){
                    e.get().setEmail(admin.getEmail());
                }
                if(admin.getPassword()!=null){
                    e.get().setPassword(admin.getPassword());
                }

                metodosCrud.save(e.get());
                return e.get();
            }else{
                return admin;
            }
        }else{
            return admin;
        }
    }

    public boolean deleteAdmin(int adminId) {
        return getAdmin(adminId).map(admin -> {
            metodosCrud.delete((com.definitivo.ensayo.modelo.Admin) Admin);
            return true;
        }).orElse(false);
    }

    public Optional<com.definitivo.ensayo.modelo.Admin> getAdmin(int adminId) {
        return null;
    }
}

