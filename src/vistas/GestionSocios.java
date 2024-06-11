package vistas;
import entities.Socio;
import javax.swing.JOptionPane;
import persistence.SocioData;


public class GestionSocios extends javax.swing.JInternalFrame {

    private Socio socio;
    private SocioData socioData;

    /**
     * Creates new form Socios
     */
    public GestionSocios() {
        initComponents();
        socio = new Socio();
        socioData = new SocioData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTNombre = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jApellido = new javax.swing.JLabel();
        jTApellido = new javax.swing.JTextField();
        jLEdad = new javax.swing.JLabel();
        jTEdad = new javax.swing.JTextField();
        jLCorreo = new javax.swing.JLabel();
        jTCorreo = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jTTelefono = new javax.swing.JTextField();
        jLDni = new javax.swing.JLabel();
        jTDni = new javax.swing.JTextField();
        jLNroSocio = new javax.swing.JLabel();
        jTId_Socio = new javax.swing.JTextField();
        jBSalir = new javax.swing.JButton();
        jBNuevo = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jRBEstado = new javax.swing.JRadioButton();

        setTitle("SOCIOS");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("DATOS SOCIOS");

        jLNombre.setText("Nombre");

        jApellido.setText("Apellido");

        jLEdad.setText("Edad");

        jLCorreo.setText("Correo");

        jLTelefono.setText("Telefono");

        jLDni.setText("DNI");

        jLNroSocio.setText("Nro Socio");

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBNuevo.setText("Nuevo");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jRBEstado.setText("Habilitado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jApellido)
                                    .addComponent(jLNombre))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                    .addComponent(jTApellido))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLEdad)
                                    .addComponent(jLDni))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLCorreo)
                                    .addComponent(jLNroSocio))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jBNuevo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                        .addComponent(jBGuardar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTCorreo)
                                            .addComponent(jTId_Socio, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                        .addGap(49, 49, 49)
                                        .addComponent(jLTelefono)))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRBEstado))))))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre)
                    .addComponent(jLDni)
                    .addComponent(jTDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jApellido)
                        .addComponent(jTApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLEdad)
                        .addComponent(jTEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLTelefono)
                    .addComponent(jTTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCorreo))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNroSocio)
                    .addComponent(jTId_Socio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRBEstado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBSalir)
                    .addComponent(jBNuevo)
                    .addComponent(jBGuardar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
   private boolean validaEntero(String texto) {
        try {
            if (!texto.matches("^\\d+$")) {
                return false;
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ha ocurrido un error: " + e.getMessage());
            return false;
        }
    }

    private void limpiarCampos() {
        jTDni.setText("");
        jTApellido.setText("");
        jTNombre.setText("");
        jRBEstado.setSelected(false);
        jTEdad.setText("");
        jTCorreo.setText("");
        jTTelefono.setText("");

    }
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try {
            String dni = jTDni.getText();
            String nombre = jTNombre.getText();
            String apellido = jTApellido.getText();
            jTId_Socio.setEditable(false);// evitamos que se cargue el campo socio
            String telefono = jTTelefono.getText();
            String edad = jTEdad.getText();
           
            String correo = jTCorreo.getText();

            if (!validaEntero(dni)) {
                throw new Exception("El DNI debe ser un número entero válido");
            }
            if (!validaEntero(edad)) {
                throw new Exception("La edad debe ser un número entero válido");
            }

            int edadInt = Integer.parseInt(edad);
            
            if (dni == null || dni.isEmpty()) {
                throw new NullPointerException("El campo DNI es null o está vacío");
            }
            if (nombre == null || nombre.isEmpty()) {
                throw new NullPointerException("El campo Nombre es null o está vacío");
            }
            if (apellido == null || apellido.isEmpty()) {
                throw new NullPointerException("El campo Apellido es null o está vacío");
            }

            boolean estado = socio();
//(String dniSocio, String nombreSocio, String apellidoSocio, int edadSocio, String correoSocio, String telefonoSocio, boolean estado)
            Socio socio = new Socio(dni, nombre, apellido, edadInt, correo, telefono, true);

            SocioData socioData = new SocioData();
            jBGuardar.setEnabled(true);
            socioData.agregarSocio(socio); // Agregar nuevo alumno a Universidad

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir el DNI a número: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        limpiarCampos();


    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      dispose();
    }//GEN-LAST:event_jBSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jApellido;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBNuevo;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLCorreo;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLEdad;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLNroSocio;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JTextField jTApellido;
    private javax.swing.JTextField jTCorreo;
    private javax.swing.JTextField jTDni;
    private javax.swing.JTextField jTEdad;
    private javax.swing.JTextField jTId_Socio;
    private javax.swing.JTextField jTNombre;
    private javax.swing.JTextField jTTelefono;
    // End of variables declaration//GEN-END:variables
}
