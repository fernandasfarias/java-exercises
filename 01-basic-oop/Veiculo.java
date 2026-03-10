public class Veiculo {

    // atributos / encapsulamento
    // private -> classes filhas não acessam
    protected String marca;
    protected String modelo;
    protected int ano;

    // construtor
    Veiculo(String marca, String modelo, int ano){
        this.marca = marca; // this: atributo marca com o valor recebido no construtor
        this.modelo = modelo;
        this.ano = ano;
    }

    // métodos getters e setters

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        if(ano > 1886){
            this.ano = ano;
        }
    }

    public void exibirInfo(){
        System.out.println("Veiculo: " + marca + " " + modelo + " - " + ano);
    }
}