package SuledoPepe;

public class SueldoBasico extends CalcularSueldo{

    public float calcular(Persona empleado){

        float resultado;

        resultado = empleado.getSueldoNeto() + empleado.bonoResultado + BR;

        return resultado;
    }
}
