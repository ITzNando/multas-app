package com.prestamo.Multas.Service;


import java.util.List;

import com.prestamo.Multas.Modelos.Prestamos;
import com.prestamo.Multas.Modelos.PrestamosDTO;

public interface PrestamosService { 
    List<Prestamos> findAll() throws Exception;
    List<PrestamosDTO> findByMulta() throws Exception;
}
