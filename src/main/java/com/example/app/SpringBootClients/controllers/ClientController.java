package com.example.app.SpringBootClients.controllers;

import com.example.app.SpringBootClients.entity.Client;
import com.example.app.SpringBootClients.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/clients")
public class ClientController {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(ClientController.class);

    @Autowired
    ClientService service;

    @GetMapping
    public List<Client> getAllClients() {
        LOGGER.info("MY_LOG: ClientController.getAllClients()");
        return service.getAllClients();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClient(@PathVariable("id") int id) {
        LOGGER.info("MY_LOG: ClientController.getClient(int id). ID: " + id);
        return service.getClientById(id);
    }

    @PostMapping
    public Client addClient(@RequestBody Client client) {
        LOGGER.info("MY_LOG: ClientController.addClient(Client client). Add " +
                client.getFirstName() + ", " + client.getLastName() + ", " +
                client.getPhone());
        return service.saveOrUpdate(client);
    }

    @PutMapping
    public Client updateClient(@RequestBody Client client) {
        LOGGER.info("MY_LOG: ClientController.updateClient(Client client). Update " +
                client.getFirstName());
        return service.saveOrUpdate(client);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable("id") int id) {
        LOGGER.info("MY_LOG: ClientController.deleteClient(int id). ID: " + id);
        service.deleteClientById(id);
    }
}
