package SuledoPepe;

public class Persona implements CalcularSueldoNeto{

    private BR br = new BR();

    private float bonoResultado;

    private String nombre;
    private int faltas;

    private String nombreCat;
    private float sueldoNETO;

    public String getNombre(){
        return this.nombre;
    }

    public void setNombe(String nombre) {

        this.nombre = nombre;
    }

    public int getFaltas(){
        return this.faltas;
    }

    public void setFaltas(int faltas) {

        this.faltas = faltas;
    }

    //CATEGORIA

    public String getNombreCat(){
        return this.nombreCat;
    }

    public void setNombreCat(String nombreCat){

        this.nombreCat = nombreCat;
    }

    //Sueldo Neto

    public float getSueldoNeto(){

        return netoSegunCategoria(this.nombreCat);
    }

    public float netoSegunCategoria(String nombreCategoria){

        if(nombreCategoria == "cadete"){

            return 1500;
        }
        else if(nombreCategoria == "gerente"){
            return 1000;
        }

        return -1;
    }

    //Bono Resultado

    public float getBonoResultado(BR tipoDeBono){


    }



















}
