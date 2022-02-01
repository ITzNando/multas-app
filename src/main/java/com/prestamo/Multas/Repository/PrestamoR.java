package com.prestamo.Multas.Repository;

import java.util.List;

import com.prestamo.Multas.Modelos.Prestamos;
import com.prestamo.Multas.Modelos.PrestamosDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository; 

@Repository
public interface PrestamoR extends JpaRepository<Prestamos, Integer> {
    
    @Query(value="select id AS id,usuario as usuario, equipo as equipo, (DATEDIFF(fecha_entrega,fecha_fin ))*5 as multa from multas.prestamos limit 10", nativeQuery = true)
	List<PrestamosDTO> findPrestamosByMultas(); 
}
