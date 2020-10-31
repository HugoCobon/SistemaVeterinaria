/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControladorPaciente;
import javax.swing.JOptionPane;
import modelo.Paciente;

/**
 *
 * @author LENOVO
 */
public class Ficha extends javax.swing.JFrame {

    /**
     * Creates new form Ficha
     */
    public Ficha() {
        initComponents();
        //PARA MAXIMIZAR PANTALLA
        this.setLocationRelativeTo(null);
//        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    private void Buscar() {
        String[] datos = new String[8];
        String info = txtBuscar.getText();
        ControladorPaciente sp = new ControladorPaciente();
        datos = sp.Buscar(info);

        if (datos.length != 0) {
            txtId.setText(datos[0]);
            txtNombrePaciente.setText(datos[1]);
            txtRaza.setText(datos[2]);
            txtFechaNacimiento.setText(datos[3]);
            txtNombreDueno.setText(datos[4]);
            txtApellidoDueno.setText(datos[5]);
            txtTelefono.setText(datos[6]);
            txtDireccion.setText(datos[7]);
        } else {
            JOptionPane.showMessageDialog(null, "No Existe Este Paciente");
        }
    }

    private void Actualizar() {

        Paciente pac = new Paciente();
        String id = txtId.getText();
      
        String nombrePaciente = txtNombrePaciente.getText();
        String raza = txtRaza.getText();
        String fechaNacimiento = txtFechaNacimiento.getText();
        String nombreDueno = txtNombreDueno.getText();
        String apellidoDueno = txtApellidoDueno.getText();
        String telefono = txtTelefono.getText();
        String direccion = txtDireccion.getText();

        if (nombrePaciente.isEmpty() || raza.isEmpty() || fechaNacimiento.isEmpty() || nombreDueno.isEmpty() || apellidoDueno.isEmpty() || telefono.isEmpty() || direccion.isEmpty()) {

            JOptionPane.showMessageDialog(null, "Algun campo esta vacio");

        } else {
            int tel = Integer.parseInt(telefono); // parsear cambio del tipo de dato de string a entero
            int idPaciente = Integer.parseInt(id);
            
            pac.setIdPaciente(idPaciente);
            pac.setNombrePaciente(nombrePaciente);
            pac.setRaza(raza);
            pac.setFechaNacimiento(fechaNacimiento);
            pac.setNombreDueno(nombreDueno);
            pac.setApellidoDueno(apellidoDueno);
            pac.setTelefono(tel);
            pac.setDireccion(direccion);

            ControladorPaciente cp = new ControladorPaciente();
            boolean resultado = cp.actualizar(pac);
            if (resultado) {
                JOptionPane.showMessageDialog(null, "Paciente Actualizado");
                Limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error Al Actualizar");
            }

        }
    }

    private void Limpiar() {
        txtId.setText(null);
        txtNombrePaciente.setText(null);
        txtRaza.setText(null);
        txtFechaNacimiento.setText(null);
        txtNombreDueno.setText(null);
        txtApellidoDueno.setText(null);
        txtTelefono.setText(null);
        txtDireccion.setText(null);

    }
    
    private void Eliminar(){
         String id = txtId.getText();
         if(!id.isEmpty()){
             ControladorPaciente sp = new ControladorPaciente();
             boolean resultado = sp.eliminar(id);
             if(resultado){
                 JOptionPane.showMessageDialog(null, "Paciente Eliminado");
                 Limpiar();
             }else{
                 JOptionPane.showMessageDialog(null, "Error Al Eliminar");
             }
             
         }else{
              JOptionPane.showMessageDialog(null, "Debe De Bucar Un Paciente");
         }
         
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelFondo11 = new vista.panelFondo1();
        jButton1 = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombreDueno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoDueno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID Paciente");

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre Del paciente");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Raza");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Fecha Nacimiento");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre Del Dueño");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Apellido Del Dueño");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Teléfono");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion");

        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Buscar");

        javax.swing.GroupLayout panelFondo11Layout = new javax.swing.GroupLayout(panelFondo11);
        panelFondo11.setLayout(panelFondo11Layout);
        panelFondo11Layout.setHorizontalGroup(
            panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelFondo11Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondo11Layout.createSequentialGroup()
                        .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFondo11Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addGroup(panelFondo11Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel9)
                                .addGap(38, 38, 38)
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnBuscar)
                                .addGap(0, 94, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(panelFondo11Layout.createSequentialGroup()
                        .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(36, 36, 36)
                        .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtId)
                            .addComponent(txtNombrePaciente)
                            .addComponent(txtRaza)
                            .addComponent(txtFechaNacimiento)
                            .addComponent(txtNombreDueno)
                            .addComponent(txtApellidoDueno)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84))))
        );
        panelFondo11Layout.setVerticalGroup(
            panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFondo11Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(jLabel9))
                .addGap(32, 32, 32)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizar))
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFondo11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelFondo11Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnEliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNombreDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtApellidoDueno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFondo11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFondo11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Interfaz pc = new Interfaz();
        pc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
       Actualizar();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        Eliminar();
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ficha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ficha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private vista.panelFondo1 panelFondo11;
    private javax.swing.JTextField txtApellidoDueno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreDueno;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}