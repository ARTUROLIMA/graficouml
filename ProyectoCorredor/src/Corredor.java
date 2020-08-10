//CarlosArturoLimaMedina
import java.util.Scanner;


public class Corredor {

    public static void main(String[] args) {
        Corredorr cor = new Corredorr();
        System.out.println("PROYECTO CORREDOR ");
        System.out.println("CARLOS ARTURO LIMA MEDINA ");
        System.out.println("Ingrese energia: ");
        Scanner in = new Scanner(System.in);
        int energia = in.nextInt();
        cor.setEnergia(energia);
        
        cor.VerificarEnergia();
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.EnergiaAgotada();
        cor.Mostrar();
        cor.RecargarEnergia(energia);
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.Correr();
        cor.Mostrar();
        cor.EnergiaAgotada();
        cor.Mostrar();
        cor.Entrenar();
        cor.Entrenar();
        cor.Mostrar();
    }
    
}
