package br.cefetmg.inf.agenda.view;

public class Agenda extends javax.swing.JFrame {

    public Agenda() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        arquivoMnu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        processosMnu = new javax.swing.JMenu();
        rotulosMnu = new javax.swing.JMenu();
        rotuloCadastrarMnu = new javax.swing.JMenuItem();
        ajudaMnu = new javax.swing.JMenu();
        ajudaSobreMnu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");

        arquivoMnu.setMnemonic('a');
        arquivoMnu.setText("Arquivo");

        exitMenuItem.setMnemonic('r');
        exitMenuItem.setText("Sair");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        arquivoMnu.add(exitMenuItem);

        menuBar.add(arquivoMnu);

        processosMnu.setMnemonic('p');
        processosMnu.setText("Processos");

        rotulosMnu.setMnemonic('r');
        rotulosMnu.setText("Rótulos");
        rotulosMnu.setActionCommand("Rotulos");

        rotuloCadastrarMnu.setMnemonic('c');
        rotuloCadastrarMnu.setText("Cadastrar");
        rotuloCadastrarMnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotuloCadastrarMnuActionPerformed(evt);
            }
        });
        rotulosMnu.add(rotuloCadastrarMnu);

        processosMnu.add(rotulosMnu);

        menuBar.add(processosMnu);

        ajudaMnu.setMnemonic('j');
        ajudaMnu.setText("Ajuda");
        ajudaMnu.setActionCommand("");

        ajudaSobreMnu.setMnemonic('s');
        ajudaSobreMnu.setText("Sobre");
        ajudaSobreMnu.setActionCommand("");
        ajudaMnu.add(ajudaSobreMnu);

        menuBar.add(ajudaMnu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void rotuloCadastrarMnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotuloCadastrarMnuActionPerformed
        RotuloCadastrar rotuloCadastrar = new RotuloCadastrar(this, true);
        rotuloCadastrar.setVisible(true);
    }//GEN-LAST:event_rotuloCadastrarMnuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu ajudaMnu;
    private javax.swing.JMenuItem ajudaSobreMnu;
    private javax.swing.JMenu arquivoMnu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu processosMnu;
    private javax.swing.JMenuItem rotuloCadastrarMnu;
    private javax.swing.JMenu rotulosMnu;
    // End of variables declaration//GEN-END:variables

}
