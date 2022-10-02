package com.caneyllanero.caneyllanero.model;

import javax.persistence.*;

@Entity
@Table(name = "producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_Producto;

    @Column
    private String Nombre;

    @Column
    private String Descripcion;

    @Column
    private Integer Precio;

    @Column
    private Integer Id_Tipo_producto;

    @Column
    private Integer Id_Documento;

    @Column
    private String Imagen;

    @Column
    private Integer Visible;

    public Integer getId_Producto() {
        return Id_Producto;
    }

    public void setId_Producto(Integer id_Producto) {
        Id_Producto = id_Producto;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public Integer getPrecio() {
        return Precio;
    }

    public void setPrecio(Integer precio) {
        Precio = precio;
    }
    
    public Integer getId_Tipo_producto() {
        return Id_Tipo_producto;
    }

    public void setId_Tipo_producto(Integer Id_Tipo_producto) {
        this.Id_Tipo_producto = Id_Tipo_producto;
    }
    

    public Integer getId_Documento() {
        return Id_Documento;
    }

    public void setId_Documento(Integer id_Documento) {
        Id_Documento = id_Documento;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

    public Integer getVisible() {
        return Visible;
    }

    public void setVisible(Integer visible) {
        Visible = visible;
    }

}
