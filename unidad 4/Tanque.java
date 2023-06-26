public class Tanque{
   private int cantAguaTanque, capacidad; 
   
   public Tanque (){
       capacidad = 950;
       cantAguaTanque = 0;
    }
   public int canTurrilesNecesarios(){
       int res = capacidad/210;
       return res;
    }
     public int getCapacidad(){
       return capacidad;
   }
   public int getCantAgua(){
       return cantAguaTanque;
       
    }
   public void setCapacidad(int Capacidad){
      Capacidad = capacidad;
    }
    public void setCantAgua (int CantAgua){
        CantAgua=cantAguaTanque;
   }
}
