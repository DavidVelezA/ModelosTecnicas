/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tecnicassimulacion;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author steve
 */
public class ModeloC extends javax.swing.JFrame {
    
    
    JComboBox combo = new JComboBox();
    String F1C = "Probabilidad de que cero clientes estén en el sistema";
    String F2C = "Promedio del servidor";
    String F3C = "Número promedio de clientes en la fila de espera";
    String F4C = "tiempo promedio de clientes en el sistema";
    String F5C = "Tiempo promedio de espera en la fila";
    String F6C = "Tiempo promedio transcurrido en el sistema, incluido el servicio";
    

    Icon iF1C = new ImageIcon(getClass().getResource("/Imagenes/MODC1.PNG"));
    Icon iF2C = new ImageIcon(getClass().getResource("/Imagenes/MODC2.PNG"));
    Icon iF3C = new ImageIcon(getClass().getResource("/Imagenes/MODC3.PNG"));
    Icon iF4C = new ImageIcon(getClass().getResource("/Imagenes/MODC4.PNG"));
    Icon iF5C = new ImageIcon(getClass().getResource("/Imagenes/MODC5.PNG"));
    Icon iF6C = new ImageIcon(getClass().getResource("/Imagenes/MODC6.PNG"));
    

    /**
     * Creates new form ModeloC
     */
    public ModeloC() {
        initComponents();
        setLocationRelativeTo(null);
        jComboBox1.addItem("Seleccione una opcion");
        jComboBox1.addItem(F1C);
        jComboBox1.addItem(F2C);
        jComboBox1.addItem(F3C);
        jComboBox1.addItem(F4C);
        jComboBox1.addItem(F5C);
        jComboBox1.addItem(F6C);
        

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
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("CALCULO DE FORMULAS MODELO C");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Seleccione lo que desea calcular:");

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(99, 99, 99))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String datos = (String) jComboBox1.getSelectedItem();
        
        
        if (datos.equals(F1C)) {
            
            
        //////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////
          /*/
        
        String n = (String) JOptionPane.showInputDialog(null, "Ingrese valor de limite inferior (n)", "MODELO C ", WIDTH, iF1, null, "");
            String N = (String) JOptionPane.showInputDialog(null, "Ingrese valor de limite superior (N)", "MODELO C ", WIDTH, iF1, null, "");
            String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO C ", WIDTH, iF5, null, "");
            String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO C ", WIDTH, iF3, null, "");

            
            
            
            
           // if (landa != null && mu != null) {

            //    double vlanda = Double.valueOf(landa);
            //    double vmu = Double.valueOf(mu);
            //    double p = vlanda / vmu;

             //   JOptionPane.showMessageDialog(null, "El promedio del sistema es = " + p);
                
                int vn = Integer.parseInt(n);
                int vN = Integer.parseInt(N);
                int Factorial1=1;
                int Factorial2=1;

                //primer factorial de N!
                 while ( vN!=0) {
                 Factorial1=Factorial1*vN;
                // vN--;
                 int valorFact2=vN-vn;
                 Factorial2 = Factorial2*valorFact2;
                        Factorial2--;   
                        
                      //  double resultado = 
                               
 
}
               System.out.println(Factorial2);
 
                
                
                
//               do{
//                  do{
//                       int Nfactorial = vN*vN;
//                       vN--;
//                       
//                   System.out.println("aaa "+ Nfactorial);    
//                   } while(vN<=1);
//       
//                                           ++vn;
//                                           System.out.println("asdad "+ vn);
//
//               }
//                while (vn<=vN);
//                
                
                
                
                
                
                
                
            }
            
            
            
            
            
            
            
        
        
        
        
        
        
        
        
        
        
        
        
        /*/  
            

        }

        

