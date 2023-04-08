package SuledoPepe;

public class SueldoBasico extends CalcularSueldo{

    public double calcular(Persona empleado){

        return empleado.getSueldoNeto();
    }
}
