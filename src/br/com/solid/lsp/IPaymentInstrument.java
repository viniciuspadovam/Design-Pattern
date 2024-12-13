package br.com.solid.lsp;

public interface IPaymentInstrument {

    public void validate() throws Exception;
    public void collectPayment();

}
