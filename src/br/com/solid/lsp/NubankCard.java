package br.com.solid.lsp;

public abstract class NubankCard implements IPaymentInstrument {

    @Override
    public void validate() throws Exception {
        // Validação básica
    }

    @Override
    public void collectPayment() {
        System.out.println("Pagamento Realizado com Sucesso!");
    }

}
