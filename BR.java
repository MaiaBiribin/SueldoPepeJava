package SuledoPepe;

public class BR extends Persona{

    private int sueldoFijo;

    public int getSueldoFijo(){

        return 80;
    }
    private int sueldoNulo = 0;

    public double sobreNeto(Persona sueldoNeto){

        return sueldoNeto.getSueldoNeto() * 0.1;
    }

    private int getSueldoNulo(){
        return 0;
    }
}
