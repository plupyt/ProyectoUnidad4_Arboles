/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author plupy
 */
public class FrMenu extends javax.swing.JFrame {

    /**
     * Creates new form FrMenu
     */
    public FrMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
        searchOptions.add(rbName);
        searchOptions.add(rbAverage);
        searchOptions.add(rbDegree);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchOptions = new javax.swing.ButtonGroup();
        rbName = new javax.swing.JRadioButton();
        rbAverage = new javax.swing.JRadioButton();
        rbDegree = new javax.swing.JRadioButton();
        lbTitle = new javax.swing.JLabel();
        lbQuestionTree = new javax.swing.JLabel();
        optionesTree = new javax.swing.JComboBox<>();
        btnCreateTree = new javax.swing.JButton();
        lbQuestionSearch = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbCoincidences = new javax.swing.JTable();
        btnLoadData = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        lbTotalCompares = new javax.swing.JLabel();
        lbDirection = new javax.swing.JLabel();
        txtDirection = new javax.swing.JTextField();
        txtAverage = new javax.swing.JTextField();
        cbDegree = new javax.swing.JComboBox<>();
        lbCoincidences = new javax.swing.JLabel();
        lbTimeExecute = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        rbName.setText("Nombre");

        rbAverage.setText("Promedio");

        rbDegree.setText("Licenciatura");

        lbTitle.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        lbTitle.setText("Proyecto Árboles");

        lbQuestionTree.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbQuestionTree.setText("¿Qué tipo de árbol desea?");

        optionesTree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Árbol AB", "Árbol AVL", "Árbol B" }));

        btnCreateTree.setText("Crear árbol");

        lbQuestionSearch.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbQuestionSearch.setText("¿Cómo desea realizar su búsqueda?");

        btnSearch.setText("Buscar");

        tbCoincidences.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre", "Licenciatura", "Promedio"
            }
        ));
        jScrollPane1.setViewportView(tbCoincidences);

        btnLoadData.setText("Cargar datos");
        btnLoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoadDataActionPerformed(evt);
            }
        });

        lbTotalCompares.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbTotalCompares.setText("Comparaciones totales:");

        lbDirection.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbDirection.setText("Dirección: ");

        cbDegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingeniería de software", " " }));

        lbCoincidences.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbCoincidences.setText("Coincidencias:");

        lbTimeExecute.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        lbTimeExecute.setText("Tiempo de ejecución:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbDirection)
                                .addGap(29, 29, 29)
                                .addComponent(txtDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbQuestionSearch))
                        .addGap(48, 48, 48)
                        .addComponent(btnLoadData)
                        .addContainerGap(222, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(optionesTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCreateTree))
                            .addComponent(lbQuestionTree))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbName)
                                    .addComponent(rbAverage)
                                    .addComponent(rbDegree))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(txtAverage))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(btnSearch)))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotalCompares)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTimeExecute)
                            .addComponent(lbCoincidences)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(lbTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lbTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLoadData)
                    .addComponent(lbDirection)
                    .addComponent(txtDirection, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCoincidences, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbQuestionTree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(optionesTree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCreateTree))
                        .addGap(32, 32, 32)
                        .addComponent(lbQuestionSearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbAverage)
                            .addComponent(txtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbDegree)
                            .addComponent(cbDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbTotalCompares)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTimeExecute)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadDataActionPerformed
        //btnLoadData
        
    }//GEN-LAST:event_btnLoadDataActionPerformed

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
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateTree;
    private javax.swing.JButton btnLoadData;
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox<String> cbDegree;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCoincidences;
    private javax.swing.JLabel lbDirection;
    private javax.swing.JLabel lbQuestionSearch;
    private javax.swing.JLabel lbQuestionTree;
    private javax.swing.JLabel lbTimeExecute;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTotalCompares;
    private javax.swing.JComboBox<String> optionesTree;
    private javax.swing.JRadioButton rbAverage;
    private javax.swing.JRadioButton rbDegree;
    private javax.swing.JRadioButton rbName;
    private javax.swing.ButtonGroup searchOptions;
    private javax.swing.JTable tbCoincidences;
    private javax.swing.JTextField txtAverage;
    private javax.swing.JTextField txtDirection;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
