public class Main{
    public static void main(String[] args){
        Carro car_1 = new Carro("Ford", "Ford Ranger 2025", 2025);
        Moto mot_1 = new Moto("Honda", "CB500", 2021);

        car_1.exibirInfo();
        mot_1.exibirInfo();
    }
}