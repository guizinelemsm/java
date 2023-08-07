package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01+numero02;
        System.out.println(resultado);


        int resto = 623%2;
        System.out.println(resto);
        if (resto <1){
            System.out.println("par");
        }
        boolean isDezMaiorQue20 = 10 > 20;
        boolean isDezMenorQue20 = 10 < 20;
        boolean isDezIgual20 = 10 == 20;
        boolean isDezIgual10 = 10 == 10;
        boolean isDezDiferenteDe20 = 10 != 20;

        System.out.println("10 é maior que 20? "+isDezMaiorQue20);
        System.out.println("10 é menor que 20? "+isDezMenorQue20);
        System.out.println("10 é igual a 20? "+isDezIgual20);
        System.out.println("10 é igual a 10? "+isDezIgual10);
        System.out.println("10 é diferente de 20? "+isDezDiferenteDe20);

    }

}
