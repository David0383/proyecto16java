package com.definitivo.ensayo.modelo;

import javax.persistence.*;
import java.io.Serializable;

/**
*
* @autor Jeison Hernandez
* */
@Entity
@Table(name = "Score")
public class Score implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer idScore;
    private Integer score;
    private String message;

    public Integer getIdScore() {
        return idScore;
    }

    public void setIdScore(Integer idScore) {
        this.idScore = idScore;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
