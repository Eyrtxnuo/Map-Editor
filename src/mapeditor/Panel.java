/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package mapeditor;

import Image.MapImage;
import inputs.KeyboardInputs;
import java.awt.Cursor;
import java.awt.Graphics;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author matti
 */
public class Panel extends javax.swing.JPanel {
    private static final JFileChooser fileChooser = new JFileChooser();
    
    MapImage mapImg;
    private int offsetX=0;
   
    public Panel(MapImage mI) {
        initComponents();
        mapImg = mI;
        fileChooser.setFileFilter(new FileNameExtensionFilter("PNG File","png"));
        
        
        //addKeyListener(new KeyboardInputs());//not needed
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }

    public int getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(int offsetX) {
        this.offsetX = (offsetX>0)?0:offsetX;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HandToggleButton = new javax.swing.JToggleButton();
        MapScrollBar = new javax.swing.JScrollBar();
        jPanel1 = (JPanel)new MapPanel(this);
        btnSave = new javax.swing.JButton();
        btnOpen = new javax.swing.JButton();
        BlockSpinner = new javax.swing.JSpinner();
        PreviewPanel = (JPanel)new PreviewPanel();
        LenghtSpinner = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        bntBlock0 = new javax.swing.JButton();
        bntBlock1 = new javax.swing.JButton();
        bntBlock2 = new javax.swing.JButton();
        bntBlock3 = new javax.swing.JButton();
        bntBlock4 = new javax.swing.JButton();
        bntBlock5 = new javax.swing.JButton();
        bntBlock6 = new javax.swing.JButton();
        bntBlock11 = new javax.swing.JButton();
        bntBlock10 = new javax.swing.JButton();
        bntBlock9 = new javax.swing.JButton();
        bntBlock8 = new javax.swing.JButton();
        bntBlock7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bntEnemy0 = new javax.swing.JButton();
        bntEnemy1 = new javax.swing.JButton();
        bntEnemy2 = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1000, 600));

        HandToggleButton.setText("Toggle Hand");
        HandToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HandToggleButtonActionPerformed(evt);
            }
        });

        MapScrollBar.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        MapScrollBar.setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(988, 448));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        btnSave.setLabel("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnOpen.setLabel("Open");
        btnOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenActionPerformed(evt);
            }
        });

        BlockSpinner.setModel(new javax.swing.SpinnerNumberModel(11, 0, MapImage.getLevelSprite().length-1, 1));
        BlockSpinner.setMinimumSize(null);
        BlockSpinner.setPreferredSize(new java.awt.Dimension(40, 22));
        BlockSpinner.setValue(11);
        BlockSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BlockSpinnerStateChanged(evt);
            }
        });

        PreviewPanel.setBackground(new java.awt.Color(255, 255, 255));
        PreviewPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PreviewPanel.setPreferredSize(new java.awt.Dimension(32, 32));

        javax.swing.GroupLayout PreviewPanelLayout = new javax.swing.GroupLayout(PreviewPanel);
        PreviewPanel.setLayout(PreviewPanelLayout);
        PreviewPanelLayout.setHorizontalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        PreviewPanelLayout.setVerticalGroup(
            PreviewPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        LenghtSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));
        LenghtSpinner.setToolTipText("");
        LenghtSpinner.setMinimumSize(null);
        LenghtSpinner.setPreferredSize(new java.awt.Dimension(40, 22));
        LenghtSpinner.setValue(MapEditor.mapImg.getWidth());
        LenghtSpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                LenghtSpinnerStateChanged(evt);
            }
        });

        jLabel1.setText("Lenght");

        jTabbedPane1.setName("Blocks"); // NOI18N

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bntBlock0.setIcon(new ImageIcon(MapImage.getLevelSprite(0))
        );
        bntBlock0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock0ActionPerformed(evt);
            }
        });

        bntBlock1.setIcon(new ImageIcon(MapImage.getLevelSprite(1))
        );
        bntBlock1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock1ActionPerformed(evt);
            }
        });

        bntBlock2.setIcon(new ImageIcon(MapImage.getLevelSprite(2))
        );
        bntBlock2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock2ActionPerformed(evt);
            }
        });

        bntBlock3.setIcon(new ImageIcon(MapImage.getLevelSprite(3))
        );
        bntBlock3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock3ActionPerformed(evt);
            }
        });

        bntBlock4.setIcon(new ImageIcon(MapImage.getLevelSprite(13))
        );
        bntBlock4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock4ActionPerformed(evt);
            }
        });

        bntBlock5.setIcon(new ImageIcon(MapImage.getLevelSprite(24))
        );
        bntBlock5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock5ActionPerformed(evt);
            }
        });

        bntBlock6.setIcon(new ImageIcon(MapImage.getLevelSprite(25))
        );
        bntBlock6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock6ActionPerformed(evt);
            }
        });

        bntBlock11.setIcon(new ImageIcon(MapImage.getLevelSprite(39))
        );
        bntBlock11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock11ActionPerformed(evt);
            }
        });

        bntBlock10.setIcon(new ImageIcon(MapImage.getLevelSprite(11))
        );
        bntBlock10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock10ActionPerformed(evt);
            }
        });

        bntBlock9.setIcon(new ImageIcon(MapImage.getLevelSprite(14))
        );
        bntBlock9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock9ActionPerformed(evt);
            }
        });

        bntBlock8.setIcon(new ImageIcon(MapImage.getLevelSprite(12))
        );
        bntBlock8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock8ActionPerformed(evt);
            }
        });

        bntBlock7.setIcon(new ImageIcon(MapImage.getLevelSprite(26))
        );
        bntBlock7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntBlock7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntBlock0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntBlock11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(bntBlock7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntBlock8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntBlock9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntBlock10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntBlock11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bntBlock6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBlock5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBlock4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBlock3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBlock2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBlock1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntBlock0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Blocks", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bntEnemy0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/barrier.png"))); // NOI18N
        bntEnemy0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEnemy0ActionPerformed(evt);
            }
        });

        bntEnemy1.setIcon(new ImageIcon(MapImage.GetCrabbyAtlas())
        );
        bntEnemy1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEnemy1ActionPerformed(evt);
            }
        });

        bntEnemy2.setIcon(new ImageIcon(MapImage.GetFollowCrabbyAtlas())
        );
        bntEnemy2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEnemy2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bntEnemy0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEnemy1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntEnemy2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(420, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bntEnemy2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEnemy1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEnemy0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Enemies", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addComponent(MapScrollBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(HandToggleButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOpen, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LenghtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(39, 39, 39)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(PreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BlockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(MapScrollBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(BlockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PreviewPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(HandToggleButton)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(btnSave)
                                            .addComponent(btnOpen)
                                            .addComponent(LenghtSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Blocks");
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenActionPerformed
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                MapEditor.mapImg.loadLevelData(file);
                System.out.println("Loaded: " + file.getAbsoluteFile());
            } catch (IOException ex) {
                Logger.getLogger(KeyboardInputs.class.getName()).log(Level.SEVERE, null, ex);
            }
            MapEditor.repaint();
        }
    }//GEN-LAST:event_btnOpenActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if (fileChooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {

            File file = fileChooser.getSelectedFile();
            if (!FilenameUtils.getExtension(file.getName()).equalsIgnoreCase("png")) {
                // filename is OK as-isfile = new File(file.toString() + ".xml");  // append .xml if "foo.jpg.xml" is OK
                file = new File(file.getParentFile(), FilenameUtils.getBaseName(file.getName())+".png");
            }
            if(file.exists()){
                if((JOptionPane.showConfirmDialog(null, "Il file esiste già! Sovrascrivere?", "Warning!", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION)){
                        return;
                }
            }
            try {
                ImageIO.write(MapEditor.mapImg.getMap(), "png", file);
                System.out.println("Saved: " +file.getAbsoluteFile());
            } catch (IOException ex) {
                Logger.getLogger(KeyboardInputs.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void HandToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HandToggleButtonActionPerformed
        if(HandToggleButton.isSelected()){
            setCursor(new Cursor(Cursor.HAND_CURSOR));
        }else{
            setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        }
    }//GEN-LAST:event_HandToggleButtonActionPerformed

    private void BlockSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BlockSpinnerStateChanged
        
        repaint();
    }//GEN-LAST:event_BlockSpinnerStateChanged

    private void bntBlock0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock0ActionPerformed
        BlockSpinner.setValue((Object)0);
        repaint();
    }//GEN-LAST:event_bntBlock0ActionPerformed

    private void bntBlock1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock1ActionPerformed
        BlockSpinner.setValue((Object)1);
        repaint();
    }//GEN-LAST:event_bntBlock1ActionPerformed

    private void bntBlock2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock2ActionPerformed
        BlockSpinner.setValue((Object)2);
        repaint();
    }//GEN-LAST:event_bntBlock2ActionPerformed

    private void bntBlock3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock3ActionPerformed
        BlockSpinner.setValue((Object)3);
        repaint();
    }//GEN-LAST:event_bntBlock3ActionPerformed

    private void bntBlock4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock4ActionPerformed
        BlockSpinner.setValue((Object)13);
        repaint();
    }//GEN-LAST:event_bntBlock4ActionPerformed

    private void bntBlock5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock5ActionPerformed
        BlockSpinner.setValue((Object)24);
        repaint();
    }//GEN-LAST:event_bntBlock5ActionPerformed

    private void bntBlock6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock6ActionPerformed
        BlockSpinner.setValue((Object)25);
        repaint();
    }//GEN-LAST:event_bntBlock6ActionPerformed

    private void bntBlock7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock7ActionPerformed
        BlockSpinner.setValue((Object)26);
        repaint();
    }//GEN-LAST:event_bntBlock7ActionPerformed

    private void bntBlock8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock8ActionPerformed
        BlockSpinner.setValue((Object)12);
        repaint();
    }//GEN-LAST:event_bntBlock8ActionPerformed

    private void bntBlock9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock9ActionPerformed
        BlockSpinner.setValue((Object)14);
        repaint();
    }//GEN-LAST:event_bntBlock9ActionPerformed

    private void bntBlock10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock10ActionPerformed
        BlockSpinner.setValue((Object)11);
        repaint();
    }//GEN-LAST:event_bntBlock10ActionPerformed

    private void LenghtSpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_LenghtSpinnerStateChanged
        mapImg.changeWidth((int)LenghtSpinner.getValue());
        repaint();
    }//GEN-LAST:event_LenghtSpinnerStateChanged

    private void bntBlock11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntBlock11ActionPerformed
        BlockSpinner.setValue((Object)39);
        repaint();
    }//GEN-LAST:event_bntBlock11ActionPerformed

    private void bntEnemy0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEnemy0ActionPerformed
        BlockSpinner.setValue(-1);
        repaint();
    }//GEN-LAST:event_bntEnemy0ActionPerformed

    private void bntEnemy1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEnemy1ActionPerformed
        BlockSpinner.setValue(-2);
        repaint();
    }//GEN-LAST:event_bntEnemy1ActionPerformed

    private void bntEnemy2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEnemy2ActionPerformed
        BlockSpinner.setValue(-3);
        repaint();
    }//GEN-LAST:event_bntEnemy2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSpinner BlockSpinner;
    public javax.swing.JToggleButton HandToggleButton;
    public javax.swing.JSpinner LenghtSpinner;
    private javax.swing.JScrollBar MapScrollBar;
    public javax.swing.JPanel PreviewPanel;
    private javax.swing.JButton bntBlock0;
    private javax.swing.JButton bntBlock1;
    private javax.swing.JButton bntBlock10;
    private javax.swing.JButton bntBlock11;
    private javax.swing.JButton bntBlock2;
    private javax.swing.JButton bntBlock3;
    private javax.swing.JButton bntBlock4;
    private javax.swing.JButton bntBlock5;
    private javax.swing.JButton bntBlock6;
    private javax.swing.JButton bntBlock7;
    private javax.swing.JButton bntBlock8;
    private javax.swing.JButton bntBlock9;
    private javax.swing.JButton bntEnemy0;
    private javax.swing.JButton bntEnemy1;
    private javax.swing.JButton bntEnemy2;
    private javax.swing.JButton btnOpen;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
