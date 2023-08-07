package academy.devdojo.maratonajava.introducao;

/*
Exercicio

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem

Eu <nome> morando no endereço <endereco>,
confirmo que recebi o salário <salario>, na data <data>
 */
public class Aula03ExercicioTiposPrimitivos {
    public static void main(String[] args) {
         String nome = "Couy";
         String data = "10/02/2022";
         String endereco = "Rua Nagibe Lauar, 117";
         float salario = 1945.23F;
         String relatorio = "Eu "+nome+" morando no endereço "+endereco+", " +
                 "confirmo que recebi o salário "+salario+" na data "+data;


        System.out.println("Eu "+nome+" morando no endereço "+endereco+", " +
                "confirmo que recebi o salário "+salario+" na data "+data);
        System.out.println(relatorio);

    }

}

