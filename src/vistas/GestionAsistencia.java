package vistas;
import entities.Clase;
import entities.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistence.AsistenciaData;
import persistence.ClaseData;
import persistence.SocioData;

public class GestionAsistencia extends javax.swing.JInternalFrame {
    private SocioData socioData = new SocioData();
    private ClaseData claseData = new ClaseData();
    private AsistenciaData asistenciaDAta = new AsistenciaData();
    private Socio socio = new Socio();
    private List<Clase> clases = new ArrayList<>();
     private DefaultTableModel modelo = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int i, int i1) {
            return false;
        }        
    };

    public GestionAsistencia() {
        initComponents();
        this.clases = claseData.listarClases();
        llenarCombo();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTextFieldDniSocio = new javax.swing.JTextField();
        jButtonBuscar = new javax.swing.JButton();
        jTextFieldNombreApellido = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxClase = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxHorario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableInfo = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CONTROL DE ASISTENCIA");

        jLabelDNI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDNI.setText("DNI");

        jTextFieldDniSocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jButtonBuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });

        jTextFieldNombreApellido.setEditable(false);
        jTextFieldNombreApellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTextFieldNombreApellido.setText("   Nombre y Apellido");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Clase");

        jComboBoxClase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Horario");

        jComboBoxHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jComboBoxHorario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jTableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableInfo);

        jButtonGuardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButtonGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        jButtonGuardar.setText("Guardar");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gym.png"))); // NOI18N

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
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
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonGuardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDNI)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButtonBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addComponent(jTextFieldNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5)))
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(63, 63, 63))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDNI)
                            .addComponent(jTextFieldDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonBuscar))
                        .addGap(26, 26, 26)
                        .addComponent(jTextFieldNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jComboBoxClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        buscarSocioYClases();
    }//GEN-LAST:event_jButtonBuscarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    private void buscarSocioYClases() {
        String dni = jTextFieldDniSocio.getText();
        if (dni.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
            return;
        }

        try {
            Socio socio = socioData.buscarSocioPorDni(dni);
            if (socio != null) {
                jTextFieldDniSocio.setText(socio.getNombreSocio());
                llenarComboBoxClases();
            } else {
                JOptionPane.showMessageDialog(this, "Socio no encontrado.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar el socio.");
        }
    }

    private void llenarComboBoxClases() {
       jComboBoxClase.removeAllItems();
        try {
           // List<Clase> clases = claseData.buscarClasesPorSocio(idSocio);
            for (Clase clase : clases) {
                jComboBoxClase.addItem(clase);
            }
            if (!clases.isEmpty()) {
                llenarComboBoxHorarios(clases.get(0));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar las clases.");
        }
    }

    private void llenarComboBoxHorarios(Clase clase) {
        jComboBoxHorario.removeAllItems();
        jComboBoxHorario.addItem(clase.getHorarioClase().toString());
    }
    private void llenarCombo() {
        if (clases.isEmpty()) {
            System.out.println("lista de clases vacia ");
        }
        for (Clase clase1 : clases) {
            jComboBoxClase.addItem(clase1);
        }
    }

    private void llenarTabla() { // FALTA EL MÉTODO DE ARMAR CABECERA Y LLENAR TABLA
    
        Clase claseSeleccionada = (Clase) jComboBoxClase.getSelectedItem();
        String horarioSeleccionado = (String) jComboBoxHorario.getSelectedItem();

        if (claseSeleccionada != null && horarioSeleccionado != null) {

        }
    }
   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jComboBoxClase;
    private javax.swing.JComboBox<String> jComboBoxHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableInfo;
    private javax.swing.JTextField jTextFieldDniSocio;
    private javax.swing.JTextField jTextFieldNombreApellido;
    // End of variables declaration//GEN-END:variables
}
