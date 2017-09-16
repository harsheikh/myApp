package com.mycompany.app;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 * Hello world!
 *
 */
public class App extends JFrame
{

    public App()
    {
        initUI();
    }

    private void initUI() {
        setTitle("Simple example");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main( String[] args )
    {
            App ex = new App();
            ex.setVisible(true);
    }
}
