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

    @JoinColumn(name = "Id_Tipo_producto", nullable = false, referencedColumnName="Id_Tipo_producto")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Tipo_Producto tipo_producto;

    @JoinColumn(name = "Id_Documento", nullable = false, referencedColumnName="Id_Documento")
    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Administrador administrador;

    @Column
    private String Imagen;

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

    public Tipo_Producto getTipo_producto() {
        return tipo_producto;
    }

    public void setTipo_producto(Tipo_Producto tipo_producto) {
        this.tipo_producto = tipo_producto;
    }
    
    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }

}
