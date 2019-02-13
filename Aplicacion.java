package MetodosNumericos;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Aplicacion extends javax.swing.JFrame {
    NumberFormat numberFormat = NumberFormat.getInstance();
    public double valorRelativo;
    public double valorAbsoluto;
    public double option;
    public double redondear;
    public double resultado;
    public int decimales;
    public int truncado;

public Aplicacion(double v1, double v2, double opcion, double redondear, int decimales) {
        this.valorRelativo = valorRelativo;
        this.valorAbsoluto = valorAbsoluto;
        this.option = opcion;
        this.redondear = redondear;
        this.decimales = decimales;
    }
public Aplicacion() {
        initComponents();
        this.setLocationRelativeTo(null);  
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel_fondo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ValorVerdadero = new javax.swing.JTextField();
        ValorAprox = new javax.swing.JTextField();
        BotonTruncar = new javax.swing.JRadioButton();
        BotonRedondear = new javax.swing.JRadioButton();
        NuevoAproximado = new javax.swing.JTextField();
        finalizar = new javax.swing.JButton();
        CantidadDec = new javax.swing.JTextField();
        BotonCalcular = new javax.swing.JButton();
        ERel = new javax.swing.JTextField();
        EPor = new javax.swing.JTextField();
        EAbs = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        BotonValor = new javax.swing.JButton();
        BotonLimpiar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jLabel_fondo.setBackground(new java.awt.Color(0, 255, 155));
        jLabel_fondo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fondo.setInheritsPopupMenu(false);
        jLabel_fondo.setOpaque(true);
        jLabel_fondo.setPreferredSize(new java.awt.Dimension(240, 420));

        jPanel1.setBackground(new java.awt.Color(0, 255, 155));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ValorVerdadero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorVerdaderoActionPerformed(evt);
            }
        });
        getContentPane().add(ValorVerdadero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 110, 30));
        getContentPane().add(ValorAprox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 110, 30));

        buttonGroup1.add(BotonTruncar);
        BotonTruncar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonTruncar.setText("Truncar");
        BotonTruncar.setContentAreaFilled(false);
        BotonTruncar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonTruncarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonTruncar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        buttonGroup1.add(BotonRedondear);
        BotonRedondear.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BotonRedondear.setText("Redondear");
        BotonRedondear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotonRedondear.setContentAreaFilled(false);
        BotonRedondear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRedondearActionPerformed(evt);
            }
        });
        getContentPane().add(BotonRedondear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, -1, -1));

        NuevoAproximado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoAproximadoActionPerformed(evt);
            }
        });
        getContentPane().add(NuevoAproximado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 120, 30));

        finalizar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        finalizar.setForeground(new java.awt.Color(255, 0, 0));
        finalizar.setText("Finalizar");
        finalizar.setBorder(new javax.swing.border.MatteBorder(null));
        finalizar.setContentAreaFilled(false);
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });
        getContentPane().add(finalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 510, 90, 30));

        CantidadDec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadDecActionPerformed(evt);
            }
        });
        getContentPane().add(CantidadDec, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 70, 30));

        BotonCalcular.setBackground(new java.awt.Color(204, 204, 204));
        BotonCalcular.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BotonCalcular.setText("Calcular");
        BotonCalcular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonCalcular.setContentAreaFilled(false);
        BotonCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        BotonCalcular.setPreferredSize(new java.awt.Dimension(256, 256));
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 130, 30));
        getContentPane().add(ERel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 170, 30));
        getContentPane().add(EPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 170, 30));
        getContentPane().add(EAbs, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 170, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Que hacer con el valor aproximado");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 270, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Metodos Numericos");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Tipos de errores");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, -1, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Valor Verdadero (P)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel10.setBackground(new java.awt.Color(204, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Valor Aproximado (P*)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 350, 10));

        jSeparator2.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, 10));

        jSeparator3.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 350, 10));

        jLabel12.setBackground(new java.awt.Color(204, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Cantidad de Decimales");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jSeparator4.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 350, 10));

        jLabel13.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel13.setText("Error Absoluto");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel14.setText("Error Relativo");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century", 1, 14)); // NOI18N
        jLabel15.setText("Relativo Porcentual");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, -1, -1));

        jSeparator5.setForeground(new java.awt.Color(51, 51, 51));
        getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, 350, 10));

        BotonValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BotonValor.setText("Nuevo Valor Aproximado");
        BotonValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        BotonValor.setContentAreaFilled(false);
        BotonValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonValorActionPerformed(evt);
            }
        });
        getContentPane().add(BotonValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 150, 30));

        BotonLimpiar.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        BotonLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        BotonLimpiar.setText("Limpiar");
        BotonLimpiar.setBorder(new javax.swing.border.MatteBorder(null));
        BotonLimpiar.setContentAreaFilled(false);
        BotonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 90, 30));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NuevoAproximadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoAproximadoActionPerformed
        
    }//GEN-LAST:event_NuevoAproximadoActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_finalizarActionPerformed

    private void BotonTruncarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonTruncarActionPerformed
        
    }//GEN-LAST:event_BotonTruncarActionPerformed

    private void ValorVerdaderoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorVerdaderoActionPerformed

    }//GEN-LAST:event_ValorVerdaderoActionPerformed

    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed

        if(BotonTruncar.isSelected()){    
            EAbs.setText(""+ Math.abs(valorRelativo-resultado));
            ERel.setText(""+Math.abs(valorRelativo-resultado)/valorRelativo);
            EPor.setText(""+(Math.abs(valorRelativo-resultado)/valorRelativo)*100+"%");
        }else if(BotonRedondear.isSelected()){
        EAbs.setText(""+Math.abs(valorRelativo-redondear));
        ERel.setText(""+ Math.abs(valorRelativo-redondear)/valorRelativo);
        EPor.setText(""+(Math.abs(valorRelativo-redondear)/valorRelativo)*100+"%");
        
        }
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void CantidadDecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadDecActionPerformed
       
    }//GEN-LAST:event_CantidadDecActionPerformed

    private void BotonValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonValorActionPerformed

        valorRelativo=Double.parseDouble(ValorVerdadero.getText());
        valorAbsoluto=Double.parseDouble(ValorAprox.getText());

        if(BotonTruncar.isSelected()){
            decimales=Integer.parseInt(CantidadDec.getText());
            resultado=valorAbsoluto;
            String arg = "" + valorAbsoluto;
            int MX = arg.indexOf('.');
            if (MX!=-1) {
                if (arg.length() > MX+decimales) {
                    arg = arg.substring(0,MX+decimales+1);
                    resultado  = Double.parseDouble(arg);
                }
                NuevoAproximado.setText(""+resultado);
            }

        }else if(BotonRedondear.isSelected()){
            decimales=Integer.parseInt(CantidadDec.getText());
            redondear= new BigDecimal(valorAbsoluto).setScale(decimales, RoundingMode.HALF_EVEN).doubleValue();
            NuevoAproximado.setText(""+redondear);
   
        }
    }//GEN-LAST:event_BotonValorActionPerformed

    private void BotonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonLimpiarActionPerformed
      
         // Limpiar
        ValorVerdadero.setText(null);
        ValorAprox.setText(null);
        CantidadDec.setText(null);
        NuevoAproximado.setText(null);
        EAbs.setText(null);
        ERel.setText(null);
        EPor.setText(null);   
    }//GEN-LAST:event_BotonLimpiarActionPerformed

    private void BotonRedondearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRedondearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonRedondearActionPerformed
   
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);    
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JButton BotonLimpiar;
    private javax.swing.JRadioButton BotonRedondear;
    private javax.swing.JRadioButton BotonTruncar;
    private javax.swing.JButton BotonValor;
    private javax.swing.JTextField CantidadDec;
    private javax.swing.JTextField EAbs;
    private javax.swing.JTextField EPor;
    private javax.swing.JTextField ERel;
    private javax.swing.JTextField NuevoAproximado;
    private javax.swing.JTextField ValorAprox;
    private javax.swing.JTextField ValorVerdadero;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_fondo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    // End of variables declaration//GEN-END:variables
}
