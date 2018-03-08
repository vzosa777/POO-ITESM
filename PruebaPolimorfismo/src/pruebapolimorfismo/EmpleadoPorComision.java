/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebapolimorfismo;

/**
 *
 * @author link_
 */
public class EmpleadoPorComision extends Empleado{
    private double ventasBrutas;
    private double tarifaPorComision;

    public EmpleadoPorComision(String nombre,
    String apellidos, String nSS, double ventasBrutas
    ,double tarifaPorComision) {
        super(nombre, apellidos, nSS);
        this.ventasBrutas=ventasBrutas;
        this.tarifaPorComision=tarifaPorComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public double getTarifaPorComision() {
        return tarifaPorComision;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public void setTarifaPorComision(double tarifaPorComision) {
        this.tarifaPorComision = tarifaPorComision;
    }

    @Override
    public double ingresos() {
        return tarifaPorComision*ventasBrutas;
    }
    
    
    
    
}
