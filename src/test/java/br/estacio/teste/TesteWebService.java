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
public class TesteWebService {
    
    @Test
    public void testeAdicao(){
         int result = 0;
        try { // Call Web Service Operation
            br.estacio.webservice.CalculadoraWS_Service service = new br.estacio.webservice.CalculadoraWS_Service();
            br.estacio.webservice.CalculadoraWS port = service.getCalculadoraWSPort();
            // TODO initialize WS operation arguments here
            int i = 2;
            int j = 2;
            // TODO process result here
            result = port.adicao(i, j);
            System.out.println("Result = "+result);
        } catch (Exception ex) {
            // TODO handle custom exceptions here
        }
        Assert.assertEquals(5, result);
    }
    
}
