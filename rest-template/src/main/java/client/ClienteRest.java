/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import dto.Usuario;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author xbxb7
 */
public class ClienteRest {
    
       private final RestTemplate restTemplate;
       private static final String URL = "http://localhost:3000/usuario";
       
       public ClienteRest() {

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = 
                new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        
        restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(messageConverters);

    }
       
    public List<Usuario> getUsuarios() {
        
        List<Usuario> usuarios = Arrays.asList(restTemplate.getForObject(URL, Usuario[].class));
        return usuarios;
        
    }
}
