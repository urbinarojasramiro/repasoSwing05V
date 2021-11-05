/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoswing05v;

/**
 *
 * @author Cetecom
 */
public class Usuario {
    private String nombre;
    private String categoria;
    private String region;

    public Usuario() {
    }

    public Usuario(String nombre, String categoria, String region) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.region = region;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }
    
    
}
