package SuledoPepe;

public interface CalcularSueldoNeto {

    default float netoSegunCategoria(String nombreCategoria){

        if(nombreCategoria == "cadete"){

            return 1500;
        }
        else if(nombreCategoria == "gerente"){
            return 1000;
        }

        return -1;
    }
}
