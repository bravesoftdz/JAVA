/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package COM_CONEXAO_BANCO_DADOS;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class consultaClientes extends javax.swing.JDialog {

    /**
     * Creates new form consProduto
     */
    public consultaClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        cli.setListaCli(cli.retornaClientes());
        for (int f = 0; f < cli.getListaCli().size(); f++){
            String[] linhaResul;
            linhaResul = cli.getListaCli().get(f).split(";");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();   
            Object[] linha = {linhaResul[0], linhaResul[1], linhaResul[3], linhaResul[2]};                
            model.addRow(linha);
        }        
    }
    
    public int codigo;
    public String nome;
    
    Cliente cli = new Cliente();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator8 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 620, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Consulta de Clientes");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 660, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "CPF", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 640, 340));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 620, -1));

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Todos");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jRadioButton2.setText("Nome");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jRadioButton3.setText("Código");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        codigo = Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 0)));
        nome = String.valueOf(jTable1.getModel().getValueAt(jTable1.getSelectedRow(), 1));
        dispose();
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);
            cli.setListaCli(cli.retornaClientes());
                if (jRadioButton1.isSelected()){ //Todos
                    for (int f = 0; f < cli.getListaCli().size(); f++){
                        String[] linhaResul;
                        linhaResul = cli.getListaCli().get(f).split(";");                       
                        Object[] linha = {linhaResul[0], linhaResul[1], linhaResul[3], linhaResul[2]};                 
                        model.addRow(linha);
                    }
                } else if (jRadioButton3.isSelected()){ //Código
                    for (int f = 0; f < cli.getListaCli().size(); f++){
                        String[] linhaResul;
                        linhaResul = cli.getListaCli().get(f).split(";");
                        if (linhaResul[0].equals(jTextField1.getText())){
                           Object[] linha = {linhaResul[0], linhaResul[1], linhaResul[3], linhaResul[2]};                
                            model.addRow(linha);
                        }
                    }
                } else if (jRadioButton2.isSelected()){ //Descrição
                    for (int f = 0; f < cli.getListaCli().size(); f++){
                        String[] linhaResul;
                        linhaResul = cli.getListaCli().get(f).split(";");
                        String nome = linhaResul[1].toUpperCase();
                        String digitado = jTextField1.getText().toUpperCase();
                        if (nome.contains(digitado)){
                           Object[] linha = {linhaResul[0], linhaResul[1], linhaResul[3], linhaResul[2]};                 
                            model.addRow(linha);
                        }
                    }
                }             
        }        
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton1.isSelected()){
            jRadioButton2.setSelected(false);
            jRadioButton3.setSelected(false);
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setNumRows(0);            
            cli.setListaCli(cli.retornaClientes());
            for (int f = 0; f < cli.getListaCli().size(); f++){
                    String[] linhaResul;
                linhaResul = cli.getListaCli().get(f).split(";");   
                Object[] linha = {linhaResul[0], linhaResul[1], linhaResul[3], linhaResul[2]};              
                model.addRow(linha);
            }             
        } else {
            jRadioButton2.setSelected(true);
        }
        
        jTextField1.requestFocus();
        jTextField1.selectAll();        
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton3.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton2.setSelected(false);
        } else {
            jRadioButton2.setSelected(true);
        }
        
        jTextField1.requestFocus();
        jTextField1.selectAll();        
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if (jRadioButton2.isSelected()){
            jRadioButton1.setSelected(false);
            jRadioButton3.setSelected(false);
        } else {
            jRadioButton1.setSelected(true);
        }
        
        jTextField1.requestFocus();
        jTextField1.selectAll();        
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(consultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(consultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(consultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(consultaClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                consultaClientes dialog = new consultaClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
