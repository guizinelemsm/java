package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02Exer {
    public static void main(String[] args) {
        // imprima todos os números pares até 1000000

        for (int i=1;i<=1000000;++i){
            int resto = i%2;
            if (resto!=1){
                System.out.println(i +" Par");
            }
        }

    }
}
