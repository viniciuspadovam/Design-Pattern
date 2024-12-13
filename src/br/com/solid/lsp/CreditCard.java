package br.com.solid.lsp;

public class CreditCard extends NubankCard {

    @Override
    public void validate() throws Exception {
        // Validação do Cartão de Crédito
        System.out.println("Validando Limite!");
        System.out.println("Limite ok!");
    }

}
