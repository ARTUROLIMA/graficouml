import java.util.Scanner;
public class Promediooo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
float n1 = 80.9f, n2 = 50.5f, n3 = 60.0f;

float promedio = (n1 + n2 + n3 / 3);

if (promedio >= 70) {
	System.out.println("El estudiante aprueba la materia con el promedio: " + promedio);
} else { 
	System.out.println("El estudiante no aprueba la materia: "+ promedio);
}
	}
}