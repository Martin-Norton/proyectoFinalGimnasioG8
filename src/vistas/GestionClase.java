/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import entities.Clase;
import entities.Entrenador;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import persistence.ClaseData;
import persistence.EntrenadorData;

/**
 *
 * @author Martin Norton
 */
public class GestionClase extends javax.swing.JInternalFrame {

    private Clase clase;
    private List<Entrenador> entrenadores = new ArrayList<>();
    private ClaseData claseData = new ClaseData();
    private EntrenadorData enData = new EntrenadorData();

    public GestionClase() {
        initComponents();
        jREstadoClase.setSelected(true);
        this.entrenadores = enData.listarEntrenadores();
        llenarCombo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBGuardar = new javax.swing.JToggleButton();
        jTNombreClase = new javax.swing.JTextField();
        jCBEntrenadores = new javax.swing.JComboBox<>();
        jTHorario = new javax.swing.JTextField();
        jTCapacidad = new javax.swing.JTextField();
        jREstadoClase = new javax.swing.JRadioButton();
        jBSalir = new javax.swing.JButton();

        jLabel1.setText("DATOS DE LA CLASE");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Entrenador:");

        jLabel4.setText("Horario:");

        jLabel5.setText("Capacidad:");

        jLabel6.setText("Estado:");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jREstadoClase)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTNombreClase)
                                .addComponent(jCBEntrenadores, 0, 230, Short.MAX_VALUE)
                                .addComponent(jTHorario)
                                .addComponent(jTCapacidad))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBGuardar)
                        .addGap(202, 202, 202)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(104, 104, 104))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTNombreClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jCBEntrenadores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jLabel6))
                    .addComponent(jREstadoClase))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        String nombreClase = jTNombreClase.getText();
        Entrenador entrenador = (Entrenador) jCBEntrenadores.getSelectedItem();
        String horarioStr = jTHorario.getText();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horarioClase = LocalTime.parse(horarioStr, formatter);
        int capacidad = Integer.parseInt(jTCapacidad.getText());
        boolean estado = jREstadoClase.isSelected();
        Clase nuevaClase = new Clase(nombreClase, entrenador, horarioClase, capacidad, estado);
        jBGuardar.setEnabled(true);
        claseData.agregarClase(nuevaClase);
        limpiarCampos();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed
    private void llenarCombo() {
        if (entrenadores.isEmpty()) {
            System.out.println("lista de entrenadores vacia ");
        }
        for (Entrenador entrenador1 : entrenadores) {
            jCBEntrenadores.addItem(entrenador1);
        }
       // jCBEntrenadores.setSelectedIndex(0);
    }

    private void limpiarCampos() {
        jTNombreClase.setText("");
        jCBEntrenadores.setSelectedIndex(0);
        jTHorario.setText("");
        jTCapacidad.setText("");
        jREstadoClase.setSelected(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Entrenador> jCBEntrenadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jREstadoClase;
    private javax.swing.JTextField jTCapacidad;
    private javax.swing.JTextField jTHorario;
    private javax.swing.JTextField jTNombreClase;
    // End of variables declaration//GEN-END:variables
}
