/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week1;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class frm_playfail extends javax.swing.JFrame {

    private char[][] pf;
//    ={{'M','O','N','A','R'},
//                         {'C','H','Y','B','D'},
//                         {'E','F','G','I','K'},
//                         {'L','P','Q','S','T'},
//                         {'U','V','W','X','Z'}
//        
//    }

    public frm_playfail() {
        initComponents();
    }
    
        private char[][] generateMatrixFromKey(String key){
        key = key.toUpperCase().replaceAll("[^A-Z]", "");
        key = key.replace("J", "I");
       
        ArrayList<Character> characters =  new ArrayList<>();
       
        for(char c :key.toCharArray()){
            if(!characters.contains(c)){
                characters.add(c);
            }
        }
        for(char c = 'A'; c<='Z';c++){
            if(c!='J' && !characters.contains(c)){
                characters.add(c);
            }
        }
       
        char[][] matrix = new char [5][5];
        int index =0;
        for(int i = 0;i<5;i++){
            for(int j= 0; j<5;j++){
                matrix[i][j] = characters.get(index++);
            }
        }
        return matrix;
    }
   
    private void generateRandomMatrix(){
        String key = this.txtkhoa.getText();
        pf= generateMatrixFromKey(key);
       
        System.out.println("Ma tran Playfair tu khoa:");
         for(int i = 0;i<5;i++){
            for(int j= 0; j<5;j++){
                System.out.print(pf[i][j] + " ");
            }
                         System.out.println();


        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        btnmahoa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btngiaima = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtkhoa = new javax.swing.JTextField();
        txtbr = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtbm = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnmahoa.setText("Ma hoa");
        btnmahoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmahoaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ban ro");

        btngiaima.setText("Giai ma");
        btngiaima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngiaimaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Khoá:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ban ma");

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnmahoa, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(btngiaima, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbr, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                            .addComponent(txtkhoa))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtbr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtkhoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmahoa)
                    .addComponent(btngiaima))
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnmahoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmahoaActionPerformed
        // TODO add your handling code here:
        generateRandomMatrix();
        String banro = this.txtbr.getText();
        banro = banro.toUpperCase();
        banro = banro.replace('J', 'I');
        String banma = mahoa(banro);
        this.txtbm.setText(banma);
    }//GEN-LAST:event_btnmahoaActionPerformed

    private String mahoa(String banro) {
        int n = banro.length();
        int i = 0;
        String banma = "";
        char a, b;
        while (i < n) {
            if (i == n - 1) {
                a = banro.charAt(i);
                b = 'X';
                i++;
            } else {
                a = banro.charAt(i);
                b = banro.charAt(i + 1);

                if (a == b) {
                    b = 'X';
                    i++;
                } else {
                    i += 2;
                }
            }
            banma += thayThe(a, b);
        }
        return banma;
    }

    String thayThe(char a, char b) {
        String vta = timViTri(a);
        String vtb = timViTri(b);
        char x, y;
        if (vta.charAt(0) == vtb.charAt(0)) {
            x = pf[vta.charAt(0) - '0'][((vta.charAt(1) - '0') + 1) % 5];
            y = pf[vtb.charAt(0) - '0'][((vtb.charAt(1) - '0') + 1) % 5];
            return x + "" + y;
        }

        if (vta.charAt(1) == vtb.charAt(1)) {
            x = pf[((vta.charAt(0) - '0') + 1) % 5][(vta.charAt(1) - '0')];
            y = pf[((vtb.charAt(0) - '0') + 1) % 5][(vtb.charAt(1) - '0')];
            return x + "" + y;
        }
        x = pf[(vta.charAt(0) - '0')][(vtb.charAt(1) - '0')];
        y = pf[(vtb.charAt(0) - '0')][(vta.charAt(1) - '0')];
        return x + "" + y;
    }

    private String timViTri(char a) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (pf[i][j] == a) {
                    return i + "" + j;
                }
            }
        }
        return "";
    }

    private void btngiaimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngiaimaActionPerformed
        // TODO add your handling code here:
        String banma = this.txtbm.getText();
        String banro = giaima(banma);
        int n = banro.length();
        String br = "";
        for (int i = 0; i < n - 2; i += 2) {
            if (banro.charAt(i) == banro.charAt(i + 2)) {
                br += banro.charAt(i);
            } else {
                br += banro.charAt(i) + "" + banro.charAt(i + 1);
            }
        }
        if (banro.charAt(n - 1) == 'X') {
            br += banro.charAt(n - 2);
        } else {
            br += banro.charAt(n - 2);
        }
        br += banro.charAt(n - 1);
        this.txtbr.setText(br);
    }//GEN-LAST:event_btngiaimaActionPerformed

    private String giaima(String banma){
        int n=banma.length();
        String banro="";
        char a,b;
        for(int i=0;i<n;i+=2){
            a=banma.charAt(i);
            b=banma.charAt(i+1);
            banro+= thayTheNguoc(a,b);
        }
        return banro;
    }
    
    String thayTheNguoc(char a, char b){
        String vta=timViTri(a);
        String vtb=timViTri(b);
        char x,y;
        if(vta.charAt(0) ==vtb.charAt(0)){
            x=pf[vta.charAt(0) - '0'][((vta.charAt(1) - '0') -1 +5) %5];
            y=pf[vtb.charAt(0) - '0'][((vtb.charAt(1) - '0') -1 +5) %5];
            return x+""+y;
        }
        if (vta.charAt(1) == vtb.charAt(1)) {
            x = pf[((vta.charAt(0) - '0') + 1+5) % 5][(vta.charAt(1) - '0')];
            y = pf[((vtb.charAt(0) - '0') + 1+5) % 5][(vtb.charAt(1) - '0')];
            return x + "" + y;
        }
        x = pf[(vta.charAt(0) - '0')][(vtb.charAt(1) - '0')];
        y = pf[(vtb.charAt(0) - '0')][(vta.charAt(1) - '0')];
        return x + "" + y;
    }
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
            java.util.logging.Logger.getLogger(frm_playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_playfail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frm_playfail().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btngiaima;
    private javax.swing.JButton btnmahoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txtbm;
    private javax.swing.JTextField txtbr;
    private javax.swing.JTextField txtkhoa;
    // End of variables declaration//GEN-END:variables
}