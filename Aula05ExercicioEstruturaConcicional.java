package academy.devdojo.maratonajava.introducao;

public class Aula05ExercicioEstruturaConcicional {
    public static void main(String[] args) {
        double salario = 1000000;


        if (salario < 34712){
            double imposto = salario / 100 * 9.7;
            double salarioN = salario - imposto;
                System.out.println(salarioN);
        }else if (salario > 34712 && salario <= 68507){
            double imposto = salario / 100 * 37.35;
            double salarioN = salario - imposto;
                System.out.println(salarioN);
        }else {
            double imposto = salario / 100 * 49.50;
            double salarioN = salario - imposto;
                System.out.println(salarioN);
        }
    }
}
