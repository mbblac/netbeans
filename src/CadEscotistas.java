
import DAO.EscotistasDAO;
import Dados.Escotistas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 277841
 */
public class CadEscotistas extends javax.swing.JFrame {

    /**
     * Creates new form CadEscotistas
     */
    public CadEscotistas() {
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
        jlReg = new javax.swing.JLabel();
        jtfReg = new javax.swing.JTextField();
        jlsenha = new javax.swing.JLabel();
        jpfSenha = new javax.swing.JPasswordField();
        jlNome = new javax.swing.JLabel();
        jtfNome = new javax.swing.JTextField();
        jlCar = new javax.swing.JLabel();
        jtfCar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfRamo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jbInserir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbVisualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(82, 127, 118));

        jlReg.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jlReg.setText("Registro:");

        jtfReg.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jlsenha.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jlsenha.setText("Senha:");

        jpfSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jlNome.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jlNome.setText("Nome:");

        jtfNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jlCar.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jlCar.setText("Cargo:");

        jtfCar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        jLabel5.setText("Ramo:");

        jtfRamo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel6.setText("Escotista");

        jbInserir.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jbAlterar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbVisualizar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jbVisualizar.setText("Visualizar");
        jbVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarActionPerformed(evt);
            }
        });

        jbLimpar.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbSair.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jbSair.setText("Sair");
        jbSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairActionPerformed(evt);
            }
        });

        jtTabela.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registro", "Nome", "Cargo", "Ramo"
            }
        ));
        jScrollPane1.setViewportView(jtTabela);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSair))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlReg)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jlNome)))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(130, 130, 130))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtfNome, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                            .addComponent(jtfRamo)
                                            .addComponent(jtfReg))
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jlsenha)
                                            .addComponent(jlCar))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtfCar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jbInserir)
                                        .addGap(64, 64, 64)
                                        .addComponent(jbVisualizar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jbAlterar)
                                        .addGap(35, 35, 35)
                                        .addComponent(jbLimpar))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 44, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlReg)
                    .addComponent(jlsenha)
                    .addComponent(jpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNome)
                    .addComponent(jlCar)
                    .addComponent(jtfCar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfRamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbVisualizar)
                    .addComponent(jbAlterar)
                    .addComponent(jbLimpar)
                    .addComponent(jbInserir))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jbSair)
                .addGap(18, 18, 18))
        );

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
    }// </editor-fold>//GEN-END:initComponents

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
    Escotistas esco = new Escotistas();
    EscotistasDAO dao = new EscotistasDAO();
    
    esco.setreg_escotista(Integer.valueOf(jtfReg.getText().trim()));
    esco.setsenha_escotista(jpfSenha.getText().trim());
    esco.setnome_escotista(jtfNome.getText().trim());
    esco.setcargo_escotista(jtfCar.getText().trim());
    esco.setramo_escotista(jtfRamo.getText().trim());
    
        try { 
        if (dao.inserir(esco)){JOptionPane.showMessageDialog(this,"Cadastro feito com Sucesso"); }
            
        else { JOptionPane.showMessageDialog(this,"Eroo no Cadastro.\n", "Erro", JOptionPane.ERROR_MESSAGE);  } 
        }
        catch (SQLException ex) { Logger.getLogger(CadEscotistas.class.getName()).log(Level.SEVERE, null, ex);     }
    
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
    Escotistas escot = new Escotistas();
    EscotistasDAO dao = new EscotistasDAO();
    
    escot.setreg_escotista(Integer.parseInt(jtfReg.getText()));
    escot.setsenha_escotista(jpfSenha.getText().trim());
    escot.setnome_escotista(jtfNome.getText().trim());
    escot.setcargo_escotista(jtfCar.getText().trim());
    escot.setramo_escotista(jtfRamo.getText().trim());
    
    if (dao.alterar(escot)){JOptionPane.showMessageDialog(this,"Alteração feita com Sucesso"); }
    
    else {JOptionPane.showMessageDialog(this,"Eroo na Alteração.\n", "Erro", JOptionPane.ERROR_MESSAGE);  }
      
    
    
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
     jtfReg.setText(null);
     jpfSenha.setText(null);
     jtfNome.setText(null);
     jtfCar.setText(null);
     jtfRamo.setText(null);
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarActionPerformed
     DefaultTableModel modelo = new DefaultTableModel();
     modelo.addColumn("Registro");
     modelo.addColumn("Senha");
     modelo.addColumn("Nome");
     modelo.addColumn("Cargo");
     modelo.addColumn("Ramo");
     
     EscotistasDAO escot = new EscotistasDAO();
     
     ArrayList<Escotistas>array = escot.buscarTodos();
     for (Escotistas j:array){
     System.out.println(j.getreg_escotista());
     Object[] Dados={j.getreg_escotista(),j.getsenha_escotista(),j.getnome_escotista(),j.getcargo_escotista(),j.getramo_escotista()};
     modelo.addRow(Dados);
     
     
     }
     jtTabela.setModel(modelo);
    }//GEN-LAST:event_jbVisualizarActionPerformed

    private void jbSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairActionPerformed
    dispose();
    }//GEN-LAST:event_jbSairActionPerformed

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
            java.util.logging.Logger.getLogger(CadEscotistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadEscotistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadEscotistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadEscotistas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadEscotistas().setVisible(true);
            }
        });
    }
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSair;
    private javax.swing.JButton jbVisualizar;
    private javax.swing.JLabel jlCar;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlReg;
    private javax.swing.JLabel jlsenha;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTextField jtfCar;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfRamo;
    private javax.swing.JTextField jtfReg;
    // End of variables declaration//GEN-END:variables
}
