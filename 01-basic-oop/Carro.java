public class Carro extends Veiculo{
    
    public Carro(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    // polimorfismo
    @Override // reescrevendo um método da classe pai
    public void exibirInfo(){
        System.out.println("Carro: " + marca + " " + modelo + " - " + ano);
    }
}
