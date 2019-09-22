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
public class h4_7 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {

        g.drawRoundRect(20, 160, 100, 100, 25, 25);
        g.fillOval(40, 180, 15, 15);
        g.fillOval(85, 180, 15, 15);
        g.fillOval(40, 225, 15, 15);
        g.fillOval(85, 225, 15, 15);
    }


}