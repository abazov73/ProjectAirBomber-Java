/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AirBomberPackage;
import java.util.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author Андрей
 */
public class JFrameMap extends javax.swing.JFrame {

    /**
     * Creates new form JFrameMap
     */
    public JFrameMap() {
        initComponents();
    }

    private DrawingAirBomber _airBomber;
    private AbstractMap _abstractMap = new SimpleMap();
    private EnginesType enginesType = EnginesType.RECTANGLE;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        airBomberCanvas = new AirBomberPackage.CanvasMy();
        jLabelEngines = new javax.swing.JLabel();
        jComboBoxEngines = new javax.swing.JComboBox<>();
        createAirBomberButton = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        leftButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        ModifyButton = new javax.swing.JButton();
        jComboBoxMap = new javax.swing.JComboBox<>();
        jComboBoxEnginesType = new javax.swing.JComboBox<>();
        jLabelEngines1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Бомбардировщик");
        setAlwaysOnTop(true);
        setName("FrameMap"); // NOI18N
        setSize(new java.awt.Dimension(700, 400));

        airBomberCanvas.setPreferredSize(new java.awt.Dimension(700, 300));

        jLabelEngines.setText("Количество двигателей: ");

        jComboBoxEngines.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Два", "Четыре", "Шесть" }));

