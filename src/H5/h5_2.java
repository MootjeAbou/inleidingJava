package H5;

import java.awt.*;
import java.applet.*;

    //een klasse met de naam Show van het type Applet
    public class h5_2 extends Applet {

        int  gewicht;
        int  gewicht2;
        int  gewicht3;
        int hoogte;
        int breedte;
        String naam;



        //een (lege) methode die de Applet initialiseert
        public void init() {
            setBackground(Color.white);
            gewicht = -40;
            gewicht2 = -80;
            gewicht3 = -100;
        }
        //een methode die de inhoud van het scherm tekent
        public void paint(Graphics g) {
            g.drawLine(80, 160, 80, 300);

            g.drawLine(80, 300, 260, 300);

            g.drawString("0 kg", 24, 300);
            g.drawString("20 kg", 24, 280);
            g.drawString("40 kg", 24, 260);
            g.drawString("60 kg", 24, 240);
            g.drawString("80 kg", 24, 220);
            g.drawString("100 kg", 24, 200);
            g.drawString("Valerie", 86, 314);
            g.drawString("Jeroen", 146, 314);
            g.drawString("Hans", 206, 314);
            g.setColor(Color.yellow);
            g.fillRect(87, 300, 20, gewicht);
            g.setColor(Color.cyan);
            g.fillRect(141, 300, 20, gewicht2);
            g.setColor(Color.blue);
            g.fillRect(201, 300, 20, gewicht3);
        }

    }

