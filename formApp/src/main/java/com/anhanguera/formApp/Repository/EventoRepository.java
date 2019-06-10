package com.anhanguera.formApp.Repository;

import org.springframework.data.repository.CrudRepository;

import com.anhanguera.formApp.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, String> {
	Evento findByCodigo(long codigo);
}
