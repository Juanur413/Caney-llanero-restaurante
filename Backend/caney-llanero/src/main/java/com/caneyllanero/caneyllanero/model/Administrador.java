package com.caneyllanero.caneyllanero.model;

import javax.persistence.*;


@Entity
@Table(name = "Administrador")
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Documento;

    @Column
    private String Nombre;

    @Column
    private String Apellido;

    @Column
    private String Correo;

    @Column
    private String Contraseña;

    public Integer getId_Documento() {
        return Id_Documento;
    }

    public void setId_Documento(Integer id_Documento) {
        Id_Documento = id_Documento;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String contraseña) {
        Contraseña = contraseña;
    }

    

}
