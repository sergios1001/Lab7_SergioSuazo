
package lab.pkg7_sergiosuazo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class SistemaBuses extends javax.swing.JFrame {

    /**
     * Creates new form SistemaBuses
     */
    public SistemaBuses() {
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

        jd_Estudiantes = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        cb_parada = new javax.swing.JComboBox<>();
        tf_cuenta = new javax.swing.JTextField();
        tf_nombre = new javax.swing.JTextField();
        js_edad = new javax.swing.JSpinner();
        jd_Buses = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tf_ID = new javax.swing.JTextField();
        tf_placa = new javax.swing.JTextField();
        bt_color = new javax.swing.JButton();
        js_velocidad = new javax.swing.JSpinner();
        jButton7 = new javax.swing.JButton();
        jd_Paradas = new javax.swing.JDialog();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        tf_nombreP = new javax.swing.JTextField();
        js_distancia = new javax.swing.JSpinner();
        js_angulo = new javax.swing.JSpinner();
        jd_Simulacion = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        jl_estudiantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_buses = new javax.swing.JList<>();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_recorrido = new javax.swing.JTable();
        pb_recorrido = new javax.swing.JProgressBar();
        cb_recorrido = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jd_Estudiantes.setTitle("Agregar Estudiantes");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad: ");

        jLabel4.setText("Numero de cuenta: ");

        jLabel5.setText("Parada: ");

        jButton5.setText("Agregar Estudiante");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        js_edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jd_EstudiantesLayout = new javax.swing.GroupLayout(jd_Estudiantes.getContentPane());
        jd_Estudiantes.getContentPane().setLayout(jd_EstudiantesLayout);
        jd_EstudiantesLayout.setHorizontalGroup(
            jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                                .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(js_edad, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(cb_parada, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton5)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jd_EstudiantesLayout.setVerticalGroup(
            jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_EstudiantesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(26, 26, 26)
                .addGroup(jd_EstudiantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(js_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_parada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jd_Buses.setTitle("Agregar Buses");

        jLabel6.setText("Numero ID: ");

        jLabel7.setText("Placa: ");

        jLabel8.setText("Color: ");

        jLabel9.setText("Velocidad:");

        bt_color.setBackground(new java.awt.Color(0, 0, 255));
        bt_color.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_colorMouseClicked(evt);
            }
        });

        js_velocidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton7.setText("Agregar Bus");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_BusesLayout = new javax.swing.GroupLayout(jd_Buses.getContentPane());
        jd_Buses.getContentPane().setLayout(jd_BusesLayout);
        jd_BusesLayout.setHorizontalGroup(
            jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_BusesLayout.createSequentialGroup()
                .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_BusesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(tf_ID)
                                .addComponent(tf_placa, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                            .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(js_velocidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                                .addComponent(bt_color, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jd_BusesLayout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jButton7)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        jd_BusesLayout.setVerticalGroup(
            jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_BusesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt_color, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_BusesLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(8, 8, 8)))
                .addGap(18, 18, 18)
                .addGroup(jd_BusesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(js_velocidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addContainerGap())
        );

        jd_Paradas.setTitle("Agregar Paradas");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Distancia: ");

        jLabel12.setText("Angulo:");

        jButton8.setText("Agregar Parada");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        js_distancia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        js_angulo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jd_ParadasLayout = new javax.swing.GroupLayout(jd_Paradas.getContentPane());
        jd_Paradas.getContentPane().setLayout(jd_ParadasLayout);
        jd_ParadasLayout.setHorizontalGroup(
            jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ParadasLayout.createSequentialGroup()
                .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_ParadasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_ParadasLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(27, 27, 27)
                                .addComponent(tf_nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jd_ParadasLayout.createSequentialGroup()
                                .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(js_distancia, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(js_angulo)))))
                    .addGroup(jd_ParadasLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jButton8)))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jd_ParadasLayout.setVerticalGroup(
            jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_ParadasLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(tf_nombreP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(js_distancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_ParadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(js_angulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jd_Simulacion.setTitle("Simulacion");

        jScrollPane1.setViewportView(jl_estudiantes);

        jScrollPane2.setViewportView(jl_buses);

        jLabel13.setText("Estudiantes");

        jLabel14.setText("Autobuses");

        jButton6.setText("---->");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jt_recorrido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Parada", "Tiempo", "Estudiantes"
            }
        ));
        jScrollPane3.setViewportView(jt_recorrido);

        jLabel15.setText("Seleccione un bus para la simulacion:");

        jButton9.setText("Inicio");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_SimulacionLayout = new javax.swing.GroupLayout(jd_Simulacion.getContentPane());
        jd_Simulacion.getContentPane().setLayout(jd_SimulacionLayout);
        jd_SimulacionLayout.setHorizontalGroup(
            jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addComponent(cb_recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pb_recorrido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)
                            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jButton6)))
                                .addGap(18, 37, Short.MAX_VALUE)
                                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))))
                        .addGap(23, 23, 23))))
            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jd_SimulacionLayout.setVerticalGroup(
            jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addGroup(jd_SimulacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jd_SimulacionLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_SimulacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(cb_recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(pb_recorrido, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jd_SimulacionLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jButton6)))
                .addGap(18, 18, 18)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Bienvenido al Sistema de buses de UNITEC");

        jButton1.setText("Agregar Estudiantes");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Agregar Buses");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Agregar Paradas");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Simulacion");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        // TODO add your handling code here:
        String nombre;
        int cuenta,edad;
        Paradas parada;
        
        nombre=tf_nombre.getText();
        cuenta=Integer.parseInt(tf_cuenta.getText());
        edad=(int)js_edad.getValue();
        parada=(Paradas) cb_parada.getSelectedItem();
        Estudiantes e=new Estudiantes(nombre, edad, cuenta, parada);
        adminEstudiantes ae = new adminEstudiantes("./estudiantes.cmd");
        ae.cargarArchivo();
        ae.setEstudiante(e);
        ae.escribirArchivo();
        JOptionPane.showMessageDialog(this, "El estudiante se agrego correctamente");
        
        tf_nombre.setText("");
        tf_cuenta.setText("");
        js_edad.setValue(0);
        cb_parada.setSelectedItem(0);
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        String ID,placa;
        Color color;
        int velocidad;
        
        ID=tf_ID.getText();
        placa=tf_placa.getText();
        color=bt_color.getBackground();
        velocidad=(int)js_velocidad.getValue();
        
        Autobuses a=new Autobuses(ID, placa, velocidad, color);
        adminBuses ab=new adminBuses("./buses.cmd");
        ab.cargarArchivo();
        ab.setBus(a);
        ab.escribirArchivo();
        JOptionPane.showMessageDialog(this, "El bus se agrego exitosamente");
        
        tf_ID.setText("");
        tf_placa.setText("");
        bt_color.setBackground(Color.blue);
        js_velocidad.setValue(0);
    }//GEN-LAST:event_jButton7MouseClicked

    private void bt_colorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_colorMouseClicked
        // TODO add your handling code here:
        bt_color.setBackground(
                JColorChooser.showDialog(this,"Seleccione un color", Color.blue));
    }//GEN-LAST:event_bt_colorMouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        // TODO add your handling code here:
        String nombre;
        int distancia,angulo;
        
        nombre=tf_nombreP.getText();
        distancia=(int)js_distancia.getValue();
        angulo=(int)js_angulo.getValue();
        
        Paradas p = new Paradas(nombre, distancia, angulo);
        adminParadas ap=new adminParadas("./paradas.cmd");
        ap.cargarArchivo();
        ap.setParada(p);
        ap.escribirArchivo();
        JOptionPane.showMessageDialog(this, "La Parada se agrego exitosamente");
        
        tf_nombreP.setText("");
        js_distancia.setValue(0);
        js_angulo.setValue(0);
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        jd_Estudiantes.setVisible(true);
        jd_Estudiantes.pack();
        adminParadas ap = new adminParadas("./paradas.cbm");
            ap.cargarArchivo();
            DefaultComboBoxModel modelo
                    = new DefaultComboBoxModel(
                            ap.getListaParadas().toArray());
            cb_parada.setModel(modelo);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        jd_Buses.setVisible(true);
        jd_Buses.pack();
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        jd_Paradas.setVisible(true);
        jd_Paradas.pack();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:
        jd_Simulacion.setVisible(true);
        jd_Simulacion.pack();
        adminEstudiantes e=new adminEstudiantes("./estudiantes.cmd");
        e.cargarArchivo();
        
        DefaultListModel m = (DefaultListModel)jl_estudiantes.getModel();
        for (int i = 0; i < e.getListaEstudiantes().size(); i++) {
            m.addElement(e.getListaEstudiantes().get(i));
        }
        jl_estudiantes.setModel(m);
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        if(jl_estudiantes.getSelectedIndex()>=0 && jl_buses.getSelectedIndex()>=0)
        {
            adminEstudiantes e=new adminEstudiantes("./estudiantes.cmd");
            e.cargarArchivo();
            adminBuses b= new adminBuses("./buses.cmd");
            b.cargarArchivo();
            b.getListaBuses().get(jl_buses.getSelectedIndex()).getPasajeros().add(e.getListaEstudiantes().get(jl_estudiantes.getSelectedIndex()));
            
            DefaultListModel m = (DefaultListModel)jl_estudiantes.getModel();
            m.remove(jl_estudiantes.getSelectedIndex());
            jl_estudiantes.setModel(m);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "No selecciono todos los objetos");
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        // TODO add your handling code here:
        ArrayList<Paradas> paradas=new ArrayList<>();
        bus=(Autobuses)cb_recorrido.getSelectedItem();
        for (int i = 0; i < bus.getPasajeros().size(); i++) {
            for (int j = 0; j < paradas.size(); j++) {
                if(paradas.get(i).equals(bus.getPasajeros().get(i).getParada()))
                {
                    break;
                }
                else
                {
                    paradas.add(bus.getPasajeros().get(i).getParada());
                }
            }
        }
        int distancia=1000000;
        for (int i = 0; i < paradas.size(); i++) {
            if(paradas.get(i).getDistancia()<distancia)
            {
                distancia=paradas.get(i).getDistancia();
            }
        }
        adminBarra h=new adminBarra(pb_recorrido,paradas.size());
        Thread proceso = new Thread(h);
        proceso.start();
        
        
        
        
    }//GEN-LAST:event_jButton9MouseClicked

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
            java.util.logging.Logger.getLogger(SistemaBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaBuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_color;
    private javax.swing.JComboBox<String> cb_parada;
    private javax.swing.JComboBox<String> cb_recorrido;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JDialog jd_Buses;
    private javax.swing.JDialog jd_Estudiantes;
    private javax.swing.JDialog jd_Paradas;
    private javax.swing.JDialog jd_Simulacion;
    private javax.swing.JList<String> jl_buses;
    private javax.swing.JList<String> jl_estudiantes;
    private javax.swing.JSpinner js_angulo;
    private javax.swing.JSpinner js_distancia;
    private javax.swing.JSpinner js_edad;
    private javax.swing.JSpinner js_velocidad;
    private javax.swing.JTable jt_recorrido;
    private javax.swing.JProgressBar pb_recorrido;
    private javax.swing.JTextField tf_ID;
    private javax.swing.JTextField tf_cuenta;
    private javax.swing.JTextField tf_nombre;
    private javax.swing.JTextField tf_nombreP;
    private javax.swing.JTextField tf_placa;
    // End of variables declaration//GEN-END:variables
    ArrayList<Estudiantes> estudiantes;
    Autobuses bus;
}
