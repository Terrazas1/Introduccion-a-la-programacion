public class BombadeAgua{
    private int cantAguaTransportar;
    private Turril turrilconectado;
    private Tanque tanqueconectado;

    public BombadeAgua (){
        cantAguaTransportar = 7;
    }

    public void Bombear (){
        int CantTurril=turrilconectado.getCantAgua();        
        CantTurril=CantTurril-cantAguaTransportar;
        turrilconectado.setCantAgua(CantTurril);
        
        int cantAguaTanque=tanqueconectado.getCantAgua();
        cantAguaTanque=cantAguaTanque+cantAguaTransportar;
        tanqueconectado.setCantAgua(cantAguaTanque);
     }

    public int cantVecesBombear(){
        int res = 210/cantAguaTransportar;
        return res;
    }

    public void conectarTurril(Turril turril){
        turrilconectado=turril;
     }

    public void conectarTanque (Tanque tanque ){
        tanqueconectado=tanque;
     }
}
