package H4;

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class h4_6 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.setColor(Color.black);
        g.fillRect(140, 20, 50, 154);
        g.setColor(Color.red);
        g.fillOval(144, 25, 42, 42);
        g.setColor(Color.yellow);
        g.fillOval(144, 75, 42, 42);
        g.setColor(Color.green);
        g.fillOval(144, 125, 42, 42);
        g.setColor(Color.black);
    }


}