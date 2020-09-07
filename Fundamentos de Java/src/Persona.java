class Persona{

                  int edad;



//public class Main {

                  public static void main(String[] args) {

                                    Persona pr1 = new Persona();

                                    pr1.edad = 14;

                                    Persona pr2 = pr1;

                                    pr2.edad = pr1.edad + 10;

                                    System.out.println(pr1.edad);

                  }

}