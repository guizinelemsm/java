package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04Exer {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição é que o valor da parcela tem que ser >= 1000
    public static void main(String[] args) {
        double valorTotal = 52312.84;
        for (int parcela = 1; parcela < valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                break;
            }
            String valorParcelaFormatado = String.format("%.2f", valorParcela);
            System.out.println("Parcela "+parcela+" R$ "+valorParcelaFormatado);

        }
    }
}