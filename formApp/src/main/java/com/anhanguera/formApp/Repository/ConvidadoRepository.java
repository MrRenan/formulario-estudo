package com.anhanguera.formApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.anhanguera.formApp.models.Convidado;
import com.anhanguera.formApp.models.Evento;

public interface ConvidadoRepository extends CrudRepository<Convidado, String>{
	Iterable<Convidado> findByEvento(Evento evento);
	Convidado findByRg(String rg);
	
}