        createAirBomberButton.setText("Создать");
        createAirBomberButton.setName("createAirBomberButton"); // NOI18N
        createAirBomberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirBomberButtonActionPerformed(evt);
            }
        });

        statusLabel.setText("Скорость: Вес: Цвет: Двигатели:");
        statusLabel.setMinimumSize(new java.awt.Dimension(0, 0));

        leftButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirBomberPackage/arrowLeft.png"))); // NOI18N
        leftButton.setMargin(new java.awt.Insets(0, 0, 0, 0));
        leftButton.setMaximumSize(new java.awt.Dimension(30, 30));
        leftButton.setMinimumSize(new java.awt.Dimension(30, 30));
        leftButton.setName("buttonLeft"); // NOI18N
        leftButton.setPreferredSize(new java.awt.Dimension(30, 30));
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        downButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirBomberPackage/arrowDown.png"))); // NOI18N
        downButton.setMaximumSize(new java.awt.Dimension(30, 30));
        downButton.setMinimumSize(new java.awt.Dimension(30, 30));
        downButton.setName("buttonDown"); // NOI18N
        downButton.setPreferredSize(new java.awt.Dimension(30, 30));
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        rightButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirBomberPackage/arrowRight.png"))); // NOI18N
        rightButton.setMaximumSize(new java.awt.Dimension(30, 30));
        rightButton.setMinimumSize(new java.awt.Dimension(30, 30));
        rightButton.setName("buttonRight"); // NOI18N
        rightButton.setPreferredSize(new java.awt.Dimension(30, 30));
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        upButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AirBomberPackage/arrowUp.png"))); // NOI18N
        upButton.setMaximumSize(new java.awt.Dimension(30, 30));
        upButton.setMinimumSize(new java.awt.Dimension(30, 30));
        upButton.setName("buttonUp"); // NOI18N
        upButton.setPreferredSize(new java.awt.Dimension(30, 30));
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveButtonActionPerformed(evt);
            }
        });

        ModifyButton.setText("Модификация");
        ModifyButton.setToolTipText("");
        ModifyButton.setName("modifyButton"); // NOI18N
        ModifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifyButtonActionPerformed(evt);
            }
        });

        jComboBoxMap.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Простая карта", "Линейная карта", "Городская карта" }));
        jComboBoxMap.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxMapItemStateChanged(evt);
            }
        });

        jComboBoxEnginesType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Квадратный", "Треугольный", "Круглый" }));
        jComboBoxEnginesType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxEnginesTypeItemStateChanged(evt);
            }
        });

        jLabelEngines1.setText("Тип двигателей: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(statusLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelEngines)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEngines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEngines1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxEnginesType, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createAirBomberButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ModifyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxMap, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(airBomberCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(airBomberCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEngines, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxEngines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelEngines1)
                            .addComponent(jComboBoxEnginesType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(createAirBomberButton, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(ModifyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxMap)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAirBomberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirBomberButtonActionPerformed
        Random rnd = new Random();
        _airBomber = new DrawingAirBomber(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000), new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)), (jComboBoxEngines.getSelectedIndex() + 1) * 2, enginesType);
        SetData(_airBomber);
    }//GEN-LAST:event_createAirBomberButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        if (_airBomber == null) return;
        String name = ((JButton) evt.getSource()).getName();
        Direction dir = Direction.NONE;
        switch (name)
        {
            case "buttonUp":
                dir = Direction.UP;
                break;
            case "buttonDown":
                dir = Direction.DOWN;
                break;
            case "buttonLeft":
                dir = Direction.LEFT;
                break;
            case "buttonRight":
                dir = Direction.RIGHT;
                break;
        }
        airBomberCanvas.getGraphics().drawImage(_abstractMap.MoveObject(dir), 0, 0, null);
    }//GEN-LAST:event_moveButtonActionPerformed

    private void ModifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifyButtonActionPerformed
        Random rnd = new Random();
        _airBomber = new DrawingHeavyAirBomber(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000),
            new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
            (jComboBoxEngines.getSelectedIndex() + 1) * 2,
            enginesType,
            new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
            rnd.nextBoolean(), rnd.nextBoolean(), rnd.nextBoolean());
        SetData(_airBomber);
    }//GEN-LAST:event_ModifyButtonActionPerformed

    private void jComboBoxMapItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxMapItemStateChanged
        switch (jComboBoxMap.getSelectedIndex())
        {
            case 0:
                _abstractMap = new SimpleMap();
                break;
            case 1:
                _abstractMap = new LineMap();
                break;
            case 2:
                _abstractMap = new CityMap();
                break;
        }
    }//GEN-LAST:event_jComboBoxMapItemStateChanged

    private void jComboBoxEnginesTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxEnginesTypeItemStateChanged
        switch (jComboBoxEnginesType.getSelectedIndex())
        {
            case 0:
            enginesType = EnginesType.RECTANGLE;
            break;
            case 1:
            enginesType = EnginesType.TRIANGLE;
            break;
            case 2:
            enginesType = EnginesType.OVAL;
            break;
        }
    }//GEN-LAST:event_jComboBoxEnginesTypeItemStateChanged

    private void SetData(DrawingAirBomber airBomber)
    {
        Random rnd = new Random();
        _airBomber.SetPosition(rnd.nextInt(10, 100), rnd.nextInt(10, 100), airBomberCanvas.getWidth(), airBomberCanvas.getHeight());
        statusLabel.setText("Скорость: " + _airBomber.getAirBomber().getSpeed() + " Вес: " + (int) _airBomber.getAirBomber().getWeight() + " Цвет: " + _airBomber.getAirBomber().getBodyColor() + " Двигатели: " + _airBomber.drawingEngines.getNumberOfEngines());
        airBomberCanvas.setAirBomber(_airBomber);
        airBomberCanvas.getGraphics().drawImage(_abstractMap.CreateMap(airBomberCanvas.getWidth() + 6, airBomberCanvas.getHeight() + 3, new DrawingObjectAirBomber(airBomber)), 0,0,null);
    }
    
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
            java.util.logging.Logger.getLogger(JFrameMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ModifyButton;
    private AirBomberPackage.CanvasMy airBomberCanvas;
    private javax.swing.JButton createAirBomberButton;
    private javax.swing.JButton downButton;
    private javax.swing.JComboBox<String> jComboBoxEngines;
    private javax.swing.JComboBox<String> jComboBoxEnginesType;
    private javax.swing.JComboBox<String> jComboBoxMap;
    private javax.swing.JLabel jLabelEngines;
    private javax.swing.JLabel jLabelEngines1;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
