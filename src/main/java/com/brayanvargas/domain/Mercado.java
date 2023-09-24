package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public static final byte CAPACIDAD_BV = 5;
    private String supermercadoBV;
    private List<Producto> productos;

    public Mercado(String supermercadoBV) {
        this.supermercadoBV = supermercadoBV;
        this.productos = new ArrayList<>();
    }

    public boolean agregar(Producto p){
        if (productos.contains(p)){
            System.out.println("producto ya en mercado");
            return false;
        } else if (productos.size() >= CAPACIDAD_BV) {
            System.out.println("Capacidad excedida");
            return false;
        } else {
            productos.add(p);
            System.out.println("Se agrego el producto con codigo: " + p.getCodigoBV() + " correctamente");
            return true;
        }
    }

    public boolean retirar(String nombre){
        for (Producto producto : productos) {
            if (producto.getNombreBV().equals(nombre)){
                productos.remove(producto);
                System.out.println("Producto '" + nombre + "' retirado correctamente");
                return true;
            }
        }

        System.out.println("El producto '" + nombre + "' no se encuentra en el mercado");
        return false;
    }

    public Producto buscar(String nombre){
        boolean exist = false;
        for (Producto producto : productos) {
            if (producto.getNombreBV().equals(nombre)){
                exist = true;
                System.out.println("Producto con nombre: " + "'" + nombre + "'" + " se encuentra disponible");
                return producto;
            }
        }
        System.out.println("Producto con nombre: " + "'" + nombre + "'" + " no se encuentra disponible");
        return null;
    }

    public Producto buscar(int codigo){
        boolean exist = false;
        for (Producto producto : productos) {
            if (producto.getCodigoBV() == codigo){
                exist = true;
                System.out.println("Producto con codigo: " + "'" + codigo + "'" + " se encuentra disponible");
                return producto;
            }
        }
        System.out.println("Producto con codigo: " + "'" + codigo + "'" + " no se encuentra disponible");
        return null;
    }

    public List<Producto> buscarPorTipo(String tipo){
        List<Producto> productosEncontrados = new ArrayList<>();
        System.out.println("Los productos encontrados del mismo tipo son: ");
        productos.forEach(producto -> {
            if (producto.getTipoBV().equals(tipo)){
                productosEncontrados.add(producto);
                System.out.println(producto.getNombreBV());
            }
        });
        return productosEncontrados;
    }

    public int calcularTotal(){
        int total = 0;
        for (Producto producto : productos) {
            int precio = producto.getPrecioBV();
            int cantidad = producto.getCantidadBV();
            String name = producto.getNombreBV();
            int totalProduct;

            totalProduct = precio * cantidad;
            System.out.println("El precio total de el producto: " + name + ", es: " + totalProduct);
            total += totalProduct;
        }
        System.out.println("El precio total de todos los producos es: " + total);
        return total;
    }

    public String getSupermercadoBV() {
        return supermercadoBV;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}
