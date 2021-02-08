package com.devsuperior.crudrest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.crudrest.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
