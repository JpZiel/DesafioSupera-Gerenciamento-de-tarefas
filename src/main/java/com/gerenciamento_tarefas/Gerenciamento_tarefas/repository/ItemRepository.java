package com.gerenciamento_tarefas.Gerenciamento_tarefas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gerenciamento_tarefas.Gerenciamento_tarefas.models.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
