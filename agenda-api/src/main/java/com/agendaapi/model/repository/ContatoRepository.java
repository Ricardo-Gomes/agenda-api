package com.agendaapi.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendaapi.model.entity.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
}
