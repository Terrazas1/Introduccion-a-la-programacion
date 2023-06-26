public class insomnio3_2{
 public int calculadorTiempo(){
 int horaDurmio=2;
 int minDurmio=45;
 int horaDesperto=11;
 int minDesperto=25;
 int horaDurmioMinutos=horaDurmio*60+minDurmio;
 int horaDespertoMinutos=horaDesperto*60+minDesperto;
 int res = horaDespertoMinutos;
 return res;
 }
 }