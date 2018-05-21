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

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = BibliotecaCadena.aTitulo(apellidos);
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = BibliotecaCadena.aTitulo(nombres);
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad >= 0 ? edad : -edad;
    }
    private String apellidos;
    private String nombres;
    private int edad;

   
    public Personas() {
        apellidos = "";
        nombres = "";
        edad = 0;        
    }

    @Override
    public String toString() {
        return apellidos  +  "\t" + nombres  +  "\t" + edad;
    }
    
    public Personas(String apellidos, String nombres, int edad) {
        this.apellidos = BibliotecaCadena.aTitulo(apellidos);
        this.nombres = BibliotecaCadena.aTitulo(nombres);
        this.edad = edad >= 0 ? edad : -edad;        
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
