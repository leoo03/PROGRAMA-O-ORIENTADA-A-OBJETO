public class Carro {
    private String nomeDoVeiculo;
    private String modelo;
    private int anoDeFabricacao;
    private String cor;
    private int velocidadeAtual;
    private int estoqueDisponivel;

    public Carro(String nomeDoVeiculo, String modelo, int anoDeFabricacao, String cor, int velocidadeAtual, int estoqueDisponivel) {
        this.nomeDoVeiculo = nomeDoVeiculo;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.cor = cor;

        if (velocidadeAtual < 0) {
            this.velocidadeAtual = 0;
        } else {
            this.velocidadeAtual = velocidadeAtual;
        }

        if (estoqueDisponivel < 0) {
            this.estoqueDisponivel = 0;
        } else {
            this.estoqueDisponivel = estoqueDisponivel;
        }

        if (anoDeFabricacao <= 1900) {
            this.anoDeFabricacao = 1901;
        } else {
            this.anoDeFabricacao = anoDeFabricacao;
        }
    }


    public void acelerar() {
        this.velocidadeAtual += 10;

    }

    public void freiar() {
        if (velocidadeAtual - 10 < 0) {
            velocidadeAtual = 0;
        } else {
            velocidadeAtual -= 10;
        }

    }


    public void vender() {
        if (estoqueDisponivel > 0){
            estoqueDisponivel --;
        }

    }

    public void exibirInformacoes(){
        System.out.println("-----------//----------------");
        System.out.println("Nome: " + nomeDoVeiculo);
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano de fabricação: " + anoDeFabricacao);
        System.out.println("Cor: " + cor);
        System.out.println("velocidade: " + velocidadeAtual);
        System.out.println("Disponivel: " + estoqueDisponivel);
        System.out.println("-----------------//----------------");

    }


}
