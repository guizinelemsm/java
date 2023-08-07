package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = (int) 1000000000L;
        long numeroGrande = 192090003;
        double salarioDouble = 2800;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0040';
        String nome = "Joelington";

        System.out.println("a idade é "+idade+"Anos");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println("Nome "+nome);
    }
}
