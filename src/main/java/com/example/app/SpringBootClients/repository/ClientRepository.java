package com.example.app.SpringBootClients.repository;

import com.example.app.SpringBootClients.entity.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
    List<Client> findAll();
    Optional<Client> findById(Integer integer);
    <Data extends Client> Data save(Data client);

    void deleteById(int id);
}
