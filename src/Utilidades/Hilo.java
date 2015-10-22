/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import GUI.Login;

/**
 *
 * @author Puma
 */
public class Hilo extends Thread {

    Login prin;
    public static boolean cancel = true;

    public Hilo(Login prin) {
        this.prin = prin;
    }

    @Override
    public void run() {
        while (true) {
            if (prin.resp == true) {
                for (int i = 0; i <= 100; i++) {

                    prin.LlenarBarra(i);

                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException ex) {
                    }

                }
            } else {
                prin.LlenarBarra(0);
            }
        }
    }

}
