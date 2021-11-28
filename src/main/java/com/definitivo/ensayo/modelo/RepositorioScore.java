package com.definitivo.ensayo.modelo;


import com.definitivo.ensayo.vista.InterfaceScore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;


/**
 *
 * @autor Jeison Hernandez
 * */

@Repository
public class RepositorioScore {
    @Autowired
    private InterfaceScore crud;
    public List<Score> getAll(){
        return (List<Score>) crud.findAll();
    }
    public Optional<Score> getScore(int id){
        return crud.findById(id);
    }

    public Score save(Score Score){
        return crud.save(Score);
    }
    public void delete(Object Score){
        crud.delete((com.definitivo.ensayo.modelo.Score) Score);
    }
}
