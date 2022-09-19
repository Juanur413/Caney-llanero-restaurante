package com.caneyllanero.caneyllanero.model;

import javax.persistence.*;

@Entity
@Table(name = "tipo_producto")
public class Tipo_Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Tipo_producto;

    @Column
    private String Nombre;

    public Integer getId_Tipo_producto() {
        return Id_Tipo_producto;
    }

    public void setId_Tipo_producto(Integer id_Tipo_producto) {
        Id_Tipo_producto = id_Tipo_producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

}
