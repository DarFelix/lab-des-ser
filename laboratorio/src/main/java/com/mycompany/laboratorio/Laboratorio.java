
package com.mycompany.laboratorio;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author xbxb7
 */

public class Laboratorio {

    private static void serializar() throws JsonProcessingException {
        
        Carro carro = new Carro();
        carro.setMarca("Mazda");
        carro.setTransmision("Manual");
        carro.setPrecio(5000D);
        
        System.out.println("objeto sin serializar");
        System.out.println(carro);
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        String jsonCarro = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(carro);
        
        System.out.println("objeto serializado");
        System.out.println(jsonCarro);
        
        
    }
    
    private static void deserializar() throws JsonProcessingException{
        
        
        String jsonCarro="{\n"+
        "               \"marca\" : \"Renault\",\n" +
        "               \"transmision\" : \"automatica\",\n" +
        "               \"precio\" : \"2000\"\n" +
        "}";
        
        System.out.println("objecto json");
        System.out.println(jsonCarro);
        
        ObjectMapper objectMapper = new ObjectMapper();
        Carro carro = objectMapper.readValue(jsonCarro, new TypeReference<Carro>(){});
        
        System.out.println("objecto deserializado");
        System.out.println(carro);
        
        
    }
    
    
    
    public static void main(String[] args) throws JsonProcessingException {
        
       
        
        
        
        
        deserializar();
    }
}
