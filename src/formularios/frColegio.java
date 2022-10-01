/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Dimension;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.JOptionPane;
import tp04.laboratorio.Alumno;
import tp04.laboratorio.Colegio;
import tp04.laboratorio.Materia;

/**
 *
 * @author sistema
 */
public class frColegio extends javax.swing.JFrame {

    /**
     * Creates new form escritorio2
     */
    public frColegio() {
        initComponents();
     }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        mmateria = new javax.swing.JMenu();
        mamateria = new javax.swing.JMenuItem();
        malumno = new javax.swing.JMenu();
        malta_alum = new javax.swing.JMenuItem();
        minscripciones = new javax.swing.JMenu();
        mainscripciones = new javax.swing.JMenuItem();
        csalir = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1096, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
        );

        mmateria.setText("Materia");
        mmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmateriaActionPerformed(evt);
            }
        });

        mamateria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mamateria.setText("Alta Materia");
        mamateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mamateriaActionPerformed(evt);
            }
        });
        mmateria.add(mamateria);

        jMenuBar2.add(mmateria);

        malumno.setText("Alumno");

        malta_alum.setText("Alta Alumno");
        malta_alum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malta_alumActionPerformed(evt);
            }
        });
        malumno.add(malta_alum);

        jMenuBar2.add(malumno);

        minscripciones.setText("Inscripción");

        mainscripciones.setText("Alta Inscripciones");
        mainscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainscripcionesActionPerformed(evt);
            }
        });
        minscripciones.add(mainscripciones);

        jMenuBar2.add(minscripciones);

        csalir.setText("Salir");
        csalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csalirActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Confirma que desea salir?");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        csalir.add(jMenuItem1);

        jMenuBar2.add(csalir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(escritorio))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmateriaActionPerformed

        // TODO add your handlin        // TODO add your handling code here:
    }//GEN-LAST:event_mmateriaActionPerformed

    private void mamateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mamateriaActionPerformed
        frMateria mat = new frMateria(col);
        escritorio.add(mat);
             //codigo para centrar ventana
        Dimension tamescritorio = escritorio.getSize();
        Dimension tamframe = mat.getSize();
        mat.setLocation((tamescritorio.width - tamframe.width)/2, (tamescritorio.height- tamframe.height)/2);
        //.------------------
        
        mat.show();
        // TODO add your handling code here:
    }//GEN-LAST:event_mamateriaActionPerformed

    private void malta_alumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malta_alumActionPerformed
        frAlumno fal = new frAlumno(col);

        escritorio.add(fal);
     //codigo para centrar ventana
        Dimension tamescritorio = escritorio.getSize();
        Dimension tamframe = fal.getSize();
        fal.setLocation((tamescritorio.width - tamframe.width)/2, (tamescritorio.height- tamframe.height)/2);
        //.------------------

        fal.setVisible(true);
        escritorio.moveToFront(fal);

    }//GEN-LAST:event_malta_alumActionPerformed

    private void csalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csalirActionPerformed

        

    }//GEN-LAST:event_csalirActionPerformed

    private void mainscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainscripcionesActionPerformed
        fxInscripciones ins=new fxInscripciones(col);
        escritorio.add(ins);
        escritorio.moveToFront(ins);
        //codigo para centrar ventana
        Dimension tamescritorio = escritorio.getSize();
        Dimension tamframe = ins.getSize();
        ins.setLocation((tamescritorio.width - tamframe.width)/2, (tamescritorio.height- tamframe.height)/2);
        //.------------------
        
        ins.setVisible(true);

        
    }//GEN-LAST:event_mainscripcionesActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(frColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frColegio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frColegio().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu csalir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mainscripciones;
    private javax.swing.JMenuItem malta_alum;
    private javax.swing.JMenu malumno;
    private javax.swing.JMenuItem mamateria;
    private javax.swing.JMenu minscripciones;
    private javax.swing.JMenu mmateria;
    // End of variables declaration//GEN-END:variables
private Colegio col = new Colegio();
}
