/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicassimulacion;

import static java.awt.image.ImageObserver.WIDTH;
import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class ModeloB extends javax.swing.JFrame {

    JComboBox combo = new JComboBox();
    String F1B = "Utilizacion promedio del sistema";
    String F2B = "Probabilidad de que cero clientes esten en el sistema";
    String F3B = "Probabilidad de que haya n clientes estén en el sistema";
    String F4B = "Numero promedio de clientes en la fila de espera";
    String F5B = "Tiempo promedio de espera en la fila";
    String F6B = "Tiempo promedio transcurrido en el sistema, incluido el servicio";
    String F7B = "Tiempo promedio de clientes en el sistema de servicio";

    Icon iF1B = new ImageIcon(getClass().getResource("/Imagenes/MODB1.PNG"));
    Icon iF2B = new ImageIcon(getClass().getResource("/Imagenes/MODB2.PNG"));
    Icon iF3B = new ImageIcon(getClass().getResource("/Imagenes/MODB3.PNG"));
    Icon iF4B = new ImageIcon(getClass().getResource("/Imagenes/MODB4.PNG"));
    Icon iF5B = new ImageIcon(getClass().getResource("/Imagenes/MODB5.PNG"));
    Icon iF6B = new ImageIcon(getClass().getResource("/Imagenes/MODB6.PNG"));
    Icon iF7B = new ImageIcon(getClass().getResource("/Imagenes/MODB7.PNG"));

    /**
     * Creates new form ModeloB
     */
    public ModeloB() {
        initComponents();
        setLocationRelativeTo(null);
        jComboBox1.addItem("Seleccione una opcion");
        jComboBox1.addItem(F1B);
        jComboBox1.addItem(F2B);
        jComboBox1.addItem(F3B);
        jComboBox1.addItem(F4B);
        jComboBox1.addItem(F5B);
        jComboBox1.addItem(F6B);
        jComboBox1.addItem(F7B);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(101, 146, 191));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione lo que desea calcular:");

        jLabel1.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CALCULO DE FORMULAS MODELO B");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String datos = (String) jComboBox1.getSelectedItem();
        if (datos.equals(F1B)) {
            String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO A ", WIDTH, iF1B, null, "");
            String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO A ", WIDTH, iF1B, null, "");
            if (landa != null && mu != null) {
                if (!landa.isEmpty() && !mu.isEmpty()) {

                    double vlanda = Double.valueOf(landa);
                    double vmu = Double.valueOf(mu);
                    double p = vlanda / vmu;

                    JOptionPane.showMessageDialog(null, "El promedio del sistema es = " + p);
                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");
        }

        if (datos.equals(F2B)) {

            String p = (String) JOptionPane.showInputDialog(null, "Ingrese valor de P", "MODELO B ", WIDTH, iF2B, null, "");

            String s = (String) JOptionPane.showInputDialog(null, "Ingrese valor de limite superior (s)", "MODELO B ", WIDTH, iF2B, null, "");
            String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF2B, null, "");
            String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO B ", WIDTH, iF2B, null, "");

            if (s != null && landa != null && mu != null) {
                if (!s.isEmpty() && !landa.isEmpty() && !mu.isEmpty()) {

                    double vp = Double.valueOf(p);
                    int vn = 0;
                    int vs = Integer.parseInt(s);
                    int vlanda = Integer.parseInt(landa);
                    int vmu = Integer.parseInt(mu);

                    //nuevos
                    //***
                    int vs2 = vs;
                    int vs3 = vs;
                    int vs4 = vs - 1;
                    //****
                    int Factorial1 = 1;
                    int Factorial2 = 1;
                    int valorResta = 0;

                    //primer factorial de N!
                    //    int contador2 = 0;
                    double resultadoDiv1;
                    double resultadoDiv2 = 1;
                    double resultadoDiv3;
                    double resultadoDiv4;
                    double resultadoMulti;

                    double resultadoExpo1;
                    double resultadoExpo2;
                    double resultadoSuma = 0;
                    double resultadoSuma2 = 0;
                    double resultadoSuma3 = 0;

                    double resultadoFinal;

                    //factorial de s
                    while (vs2 != 0) {
                        Factorial1 = Factorial1 * vs2;
                        vs2--;

                    }

                    if (vn == 0) {
                        Factorial2 = 1;
                        vn++;
                    }

                    while (vn <= vs4) {
                        Factorial2 = Factorial2 * vn;

                        resultadoDiv1 = (double) vlanda / vmu;
                        resultadoExpo1 = Math.pow(resultadoDiv1, vn);
                        resultadoDiv3 = resultadoExpo1 / Factorial2;

                        resultadoDiv2 = (double) vlanda / vmu;
                        resultadoExpo2 = Math.pow(resultadoDiv2, vs);
                        resultadoDiv4 = resultadoExpo2 / Factorial1;

                        resultadoSuma = resultadoDiv3 + resultadoDiv4;

                        resultadoSuma2 = resultadoSuma2 + resultadoSuma;

                        vn++;

                    }
                    resultadoSuma3 = resultadoSuma2 + (1 / (1 - vp));

                    resultadoFinal = 1 / resultadoSuma3;
                    DecimalFormat formato = new DecimalFormat("#.###");

                    JOptionPane.showMessageDialog(null, "El resultado de la formula es: " + formato.format(resultadoFinal));

                    //    System.out.println("factorial de n" + Factorial2);
                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");

        }

        if (datos.equals(F3B)) {
            {
                String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF3B, null, "");
                String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO B ", WIDTH, iF3B, null, "");
                String n = (String) JOptionPane.showInputDialog(null, "Ingrese valor de n", "MODELO B ", WIDTH, iF3B, null, "");
                String p0 = (String) JOptionPane.showInputDialog(null, "Ingrese valor de P0", "MODELO B ", WIDTH, iF3B, null, "");

                if (landa != null && mu != null && n != null && p0 != null) {
                    if (!landa.isEmpty() && !mu.isEmpty() && !n.isEmpty() && !p0.isEmpty()) {

                        double vlanda = Double.valueOf(landa);
                        double vmu = Double.valueOf(mu);
                        double vp0 = Double.valueOf(p0);
                        double vn = Double.valueOf(n);

                        int fact = 1;
                        for (int i = 1; i <= vn; i++) {
                            fact = fact * i;
                        }

                        double ej3 = (((Math.pow((vlanda / vmu), vn)) / fact) * vp0);

                        JOptionPane.showMessageDialog(null, "Pobabilidad de que haya n clientes estén en el sistema es de = " + ej3);
                    }
                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");

        }

        if (datos.equals(F4B)) {
            String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF4B, null, "");
            String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO B ", WIDTH, iF4B, null, "");
            String p0 = (String) JOptionPane.showInputDialog(null, "Ingrese valor de P0", "MODELO B ", WIDTH, iF4B, null, "");
            String s = (String) JOptionPane.showInputDialog(null, "Ingrese valor de s", "MODELO B ", WIDTH, iF4B, null, "");
            String p = (String) JOptionPane.showInputDialog(null, "Ingrese valor de p", "MODELO B ", WIDTH, iF4B, null, "");

            if (landa != null && mu != null && p0 != null && s != null && p != null) {
                if (!landa.isEmpty() && !mu.isEmpty() && !p0.isEmpty() && !s.isEmpty() && !p.isEmpty()) {

                    double vlanda = Double.valueOf(landa);
                    double vmu = Double.valueOf(mu);
                    double vp0 = Double.valueOf(p0);
                    double vs = Double.valueOf(s);
                    double vp = Double.valueOf(p);

                    int fact = 1;
                    for (int i = 1; i <= vs; i++) {
                        fact = fact * i;
                    }

                    double ej4 = ((vp0 * (Math.pow((vlanda / vmu), vs)) * vp)) / (fact * (Math.pow((1 - vp), 2)));

                    JOptionPane.showMessageDialog(null, "Número promedio de clientes en la fila de espera = " + ej4);
                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");

        }

        if (datos.equals(F5B)) {

            String Lq = (String) JOptionPane.showInputDialog(null, "Ingrese valor de Lq", "MODELO B ", WIDTH, iF5B, null, "");
            String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF5B, null, "");

            if (Lq != null && landa != null) {
                if (!Lq.isEmpty() && !landa.isEmpty()) {

                    double vLq = Double.valueOf(Lq);
                    double vlanda = Double.valueOf(landa);
                    double LLq = vLq / vlanda;

                    JOptionPane.showMessageDialog(null, "Tiempo promedio de espera en la fila = " + LLq);
                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");

        }
        if (datos.equals(F6B)) {

            String Wq = (String) JOptionPane.showInputDialog(null, "Ingrese valor de Wq", "MODELO B ", WIDTH, iF6B, null, "");
            String μ = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO B ", WIDTH, iF6B, null, "");

            if (Wq != null && μ != null) {
                if (!Wq.isEmpty() && !μ.isEmpty()) {

                    double vWq = Double.valueOf(Wq);
                    double vμ = Double.valueOf(μ);
                    double w = vWq * (1 / vμ);

                    JOptionPane.showMessageDialog(null, "Tiempo promedio transcurrido en el sistema, incluido el servicio = " + w);

                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");

        }

        if (datos.equals(F7B)) {

            String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF7B, null, "");
            String aW = (String) JOptionPane.showInputDialog(null, "Ingrese valor de W", "MODELO B ", WIDTH, iF7B, null, "");

            if (landa != null && aW != null) {
                if (!landa.isEmpty() && !aW.isEmpty()) {

                    double vλ = Double.valueOf(landa);
                    double vw = Double.valueOf(aW);
                    double w = vλ * vw;

                    JOptionPane.showMessageDialog(null, "Tiempo promedio de clientes en el sistema de servicio = " + w);

                }
            }
            JOptionPane.showMessageDialog(null, "valores nulos");

        }


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Principal p = new Principal();
        p.setVisible(true);
        dispose();
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
            java.util.logging.Logger.getLogger(ModeloB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ModeloB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
