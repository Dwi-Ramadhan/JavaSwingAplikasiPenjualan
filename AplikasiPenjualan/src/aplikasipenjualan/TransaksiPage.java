/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package AplikasiPenjualan;

import AplikasiPenjualan.ServerAPI.ServerAPI;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import javax.swing.event.TableModelEvent;

/**
 *
 * @author Lenovo
 */
public class TransaksiPage extends javax.swing.JPanel {

    /**
     * Creates new form TransaksiPage
     */
    public TransaksiPage() {
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

        pageTitle = new javax.swing.JLabel();
        tambahBarangButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        totalHarga = new javax.swing.JLabel();
        simpanButton = new javax.swing.JButton();
        hapusButton = new javax.swing.JButton();

        pageTitle.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        pageTitle.setText("Transaksi");

        tambahBarangButton.setText("Tambah Barang");
        tambahBarangButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahBarangButtonActionPerformed(evt);
            }
        });

        dataTable.getTableHeader().setFont(new java.awt.Font("Arial", 0, 16));
        dataTable.getTableHeader().setBackground(Color.BLACK);
        dataTable.getTableHeader().setForeground(Color.WHITE);
        dataTable.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Barang", "Harga", "Stok", "Jumlah"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dataTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(dataTable);
        if (dataTable.getColumnModel().getColumnCount() > 0) {
            dataTable.getColumnModel().getColumn(1).setResizable(false);
            dataTable.getColumnModel().getColumn(2).setMinWidth(70);
            dataTable.getColumnModel().getColumn(2).setPreferredWidth(70);
            dataTable.getColumnModel().getColumn(2).setMaxWidth(70);
        }

        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
        for(String idBarang : selectedBarangID){
            String[] dataBarang = ServerAPI.get_data_barang(idBarang);
            if(dataBarang.length == 4){
                String[] row = {
                    dataBarang[1], dataBarang[2], dataBarang[3], "0"
                };
                tableModel.addRow(row);
            }
        }
        tableModel.addTableModelListener(new TransaksiPageTableChangeListener());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Total : ");

        totalHarga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        totalHarga.setText("0");

        simpanButton.setText("Simpan");
        simpanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanButtonActionPerformed(evt);
            }
        });

        hapusButton.setText("Hapus");
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 564, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(pageTitle)
                                .addGap(333, 333, 333)
                                .addComponent(hapusButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tambahBarangButton))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(simpanButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalHarga)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tambahBarangButton)
                            .addComponent(hapusButton)))
                    .addComponent(pageTitle))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(totalHarga)
                    .addComponent(simpanButton))
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tambahBarangButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahBarangButtonActionPerformed
        SelectBarangDialog dialog = new SelectBarangDialog(this, (javax.swing.JFrame)this.getTopLevelAncestor(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_tambahBarangButtonActionPerformed

    private void simpanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanButtonActionPerformed
        System.out.print("\nSave transaction data to DB...");
        
        int selectedBarangCount = selectedBarangID.size();
        String[][] data = new String[selectedBarangCount][2];
        
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
        String[] jumlahField = new String[selectedBarangCount];
        for(int i=0; i<selectedBarangCount; ++i){
            jumlahField[i] = String.valueOf(Integer.parseInt((String)tableModel.getValueAt(i, 3)));
        }
        
        for(int i=0; i<selectedBarangCount; ++i){
            data[i][0] = selectedBarangID.get(i);
            data[i][1] = jumlahField[i];
        }
        
        int idUser = ((MainFrame) this.getTopLevelAncestor()).idUser;
        boolean isSaved = ServerAPI.simpan_data_transaksi(String.valueOf(idUser), java.time.LocalDate.now().toString(), totalHarga.getText(), data);
        System.out.print("\nisSaved = " + isSaved);
        if(isSaved){
            System.out.print("\nsaved");
            refresh();
        }else{
            System.out.print("\ndata transaksi hasnt been saved");
        }
    }//GEN-LAST:event_simpanButtonActionPerformed

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        int selectedRow = dataTable.getSelectedRow();
        if(selectedRow != -1){
            ((javax.swing.table.DefaultTableModel) dataTable.getModel()).removeRow(selectedRow);
            selectedBarangID.remove(selectedRow);
        }
    }//GEN-LAST:event_hapusButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable dataTable;
    private javax.swing.JButton hapusButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel pageTitle;
    private javax.swing.JButton simpanButton;
    private javax.swing.JButton tambahBarangButton;
    private javax.swing.JLabel totalHarga;
    // End of variables declaration//GEN-END:variables

    //my own declaration
    ArrayList<String> selectedBarangID = new ArrayList<String>();
    
    public void addSelectedBarang(ArrayList<String> selectedBarangIDs){
        System.out.print("\nAdding selected barang to List");
        selectedBarangID.addAll(selectedBarangIDs);
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
        for(String idBarang : selectedBarangIDs){
            String[] dataBarang = ServerAPI.get_data_barang(idBarang);
            if(dataBarang.length == 4){
                String[] row = {
                    dataBarang[1], dataBarang[2], dataBarang[3], "0", "0"
                };
                tableModel.addRow(row);
            }
        }
    }
    
    public void refresh(){
        System.out.print("\nRefreshing transaksi page...");
        selectedBarangID.clear();
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) dataTable.getModel();
        int rowCount = dataTable.getRowCount();
        for(int i=0; i<rowCount; ++i){
            tableModel.removeRow(0);
        }
        totalHarga.setText("0");
    }
    
    class TransaksiPageTableChangeListener implements javax.swing.event.TableModelListener{

    @Override
    public void tableChanged(TableModelEvent e) {
        int total = 0;
        javax.swing.table.DefaultTableModel tableModel = (javax.swing.table.DefaultTableModel) e.getSource();
        int rowsCount = tableModel.getRowCount();
        for(int i=0; i<rowsCount; ++i){
            int harga = Integer.parseInt((String)tableModel.getValueAt(i, 1));
            int jumlah = Integer.parseInt((String)tableModel.getValueAt(i, 3));
            total += harga*jumlah;
        }
        totalHarga.setText(String.valueOf(total));
    }
    
    }
}
