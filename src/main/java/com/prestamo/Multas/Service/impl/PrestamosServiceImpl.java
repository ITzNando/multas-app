package com.prestamo.Multas.Service.impl;

import java.util.List;

import com.prestamo.Multas.Modelos.Prestamos;
import com.prestamo.Multas.Modelos.PrestamosDTO;
import com.prestamo.Multas.Repository.PrestamoR;
import com.prestamo.Multas.Service.PrestamosService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrestamosServiceImpl implements PrestamosService {

    @Autowired
    private PrestamoR prestamoR; 

    @Override
    public List<Prestamos> findAll() throws Exception{
        return prestamoR.findAll();
    }

    @Override
    public List<PrestamosDTO> findByMulta() throws Exception {
        return prestamoR.findPrestamosByMultas();
    }
    
}
