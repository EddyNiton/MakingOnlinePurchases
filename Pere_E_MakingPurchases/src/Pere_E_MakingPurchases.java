/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eddy Perez Macias
 */
public class Pere_E_MakingPurchases extends javax.swing.JFrame {

    /**
     * Creates new form Pere_E_MakingPurchases
     */
    public Pere_E_MakingPurchases() {
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

        pnlBack = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblIntoPrompt = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        txtSpruce = new javax.swing.JTextField();
        txtBirch = new javax.swing.JTextField();
        txtOak = new javax.swing.JTextField();
        txtRedoak = new javax.swing.JTextField();
        lblSprPrompt = new javax.swing.JLabel();
        lblBirPrompt = new javax.swing.JLabel();
        lblOakPrompt = new javax.swing.JLabel();
        lblRedPrompt = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        lblSub = new javax.swing.JLabel();
        lblGrand = new javax.swing.JLabel();
        lblTaxAns = new javax.swing.JLabel();
        lblSubAns = new javax.swing.JLabel();
        lblGrandAns = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pnlBack.setBackground(new java.awt.Color(153, 81, 44));

        lblTitle.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        lblTitle.setText("Wood Chuck Wood");

        lblIntoPrompt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblIntoPrompt.setText("Enter how much wood would you buy a wood chuck who wants to chuck wood: ");

        btnCalculate.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 18)); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        txtSpruce.setText("0");
        txtSpruce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSpruceActionPerformed(evt);
            }
        });

        txtBirch.setText("0");

        txtOak.setText("0");

        txtRedoak.setText("0");

        lblSprPrompt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSprPrompt.setText("Spruce ($43.77):");

        lblBirPrompt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblBirPrompt.setText("Birch ($23.80):");

        lblOakPrompt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblOakPrompt.setText("Oak ($40.32):");

        lblRedPrompt.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblRedPrompt.setText("RedOak ($50.98):");

        lblTax.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTax.setText("Taxes (13%):");

        lblSub.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSub.setText("Grandtotal:");

        lblGrand.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblGrand.setText("Subtotal:");

        lblTaxAns.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblTaxAns.setText("$0.00");

        lblSubAns.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblSubAns.setText("$0.00");

        lblGrandAns.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        lblGrandAns.setText("$0.00");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Eddy Perez Macias\\Desktop\\download.jpg")); // NOI18N

        javax.swing.GroupLayout pnlBackLayout = new javax.swing.GroupLayout(pnlBack);
        pnlBack.setLayout(pnlBackLayout);
        pnlBackLayout.setHorizontalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblTitle))
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(lblIntoPrompt)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSprPrompt)
                    .addComponent(lblBirPrompt)
                    .addComponent(lblOakPrompt)
                    .addComponent(lblRedPrompt))
                .addGap(32, 32, 32)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtBirch, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSpruce, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOak, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRedoak, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSub)
                            .addComponent(lblGrand))
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnCalculate)
                                .addGap(300, 300, 300))
                            .addGroup(pnlBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSubAns, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTaxAns, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblGrandAns, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(67, 67, 67)
                                .addComponent(jLabel1)
                                .addContainerGap())))
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTax)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlBackLayout.setVerticalGroup(
            pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBackLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addComponent(lblIntoPrompt)
                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSpruce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSprPrompt)
                            .addComponent(btnCalculate))
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBackLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblBirPrompt)
                                    .addComponent(txtBirch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46)
                                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOakPrompt)
                                    .addComponent(txtOak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtRedoak, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRedPrompt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(57, 57, 57))))
                    .addGroup(pnlBackLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBackLayout.createSequentialGroup()
                                .addComponent(lblTaxAns)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlBackLayout.createSequentialGroup()
                                .addComponent(lblTax)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGrand)
                            .addComponent(lblSubAns))
                        .addGap(38, 38, 38)
                        .addGroup(pnlBackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSub)
                            .addComponent(lblGrandAns))
                        .addGap(79, 79, 79))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        
        String sSpruce = txtSpruce.getText();
        String sBirch = txtBirch.getText();
        String sOak = txtOak.getText();
        String sRedoak = txtRedoak.getText();
        
        double numSpruce = Double.parseDouble(sSpruce) * 43.77;
        double numBirch = Double.parseDouble(sBirch) * 23.8;
        double numOak = Double.parseDouble(sOak) * 40.32;
        double numRedoak = Double.parseDouble(sRedoak) * 50.98;
        
        double tax = (numSpruce + numBirch + numOak + numRedoak) * 0.13;
        double TaxAns = Math.round(tax*100)/100.0; 
        lblTaxAns.setText("$"+TaxAns);
        
        double total = numSpruce + numBirch + numOak + numRedoak; 
        double SubAns = Math.round(total*100)/100.0;
        lblSubAns.setText("$"+SubAns);
        
        double Grand = SubAns + TaxAns;
        double GrandAns = Math.round(Grand*100)/100.0;
        lblGrandAns.setText("$"+GrandAns);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnCalculateActionPerformed

    private void txtSpruceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSpruceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSpruceActionPerformed

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
            java.util.logging.Logger.getLogger(Pere_E_MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pere_E_MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pere_E_MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pere_E_MakingPurchases.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pere_E_MakingPurchases().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblBirPrompt;
    private javax.swing.JLabel lblGrand;
    private javax.swing.JLabel lblGrandAns;
    private javax.swing.JLabel lblIntoPrompt;
    private javax.swing.JLabel lblOakPrompt;
    private javax.swing.JLabel lblRedPrompt;
    private javax.swing.JLabel lblSprPrompt;
    private javax.swing.JLabel lblSub;
    private javax.swing.JLabel lblSubAns;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTaxAns;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlBack;
    private javax.swing.JTextField txtBirch;
    private javax.swing.JTextField txtOak;
    private javax.swing.JTextField txtRedoak;
    private javax.swing.JTextField txtSpruce;
    // End of variables declaration//GEN-END:variables
}
