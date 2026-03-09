public class Main {

    public static void main(String[] args) {

        Pagamento p1 = new CartaoCredito();
        Pagamento p2 = new Pix();

        p1.pagar(100);
        p2.pagar(50);

    }

}
