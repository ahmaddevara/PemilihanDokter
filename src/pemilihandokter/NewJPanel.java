/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemilihandokter;

/**
 *
 * @author microsoft
 */
public class NewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public NewJPanel() {
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
        jLabel2 = new javax.swing.JLabel();
        jconadokt = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtxtwaktu = new javax.swing.JTextField();
        jtxtnama = new javax.swing.JTextField();
        jtxtalamat = new javax.swing.JTextField();
        jtxtusia = new javax.swing.JTextField();
        jtxtjenis = new javax.swing.JTextField();
        jtxtgol = new javax.swing.JTextField();
        jtxtstatus = new javax.swing.JTextField();
        jtxtkewar = new javax.swing.JTextField();
        jtxtspesial = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Status");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel2.setText("Identitas");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 60, 20));

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Pilih Salah Satu--", "DR. Farras Yassar", "DR. Anisa Putri", "DR. Harun Fajar ", " " }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        add(jconadokt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 130, 20));

        jLabel3.setText("Alamat");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel4.setText("Usia");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        jLabel5.setText("Jenis Kelamin");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel6.setText("Gol. Darah");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel7.setText("Pilih Dokter");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, -1));

        jLabel8.setText("Kewarganegaraan");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        jLabel9.setText("Waktu Praktek");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jLabel10.setText("Dokter Spesialis");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jLabel11.setText("Nama");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        add(jtxtwaktu, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 190, 20));
        add(jtxtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 190, 20));

        jtxtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtalamatActionPerformed(evt);
            }
        });
        add(jtxtalamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 190, 20));
        add(jtxtusia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 190, 20));
        add(jtxtjenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 190, 20));
        add(jtxtgol, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 190, 20));

        jtxtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstatusActionPerformed(evt);
            }
        });
        add(jtxtstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 190, 20));
        add(jtxtkewar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 190, 20));

        jtxtspesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtspesialActionPerformed(evt);
            }
        });
        add(jtxtspesial, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 190, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtalamatActionPerformed

    private void jtxtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstatusActionPerformed

    private void jtxtspesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtspesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtspesialActionPerformed

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
         if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){             
jtxtnama.setText("DR. Farras Yassar ");             
jtxtalamat.setText("Jl. Surabaya 16, Malang");            
jtxtusia.setText("20 Tahun");             
jtxtjenis.setText("Laki-Laki");             
jtxtgol.setText("A");             
jtxtstatus.setText("Belum Menikah ");             
jtxtkewar.setText("Indonesia");             
jtxtspesial.setText("Dokter Umum");            
jtxtwaktu.setText(" Pagi (07.00-15.00)");}         
else        
if(jconadokt.getSelectedItem().equals("DR. Anisa Putri ")){            
jtxtnama.setText("DR. Anisa Putri");             
jtxtalamat.setText("Jl. Veteran 3, Malang");             
jtxtusia.setText("20 Tahun");             
jtxtjenis.setText("Perempuan");             
jtxtgol.setText("O");             
jtxtstatus.setText("Belum Menikah"); 
jtxtkewar.setText("Indonesia");            
jtxtspesial.setText("Dokter Gigi");             
jtxtwaktu.setText(" Sore (16.00-22.00)");}         
else         
if(jconadokt.getSelectedItem().equals("DR. Harun Fajar ")){             
jtxtnama.setText("DR. Harun Fajar ");             
jtxtalamat.setText("Jl. Bandung 9, Malang");             
jtxtusia.setText("20 Tahun");             
jtxtjenis.setText("Laki-Laki");             
jtxtgol.setText("B");            
jtxtstatus.setText("Belum Menikah");            
jtxtkewar.setText("Indonesia");             
jtxtspesial.setText("Dokter Gizi");             
jtxtwaktu.setText(" Malam (22.00-06.00)");         }
    }//GEN-LAST:event_jconadoktActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
