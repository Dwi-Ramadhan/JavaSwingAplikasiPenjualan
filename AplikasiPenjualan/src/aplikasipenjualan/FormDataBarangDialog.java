/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package AplikasiPenjualan;

import AplikasiPenjualan.ServerAPI.ServerAPI;

/**
 *
 * @author Lenovo
 */
public abstract class FormDataBarangDialog extends javax.swing.JDialog {

    /**
     * Creates new form FormDataBarangDialog
     */
    public FormDataBarangDialog(java.awt.Frame parent, boolean modal) {
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
        inputHargaField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        inputStokField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(275, 100));

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
        jLabel4.setText("Harga");

        inputHargaField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inputHargaField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        inputHargaField.setMargin(new java.awt.Insets(10, 0, 0, 0));
        inputHargaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputHargaFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Stok");

        inputStokField.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        inputStokField.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));
        inputStokField.setMargin(new java.awt.Insets(10, 0, 0, 0));
        inputStokField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputStokFieldActionPerformed(evt);
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
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNamaField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputHargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputStokField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
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
                    .addComponent(inputHargaField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(inputStokField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(submitButton)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputIdFieldActionPerformed

    private void inputNamaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaFieldActionPerformed

    private void inputHargaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputHargaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputHargaFieldActionPerformed

    private void inputStokFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputStokFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputStokFieldActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        onSubmit();
    }//GEN-LAST:event_submitButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JTextField inputHargaField;
    protected javax.swing.JTextField inputIdField;
    protected javax.swing.JTextField inputNamaField;
    protected javax.swing.JTextField inputStokField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
    
    //my own declaration
    public abstract void onSubmit();
}

class TambahDataBarangDialog extends FormDataBarangDialog{
    private javax.swing.JFrame parentFrame;
    public TambahDataBarangDialog(javax.swing.JFrame parentFrame){
        super(parentFrame, false);
        this.parentFrame=parentFrame;
        setTitle("Tambah Data Barang");
    }
    
    //@override
    public void onSubmit(){
        boolean isAdded = ServerAPI.add_data_barang(inputIdField.getText(), inputNamaField.getText(), inputHargaField.getText(), inputStokField.getText());
        if(isAdded){
            dispose();
            ((MainFrame) parentFrame).navigateToDataBarangPage();
        }else{
            dispose();
        }
    }
}

class EditDataBarangDialog extends FormDataBarangDialog{
    private javax.swing.JFrame parentFrame;
    private String id_barang;
    public EditDataBarangDialog(javax.swing.JFrame parentFrame, String kode_barang){
        super(parentFrame, false);
        this.parentFrame=parentFrame;
        this.id_barang = kode_barang;
        setTitle("Edit Data Barang");
        
        String[] datas = ServerAPI.get_data_barang(kode_barang);
        if(datas.length == 4){
            inputIdField.setText(datas[0]);
            inputNamaField.setText(datas[1]);
            inputHargaField.setText(datas[2]);
            inputStokField.setText(datas[3]);
        }
    }
    
    //@override
    public void onSubmit(){
        boolean isEdited = ServerAPI.edit_data_barang(id_barang, inputIdField.getText(), inputNamaField.getText(), inputHargaField.getText(), inputStokField.getText());
        if(isEdited){
            dispose();
            ((MainFrame) parentFrame).navigateToDataBarangPage();
        }else{
            dispose();
        }
    }
}