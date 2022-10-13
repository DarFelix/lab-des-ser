/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.rest.template;

import client.ClienteRest;
import dto.Usuario;

/**
 *
 * @author xbxb7
 */
public class RestTemplate {

    private static void getUsuarios(ClienteRest clientRest) {
        
        System.out.println("****** Listado de usuarios ******");
        
        for(Usuario usuario : clientRest.getUsuarios()) {
            System.out.println("=======================");
            System.out.println("nombre: " + usuario.getNombre());
            System.out.println("email: " + usuario.getEmail());
            System.out.println("estado: " + usuario.getEstado());
            System.out.println("fechaCreacion: " + usuario.getFechaCreacion());
            System.out.println("fechaActualizacion: " + usuario.getFechaActualizacion());
            System.out.println("=======================");
        }
        
        System.out.println("*******************************");
        
    }
    
    
    public static void main(String[] args) {
        ClienteRest clienteRest = new ClienteRest();
        getUsuarios(clienteRest);
    }
}
