/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.bibpersona;

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
        this.apellidos = apellidos;
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
        this.nombres = nombres;
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
        this.edad = edad;
    }
    private String apellidos;
    private String nombres;
    private int edad;

    public Personas() {
    }

    public Personas(String apellidos, String nombres, int edad) {
        this.apellidos = "";
        this.nombres = "";
        this.edad = 0;
    }

    @Override
    public String toString() {
        return "Personas{" + "apellidos=" + apellidos + ", nombres=" + nombres + ", edad=" + edad + '}';
    }
    
    
    
}
