/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasipenjualan;

import AplikasiPenjualan.ServerAPI.ServerAPI;

/**
 *
 * @author user
 */
public abstract class FormDataUserDialog extends javax.swing.JDialog {

    /**
     * Creates new form FormDataUserDialog
     */
    public FormDataUserDialog(java.awt.Frame parent, boolean modal) {
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

        jLabel1 = new javax.swing.JLabel();
        inputIdField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        inputNamaField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputPasswordField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setText("ID");

        inputIdField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inputIdField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        inputIdField.setMargin(new java.awt.Insets(10, 0, 0, 0));
        inputIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputIdFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nama");

        inputNamaField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inputNamaField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        inputNamaField.setMargin(new java.awt.Insets(10, 0, 0, 0));
        inputNamaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Password");

        inputPasswordField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inputPasswordField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        inputPasswordField.setMargin(new java.awt.Insets(10, 0, 0, 0));
        inputPasswordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputPasswordFieldActionPerformed(evt);
            }
        });

        submitButton.setText("Simpan");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNamaField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(inputNamaField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(submitButton)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdFieldActionPerformed

    private void inputNamaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaFieldActionPerformed

    private void inputPasswordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputPasswordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputPasswordFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        onSubmit();
    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField inputIdField;
    protected javax.swing.JTextField inputNamaField;
    protected javax.swing.JTextField inputPasswordField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    
    //my own declaration
    public abstract void onSubmit();
}

class TambahDataUserDialog extends aplikasipenjualan.FormDataUserDialog{
    private javax.swing.JFrame parentFrame;
    public TambahDataUserDialog(javax.swing.JFrame parentFrame){
        super(parentFrame, false);
        this.parentFrame=parentFrame;
        setTitle("Tambah Data User");
    }
    
    //@override
    public void onSubmit(){
        boolean isAdded = ServerAPI.add_data_user(inputIdField.getText(), inputNamaField.getText(), inputPasswordField.getText());
        if(isAdded){
            dispose();
            ((AplikasiPenjualan.MainFrame) parentFrame).navigateToDataUserPage();
        }else{
            dispose();
        }
    }
}

class EditDataUserDialog extends aplikasipenjualan.FormDataUserDialog{
    private javax.swing.JFrame parentFrame;
    private String id_user;
    public EditDataUserDialog(javax.swing.JFrame parentFrame, String id_user){
        super(parentFrame, false);
        this.parentFrame=parentFrame;
        this.id_user = id_user;
        setTitle("Edit Data User");
        
        String[] datas = ServerAPI.get_data_user(id_user);
        if(datas.length == 3){
            inputIdField.setText(datas[0]);
            inputNamaField.setText(datas[1]);
            inputPasswordField.setText(datas[2]);
        }
    }
    
    //@override
    public void onSubmit(){
        boolean isEdited = ServerAPI.edit_data_user(id_user, inputIdField.getText(), inputNamaField.getText(), inputPasswordField.getText());
        if(isEdited){
            dispose();
            ((AplikasiPenjualan.MainFrame) parentFrame).navigateToDataUserPage();
        }else{
            dispose();
        }
    }
}