package br.cefetmg.inf.agenda;

import br.cefetmg.inf.agenda.view.Agenda;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }
    
}
