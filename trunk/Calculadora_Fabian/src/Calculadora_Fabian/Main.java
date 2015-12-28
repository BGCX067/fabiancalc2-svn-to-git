package Calculadora_Fabian;


import java.util.Scanner;

public class Main {
//
    public Main () {
    }

    public static void main (String[] args) {
        Fabian_Operaciones fabiancalculadora = new Fabian_Operaciones();

        Scanner FabianEntrada = new Scanner(System.in);
        float fabian_Num1 = 0;
        float fabian_Num2 = 0;
        int fabianOpc = 0;
        while(fabianOpc != 5){

            System.out.println("                CALCULADORA KAZIO         ");
            System.out.println("_______________________________________________");
            System.out.println("Por favor seleccione una opcion:");
            System.out.println("1. sumar");
            System.out.println("2. restar");
            System.out.println("3. multiplicar");
            System.out.println("4. dividir");
            System.out.println("5. salir");
            fabianOpc = FabianEntrada.nextInt();

            if(fabianOpc>=1 && fabianOpc<5){
                System.out.println("Digite el primer numero: ");
                fabian_Num1 = FabianEntrada.nextInt();
                System.out.println("Digite el segundo numero: ");
                fabian_Num2 = FabianEntrada.nextInt();
            }
            switch(fabianOpc){
                case(1):
                    System.out.println("El resultado de la suma es: "+fabiancalculadora.FabianSuma(fabian_Num1, fabian_Num2));
                    break;
                case(2):
                    System.out.println("El resultado de la resta es: "+fabiancalculadora.FabianRestar(fabian_Num1, fabian_Num2));
                    break;
                case(3):
                    System.out.println("El resultado de la multiplicacion es: "+fabiancalculadora.FabianMultiplicar(fabian_Num1, fabian_Num2));
                    break;
                case(4):
                    if (fabian_Num2==0){
                        System.out.println("Error la divison por cero no es valida");
                    }
                    else

                    System.out.println("El resultado de la division es: "+fabiancalculadora.FabianDividir(fabian_Num1, fabian_Num2));
                    break;
                default:
                    System.out.println("Ha elejido finalizar el aplicativo.");
            }

            
        }
        FabianEntrada.close();
    }

}
