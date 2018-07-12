package view;

import dao.CarroDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Carro;

public class InserirCarro extends javax.swing.JFrame {

    private List<Carro> carros = new ArrayList<Carro>();
    private Carro carro = new Carro();
    private boolean alterarTrue = false;

    public InserirCarro() {
        initComponents();
        listarCarro();
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfModelo = new javax.swing.JTextField();
        jtfMarca = new javax.swing.JTextField();
        jtfValor = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jbtSalvar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaCarro = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtfPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Cadastrais"));

        jLabel1.setText("MODELO:");

        jLabel2.setText("MARCA:");

        jLabel3.setText("VALOR:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(jtfModelo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/excluir.png"))); // NOI18N
        jButton2.setText("EXCLUIR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbtSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/salvar.png"))); // NOI18N
        jbtSalvar.setText("SALVAR");
        jbtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtSalvarActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/sair.png"))); // NOI18N
        jButton4.setText("SAIR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/alterar.png"))); // NOI18N
        jButton3.setText("ALTERAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jbtSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );

        tabelaCarro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CÓDIGO", "MODELO", "MARCA", "VALOR"
            }
        ));
        jScrollPane1.setViewportView(tabelaCarro);

        jLabel4.setText("PESQUISAR:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisar.png"))); // NOI18N
        jButton1.setText("PESQUISAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtSalvarActionPerformed
        CarroDAO dao = new CarroDAO();
        try {
            if(alterarTrue == false){
                Carro carro = new Carro();
                carro.setModelo(jtfModelo.getText());
                carro.setMarca(jtfMarca.getText());
                carro.setValor(Double.parseDouble(jtfValor.getText()));
                
                dao.salvar(carro);
                listarCarro();
                JOptionPane.showMessageDialog(null, "Carro salvo com sucesso!");
                jtfMarca.setText(null);
                jtfModelo.setText(null);
                jtfValor.setText(null);
            }else{
                carro.setMarca(jtfMarca.getText());
                carro.setModelo(jtfModelo.getText());
                carro.setValor(Double.parseDouble(jtfValor.getText()));
                dao.salvar(carro);
                listarCarro();
                JOptionPane.showMessageDialog(null, "Carro alterado com sucesso!");
                jtfMarca.setText(null);
                jtfModelo.setText(null);
                jtfValor.setText(null);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Carro!");
            Logger.getLogger(InserirCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbtSalvarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaCarro.getModel();
        int selecao = tabelaCarro.getSelectedRow();
        if (selecao < 0) {
            JOptionPane.showMessageDialog(null, "É necessário selecionar um veículo!");
        } else {
            carro = carros.get(selecao);
            CarroDAO dao = new CarroDAO();
            try {
                dao.excluir(carro);
                listarCarro();
                JOptionPane.showMessageDialog(null, "Carro excluído com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao excluir carro!");
                Logger.getLogger(InserirCarro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jtfPesquisa.equals(null) || jtfPesquisa.equals("") || jtfPesquisa.equals(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o modelo para pesquisa!");
        } else {
            pesquisarModelo();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) tabelaCarro.getModel();
        if (tabelaCarro.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "É necessário selecionar um veículo!");
        } else {
            carro = carros.get(tabelaCarro.getSelectedRow());
            jtfMarca.setText(carro.getMarca());
            jtfModelo.setText(carro.getModelo());
            jtfValor.setText("" + carro.getValor());
            alterarTrue = true;
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtSalvar;
    private javax.swing.JTextField jtfMarca;
    private javax.swing.JTextField jtfModelo;
    private javax.swing.JTextField jtfPesquisa;
    private javax.swing.JTextField jtfValor;
    private javax.swing.JTable tabelaCarro;
    // End of variables declaration//GEN-END:variables

    public void listarCarro() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCarro.getModel();
        modelo.setRowCount(0);
        try {
            CarroDAO dao = new CarroDAO();
            carros = dao.buscarTodos();
            for (Carro carro : carros) {
                modelo.addRow(new String[]{carro.getCodigo() + "", carro.getModelo(), carro.getMarca(), carro.getValor() + ""});
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listas Carros.");
            Logger.getLogger(InserirCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pesquisarModelo() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaCarro.getModel();
        modelo.setRowCount(0);
        try {
            List<Carro> carros = new CarroDAO().pesquisarPorModelo(jtfPesquisa.getText());
            for (Carro carro : carros) {
                modelo.addRow(new String[]{carro.getCodigo() + "", carro.getModelo(), carro.getMarca(), carro.getValor() + ""});
            }
        } catch (Exception ex) {
            Logger.getLogger(InserirCarro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}