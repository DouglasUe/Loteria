package loteria;

import java.util.Scanner;

public class Loteria {

    public static void main(String[] args) {
        int[] valores = new int[]{0, 0, 0, 0, 0, 0};
        imprimeVetor(valores);
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seis numeros");
        for (int i = 0; i < 6; i++) {
            int num = -1;
            while (num == -1) {
                num = capNum(in, i);
                for (int j = 0; j < i; j++) {
                    if (valores[j] == num) {
                        num = -1;
                        break;
                    }
                }
            }
            valores[i] = num;
            imprimeVetor(valores);
        }
    }

    public static int capNum(Scanner in, int i) {
        System.out.println("Digite o " + (i + 1) + "º numero");
        int num = in.nextInt();
        if (num >= 1 && num <= 60) {
            return num;
        } else {
            return -1;
        }
    }

    public static void imprimeVetor(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println("");
    }
}
