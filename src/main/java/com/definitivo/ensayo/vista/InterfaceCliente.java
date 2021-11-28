/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.definitivo.ensayo.vista;


import com.definitivo.ensayo.modelo.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @autor Jeison Hernandez
 * */

public interface InterfaceCliente extends CrudRepository<Cliente,Integer> {
    
}