        if (datos.equals(F2C)) {
                        String p0 = (String) JOptionPane.showInputDialog(null, "Ingrese valor de Po", "MODELO C ", WIDTH, iF2C, null, "");
            
            if (p0 != null) {

                double vp0 = Double.valueOf(p0);
                double p = 1 - vp0;

                JOptionPane.showMessageDialog(null, "El promedio del servidor es = " + p);
            }
            }

           
            if (datos.equals(F3C)) {
                {   
                    String n = (String) JOptionPane.showInputDialog(null, "Ingrese valor de n", "MODELO B ", WIDTH, iF3C, null, "");
                    String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF3C, null, "");
                    String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO B ", WIDTH, iF3C, null, "");
                    String p0 = (String) JOptionPane.showInputDialog(null, "Ingrese valor de P0", "MODELO B ", WIDTH, iF3C, null, "");

                    if (landa != null && mu != null && n != null && p0 != null) {

                        double vlanda = Double.valueOf(landa);
                        double vmu = Double.valueOf(mu);
                        double vp0 = Double.valueOf(p0);
                        double vn = Double.valueOf(n);


                        double ej3 = vn-((vlanda + vmu)/vlanda)*(1-vp0);

                        JOptionPane.showMessageDialog(null, "Número promedio de clientes en la fila de espera es de = " + ej3);
                    }
                }
            }

            if (datos.equals(F4C)) {
                    String n = (String) JOptionPane.showInputDialog(null, "Ingrese valor de n", "MODELO B ", WIDTH, iF4C, null, "");
                    String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO B ", WIDTH, iF4C, null, "");
                    String mu = (String) JOptionPane.showInputDialog(null, "Ingrese valor de μ", "MODELO B ", WIDTH, iF4C, null, "");
                    String p0 = (String) JOptionPane.showInputDialog(null, "Ingrese valor de P0", "MODELO B ", WIDTH, iF4C, null, "");

                    if (landa != null && mu != null && n != null && p0 != null) {

                        double vlanda = Double.valueOf(landa);
                        double vmu = Double.valueOf(mu);
                        double vp0 = Double.valueOf(p0);
                        double vn = Double.valueOf(n);


                        double ej4 = vn-(vmu/vlanda)*(1-vp0);

                        JOptionPane.showMessageDialog(null, "Tiempo promedio de clientes en el sistema es de = " + ej4);

                    }
            }

            if (datos.equals(F5C)) {

                    String Lq = (String) JOptionPane.showInputDialog(null, "Ingrese valor de Lq", "MODELO C ", WIDTH, iF5C, null, "");
                    String n = (String) JOptionPane.showInputDialog(null, "Ingrese valor de n", "MODELO C ", WIDTH, iF5C, null, "");
                    String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO C ", WIDTH, iF5C, null, "");
                    String L = (String) JOptionPane.showInputDialog(null, "Ingrese valor de L", "MODELO C ", WIDTH, iF5C, null, "");
                    

                    if (landa != null && Lq != null && n != null && L != null) {

                        double vlanda = Double.valueOf(landa);
                        double vL = Double.valueOf(L);
                        double vlq = Double.valueOf(Lq);
                        double vn = Double.valueOf(n);


                        double ej5 = (vlq*(1/((vn-vL)*vlanda)));

                        JOptionPane.showMessageDialog(null, "Tiempo promedio de espera en la fila es de = " + ej5);

                    }
                
                
            }
            if (datos.equals(F6C)) {

                    String L = (String) JOptionPane.showInputDialog(null, "Ingrese valor de L", "MODELO C ", WIDTH, iF6C, null, "");
                    String n = (String) JOptionPane.showInputDialog(null, "Ingrese valor de n", "MODELO C ", WIDTH, iF6C, null, "");
                    String landa = (String) JOptionPane.showInputDialog(null, "Ingrese valor de λ", "MODELO C ", WIDTH, iF6C, null, "");

                    

                    if (landa != null && L != null && n != null) {

                        double vlanda = Double.valueOf(landa);
                        double vL = Double.valueOf(L);
                        double vn = Double.valueOf(n);


                        double ej6 = (vL*(1/((vn-vL)*vlanda)));

                        JOptionPane.showMessageDialog(null, "Tiempo promedio transcurrido en el sistema, incluido el servicio es de = " + ej6);

                }
            }

    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ModeloC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModeloC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModeloC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModeloC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModeloC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
