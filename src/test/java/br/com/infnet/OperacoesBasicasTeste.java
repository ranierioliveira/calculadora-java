package br.com.infnet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



class OperacoesBasicasTeste {
    private static final Logger LOGGER = LoggerFactory.getLogger(OperacoesBasicas.class);

   @Test
   @DisplayName("Testa soma de dois números:")
   public void test1(){
       OperacoesBasicas operacoesBasicas = new OperacoesBasicas();
       int primeiroTermo = 5;
       int segundoTermo = 10;
       LOGGER.debug("Executando adição entre {} e {}", primeiroTermo, segundoTermo);
       assertEquals(15, operacoesBasicas.adicao(primeiroTermo, segundoTermo));
    }

    @Test
    @DisplayName("Testa multiplicação de dois números:")
    public void test2(){
        OperacoesBasicas operacoesBasicas = new OperacoesBasicas();
        assertEquals(-2, operacoesBasicas.subtracao(-4, -2));
    }

    @Test
    @DisplayName("Testa divisão entre dois números:")
    public void test3(){
       OperacoesBasicas operacoesBasicas = new OperacoesBasicas();
       assertThrows(ValorInvalidoException.class, () -> {
           LOGGER.error("Excessão lançada, impossível dividir por 0");
           operacoesBasicas.divisao(40,0);
       });
    }
}
