/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.teste;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Marcelo
 */
public class TesteWS {

    
    @Test
    public void TestaAdicao() {
        int num1 = 5;
        int num2 = 6;
        int result = 0;
        try {
            // Call Web Service Operation
            br.estacio.webservice.CalculadoraWS_Service service = new br.estacio.webservice.CalculadoraWS_Service();
            br.estacio.webservice.CalculadoraWS port = service.getCalculadoraWSPort();
            // TODO initialize WS operation arguments here
            
            // TODO process result here
            result = port.adicao(num1, num2);
            
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        Assert.assertEquals(11, result);
    }
}
