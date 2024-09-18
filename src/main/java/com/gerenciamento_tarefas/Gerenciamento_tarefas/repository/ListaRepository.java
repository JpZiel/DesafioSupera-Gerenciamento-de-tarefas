package com.gerenciamento_tarefas.Gerenciamento_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciamento_tarefas.Gerenciamento_tarefas.models.Lista;

public interface ListaRepository extends JpaRepository<Lista, Long> {
}