
package com.gm.mundopc;


public class Teclado extends DispositivoEntrada {
    
    private final int idTeclado;
    private static int contadorTeclados;
    
    
    public Teclado(String marca, String tipoEntrada){
        super(marca, tipoEntrada);
        this.idTeclado = ++Teclado.contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + " ," + super.toString() + '}';
    }
    
}
