package ar.com.xeven;

import java.util.ArrayList;

/*
La máquina Eurocoin genera una moneda de curso legal cada vez que
se pulsa un botón siguiendo la siguiente pauta: o bien coincide el
valor con la moneda anteriormente generada - 1 céntimo, 2 céntimos,
5 céntimos, 10 céntimos, 25 céntimos, 50 céntimos, 1 euro o 2 euros -
o bien coincide la posición – cara o cruz. Simula, mediante un
programa, la generación de 6 monedas aleatorias siguiendo la pauta
correcta. Cada moneda generada debe ser una instancia de la clase
Moneda y la secuencia se debe ir almacenando en una lista.
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Moneda> monedas = new ArrayList<Moneda>();


        Moneda moneda1 = new Moneda();

        monedas.add(moneda1);


        String ultimaPosicion = moneda1.getPosicion();
        String ultimaCantidad = moneda1.getCantidad();


        //genero 6 monedas aleatorias
        for (int i=0; i<5; i++){
            do {
                moneda1 = new Moneda();
            } while (!((moneda1.getPosicion()).equals(ultimaPosicion)) && !((moneda1.getCantidad()).equals(ultimaCantidad)));
            monedas.add(moneda1);
            ultimaPosicion = moneda1.getPosicion();
            ultimaCantidad = moneda1.getCantidad();
        }

        for (Moneda moneda:monedas){
            System.out.println(moneda);
        }
    }
}
