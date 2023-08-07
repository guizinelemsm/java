package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        //Doar caso salário seja maior que 5000
        double salario = 3000;
        // condição ? verdadeiro : falso;
        String resultado = salario > 5000 ?"Eu vou doar 500": "Ainda não tenho condições";

        System.out.println(resultado);
    }
}
