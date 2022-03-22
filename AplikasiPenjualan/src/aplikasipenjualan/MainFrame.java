package AplikasiPenjualan;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame(int idUser) {
        this.idUser = idUser;
        initComponents();
        java.awt.CardLayout cards = (java.awt.CardLayout) body.getLayout();
        cards.show(body, "dataBarangPage");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penjualan");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(150, 50));

        body.setPreferredSize(new java.awt.Dimension(1200, 800));
        body.setLayout(new java.awt.CardLayout());

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jMenu1.setText("Data Master");
        jMenu1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem5.setText("Data User");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem1.setText("Data Barang");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem3.setText("Keluar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 5));
        jMenu2.setText("Transaksi");
        jMenu2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem2.setText("Kasir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 2, 5, 5));
        jMenu3.setText("Laporan");
        jMenu3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N

        jMenuItem4.setText("Log Transaksi");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        body.add(dataBarangPage, "dataBarangPage");
        body.add(transaksiPage, "transaksiPage");
        body.add(logPage, "logPage");
        body.add(dataUserPage, "dataUserPage");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 769, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 763, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        //back to login page to give "log out" effect
        this.dispose();
        LoginFrame login_page = new LoginFrame();
        login_page.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        navigateToDataBarangPage();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        navigateToTransaksiPage();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        navigateToLogPage();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        navigateToDataUserPage();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel body;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

    //my own declaration
    public int idUser;
    private final aplikasipenjualan.DataUserPage dataUserPage = new aplikasipenjualan.DataUserPage();
    private final DataBarangPage dataBarangPage = new DataBarangPage();
    private final TransaksiPage transaksiPage = new TransaksiPage();
    private final LogPage logPage = new LogPage();
    
    public void navigateToDataUserPage(){
        java.awt.CardLayout cards = (java.awt.CardLayout) body.getLayout();
        dataUserPage.refresh();
        cards.show(body, "dataUserPage");
        System.out.print("\nNavigate to data user page");
    }
    
    public void navigateToDataBarangPage(){
        java.awt.CardLayout cards = (java.awt.CardLayout) body.getLayout();
        dataBarangPage.refresh();
        cards.show(body, "dataBarangPage");
        System.out.print("\nNavigate to data barang page");
    }
    
    public void navigateToTransaksiPage(){
        java.awt.CardLayout cards = (java.awt.CardLayout) body.getLayout();
        transaksiPage.refresh();
        cards.show(body, "transaksiPage");
        System.out.print("\nNavigate to transaksi page");
    }
    
    public void navigateToLogPage(){
        java.awt.CardLayout cards = (java.awt.CardLayout) body.getLayout();
        logPage.refresh();
        cards.show(body, "logPage");
        System.out.print("\nNavigate to log page");
    }
}
