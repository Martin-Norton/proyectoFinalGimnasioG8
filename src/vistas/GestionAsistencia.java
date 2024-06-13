package vistas;

import entities.Asistencia;
import entities.Clase;
import entities.Membresia;
import entities.Socio;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistence.AsistenciaData;
import persistence.ClaseData;
import persistence.MembresiaData;
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
        llenarComboBoxClases();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jTDniSocio = new javax.swing.JTextField();
        jBBuscarSocio = new javax.swing.JButton();
        jTFNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jCBClase = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jCBHorario = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTClases = new javax.swing.JTable();
        jButtonGuardar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jBSalir = new javax.swing.JButton();
        jTFApellido = new javax.swing.JTextField();
        jBBuscarHorario = new javax.swing.JButton();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("CONTROL DE ASISTENCIA");

        jLabelDNI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelDNI.setText("DNI");

        jTDniSocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jBBuscarSocio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jBBuscarSocio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBBuscarSocio.setText("Buscar");
        jBBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarSocioActionPerformed(evt);
            }
        });

        jTFNombre.setEditable(false);
        jTFNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Clase");

        jCBClase.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Horario");

        jCBHorario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jTClases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTClases);

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

        jTFApellido.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jBBuscarHorario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        jBBuscarHorario.setText("Buscar");
        jBBuscarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDNI)
                                .addGap(18, 18, 18)
                                .addComponent(jTDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jBBuscarSocio))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel5)))
                        .addGap(162, 162, 162)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(159, 159, 159))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonGuardar)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBSalir)
                        .addGap(63, 63, 63))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBBuscarHorario)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelDNI)
                            .addComponent(jTDniSocio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarSocio))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jCBClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jCBHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBBuscarHorario))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jButtonGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarSocioActionPerformed
        String dni = jTDniSocio.getText();
        Boolean socioHabilitado = false;

        // buscar socio por DNI
        Socio socio1 = socioData.buscarSocioPorDni(dni);
        int idsocio = socio1.getIdSocio();

        if (dni.isEmpty()) { // valido el campo
            JOptionPane.showMessageDialog(this, "Ingrese un DNI válido.");
            return;
        }
        try {
            if (socio1 != null) {
                jTFNombre.setText(socio1.getNombreSocio());
                jTFApellido.setText(socio1.getApellidoSocio());
                llenarComboBoxClases();
            } else {
                JOptionPane.showMessageDialog(this, "Socio no encontrado.");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al buscar el socio.");
        }

        // busco si tiene membresia el socio y la cantidad de pases
        MembresiaData membresiaData = new MembresiaData();
        Membresia membresiaSocio = membresiaData.MembresiaxSocio(socio);

        if (membresiaSocio != null) {
            int cantPases = membresiaSocio.getCantPases();
            if (cantPases > 0) {
                socioHabilitado = true;
                buscarClasesDisponibles();
            } else {
                JOptionPane.showMessageDialog(this, "No tiene pases disponibles");
                socioHabilitado = false;
            }
        } else {
            JOptionPane.showMessageDialog(this, "No tiene membresia disponible");

        }
    }//GEN-LAST:event_jBBuscarSocioActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBBuscarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHorarioActionPerformed
        try {
            String c = String.valueOf(jCBClase.getSelectedItem());

            clases = asistenciaDAta.obtenerClasesDisponibles(c);

            String[] columnNames = {"Nombre de la clase", "Capacidad", "Horario"};
            DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };
            for (Clase clase1 : clases) {
                Vector renglon = new Vector<>();
                renglon.add(clase1.getNombreClase());
                renglon.add(clase1.getCapacidad());
                renglon.add(clase1.getHorarioClase());

                model.addRow(renglon);
            }
            jTClases.setModel(model);
        } catch (Exception e) {
            // Manejar la excepción de manera adecuada
            e.printStackTrace(); // o muestra un mensaje de error en la interfaz
        }
    }//GEN-LAST:event_jBBuscarHorarioActionPerformed

    private String[] obtenerValoresSeleccionados() {
        int selectedRow = jTClases.getSelectedRow();
        String[] valores = new String[3];

        if (selectedRow != -1) {
            valores[0] = jTClases.getValueAt(selectedRow, 0).toString(); // Nombre de la clase en la columna 1
            valores[1] = jTClases.getValueAt(selectedRow, 1).toString(); // Entrenador en la columna 2
            valores[2] = jTClases.getValueAt(selectedRow, 2).toString(); // Horario en la columna 3
        }

        return valores;
    }

    // se selecciona la clase de la lista que viene con las clases 
    //disponibles en esos horarios y que tengan cupo
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {
        Clase claseSel = new Clase();
        Asistencia asistenciaSocio = new Asistencia();
        String[] valoresSeleccionados = obtenerValoresSeleccionados();
        String nombreClase = valoresSeleccionados[0];
        String nombreEntrenador = valoresSeleccionados[1];
        String horarioClase = valoresSeleccionados[2];

        // restar un pase (update de la memebresia de ese socio)
    }

