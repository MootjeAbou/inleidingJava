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
public class h4_4 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(Color.white);

    }
    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawLine(80, 160, 80, 260);
        g.drawLine(140, 160, 140, 260);
        g.drawLine(200, 160, 200, 260);
        g.drawLine(260, 160, 260, 260);
        g.drawLine(260, 240, 260, 240);
        g.drawLine(20, 220, 260, 220);
        g.drawLine(20, 180, 260, 180);
        g.drawLine(20, 200, 260, 200);
        g.drawLine(20, 240, 260, 240);
        g.drawLine(20, 260, 260, 260);
        g.drawString("Valerie", 86, 174);
        g.drawString("Jeroen", 146, 174);
        g.drawString("Hans", 206, 174);
        g.drawString("40 kg", 24, 194);
        g.drawString("60 kg", 24, 214);
        g.drawString("80 kg", 24, 234);
        g.drawString("100 kg", 24, 254);
        g.setColor(Color.yellow);
        g.fillRect(81, 181, 59, 19);
        g.setColor(Color.cyan);
        g.fillRect(141, 201, 59, 19);
        g.setColor(Color.blue);
        g.fillRect(201, 241, 59, 19);
    }

}