package pucrs.java.br.animais;

import pucrs.java.br.animais.domain.Gato;

/**
 * Hello world!
 *
 */
public class GatosApp 
{
    public static void main( String[] args )
    {
       Gato[] gatos = new Gato[3];
       gatos[0] = new Gato("Bandida",2 , 4, false, "miau");
       gatos[1] = new Gato("Tigrinha", 2 , 4, false, "miau");
       gatos[2] = new Gato("Aladdin", 2 , 4, false, "miau");
    }
}
