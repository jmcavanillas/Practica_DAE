/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ujaen.practicaDAE.Servidor;

import java.util.Map;
import java.util.TreeMap;
import org.springframework.stereotype.Component;
import org.ujaen.practicaDAE.Servidor.Interfaces.ServiciosUsuario;

/**
 * Clase que gestiona una coleccion de usuarios
 * @author macosx
 */
@Component
public class GestionUsuarios implements ServiciosUsuario {



    Map<String, Usuario> usuarios = new TreeMap<>();

    @Override
    public boolean login(String usuario, String clave) 
    {
        return usuarios.get(usuario).getContraseña().equals(clave);
    }

    @Override
    public boolean registro(String usuario, String clave) 
    {
        if (!usuarios.containsKey(usuario)) {
            Usuario tmp=new Usuario(usuario,clave);
            usuarios.put(usuario, tmp);
            return true;
        }
        return false;
    }
    
    
    public Usuario buscarUsuario(String usuario)
    {
        //Falta meter excepciones y tal 
        return usuarios.get(usuario);
        
    }

}