package com.definitivo.ensayo.vista;

import com.definitivo.ensayo.modelo.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @autor Jeison Hernandez
 * */

public interface InterfaceAdmin extends CrudRepository<Admin,Integer> {
}
