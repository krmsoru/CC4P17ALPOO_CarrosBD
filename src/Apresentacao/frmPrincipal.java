/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Apresentacao;

/**
 *
 * @author Usuario
 */
public class frmPrincipal extends javax.swing.JDialog
{

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuCarros = new javax.swing.JMenu();
        mniCadastrar = new javax.swing.JMenuItem();
        mniPFMEE = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Carro CRUD");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 49, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(236, 236, 236));
        jMenuBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(52, 35));

        mnuCarros.setBackground(new java.awt.Color(177, 177, 177));
        mnuCarros.setForeground(new java.awt.Color(0, 0, 0));
        mnuCarros.setText("Carros");

        mniCadastrar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniCadastrar.setBackground(new java.awt.Color(183, 183, 183));
        mniCadastrar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mniCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        mniCadastrar.setText("Cadastrar");
        mniCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniCadastrarActionPerformed(evt);
            }
        });
        mnuCarros.add(mniCadastrar);

        mniPFMEE.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        mniPFMEE.setBackground(new java.awt.Color(183, 183, 183));
        mniPFMEE.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        mniPFMEE.setForeground(new java.awt.Color(0, 0, 0));
        mniPFMEE.setText("Pesquisar, editar ou excluir");
        mniPFMEE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniPFMEEActionPerformed(evt);
            }
        });
        mnuCarros.add(mniPFMEE);

        jMenuBar1.add(mnuCarros);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mniCadastrarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniCadastrarActionPerformed
    {//GEN-HEADEREND:event_mniCadastrarActionPerformed
        frmCadastro frmC = new frmCadastro(null,true);
        frmC.setVisible(true);
    }//GEN-LAST:event_mniCadastrarActionPerformed

    private void mniPFMEEActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_mniPFMEEActionPerformed
    {//GEN-HEADEREND:event_mniPFMEEActionPerformed
        frmPesquisarEditarExcluir frmPEE = new frmPesquisarEditarExcluir(null,true);
        frmPEE.setVisible(true);
    }//GEN-LAST:event_mniPFMEEActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                frmPrincipal dialog = new frmPrincipal(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem mniCadastrar;
    private javax.swing.JMenuItem mniPFMEE;
    private javax.swing.JMenu mnuCarros;
    // End of variables declaration//GEN-END:variables
}