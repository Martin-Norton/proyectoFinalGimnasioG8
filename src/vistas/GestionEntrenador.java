
package vistas;

import entities.Entrenador;
import enums.Especialidad;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import persistence.EntrenadorData;

/**
 *
 * @author carba
 */
public class GestionEntrenador extends javax.swing.JInternalFrame {

    private List<Especialidad> especialidades;
    private EntrenadorData ed;
    private Entrenador entrenador;
    private List<Entrenador> entrenadores;

    public GestionEntrenador() {
        ed = new EntrenadorData();
        entrenador = new Entrenador();
        entrenadores = ed.listarEntrenadores();
        especialidades = new ArrayList<>();
        llenarEspe();
        initComponents();
        llenarCombo();
    }

    private void llenarCombo() {
        if (especialidades.isEmpty()) {
            System.out.println("lista de entrenadores vacia");
        } else {
            for (Especialidad esp : especialidades) {
                jCEspecialidad.addItem(esp);
            }
        }
    }

    private void llenarEspe() {
        for (Especialidad especialidad : Especialidad.values()) {
            especialidades.add(especialidad);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLDatosEntrenador = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLEspecialidad = new javax.swing.JLabel();
        jCEspecialidad = new javax.swing.JComboBox<>();
        jRBEstado = new javax.swing.JRadioButton();
        jLEstado = new javax.swing.JLabel();

        jLIdEntrenador = new javax.swing.JLabel();
        jTIdEntrenador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jBGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();


        jLDatosEntrenador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLDatosEntrenador.setText("DATOS ENTRENADOR");

        jLNombre.setText("Nombre");

        jLApellido.setText("Apellido");

        jLDNI.setText("DNI");

        jLEspecialidad.setText("Especialidad");

        jRBEstado.setSelected(true);
        jRBEstado.setText("Habiliado");

        jLEstado.setText("Estado");

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLDatosEntrenador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNombre)
                            .addComponent(jLApellido))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTNombre)
                            .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLEspecialidad)
                            .addComponent(jLEstado))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRBEstado)
                            .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLDNI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLIdEntrenador, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(44, 44, 44))

                            .addComponent(jCEspecialidad, 0, 138, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                            .addComponent(jCEspecialidad, 0, 138, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)

                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                        .addComponent(jLDNI)
                        .addGap(18, 18, 18)
                        .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jBGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jBSalir)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLDatosEntrenador)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLDatosEntrenador)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLNombre)
                                .addGap(18, 18, 18)
                                .addComponent(jLApellido))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLDNI))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLIdEntrenador)
                                    .addComponent(jTIdEntrenador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEspecialidad)
                            .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRBEstado)
                            .addComponent(jLEstado))))
                .addGap(0, 56, Short.MAX_VALUE))
                        .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEspecialidad)
                    .addComponent(jCEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBEstado)
                    .addComponent(jLEstado)
                    .addComponent(jBGuardar)
                    .addComponent(jBSalir))
                .addGap(0, 26, Short.MAX_VALUE);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        if (jTNombre.getText().isEmpty()
                || jTApellido.getText().isEmpty()
                || jTDni.getText().isEmpty()
                || jCEspecialidad.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben estar llenos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (ed.buscarPorDni(jTDni.getText()) == null) {
            String nombreEntrenador = jTNombre.getText();
            String apellidoEntrenador = jTApellido.getText();
            String dniEntrenador = jTDni.getText();
            Especialidad enume =  (Especialidad) jCEspecialidad.getSelectedItem();
            String especialidad = enume.name();
            boolean estado = jRBEstado.isSelected();
            Entrenador entrenador = new Entrenador(nombreEntrenador, apellidoEntrenador, dniEntrenador, especialidad, estado);
            ed.agregarEntrenador(entrenador);
        } else {
            JOptionPane.showMessageDialog(this, "ya existe un entrenador con ese dni");
        }
        limpiarCampos();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void limpiarCampos() {
        jTNombre.setText("");
        jCEspecialidad.setSelectedIndex(0);
        jTApellido.setText("");
        jTDni.setText("");
        jRBEstado.setSelected(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JComboBox<Especialidad> jCEspecialidad;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLDatosEntrenador;
    private javax.swing.JLabel jLEspecialidad;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables
}
