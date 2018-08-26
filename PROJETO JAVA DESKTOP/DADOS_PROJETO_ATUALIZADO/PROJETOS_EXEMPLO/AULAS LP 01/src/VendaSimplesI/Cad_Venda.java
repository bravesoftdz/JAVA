/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VendaSimplesI;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Fernando
 */
public class Cad_Venda extends javax.swing.JFrame {

    /**
     * Creates new form Cad_Venda
     */
    
    Date data = new Date();
    
    Venda v = new Venda();
    VendaProduto vp = new VendaProduto();
    Produto pro = new Produto();
    Cliente cli = new Cliente();
    Vendedor vend = new Vendedor();
    consultaVendas cons = new consultaVendas(this, true);
    consultaClientes consCli = new consultaClientes(this, true);
    consultaProduto consPro = new consultaProduto(this, true);
    consultaVendedores consVen = new consultaVendedores(this, true);
    
    public Cad_Venda() {
        initComponents();
        this.setLocationRelativeTo(null);
        jTextField2.requestFocus();        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator6 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 610, 10));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faturamento");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 650, -1));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 610, 10));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Descrição", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 610, 150));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Código");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, -1));

        jTextField3.setEnabled(false);
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 60, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Cliente");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setText("Produtos");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextField4.setEnabled(false);
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField4KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 60, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VendaSimplesI/Knob Valid Green.png"))); // NOI18N
        jButton2.setText("Gravar");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 130, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VendaSimplesI/Knob Cancel.png"))); // NOI18N
        jButton4.setText("Cancelar");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, 130, 40));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, -1, 20));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));
        getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 610, 10));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Vendedor");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Valor");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 250, -1, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Código");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Descrição");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, 20));

        jTextField1.setEditable(false);
        jTextField1.setEnabled(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 320, -1));

        jTextField5.setEnabled(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField5KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 90, -1));

        jTextField6.setEnabled(false);
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        jTextField6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField6KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 100, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Qtd.");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 80, 20));

        jTextField7.setEnabled(false);
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jTextField7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField7KeyPressed(evt);
            }
        });
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 70, -1));
        getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 610, 10));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VendaSimplesI/Knob Remove Red.png"))); // NOI18N
        jButton1.setText("Deletar Item");
        jButton1.setEnabled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 455, 130, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VendaSimplesI/Knob Add.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 40, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VendaSimplesI/Knob Search.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 40, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VendaSimplesI/Knob Red.png"))); // NOI18N
        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, 130, 40));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 260, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed
        // TODO add your handling code here:
        if ((evt.getKeyCode() == KeyEvent.VK_ENTER) || (evt.getKeyCode() == KeyEvent.VK_TAB)){
            if (jTextField2.getText().equals("")){
                jTextField2.setText(String.valueOf(v.retornaUltimo()));
                habilitaCampos(true);
                jTextField3.requestFocus();
            } else {
                v.setCodigo(Integer.parseInt(jTextField2.getText()));
            
                if (v.procurarVenda(v.getCodigo())){
                    jTextField3.setText(String.valueOf(v.getCliente()));
                    jTextField4.setText(String.valueOf(v.getVendedor()));
                    
                    cli.setCodigo(v.getCodigo());
                    cli.procurarCliente();
                    //jTextField9.setText(cli.getNome());
                    
                    vend.setCodigo(v.getVendedor());
                    vend.procurarVendedor();
                    //jTextField8.setText(vend.getNome());
                    
                    habilitaCampos(true);
                    
                    jComboBox1.setSelectedItem(cli.getNome());
                    jComboBox2.setSelectedItem(vend.getNome());
                    
                    jButton2.setEnabled(false);
                    jButton1.setEnabled(false);
                    jTextField3.requestFocus();
                    
                    //Faço a inserção dos itens no grid
                    vp.setListaProd(vp.setaProdutosVenda());
                    
                    for (int f = 0; f < vp.getListaProd().size(); f++){
                        String[] linhaResul;
                        linhaResul = vp.getListaProd().get(f).split(";");
                        
                        if (linhaResul[0].equals(String.valueOf(v.getCodigo()))){
                            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                            pro.setCodigo(Integer.parseInt(linhaResul[1]));
                            pro.procurarProduto();
                            Object[] linha = {linhaResul[1], pro.getDescricao(), linhaResul[2], linhaResul[3]};                
                            model.addRow(linha);
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Venda não existe!");
                    habilitaCampos(false);
                    jTextField2.requestFocus();            
                }
            }
        }        
    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextField4.requestFocus();
            cli.setCodigo(Integer.parseInt(jTextField3.getText()));
            if (cli.procurarCliente()){
                //jTextField9.setText(cli.getNome());
                jComboBox1.setSelectedItem(cli.getNome());
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_F11){
            consCli.setVisible(true);
            jTextField3.setText(String.valueOf(consCli.codigo));
            jComboBox1.setSelectedItem(consCli.nome);
            //jTextField9.setText(consCli.nome);
            jTextField3.requestFocus();
        }
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            jTextField6.requestFocus();        
            vend.setCodigo(Integer.parseInt(jTextField4.getText()));
            if (vend.procurarVendedor()){
                //jTextField8.setText(vend.getNome());
                jComboBox2.setSelectedItem(vend.getNome());
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_F11){
            consVen.setVisible(true);
            jTextField4.setText(String.valueOf(consVen.codigo));
            jComboBox2.setSelectedItem(consVen.nome);
            //jTextField8.setText(consVen.nome);
            jTextField4.requestFocus();
        }
    }//GEN-LAST:event_jTextField4KeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        v.setCliente(Integer.parseInt(jTextField3.getText()));
        v.setCodigo(Integer.parseInt(jTextField2.getText()));
        v.setVendedor(Integer.parseInt(jTextField4.getText()));
        v.setData(String.valueOf(data.getTime()));
        if (v.gravarVenda()){
            for (int x = 0; x < jTable1.getRowCount(); x++){
                vp.setPreco(Double.parseDouble(String.valueOf(jTable1.getModel().getValueAt(x, 3))));
                vp.setProduto(Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(x, 0))));
                vp.setQuantidade(Integer.parseInt(String.valueOf(jTable1.getModel().getValueAt(x, 2))));                    
                vp.gravarProdutoDaVenda(Integer.parseInt(jTextField2.getText()));            
            }
            JOptionPane.showMessageDialog(null, "Venda gravada com sucesso!");
            limpaCampos();
            habilitaCampos(false);
            jButton2.requestFocus();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        limpaCampos();
        habilitaCampos(false);
        jTextField2.requestFocus();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
        if (!jTextField6.getText().equals("")){
            pro.setCodigo(Integer.parseInt(jTextField6.getText()));
            if (pro.procurarProduto()){
                jTextField1.setText(pro.getDescricao());
                jTextField5.setText(String.valueOf(pro.getPreco()));
                jTextField7.requestFocus();
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado");
                jTextField6.requestFocus();
            }
        }
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jTextField5ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jTextField5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER){
            if (!jTextField5.getText().equals("")){
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();                
                Object[] linha = {jTextField6.getText(), jTextField1.getText(), jTextField7.getText(), jTextField5.getText()};                
                model.addRow(linha);
                jTextField1.setText("");
                jTextField5.setText("");
                jTextField6.setText("");
                jTextField7.setText("");
                jTextField6.requestFocus();
            } else{
                JOptionPane.showMessageDialog(null, "Informe um Valor!");
                jTextField5.requestFocus();                
            }                
        }        
    }//GEN-LAST:event_jTextField5KeyPressed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField7KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER)
            jTextField5.requestFocus();        
    }//GEN-LAST:event_jTextField7KeyPressed

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        jTextField2.setText(String.valueOf(v.retornaUltimo()));
        habilitaCampos(true);
        jTextField3.requestFocus();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jTable1.getModel()).removeRow(jTable1.getSelectedRow()); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        cons.setVisible(true);
        jTextField2.setText(String.valueOf(cons.codigo));
        jTextField2.requestFocus();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField6KeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_F11){
            consPro.setVisible(true);
            jTextField6.setText(String.valueOf(consPro.codigo));
            jTextField1.setText(consPro.nome);
            jTextField6.requestFocus();
        }
    }//GEN-LAST:event_jTextField6KeyPressed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        cli.setListaCli(cli.retornaClientes());
        for (int x = 0; x < cli.getListaCli().size(); x++){
            String[] linhaResul = cli.getListaCli().get(x).split(";");
            
            if (linhaResul[1].equals(jComboBox1.getSelectedItem())){
                jTextField3.setText(linhaResul[0]);
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
        vend.setListaVend(vend.retornaVendedores());
        for (int x = 0; x < vend.getListaVend().size(); x++){
            String[] linhaResul = vend.getListaVend().get(x).split(";");
            
            if (linhaResul[1].equals(jComboBox2.getSelectedItem())){
                jTextField4.setText(linhaResul[0]);
            }
        }        
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cad_Venda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cad_Venda().setVisible(true);
            }
        });
    }
    
    public void habilitaCampos(boolean habilita){
        jTextField3.setEnabled(habilita);
        jTextField4.setEnabled(habilita);
        jTextField5.setEnabled(habilita);
        jTextField6.setEnabled(habilita);
        jTextField7.setEnabled(habilita);
        jTextField1.setEnabled(habilita);
        //jTextField8.setEnabled(habilita);
        //jTextField9.setEnabled(habilita);
        jButton1.setEnabled(habilita);
        jButton2.setEnabled(habilita);
        jButton4.setEnabled(habilita);
        
        jTextField2.setEnabled(!habilita);
        jButton5.setEnabled(!habilita);
        jButton6.setEnabled(!habilita);
        jButton3.setEnabled(!habilita);
        
        if (habilita){            
            jComboBox1.removeAllItems();
            cli.setListaCli(cli.retornaClientes());
            jComboBox1.addItem("Selecione o Cliente");
            for (int f = 0; f < cli.getListaCli().size(); f++){
                String[] linhaResul;
                linhaResul = cli.getListaCli().get(f).split(";");                
                jComboBox1.addItem(linhaResul[1]);
            }
            
            jComboBox2.removeAllItems();
            vend.setListaVend(vend.retornaVendedores());
            jComboBox2.addItem("Selecione o Vendedor");
            for (int f = 0; f < vend.getListaVend().size(); f++){
                String[] linhaResul;
                linhaResul = vend.getListaVend().get(f).split(";");                
                jComboBox2.addItem(linhaResul[1]);
            }            
        } else {
            jComboBox1.removeAllItems();
            jComboBox2.removeAllItems();
        }
    }
    
    public void limpaCampos(){
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        //jTextField8.setText("");
        //jTextField9.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setNumRows(0);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
