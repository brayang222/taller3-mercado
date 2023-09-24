package com.brayanvargas.domain;

import java.util.ArrayList;
import java.util.List;

public class Mercado {
    public static final byte CAPACIDAD_BV = 5;
    private String supermercadoBV;
    private List<Producto> productosBV;

    public Mercado(String supermercadoBV) {
        this.supermercadoBV = supermercadoBV;
        this.productosBV = new ArrayList<>();
    }

    public boolean agregar(Producto p){
        if (productosBV.contains(p)){
            System.out.println("producto ya en mercado");
            return false;
        } else if (productosBV.size() >= CAPACIDAD_BV) {
            System.out.println("Capacidad excedida");
            return false;
        } else {
            productosBV.add(p);
            System.out.println("Se agrego el producto con codigo: " + p.getCodigoBV() + " correctamente");
            return true;
        }
    }

    public boolean retirar(String nombre){
        for (Producto producto : productosBV) {
            if (producto.getNombreBV().equals(nombre)){
                productosBV.remove(producto);
                System.out.println("Producto '" + nombre + "' retirado correctamente");
                return true;
            }
        }

        System.out.println("El producto '" + nombre + "' no se encuentra en el mercado");
        return false;
    }

    public Producto buscar(String nombre){
        for (Producto producto : productosBV) {
            if (producto.getNombreBV().equals(nombre)){
                System.out.println("Producto con nombre: " + "'" + nombre + "'" + " se encuentra disponible");
                return producto;
            }
        }
        System.out.println("Producto con nombre: " + "'" + nombre + "'" + " no se encuentra disponible");
        return null;
    }

    public Producto buscar(int codigo){
        for (Producto producto : productosBV) {
            if (producto.getCodigoBV() == codigo){
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
        productosBV.forEach(producto -> {
            if (producto.getTipoBV().equals(tipo)){
                productosEncontrados.add(producto);
                System.out.println(producto.getNombreBV());
            }
        });
        return productosEncontrados;
    }

    public int calcularTotal(){
        int total = 0;
        for (Producto producto : productosBV) {
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

    public List<Producto> getProductosBV() {
        return productosBV;
    }
}
