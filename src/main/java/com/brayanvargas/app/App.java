package com.brayanvargas.app;

import com.brayanvargas.domain.Mercado;
import com.brayanvargas.domain.Producto;
import com.brayanvargas.domain.TipoProducto;

public class App {
    public static void main(String[] args) {

        Mercado mercado = new Mercado("Mercosto");

        Producto producto1 = new Producto(1, "Dorian", 2, 3000, TipoProducto.PASTA_BV);
        Producto producto2 = new Producto(2, "Posta", 3, 15000, TipoProducto.CARNE_BV);
        Producto producto3 = new Producto(3, "Zanahoria", 5, 1000, TipoProducto.VERDURA_BV);
        Producto producto4 = new Producto(4, "Yogurt", 3, 1300, TipoProducto.LACTEO_BV);
        Producto producto5 = new Producto(5, "Manzana", 2, 1000, TipoProducto.VERDURA_BV);
        Producto producto6 = new Producto(6, "Roa", 1, 5000, TipoProducto.ARROZ_BV);

        //Agregar
        mercado.agregar(producto1);
        mercado.agregar(producto2);
        mercado.agregar(producto3);
        mercado.agregar(producto4);
        mercado.agregar(producto5);

        //retirar
        mercado.retirar("Posta");

        //Buscar (Nombre)
        mercado.buscar("Posta");

        //Buscar (Codigo)
        mercado.buscar(3);

        //Buscar por tipo
        String product = producto3.getTipoBV();
        mercado.buscarPorTipo(product);

        //Calcular total
        mercado.calcularTotal();
    }
}
