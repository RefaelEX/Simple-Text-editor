
package Simple_Editor;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Text extends javax.swing.JFrame {

  
    public Text() {
        super("My Simple Editor");
        initComponents();
        TextArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutWindow = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        okAbout = new javax.swing.JButton();
        Exit = new javax.swing.JFrame();
        qa = new javax.swing.JLabel();
        yesSave = new javax.swing.JButton();
        noSave = new javax.swing.JButton();
        img = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        OpenFileMenu = new javax.swing.JMenu();
        openFileMenu = new javax.swing.JMenuItem();
        SaveFileMenu = new javax.swing.JMenuItem();
        ExitFileMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        CopyFileMenu = new javax.swing.JMenuItem();
        PasteFileMenu = new javax.swing.JMenuItem();
        CutFileMenu = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        aboutButton = new javax.swing.JMenuItem();

        aboutWindow.setTitle("About");
        aboutWindow.setBounds(new java.awt.Rectangle(600, 250, 300, 150));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("My Simple Editor Product Version 1.2");

        okAbout.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okAbout.setText("ok");
        okAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout aboutWindowLayout = new javax.swing.GroupLayout(aboutWindow.getContentPane());
        aboutWindow.getContentPane().setLayout(aboutWindowLayout);
        aboutWindowLayout.setHorizontalGroup(
            aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutWindowLayout.createSequentialGroup()
                .addGroup(aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(aboutWindowLayout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(okAbout))
                    .addGroup(aboutWindowLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        aboutWindowLayout.setVerticalGroup(
            aboutWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutWindowLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(okAbout)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        Exit.setBounds(new java.awt.Rectangle(600, 200, 400, 200));

        qa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        qa.setText("Do you want to save your changes?");

        yesSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        yesSave.setText("yes");
        yesSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesSaveActionPerformed(evt);
            }
        });

        noSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        noSave.setText("no");
        noSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ExitLayout = new javax.swing.GroupLayout(Exit.getContentPane());
        Exit.getContentPane().setLayout(ExitLayout);
        ExitLayout.setHorizontalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitLayout.createSequentialGroup()
                .addGroup(ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExitLayout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(img))
                    .addGroup(ExitLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ExitLayout.createSequentialGroup()
                                .addComponent(yesSave)
                                .addGap(120, 120, 120)
                                .addComponent(noSave))
                            .addComponent(qa, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        ExitLayout.setVerticalGroup(
            ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ExitLayout.createSequentialGroup()
                .addGroup(ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ExitLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(img)
                        .addGap(47, 47, 47)
                        .addComponent(qa, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ExitLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel2)))
                .addGap(11, 11, 11)
                .addGroup(ExitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesSave)
                    .addComponent(noSave))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        jScrollPane1.setViewportView(TextArea);

        OpenFileMenu.setText("File");

        openFileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        openFileMenu.setText("Open");
        openFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileMenuActionPerformed(evt);
            }
        });
        OpenFileMenu.add(openFileMenu);

        SaveFileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        SaveFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        SaveFileMenu.setText("Save");
        SaveFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveFileMenuActionPerformed(evt);
            }
        });
        OpenFileMenu.add(SaveFileMenu);

        ExitFileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        ExitFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        ExitFileMenu.setText("Exit");
        ExitFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitFileMenuActionPerformed(evt);
            }
        });
        OpenFileMenu.add(ExitFileMenu);

        jMenuBar1.add(OpenFileMenu);

        jMenu2.setText("Edit");

        CopyFileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        CopyFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        CopyFileMenu.setText("Copy");
        CopyFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CopyFileMenuActionPerformed(evt);
            }
        });
        jMenu2.add(CopyFileMenu);

        PasteFileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        PasteFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        PasteFileMenu.setText("Paste");
        PasteFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteFileMenuActionPerformed(evt);
            }
        });
        jMenu2.add(PasteFileMenu);

        CutFileMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        CutFileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        CutFileMenu.setText("Cut");
        CutFileMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutFileMenuActionPerformed(evt);
            }
        });
        jMenu2.add(CutFileMenu);

        jMenuBar1.add(jMenu2);

        Help.setText("Help");

        aboutButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Simple_Editor/icon.gif"))); // NOI18N
        aboutButton.setText("About");
        aboutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutButtonActionPerformed(evt);
            }
        });
        Help.add(aboutButton);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileMenuActionPerformed
        JFileChooser chooser = new JFileChooser();
        int chooserValue = chooser.showOpenDialog(this);
        if(chooserValue == JFileChooser.APPROVE_OPTION){
            try{
                Scanner fin = new Scanner(chooser.getSelectedFile());
                String buffer = "";
                while (fin.hasNext()){
                    buffer += fin.nextLine() + "\n";
                }
                TextArea.setText(buffer);
        }catch (FileNotFoundException ex){
                JOptionPane.showMessageDialog(this,"File not found");
        }
        }
    }//GEN-LAST:event_openFileMenuActionPerformed

    private void ExitFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitFileMenuActionPerformed
        Exit.setVisible(true);
    }//GEN-LAST:event_ExitFileMenuActionPerformed

    private void PasteFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteFileMenuActionPerformed
        TextArea.paste();
    }//GEN-LAST:event_PasteFileMenuActionPerformed

    private void SaveFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveFileMenuActionPerformed
       JFileChooser chooser = new JFileChooser();
       int chooserValue = chooser.showSaveDialog(this);
       if (chooserValue == JFileChooser.APPROVE_OPTION){
           try {
               PrintWriter fout = new PrintWriter(chooser.getSelectedFile());
               fout.print(TextArea.getText());
               fout.close();
           } catch (FileNotFoundException ex) {
               Logger.getLogger(Text.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
    }//GEN-LAST:event_SaveFileMenuActionPerformed

    private void CopyFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CopyFileMenuActionPerformed
        TextArea.copy();
    }//GEN-LAST:event_CopyFileMenuActionPerformed

    private void CutFileMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutFileMenuActionPerformed
        TextArea.cut();
    }//GEN-LAST:event_CutFileMenuActionPerformed

    private void okAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okAboutActionPerformed
        aboutWindow.dispose();

    }//GEN-LAST:event_okAboutActionPerformed

    private void aboutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutButtonActionPerformed
         aboutWindow.setVisible(true);
    }//GEN-LAST:event_aboutButtonActionPerformed

    private void yesSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesSaveActionPerformed
        Exit.dispose();
        SaveFileMenuActionPerformed(evt);
        System.exit(0);
    }//GEN-LAST:event_yesSaveActionPerformed

    private void noSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noSaveActionPerformed
        System.exit(0);
    }//GEN-LAST:event_noSaveActionPerformed

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
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Text.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Text().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem CopyFileMenu;
    private javax.swing.JMenuItem CutFileMenu;
    private javax.swing.JFrame Exit;
    private javax.swing.JMenuItem ExitFileMenu;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu OpenFileMenu;
    private javax.swing.JMenuItem PasteFileMenu;
    private javax.swing.JMenuItem SaveFileMenu;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenuItem aboutButton;
    private javax.swing.JFrame aboutWindow;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton noSave;
    private javax.swing.JButton okAbout;
    private javax.swing.JMenuItem openFileMenu;
    private javax.swing.JLabel qa;
    private javax.swing.JButton yesSave;
    // End of variables declaration//GEN-END:variables
}
