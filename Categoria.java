package SuledoPepe;

public class Categoria implements CalcularSueldoNeto{
   private String nombreCategoria;

   public String getNombreCategoria(){

      return this.nombreCategoria;
   }

   public void setNombreCategoria(String nombreCategoria){

      this.nombreCategoria = nombreCategoria;
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
}
