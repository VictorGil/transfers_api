package net.devaction.kafka.avro.util;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

import net.devaction.entity.ClientEntity;
import net.devaction.kafka.avro.Client;

/**
 * @author Víctor Gil
 *
 * since August 2019
 */
class ClientConverterTest{
    
    @Test
    void testConvertToPojo01(){
        ClientEntity expected = new ClientEntity();
        
        expected.generateId();
        String id = expected.getId();
        
        expected.setFirstName("Joan");
        expected.setLastName("Iranzo");
        expected.setEmail("j.iranzo@acme.com");
        expected.setAddress("Moon Street 37");
        expected.setLevel("gold");
        
        Client client = new Client();
        
        client.setId(id);
        client.setFirstName("Joan");
        client.setLastName("Iranzo");
        client.setEmail("j.iranzo@acme.com");
        client.setAddress("Moon Street 37");
        client.setLevel("gold");        
        
        Assertions.assertEquals(expected, 
                ClientConverter.convertToPojo(client));
    }
    
    @Test
    public void testConvertToAvro01() {
        Client expected = new Client();
        
        ClientEntity entity = new ClientEntity(); 
        entity.generateId();
        
        expected.setId(entity.getId());
        
        expected.setFirstName("Paul");
        expected.setLastName("Smith");
        expected.setEmail("p.smith@acme.org");
        expected.setAddress("Bakery Street 11");
        expected.setLevel("bronze");
        
        entity.setFirstName("Paul");
        entity.setLastName("Smith");
        entity.setEmail("p.smith@acme.org");
        entity.setAddress("Bakery Street 11");
        entity.setLevel("bronze");
        
        Assertions.assertEquals(expected, 
                ClientConverter.convertToAvro(entity));
    }
}
