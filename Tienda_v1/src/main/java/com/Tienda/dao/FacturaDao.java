/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Tienda.dao;

import com.Tienda.domain.Factura;
import com.Tienda.domain.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author quesa
 */
public interface FacturaDao extends JpaRepository<Factura, Long>{
    
}
