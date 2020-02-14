package fipp.unoeste;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe o número....");
        int inum = leitura.nextInt();
        int inv  = 0;
        int resultado = Inverte(inum,inv);

        System.out.print("Resultado...."+ resultado);


        
    }


    public static int Inverte(int numero, int invertido){
        int resto = 0;
        if (numero>0){
            resto = (numero % 10);
            numero = Inverte((numero / 10),invertido);
        }else  invertido += (invertido*10)+numero;

        return invertido;
    }

}
