import java.util.Scanner;

public class CalculadoraApp {
    public static  void  main(String[] args){
        //leer la entarda de la consola
        Scanner consola = new Scanner(System.in);

        while (true) {


            System.out.println("***Aplicacion de calculadora***");
            //Mostrar menu
            //System.out.println("1-Suma \n2-Resta \n3-Multiplicacion \n4-Division \n5-Salir ");
            System.out.println("""
                    1-Suma
                    2-Resta
                    3-Multiplicacion
                    4-Division
                    """);
            System.out.print("Ingresa la operacion que deseas");

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                //Revisar que este dentro de las operaciones mencionadas
                if (operacion >= 1 && operacion <= 4) {
                    System.out.print("Ingresa el primer operando ");
                    var operando1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingresa el segundo operando ");
                    var operando2 = Double.parseDouble(consola.nextLine());
                    Double resultado;

                    switch (operacion) {
                        case 1 -> {//suma
                            resultado = operando1 + operando2;
                            System.out.println("El resultado es " + resultado);
                        }
                        case 2 -> {//resta
                            resultado = operando1 - operando2;
                            System.out.println("El resultado es " + resultado);
                        }
                        case 3 -> {
                            resultado = operando1 * operando2;
                            System.out.println("El resultado es " + resultado);
                        }
                        case 4 -> {
                            resultado = operando1 / operando2;
                            System.out.println("El resultado es " + resultado);
                        }
                        default -> {
                            System.out.println("La operacion es erronea ingresa un numero del 1 al 5 " + operacion);
                        }
                    }
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto");

                    break;
                } else {
                    System.out.println("La operacion es erronea ingresa un numero del 1 al 5 ");
                }
            }catch (Exception e){
                System.out.println("ocurrio un error "+ e.getMessage());
            }
        }//fin while
    }
}
