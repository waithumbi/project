/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MY
 */
public class SymptomChecker extends javax.swing.JFrame {

    /**
     * Creates new form SymptomChecker
     */
    public SymptomChecker() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        setLocation(new java.awt.Point(500, 200));
        setPreferredSize(new java.awt.Dimension(650, 650));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setText("SYMPTOM CHECKER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 20, 500, 51);

        jLabel2.setText("LIST:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(465, 78, 39, 20);

        jLabel3.setText("General Symptoms:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(105, 114, 140, 39);

        jLabel4.setText("Skin Symptoms:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(105, 172, 140, 20);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bald spots(hairs)", "Blue coloured lips", "Blue coloured skin", "Brittle hair", "Bruising or discoloration", "Change in hair texture", "Color change", "Cracks at corner of mouth", "Drainage or Pus", "Dry Sink", "Easy Bruising", "Hair Loss", "Hives", "Itching or Burning", "Pale skin", "Skin Hardening", "Skin rush ", "Swelling" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(306, 169, 215, 26);

        jLabel5.setText("Head area:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(105, 213, 195, 44);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Blurred Vision", "Bruising or discoloration", "eyes irritation", "difficulty breathing", "runny nose", "sneezing", "sensitive to noise", "ear ache", "bad breath", "cough", "gum sores", "mouth sores", "sore tongue" }));
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(306, 222, 203, 26);

        jLabel6.setText("Chest area:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(105, 273, 195, 41);

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "cough", "drainage or pus", "heartburn", "noisy breathing", "shortness of breath", "wheezing" }));
        getContentPane().add(jComboBox4);
        jComboBox4.setBounds(306, 280, 167, 26);

        jLabel7.setText("Abdomen:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(105, 323, 165, 42);

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "constipation", "nausea or vomiting", "stomach cramps", "upset stomach" }));
        getContentPane().add(jComboBox5);
        jComboBox5.setBounds(306, 342, 167, 26);

        jLabel8.setText("Arms:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(105, 377, 149, 42);

        jComboBox6.setMaximumRowCount(150);
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "Anxiety", "Binge drinking(alcohol)", "Binge eating", "Body aches or pains", "Cough", "Decreased appetite", "Dizziness", "Dry skin", "Easy bleeding", "Easy bruising", "Fatigue", "Fever", "High Blood pressure", "Increased thirst", "Low pressure", "Muscle cramps or spasms(painful)", "Overweight", "Prolonged bleeding", "wheezing" }));
        jComboBox6.setEditor(null);
        jComboBox6.setFocusCycleRoot(true);
        jComboBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(288, 114, 271, 26);

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "bruising", "joint pain", "numbness", "inability to move", "swelling", "weakness", "warm to touch", " " }));
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(306, 385, 149, 26);

        jLabel9.setText("Legs:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(105, 428, 67, 20);

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "joint aches", "joint pains", "numbness or tingling", "swelling", "weakness", "broken", "bleeding", " " }));
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(306, 428, 181, 26);

        jButton1.setText("Return");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(306, 516, 140, 40);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY\\Downloads\\Stethoscope_48px.png")); // NOI18N
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 10, 70, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\MY\\Downloads\\Return_48px.png")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(460, 520, 48, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox6ActionPerformed
        Solutions s=new Solutions();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jComboBox6ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(SymptomChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SymptomChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SymptomChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SymptomChecker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SymptomChecker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
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
    // End of variables declaration//GEN-END:variables
}
