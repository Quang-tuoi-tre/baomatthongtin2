/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.Arrays;

/**
 *
 * @author Administrator
 */
public class frm_rail_fence extends javax.swing.JFrame {
    private int sokytu;
    private int sodu;
    private int t;
    private String kq;

   
    public frm_rail_fence() {
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

        mahoabtn = new javax.swing.JButton();
        giaimabtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtbr = new javax.swing.JTextArea();
        txtkhoa = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mahoabtn.setText("Encypt");
        mahoabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mahoabtnActionPerformed(evt);
            }
        });

        giaimabtn.setText("Dencypt");
        giaimabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaimabtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Thuật Toán Mã Hoá Rail Fence Cipher");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("PlainText:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Khoá:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Cipher Text:");

        txtbr.setColumns(20);
        txtbr.setRows(5);
        jScrollPane1.setViewportView(txtbr);

        txtkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkhoaActionPerformed(evt);
            }
        });

        txtbm.setColumns(20);
        txtbm.setRows(5);
        jScrollPane2.setViewportView(txtbm);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(mahoabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(giaimabtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(43, 43, 43))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mahoabtn)
                            .addComponent(giaimabtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mahoabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mahoabtnActionPerformed
        // TODO add your handling code here:
//        int k=Integer.valueOf(this.txtkhoa.getText());
//        String s = this.txtbr.getText();
//        int n=s.length();
//        int sd, sc;
//        sd = k;
//        sc = n/sd+1;
//        char hr[][] = new char[sd][sc];
//        int c,d;
//        c=0;d=0;
//        int sodu=n%sd;
//        for(int i=0;i<n;i++){
//            hr[d][c]=s.charAt(i);
//            d++;
//            if(d==k){
//                c++;d=0;
//            }
//        }
//        String kq="";
//        int sokytu=sc;
//        for(int i=0;i<sd;i++){
//            if(i>=sodu) sokytu = sc-1;
//            for(int j=0;j<sokytu;j++){
//                kq=kq+hr[i][j];
//            }
//        }
//        this.txtbm.setText(kq);
  int k=Integer.valueOf(this.txtkhoa.getText());
        String s = this.txtbr.getText();
        int n=s.length();
        char [][] railFence = new char[k][n];
       
        for(int i = 0; i<k;i++){
            Arrays.fill(railFence[i], '\0');
        }
       
        int row = 0;
        boolean down = true;
        for(int i=0; i<n;i++){
            railFence[row][i] = s.charAt(i);
            if(row == 0){
                down= true;
            }else if(row == k - 1){
                down = false ;
               
            }
            if(down){
                row++;
            }else{
                row--;
            }
        }
        StringBuilder kq = new StringBuilder();
        for(int i=0;i<k;i++){
            for(int j=0;j<n;j++){
                if(railFence[i][j] != '\0'){
                    kq.append(railFence[i][j]);
                }
            }
        }
         this.txtbm.setText(kq.toString());
    }//GEN-LAST:event_mahoabtnActionPerformed

    private void giaimabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaimabtnActionPerformed
        // TODO add your handling code here:
       int k=Integer.valueOf(this.txtkhoa.getText());
        String s = this.txtbm.getText();
        int n=s.length();
        int sd, sc;
        sd = k;
        sc = n/sd+1;
        char hr[][] = new char[sd][sc];
          int sodu= n%sd;
        int sokytu = sc;
        int t=0;
        for(int i=0;i<sd;i++){
            if(i>=sodu) sokytu = sc-1;
            for(int j=0;j<sokytu;j++){
                hr[i][j]=s.charAt(t);
                t++;
            }
        }
        int c,d;
        c=0;d=0;
        String kq = "";
        for(int i=0;i<n;i++){
            kq+=hr[d][c];
            d++;
            if(d==k){
                c++; d=0;
            }
        }
        this.txtbr.setText(kq);
    }//GEN-LAST:event_giaimabtnActionPerformed

    private void txtkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkhoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkhoaActionPerformed

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
            java.util.logging.Logger.getLogger(frm_rail_fence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_rail_fence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_rail_fence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_rail_fence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_rail_fence().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton giaimabtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mahoabtn;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextArea txtbr;
    private javax.swing.JTextField txtkhoa;
    // End of variables declaration//GEN-END:variables
}
