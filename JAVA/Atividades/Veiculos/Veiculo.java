package JAVA.Atividades.Veiculos;

public class Veiculo {

    private String nome;
    private String marca;
    private int ano;
    private String cor;
    private String modelo;

    public Veiculo(String nome, String marca, int ano, String cor, String modelo) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
