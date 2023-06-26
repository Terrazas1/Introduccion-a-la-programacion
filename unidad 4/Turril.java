public class Turril{
   private int cantAgua; 
   private int capacidad; 
   
   public Turril (){
       capacidad = 210;
       cantAgua = 0;
    }
   public void CargarAgua(){
       cantAgua = capacidad;
    }
   public int getCapacidad(){
       return capacidad;
   }
   public int getCantAgua(){
       return cantAgua;
       
    }
   public void setCapacidad(int Capacidad){
      Capacidad = capacidad;
    }
    public void setCantAgua (int CantAgua){
        CantAgua=cantAgua;
   }
}
