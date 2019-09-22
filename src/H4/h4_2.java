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
public class h4_2 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(0, 50, 25, 0);
        g.drawLine(25, 0, 50, 50);
        g.drawLine(0, 50, 0, 100);
        g.drawLine(0, 100, 50, 100);
        g.drawLine(50, 100, 50, 50);
        g.drawLine(28, 100, 28, 81);
        g.drawLine(28, 81, 35, 81);
        g.drawLine(35, 81, 35, 100);
        g.drawLine(5, 60, 5, 72);
        g.drawLine(5, 72, 28, 72);
        g.drawLine(28, 72, 28, 60);
        g.drawLine(28, 60, 5, 60);
        g.drawLine(0, 50, 50, 50);
    }

}