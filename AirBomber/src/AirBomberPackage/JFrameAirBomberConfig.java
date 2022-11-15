/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package AirBomberPackage;

import java.awt.Color;
import javax.swing.*;
import java.util.ArrayList;

/**
 *
 * @author Андрей
 */
public class JFrameAirBomberConfig extends javax.swing.JFrame {

    private IDrawingObjectDop engines;
    private Color dragColor;
    private String typeOfAirBomber;
    private DrawingAirBomber _airBomber = null;
    private boolean cursorInCanvasLocation = false;
    private boolean cursorInBaseLabelLocation = false;
    private boolean cursorInDopLabelLocation = false;
    private ArrayList<ITransferAirBomberDelegate> eventAddAirBomber = new ArrayList<>();
    /**
     * Creates new form JFrameAirBomberConfig
     */
    public JFrameAirBomberConfig() {
        initComponents();
        jButtonCancel.addActionListener(e -> dispose());
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
        jLabel2 = new javax.swing.JLabel();
        jSpinnerSpeed = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerWeight = new javax.swing.JSpinner();
        jCheckBoxFuelTanks = new javax.swing.JCheckBox();
        jCheckBoxBombs = new javax.swing.JCheckBox();
        jCheckBoxTailLine = new javax.swing.JCheckBox();
        jLabelSimpleObject = new javax.swing.JLabel();
        jLabelModifiedObject = new javax.swing.JLabel();
        jPanelGreen = new javax.swing.JPanel();
        jPanelWhite = new javax.swing.JPanel();
        jPanelRed = new javax.swing.JPanel();
        jPanelGray = new javax.swing.JPanel();
        jPanelBlue = new javax.swing.JPanel();
        jPanelBlack = new javax.swing.JPanel();
        jPanelYellow = new javax.swing.JPanel();
        jPanelPurple = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSpinnerNumOfEngines = new javax.swing.JSpinner();
        jLabelRect = new javax.swing.JLabel();
        jLabelTriangle = new javax.swing.JLabel();
        jLabelRound = new javax.swing.JLabel();
        canvasMyObject = new AirBomberPackage.CanvasMy();
        jLabelBaseColor = new javax.swing.JLabel();
        jLabelDopColor = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Создание объекта");

        jLabel1.setText("Параметры");

        jLabel2.setText("Скорость:");

        jSpinnerSpeed.setModel(new javax.swing.SpinnerNumberModel(100, 1, null, 1));

        jLabel3.setText("Вес:");

        jSpinnerWeight.setModel(new javax.swing.SpinnerNumberModel(100, 1, null, 1));

        jCheckBoxFuelTanks.setText("Признак наличия топливных баков");

        jCheckBoxBombs.setText("Признак наличия бомб");

        jCheckBoxTailLine.setText("Признак наличия полосок на хвосте");

        jLabelSimpleObject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSimpleObject.setText("Простой");
        jLabelSimpleObject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelSimpleObject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelObjectMouseReleased(evt);
            }
        });

        jLabelModifiedObject.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModifiedObject.setText("Продвинутый");
        jLabelModifiedObject.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelModifiedObject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelObjectMouseReleased(evt);
            }
        });

        jPanelGreen.setBackground(new java.awt.Color(102, 255, 102));
        jPanelGreen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelGreenLayout = new javax.swing.GroupLayout(jPanelGreen);
        jPanelGreen.setLayout(jPanelGreenLayout);
        jPanelGreenLayout.setHorizontalGroup(
            jPanelGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelGreenLayout.setVerticalGroup(
            jPanelGreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelWhite.setBackground(new java.awt.Color(255, 255, 255));
        jPanelWhite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelWhiteLayout = new javax.swing.GroupLayout(jPanelWhite);
        jPanelWhite.setLayout(jPanelWhiteLayout);
        jPanelWhiteLayout.setHorizontalGroup(
            jPanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelWhiteLayout.setVerticalGroup(
            jPanelWhiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelRed.setBackground(new java.awt.Color(255, 0, 51));
        jPanelRed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelRedLayout = new javax.swing.GroupLayout(jPanelRed);
        jPanelRed.setLayout(jPanelRedLayout);
        jPanelRedLayout.setHorizontalGroup(
            jPanelRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelRedLayout.setVerticalGroup(
            jPanelRedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelGray.setBackground(new java.awt.Color(153, 153, 153));
        jPanelGray.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelGrayLayout = new javax.swing.GroupLayout(jPanelGray);
        jPanelGray.setLayout(jPanelGrayLayout);
        jPanelGrayLayout.setHorizontalGroup(
            jPanelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelGrayLayout.setVerticalGroup(
            jPanelGrayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelBlue.setBackground(new java.awt.Color(51, 51, 255));
        jPanelBlue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelBlueLayout = new javax.swing.GroupLayout(jPanelBlue);
        jPanelBlue.setLayout(jPanelBlueLayout);
        jPanelBlueLayout.setHorizontalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelBlueLayout.setVerticalGroup(
            jPanelBlueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelBlack.setBackground(new java.awt.Color(0, 0, 0));
        jPanelBlack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelBlackLayout = new javax.swing.GroupLayout(jPanelBlack);
        jPanelBlack.setLayout(jPanelBlackLayout);
        jPanelBlackLayout.setHorizontalGroup(
            jPanelBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelBlackLayout.setVerticalGroup(
            jPanelBlackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelYellow.setBackground(new java.awt.Color(255, 255, 51));
        jPanelYellow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelYellowLayout = new javax.swing.GroupLayout(jPanelYellow);
        jPanelYellow.setLayout(jPanelYellowLayout);
        jPanelYellowLayout.setHorizontalGroup(
            jPanelYellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelYellowLayout.setVerticalGroup(
            jPanelYellowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanelPurple.setBackground(new java.awt.Color(204, 51, 255));
        jPanelPurple.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelColorMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanelColorMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanelPurpleLayout = new javax.swing.GroupLayout(jPanelPurple);
        jPanelPurple.setLayout(jPanelPurpleLayout);
        jPanelPurpleLayout.setHorizontalGroup(
            jPanelPurpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanelPurpleLayout.setVerticalGroup(
            jPanelPurpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jLabel4.setText("Цвета");

        jLabel5.setText("Количество двигателей:");

        jSpinnerNumOfEngines.setModel(new javax.swing.SpinnerListModel(new String[] {"2", "4", "6"}));

        jLabelRect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRect.setText("Квадратные");
        jLabelRect.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelRect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelEngineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelEngineTypeMouseReleased(evt);
            }
        });

        jLabelTriangle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTriangle.setText("Треугольные");
        jLabelTriangle.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelTriangle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelEngineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelEngineTypeMouseReleased(evt);
            }
        });

        jLabelRound.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRound.setText("Круглые");
        jLabelRound.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelRound.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelEngineMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelEngineTypeMouseReleased(evt);
            }
        });

        canvasMyObject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        canvasMyObject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                canvasMyObjectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                canvasMyObjectMouseExited(evt);
            }
        });

        jLabelBaseColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBaseColor.setText("Цвет");
        jLabelBaseColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelBaseColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelBaseColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelBaseColorMouseExited(evt);
            }
        });

        jLabelDopColor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelDopColor.setText("Доп. Цвет");
        jLabelDopColor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelDopColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelDopColorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelDopColorMouseExited(evt);
            }
        });

        jButtonOk.setText("Добавить");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Отмена");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBoxBombs)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCheckBoxFuelTanks)
                                    .addComponent(jCheckBoxTailLine)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(44, 44, 44)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jSpinnerWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(jSpinnerSpeed)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinnerNumOfEngines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelRect, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabelTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabelRound, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(121, 121, 121)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelWhite, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelRed, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanelGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanelYellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jPanelGray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanelBlack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jPanelPurple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSimpleObject, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelModifiedObject, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonOk)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancel))
                            .addComponent(canvasMyObject, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelBaseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDopColor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerSpeed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSpinnerWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBaseColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDopColor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jSpinnerNumOfEngines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanelGray, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jPanelYellow, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelRed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelGreen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jPanelBlue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelRect, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelTriangle, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelWhite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jPanelBlack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanelPurple, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelRound, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jCheckBoxBombs))
                    .addComponent(canvasMyObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxFuelTanks)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxTailLine))
                    .addComponent(jLabelSimpleObject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonOk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelModifiedObject, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelColorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelColorMousePressed
        dragColor = ((JPanel) evt.getSource()).getBackground();
    }//GEN-LAST:event_jPanelColorMousePressed

    private void jLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMousePressed
        typeOfAirBomber = ((JLabel) evt.getComponent()).getText();
    }//GEN-LAST:event_jLabelMousePressed
    
    private void drawAirBomber(){
        if (_airBomber != null){
            _airBomber.SetPosition(5, 5, canvasMyObject.getWidth(), canvasMyObject.getHeight());
            canvasMyObject.setAirBomber(_airBomber);
            canvasMyObject.repaint();
        }
    }
    
    public void addEvent(ITransferAirBomberDelegate ev){
        eventAddAirBomber.add(ev);
    }
    
    private void jLabelEngineMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEngineMousePressed
        switch (((JLabel) evt.getComponent()).getText()){
            case "Квадратные":
                engines = new DrawingEngines();
                break;
            case "Треугольные":
                engines = new DrawingEnginesTriangle();
                break;
            case "Круглые":
                engines = new DrawingEnginesOval();
                break;
        }
    }//GEN-LAST:event_jLabelEngineMousePressed

    private void canvasMyObjectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMyObjectMouseEntered
        cursorInCanvasLocation = true;
    }//GEN-LAST:event_canvasMyObjectMouseEntered

    private void jLabelObjectMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelObjectMouseReleased
        if (cursorInCanvasLocation && typeOfAirBomber != null) {
            if (typeOfAirBomber == "Простой"){
                _airBomber = new DrawingAirBomber((int) jSpinnerSpeed.getValue(), (int) jSpinnerWeight.getValue(), Color.WHITE, 2, EnginesType.RECTANGLE);
            } 
            else {
                _airBomber = new DrawingHeavyAirBomber((int) jSpinnerSpeed.getValue(), (int) jSpinnerWeight.getValue(), Color.WHITE, 2, EnginesType.RECTANGLE, 
                        Color.WHITE, jCheckBoxBombs.isSelected(), jCheckBoxFuelTanks.isSelected(), jCheckBoxTailLine.isSelected());
            }
            typeOfAirBomber = null;
            drawAirBomber();
        }
    }//GEN-LAST:event_jLabelObjectMouseReleased

    private void jLabelEngineTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEngineTypeMouseReleased
        if (cursorInCanvasLocation && engines != null && _airBomber != null){
            engines.setNumberOfEngines(Integer.parseInt((String)jSpinnerNumOfEngines.getValue()));
            _airBomber.setEngines(engines);
            engines = null;
            drawAirBomber();
        }
    }//GEN-LAST:event_jLabelEngineTypeMouseReleased

    private void canvasMyObjectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMyObjectMouseExited
        cursorInCanvasLocation = false;
    }//GEN-LAST:event_canvasMyObjectMouseExited

    private void jPanelColorMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelColorMouseReleased
        if (dragColor != null){
            if (cursorInBaseLabelLocation && _airBomber != null){
                _airBomber.AirBomber.setBodyColor(dragColor);
                dragColor = null;
                drawAirBomber();
            }
            else if (cursorInDopLabelLocation && _airBomber != null && _airBomber.AirBomber instanceof EntityHeavyAirBomber heavyAirBomber){
                heavyAirBomber.setDopColor(dragColor);
                dragColor = null;
                drawAirBomber();
            }
        }
    }//GEN-LAST:event_jPanelColorMouseReleased

    private void jLabelBaseColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBaseColorMouseEntered
        cursorInBaseLabelLocation = true;
    }//GEN-LAST:event_jLabelBaseColorMouseEntered

    private void jLabelBaseColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelBaseColorMouseExited
        cursorInBaseLabelLocation = false;
    }//GEN-LAST:event_jLabelBaseColorMouseExited

    private void jLabelDopColorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDopColorMouseEntered
        cursorInDopLabelLocation = true;
    }//GEN-LAST:event_jLabelDopColorMouseEntered

    private void jLabelDopColorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelDopColorMouseExited
        cursorInDopLabelLocation = false;
    }//GEN-LAST:event_jLabelDopColorMouseExited

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        for (ITransferAirBomberDelegate ev : eventAddAirBomber){
            ev.Invoke(_airBomber);
        }
        dispose();
    }//GEN-LAST:event_jButtonOkActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameAirBomberConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAirBomberConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAirBomberConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAirBomberConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAirBomberConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private AirBomberPackage.CanvasMy canvasMyObject;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JCheckBox jCheckBoxBombs;
    private javax.swing.JCheckBox jCheckBoxFuelTanks;
    private javax.swing.JCheckBox jCheckBoxTailLine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelBaseColor;
    private javax.swing.JLabel jLabelDopColor;
    private javax.swing.JLabel jLabelModifiedObject;
    private javax.swing.JLabel jLabelRect;
    private javax.swing.JLabel jLabelRound;
    private javax.swing.JLabel jLabelSimpleObject;
    private javax.swing.JLabel jLabelTriangle;
    private javax.swing.JPanel jPanelBlack;
    private javax.swing.JPanel jPanelBlue;
    private javax.swing.JPanel jPanelGray;
    private javax.swing.JPanel jPanelGreen;
    private javax.swing.JPanel jPanelPurple;
    private javax.swing.JPanel jPanelRed;
    private javax.swing.JPanel jPanelWhite;
    private javax.swing.JPanel jPanelYellow;
    private javax.swing.JSpinner jSpinnerNumOfEngines;
    private javax.swing.JSpinner jSpinnerSpeed;
    private javax.swing.JSpinner jSpinnerWeight;
    // End of variables declaration//GEN-END:variables
}
