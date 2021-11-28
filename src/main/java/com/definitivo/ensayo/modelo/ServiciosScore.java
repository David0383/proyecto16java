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
public class ServiciosScore {
    @Autowired
    private RepositorioScore metodosCrud;
    private Object Score;

    public List<Score> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<Score> getClient(int scoreId) {
        return metodosCrud.getScore(scoreId);
    }

    public Score save(Score score){
        if(score.getIdScore()==null){
            return metodosCrud.save(score);
        }else{
            Optional<Score> e= metodosCrud.getScore(score.getIdScore());
            if(e.isPresent()){
                return metodosCrud.save(score);
            }else{
                return score;
            }
        }
    }

    public Score update(Score score){
        if(score.getIdScore()!=null){
            Optional<Score> e= metodosCrud.getScore(score.getIdScore());
            if(!e.isPresent()){
                if(score.getScore()!=null){
                    e.get().setScore(score.getScore());
                }

                if(score.getMessage()!=null){
                    e.get().setMessage(score.getMessage());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return score;
            }
        }else{
            return score;
        }
    }

    public boolean deleteScore(int scoreId) {
        return getScore(scoreId).map(score -> {
            metodosCrud.delete(Score);
            return true;
        }).orElse(false);
    }

    public Optional<com.definitivo.ensayo.modelo.Score> getScore(int scoreId) {
        return null;
    }
}
