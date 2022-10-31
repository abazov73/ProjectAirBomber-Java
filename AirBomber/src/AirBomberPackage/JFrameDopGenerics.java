/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AirBomberPackage;

import java.util.Random;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Андрей
 */
public class JFrameDopGenerics extends javax.swing.JFrame {

    /**
     * Creates new form JFrameDopGenerics
     */
    public JFrameDopGenerics() {
        initComponents();
        int numOfDecals = 2;
        airBomberGenerator = new SetAirBombersGenericDop<>(numOfDecals);
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < numOfDecals; i++){
            EntityAirBomber airBomber;
            int rndNum = rnd.nextInt(0, 100);
            if (rndNum % 2 == 0){
                //создаём обычный бомбардировщик
                airBomber = new EntityAirBomber(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000), new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)));
            }
            else{
                //создаём тяжелый бомбардировщик
                airBomber = new EntityHeavyAirBomber(rnd.nextInt(100, 300), rnd.nextInt(1000, 2000),
                        new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
                        new Color(rnd.nextInt(0, 256), rnd.nextInt(0, 256), rnd.nextInt(0, 256)),
                        rnd.nextBoolean(),
                        rnd.nextBoolean(),
                        rnd.nextBoolean());
            }
            airBomberGenerator.add(airBomber);
        }
        
        for (int i = 0; i < numOfDecals; i++){
            int rndNum = rnd.nextInt(0, 500);
            IDrawingObjectDop engines = null;
            if (rndNum % 3 == 0){
                //создаем квадратные двигатели
                engines = new DrawingEngines();
            }
            else if (rndNum % 3 == 1){
                //создаём треугольные двигатели
                engines = new DrawingEnginesTriangle();
            }
            else {
                //создаём круглые двигатели
                engines = new DrawingEnginesOval();
            }
            engines.setNumberOfEngines(rnd.nextInt(1,4) * 2);
            airBomberGenerator.add(engines);
        }
    }

    private DrawingAirBomber _airBomber;
    private SetAirBombersGenericDop<EntityAirBomber, IDrawingObjectDop> airBomberGenerator;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        createAirBomberButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        upButton = new javax.swing.JButton();
        airBomberCanvas = new AirBomberPackage.CanvasMy();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Бомбардировщик");

        createAirBomberButton.setText("Создать");
        createAirBomberButton.setName("createAirBomberButton"); // NOI18N
        createAirBomberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAirBomberButtonActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAirBomberButton, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addComponent(airBomberCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(airBomberCanvas, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(createAirBomberButton, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(upButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(leftButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(downButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rightButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAirBomberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAirBomberButtonActionPerformed
        _airBomber = airBomberGenerator.buildAirBomber();
        SetData();
        Draw();
    }//GEN-LAST:event_createAirBomberButtonActionPerformed

    private void moveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveButtonActionPerformed
        if (_airBomber == null) return;
        String name = ((JButton) evt.getSource()).getName();
        switch (name)
        {
            case "buttonUp":
            _airBomber.MoveTransport(Direction.UP);
            break;
            case "buttonDown":
            _airBomber.MoveTransport(Direction.DOWN);
            break;
            case "buttonLeft":
            _airBomber.MoveTransport(Direction.LEFT);
            break;
            case "buttonRight":
            _airBomber.MoveTransport(Direction.RIGHT);
            break;
        }
        Draw();
    }//GEN-LAST:event_moveButtonActionPerformed

    private void SetData()
    {
        Random rnd = new Random();
        _airBomber.SetPosition(rnd.nextInt(10, 100), rnd.nextInt(10, 100), airBomberCanvas.getWidth(), airBomberCanvas.getHeight());
        airBomberCanvas.setAirBomber(_airBomber);
    }
    
    private void Draw(){
        airBomberCanvas.repaint();
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
            java.util.logging.Logger.getLogger(JFrameDopGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameDopGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameDopGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameDopGenerics.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameDopGenerics().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AirBomberPackage.CanvasMy airBomberCanvas;
    private javax.swing.JButton createAirBomberButton;
    private javax.swing.JButton downButton;
    private javax.swing.JButton leftButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JButton upButton;
    // End of variables declaration//GEN-END:variables
}
