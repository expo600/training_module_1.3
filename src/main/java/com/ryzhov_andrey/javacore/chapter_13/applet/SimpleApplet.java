package main.java.com.ryzhov_andrey.javacore.chapter_13.applet;

import java.awt.*;
import java.applet.*;
/*
<applet code="SimpleApplet" width=200 height=60>
</applet>
 */

public class SimpleApplet extends Applet {
    public void paint(Graphics g){
        g.drawString("Простейший аплет",20,20);
    }
}
