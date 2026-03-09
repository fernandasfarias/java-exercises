public class CartaoCredito implements Pagamento{

    @Override
    public void pagar(double valor){
        System.out.println("Pagamento de " + valor + " no cartão de crédito");
    }
    
}
