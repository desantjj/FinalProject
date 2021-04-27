/*
Final Project
Group #2: Sam Dobrowolski, Jamie Schaffer, Joey DeSantis, Christopher Sonnhalter
Date: 4/19/21
*/

/**
  * This is the Main.java where trivia GUI appears
  * @author Samuel Dobrowolski, Jamie Schaffer, Joey DeSantis, Christopher Sonnhalter
  * @version 4/19/2021
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
 public static void main(String args[]) {
   SwingUtilities.invokeLater(new Runnable() {
     public void run() {
        new Game();
     }
   });
 }
} 