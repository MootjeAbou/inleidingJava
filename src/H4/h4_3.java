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
public class h4_3 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillRect(10, 120, 40, 10);
        g.setColor(Color.white);
        g.fillRect(10, 130, 40, 10);
        g.setColor(Color.blue);
        g.fillRect(10, 140, 40, 10);
        g.setColor(Color.black);
        g.drawLine(10, 120, 10, 180);
    }

}