package net.devaction.kafka.avro.util;

import net.devaction.entity.ClientEntity;
import net.devaction.kafka.avro.Client;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
public class ClientConverter {

    private ClientConverter() {}

    public static ClientEntity convertToPojo(Client client) {
        ClientEntity entity = new ClientEntity();

        entity.setId(client.getId());
        entity.setFirstName(client.getFirstName());
        entity.setLastName(client.getLastName());
        entity.setEmail(client.getEmail());
        entity.setAddress(client.getAddress());
        entity.setLevel(client.getLevel());

        return entity;
    }

    public static Client convertToAvro(ClientEntity entity) {
        Client client = new Client();

        client.setId(entity.getId());
        client.setFirstName(entity.getFirstName());
        client.setLastName(entity.getLastName());
        client.setEmail(entity.getEmail());
        client.setAddress(entity.getAddress());
        client.setLevel(entity.getLevel());

        return client;
    }
}
