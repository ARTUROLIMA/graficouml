
//CarlosArturoLimaMedina
import java.util.Scanner;

public class Corredorr {
    private int energia;
    private int recarga;
    Corredorr(){}
    Corredorr(int energia, int recarga){
        this.setEnergia(energia);
        this.setRecarga(recarga);
    }
public int VerificarEnergia(){
    if (energia>=0 && energia <=100){
        this.setEnergia(energia);
        return this.getEnergia();
    }else if(energia<0){
        System.out.println("La energia del corredor esta debajo de lo permitido");
        energia=0;
        this.setEnergia(energia);
        return this.getEnergia();
    }else{
        energia=100;
        this.setEnergia(energia);
        return this.getEnergia();
    }
}

public int RecargarEnergia(int recarga){
    System.out.println("Recarga de:");
    Scanner in = new Scanner(System.in);
    recarga = in.nextInt();
    energia = energia + recarga;
    this.setEnergia(energia);
    return this.getEnergia();
}

public int Correr(){
    energia = energia - 10;
    this.setEnergia(energia);
    return this.getEnergia();
}
 public int EnergiaAgotada(){
     if (energia<10){
        energia=0;
        this.setEnergia(energia);
        return this.getEnergia();
     } else{
        this.setEnergia(energia);
        return this.getEnergia();
     }
 }
 
 public int Entrenar(){
     if (energia>=10 && energia<=85){
      energia= energia + 15;
      this.setEnergia(energia);
      return this.getEnergia();
    }else{
      energia=100;
      this.setEnergia(energia);
      return this.getEnergia();   
     }
    }
    public void Mostrar(){
        System.out.println("La energia del corredor es:" + this.getEnergia());
    }
    
    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getRecarga() {
        return recarga;
    }

    public void setRecarga(int recarga) {
        this.recarga = recarga;
    }


}