// busco clases disponibles desde el horario de inicio, ya que las 
    //clases tienen horario de inicio solamente
    private void buscarClasesPorHorario(LocalTime horaInicio) {
        clases = claseData.buscarPorHorario(horaInicio);
        String[] columnNames = {"Nombre de la clase", "Entrenador", "Horario"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (Clase clase : clases) {
            Vector renglon = new Vector<>();
            renglon.add(clase.getNombreClase());
            renglon.add(clase.getEntrenador().getNombreEntrenador() + ", " + clase.getEntrenador().getApellidoEntrenador());
            renglon.add(clase.getHorarioClase());
            model.addRow(renglon);
        }

        jTClases.setModel(model);
    }

    private void buscarClasesDisponibles() {
        switch (jCBHorario.getSelectedItem().toString()) {
            case "08:00":
                buscarClasesPorHorario(LocalTime.of(8, 0));
                break;
            case "09:00":
                buscarClasesPorHorario(LocalTime.of(9, 0));
                break;
            case "10:00":
                buscarClasesPorHorario(LocalTime.of(10, 0));
                break;
            case "11:00":
                buscarClasesPorHorario(LocalTime.of(11, 0));
                break;
            case "12:00":
                buscarClasesPorHorario(LocalTime.of(12, 0));
                break;
            case "13:00":
                buscarClasesPorHorario(LocalTime.of(13, 0));
                break;
            case "14:00":
                buscarClasesPorHorario(LocalTime.of(14, 0));
                break;
            case "15:00":
                buscarClasesPorHorario(LocalTime.of(15, 0));
                break;
            case "16:00":
                buscarClasesPorHorario(LocalTime.of(16, 0));
                break;
            case "17:00":
                buscarClasesPorHorario(LocalTime.of(17, 0));
                break;
            case "18:00":
                buscarClasesPorHorario(LocalTime.of(18, 0));
                break;
            case "19:00":
                buscarClasesPorHorario(LocalTime.of(19, 0));
                break;
            case "20:00":
                buscarClasesPorHorario(LocalTime.of(20, 0));
                break;
            case "21:00":
                buscarClasesPorHorario(LocalTime.of(21, 0));
                break;
            default:
                // Manejo de un caso por defecto si es necesario
                break;
        }
    }

    private void llenarComboBoxClases() {
        jCBClase.removeAllItems();
        try {
            // List<Clase> clases = claseData.buscarClasesPorSocio(idSocio);
            for (Clase clase : clases) {
                jCBClase.addItem(clase);
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
        jCBHorario.removeAllItems();
        jCBHorario.addItem("08:00:00");
        jCBHorario.addItem("09:00:00");
        jCBHorario.addItem("10:00:00");
        jCBHorario.addItem("11:00:00");
        jCBHorario.addItem("12:00:00");
        jCBHorario.addItem("13:00:00");
        jCBHorario.addItem("14:00:00");

    }

    private void llenarCombo() {
        if (clases.isEmpty()) {
            System.out.println("lista de clases vacia ");
        }
        for (Clase clase1 : clases) {
            jCBClase.addItem(clase1);
        }
    }

    private void llenarTabla() { // FALTA EL MÉTODO DE ARMAR CABECERA Y LLENAR TABLA

        Clase claseSeleccionada = (Clase) jCBClase.getSelectedItem();
        String horarioSeleccionado = (String) jCBHorario.getSelectedItem();

        if (claseSeleccionada != null && horarioSeleccionado != null) {

        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscarHorario;
    private javax.swing.JButton jBBuscarSocio;
    private javax.swing.JButton jBSalir;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JComboBox jCBClase;
    private javax.swing.JComboBox<String> jCBHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTClases;
    private javax.swing.JTextField jTDniSocio;
    private javax.swing.JTextField jTFApellido;
    private javax.swing.JTextField jTFNombre;
    // End of variables declaration//GEN-END:variables
}
