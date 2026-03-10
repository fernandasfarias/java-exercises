public class Moto extends Veiculo{
    public Moto(String marca, String modelo, int ano){
        super(marca, modelo, ano);
    }

    @Override
    public void exibirInfo(){
        System.out.println("Moto: " + marca + " " + modelo + " - " + ano);
    }
}