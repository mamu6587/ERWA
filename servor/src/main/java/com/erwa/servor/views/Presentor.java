package com.erwa.servor.views;

import javax.swing.*;
import java.awt.*;

public class Presentor extends JFrame {

    public Presentor(){
        //vi vill ha ett fönster som presenterar statsen; det skall gå att skapa en separat del för abilities en godtycklig mängd gånger,
        //man ska kunna välja vilka stats som skall vara vart
        //tänk på hur texten skall presenteras när man splittar osv
        //stäng-knappar för de olika fälten

        //creating frame

        JFrame frame = new JFrame("ERWA GUI/Main window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setSize(400,400);
        //frame.setLocationRelativeTo(null);
        frame.setBounds(0,0,200,200);
        frame.setResizable(true);


        //menubar, if will need
        JMenuBar mb = new JMenuBar();
        JMenu load = new JMenu("Load statblock"); //this will check if in database and get otherwise
        mb.add(load);
        //needs a "Gotten/Loaded successfully"

        //input stats window

        //choose stats from database load

        //load database, including

    }
    //TODO Gör en GUI
    public static void main(String[] args){
        new Presentor();
    }
}
