
package VISTA;

import java.util.Arrays;

public class VentanaMultiplicacion extends javax.swing.JFrame {

    // Lógica de Hash
    private String[] arreglo; // Array que actuará como la tabla de hash
    private int tamaño, contador; // Variables para gestionar la tabla
    private final int capacidadMaxima = 8;  // Establece la capacidad máxima deseada
   
    
    public VentanaMultiplicacion() {
        initComponents();
               
       // Inicializar la lógica de Hash
        tamaño = 8; // Tamaño de la tabla
        arreglo = new String[tamaño];
        Arrays.fill(arreglo, "vacio"); // Llena el array con "vacio" para indicar posiciones vacías
        
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
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();
        btnMultiplicacion = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Edad");

        txtArea.setColumns(20);
        txtArea.setRows(5);
        jScrollPane1.setViewportView(txtArea);

        btnMultiplicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnMultiplicacion.setText("Multiplicación");
        btnMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplicacionActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Teléfono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(txtTelefono))
                        .addGap(38, 38, 38)
                        .addComponent(btnMultiplicacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiplicacion))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplicacionActionPerformed
        
    // Lógica de Hash
    String elementosInput = txtEdad.getText();
    String nombre = txtNombre.getText();
    String telefono = txtTelefono.getText();
    
    // Verificar si la tabla está llena
    if (contador >= capacidadMaxima) {
        txtArea.append("La tabla está llena. No se pueden agregar más elementos.\n");
        return;
    }

    String[] nuevosEdades = elementosInput.split(",");

    // Aplicar la función de Hash
    funcionHash(nuevosEdades, nombre, telefono, arreglo);
    contador++;  // Incrementar el contador de elementos

    // Mostrar el resultado en el JTextArea
    mostrar();
        
    }//GEN-LAST:event_btnMultiplicacionActionPerformed

    /**
     * @param args the command line arguments
     */
    
   public void funcionHash(String[] cadenaArreglo, String nombre, String telefono, String[] arreglo) {
        int i;
        for (i = 0; i < cadenaArreglo.length; i++) {
            String edad = cadenaArreglo[i].trim(); // Obtiene un elemento y elimina espacios en blanco
            int indiceArreglo = hashMultiplicacion(edad); // Utilizar la función de hash de multiplicación

            // Tratando las Colisiones
            while (!arreglo[indiceArreglo].equals("vacio")) { // Mientras el índice actual en el arreglo no esta vacio
                txtArea.append("Ocurrió una colisión en el índice " + indiceArreglo + ". ");

                // Buscar el siguiente índice disponible
                indiceArreglo++;
                txtArea.append("Cambiando al índice " + indiceArreglo + "\n"); // Se impprime el indice cambiado
                indiceArreglo %= tamaño; // Asegurarse de que el índice esté dentro del rango válido
                
            }
            arreglo[indiceArreglo] = edad + " - " + nombre + " - " + telefono; // Combina elemento, nombre y telefono
        }
    }
   // Metodo Multiplicacion
   public int hashMultiplicacion(String Edad) {
           
    final double R = 0.6180334; //contante R
        
    int edad = Integer.parseInt(Edad);

    // Paso 1: Multiplicar la clave x por una constante real R (0 < R < 1.0)
    double producto = R * edad;

    // Paso 2: Determinar la parte decimal d del resultado
    double parteDecimal = producto - Math.floor(producto);  //producto - parteEntera(producto)

    // Paso 3: Multiplicar el tamaño de la tabla m por psrteDecimal y obtener la dirección dispersa
    int direccionDispersa = (int) Math.floor(tamaño * parteDecimal);

    // Asegurarse de que la dirección dispersa esté en el rango 0 .. m - 1
    direccionDispersa = direccionDispersa % tamaño;

    return direccionDispersa;
    }

    // Método para mostrar la tabla
    public void mostrar() {
    txtArea.setText(""); // Limpiar el JTextArea antes de mostrar nuevo contenido
    txtArea.append("Índice\tEdad\tNombre\tTeléfono\n");

    for (int i = 0; i < tamaño; i++) {
        if (arreglo[i].equals("vacio")) {
            txtArea.append("Índice " + i + ":\tVacío\n");
        } else {
            String[] partes = arreglo[i].split(" - ");
            txtArea.append("Índice " + i + ":\t" + partes[0] + "\t" + partes[1] + "\t" + partes[2] + "\n");
        }
    }

    txtArea.append("\nNúmero actual de elementos: " + contador + " de " + capacidadMaxima + "\n");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMultiplicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
