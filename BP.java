package SuledoPepe;

public class BP extends Persona{

    public float bonoPresentismo(Persona empleado){

        if (empleado.getFaltas() == 0) {
            return 100;
        }
        else if (empleado.getFaltas() > 0 && empleado.getFaltas() <= 10) {
            return 50;
        }
        else if (empleado.getFaltas() >= 11){
            return 10;
        }
        else return 0;
    }
}
