package com.definitivo.ensayo.vista;


import com.definitivo.ensayo.modelo.Score;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @autor Jeison Hernandez
 * */

public interface InterfaceScore extends CrudRepository<Score,Integer> {
}
