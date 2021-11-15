/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

/**
 *
 * @author Eduardo Czpla
 */
public class ViewHome extends javax.swing.JFrame {

    /**
     * Creates new form ViewHome
     */
    public ViewHome() {
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

        try {
            JdpHome =(javax.swing.JDesktopPane)java.beans.Beans.instantiate(getClass().getClassLoader(), "view.ViewHome_JdpHome");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuItemNewAviary = new javax.swing.JMenuItem();
        MenuItemListAviary = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A_AVE");

        javax.swing.GroupLayout JdpHomeLayout = new javax.swing.GroupLayout(JdpHome);
        JdpHome.setLayout(JdpHomeLayout);
        JdpHomeLayout.setHorizontalGroup(
            JdpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1100, Short.MAX_VALUE)
        );
        JdpHomeLayout.setVerticalGroup(
            JdpHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 633, Short.MAX_VALUE)
        );

        jMenu1.setText("Aviário");

        MenuItemNewAviary.setText("Novo");
        MenuItemNewAviary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemNewAviaryActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemNewAviary);

        MenuItemListAviary.setText("Listar");
        MenuItemListAviary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemListAviaryActionPerformed(evt);
            }
        });
        jMenu1.add(MenuItemListAviary);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdpHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JdpHome)
        );

        setSize(new java.awt.Dimension(1116, 692));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemNewAviaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemNewAviaryActionPerformed
        ViewAviaryNewInternal viewAviaryNewInternal = new ViewAviaryNewInternal();
        
        JdpHome.add(viewAviaryNewInternal);
        
        viewAviaryNewInternal.setVisible(true);
    }//GEN-LAST:event_MenuItemNewAviaryActionPerformed

    private void MenuItemListAviaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemListAviaryActionPerformed
        ViewAviaryListInternal viewAviaryListInternal = new ViewAviaryListInternal();
        
        JdpHome.add(viewAviaryListInternal);
        
        viewAviaryListInternal.setVisible(true);
    }//GEN-LAST:event_MenuItemListAviaryActionPerformed

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
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane JdpHome;
    private javax.swing.JMenuItem MenuItemListAviary;
    private javax.swing.JMenuItem MenuItemNewAviary;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}