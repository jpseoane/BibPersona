/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.bibpersona;

import java.util.Objects;
import org.me.mibiblioteca.BibliotecaCadena;

/**
 *
 * @author juanpab
 */
public class Personas {
        
    private String apellidos;
    private String nombres;
    private int edad;
    
    /**
     * Constructor por defecto
     */
    public Personas() {
        apellidos = "";
        nombres = "";
        edad = 0;        
    }
    
    /**
     * Constructor de la clase
     * @param apellidos
     * @param nombres
     * @param edad
     */
    public Personas(String apellidos, String nombres, int edad) {
        this.apellidos = BibliotecaCadena.aTitulo(apellidos);
        this.nombres = BibliotecaCadena.aTitulo(nombres);
        this.edad = edad >= 0 ? edad : -edad;        
    }

    /**
     * @return  devuelve los apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos para setear los apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = BibliotecaCadena.aTitulo(apellidos);
    }

    /**
     * @return devuelve los nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres para setear los nombres
     */
    public void setNombres(String nombres) {
        this.nombres = BibliotecaCadena.aTitulo(nombres);
    }

    
    public int getEdad() {
        return edad;
    }
    
    /**
     * @param edad para setear la edad
     */
    public void setEdad(int edad) {
        this.edad = edad >= 0 ? edad : -edad;
    }      

    /**
     * Devuelve una cadena concatenando los miembros de informacion separados por tabulaciones
     */
    @Override
    public String toString() {
        return apellidos  +  "\t" + nombres  +  "\t" + edad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.apellidos);
        hash = 17 * hash + Objects.hashCode(this.nombres);
        hash = 17 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personas other = (Personas) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.apellidos, other.apellidos)) {
            return false;
        }
        if (!Objects.equals(this.nombres, other.nombres)) {
            return false;
        }
        return true;
    }

    
    
    
    
}
