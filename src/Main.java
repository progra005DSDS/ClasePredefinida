
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {Calculadora();
    }

    public static void Calculadora() {

        Scanner n = new Scanner(System.in);

        double num1, num2, res, s, r, d, m;
        int opc,c;

        System.out.println(" Bienvenido seleccciona la operacion a realizar:  ");
        System.out.println("precione 1 para sumar");
        System.out.println("precione 2 para restar");
        System.out.println("precione 3 para multiplicar");
        System.out.println("precione 4 para dividir");
        opc = n.nextInt();

        System.out.println("Ingrese un numero: ");
        num1 = n.nextInt();
        System.out.println("Ingrese otro numero: ");
        num2 = n.nextInt();

        s = num1 + num2;
        r = num1 - num2;
        m = num1 * num2;
        d = num1 / num2;

        switch (opc) {
            case 1:
                res = s;
                System.out.print(" el resultado de la suma es: " + res);
                break;
            case 2:
                res = r;
                System.out.print("el resultado de la resta es " + res);
                break;
            case 3:
                res = m;
                System.out.println("El resultado de la multiplicacion es: " + res);
                break;
            case 4:
                res = d;
                System.out.println("El resultado de la divicion es: " + res);
                break;
            default:
                System.out.println("La opcion que coloco no existe");


        }
        System.out.println("Quiere realizar otra operacion:  ");
        System.out.println("Ingresa  1=SI  0=NO ");
        c=n.nextInt();

        if (c>=1){
            Calculadora();

        }
        else {
            System.out.print(" Fin ");
        }



        }
    }



