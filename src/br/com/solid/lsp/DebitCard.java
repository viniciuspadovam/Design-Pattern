package br.com.solid.lsp;

public class DebitCard extends NubankCard {

    @Override
    public void validate() throws Exception {
        // Validação de Cartão de Débito
        System.out.println("Verificando saldo.");
        System.out.println("Verificando disponível!");
    }

}
