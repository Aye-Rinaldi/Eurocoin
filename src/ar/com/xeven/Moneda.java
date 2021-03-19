package ar.com.xeven;

public class Moneda {
    //atributos de clase
    private static String posiciones[] = {"cara","cruz"};
    private static String cantidades[] = {"1 centimo","2 centimos","5 centimo","10 centimos",
                                         "25 centimos","50 centimos","1 euro","2 euros"};
    //atributos de instancia
    private String cantidad;
    private String posicion;


    public Moneda() {
        //genera 2 posiones aleatorias
        this.posicion = posiciones[(int)(Math.random()*2)];
        //genera 8 cantidades aleatorias
        this.cantidad = cantidades[(int)(Math.random()*8)];
    }

    //getters y setters
    public String getCantidad() {
        return cantidad;
    }

    public String getPosicion() {
        return posicion;
    }

    //toString


    @Override
    public String toString() {
        return this.cantidad+" - "+this.posicion;
    }
}
