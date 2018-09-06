
package my.SensitivityChange;
import java.util.Properties;
import java.io.*;
import java.io.IOException;
import java.util.Scanner;
import java.awt.FileDialog;
import java.awt.Frame;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringEscapeUtils;
import static javax.swing.ScrollPaneConstants.*;

/**
 *
 * @author justin
 */
public class SensitivityChangeUI extends javax.swing.JFrame {

    /**
     * Creates new form SensitivityChangeUI
     * 
     */
    public static void csChangeProperty(String filename, String key, String value) throws IOException {
        File tmpFile = new File(filename + ".tmp");
        File file = new File(filename);
        try (PrintWriter pw = new PrintWriter(tmpFile); BufferedReader br = new BufferedReader(new FileReader(file))) {
            boolean found = false;
            final String toAdd = key + " " + value;
            for (String line; (line = br.readLine()) != null; ) {
                if (line.startsWith(key)) {
                    line = toAdd;
                    found = true;
                }
                pw.println(line);
            }
            if (!found)
                pw.println(toAdd);
        }
        file.delete();
        tmpFile.renameTo(file);
    }
    
    public static void pubgChangeProperty(String filename, String key, String value) throws IOException {
       File tmpFile = new File(filename + ".tmp");
       File file = new File(filename);
       try (PrintWriter pw = new PrintWriter(tmpFile); BufferedReader br = new BufferedReader(new FileReader(file))) {
           boolean found = false;
           String newn = "";
           String ind = "";
           String newLine = "";
           for (String line; (line = br.readLine()) != null; ) {
               if (line.startsWith(key)) {
                   double vald = Double.parseDouble(value);
                   double nvald = vald*10;
                   double realVal = vald/101.0101;
                   String realStringVal = Double.toString(realVal);
                   String faceValue = Double.toString(nvald);
                   int i = line.indexOf("((SensitiveName=\"Normal\",Sensitivity=");
                   newn = (line.substring(0,i) + "((SensitiveName=\"Normal\",Sensitivity=" + faceValue);
                   int st = line.indexOf("),(SensitiveName=\"Targeting\"");
                   newLine = (newn+ ",LastConvertedSensitivity=" + realStringVal + line.substring(st,line.length()));
                   line = newLine;
                   found = true;
               }
               pw.println(line);
           }
           if (!found)
               pw.println(newn);
       }
       file.delete();
       tmpFile.renameTo(file);
    }
    
    public static void pubgIronChangeProperty(String filename, String key, String value) throws IOException {
       File tmpFile = new File(filename + ".tmp");
       File file = new File(filename);
       try (PrintWriter pw = new PrintWriter(tmpFile); BufferedReader br = new BufferedReader(new FileReader(file))) {
           boolean found = false;
           String newn = "";
           String ind = "";
           String newLine = "";
           for (String line; (line = br.readLine()) != null; ) {
               if (line.startsWith(key)) {  
                   double vald = Double.parseDouble(value);
                   double nvald = vald;
                   double realVal = vald/88.38;
                   String realStringVal = Double.toString(realVal);
                   String faceValue = Double.toString(nvald);
                   int i = line.indexOf("(SensitiveName=\"Scoping\",Sensitivity=");
                   newn = (line.substring(0,i) + "(SensitiveName=\"Scoping\",Sensitivity=" + faceValue);
                   int st = line.indexOf("),(SensitiveName=\"ScopingMagnified\"");
                   newLine = (newn+ ",LastConvertedMouseSensitivity=" + realStringVal + line.substring(st,line.length()));
                   line = newLine;
                   found = true;
               }
               pw.println(line);
           }
           if (!found)
               pw.println(newn);
       }
       file.delete();
       tmpFile.renameTo(file);
    }
    public static void pubgScopeChangeProperty(String filename, String key, String value) throws IOException {
       File tmpFile = new File(filename + ".tmp");
       File file = new File(filename);
       try (PrintWriter pw = new PrintWriter(tmpFile); BufferedReader br = new BufferedReader(new FileReader(file))) {
           boolean found = false;
           String newn = "";
           String ind = "";
           String newLine = "";
           for (String line; (line = br.readLine()) != null; ) {
               if (line.startsWith(key)) {  
                   double vald = Double.parseDouble(value);
                   double nvald = vald;
                   double realVal = vald/101.0101;
                   String realStringVal = Double.toString(realVal);
                   String faceValue = Double.toString(nvald*10);
                   int i = line.indexOf("(SensitiveName=\"ScopingMagnified\",Sensitivity=");
                   newn = (line.substring(0,i) + "(SensitiveName=\"ScopingMagnified\",Sensitivity=" + faceValue);
                   int st = line.indexOf("),(SensitiveName=\"Scope2X\"");
                   newLine = (newn+ ",LastConvertedMouseSensitivity=" + realStringVal + line.substring(st,line.length()));
                   line = newLine;
                   found = true;
               }
               pw.println(line);
           }
           if (!found)
               pw.println(newn);
       }
       file.delete();
       tmpFile.renameTo(file);
    }
    public static void pubgScopeFalse(String filename, String key, String value) throws IOException {
       File tmpFile = new File(filename + ".tmp");
       File file = new File(filename);
       try (PrintWriter pw = new PrintWriter(tmpFile); BufferedReader br = new BufferedReader(new FileReader(file))) {
           boolean found = false;
           String newn = "";
           String ind = "";
           String newLine = "";
           for (String line; (line = br.readLine()) != null; ) {
               if (line.startsWith(key)) {  
                   int i = line.indexOf("bIsUsingPerScopeMouseSensitivity=");
                   newn = (line.substring(0,i) + "bIsUsingPerScopeMouseSensitivity=" + value);
                   int st = line.indexOf(",bIsUsingPerScopeGamepadSensitivity=");
                   newLine = (newn + line.substring(st,line.length()));
                   line = newLine;
                   found = true;
               }
               pw.println(line);
           }
           if (!found)
               pw.println(newn);
       }
       file.delete();
       tmpFile.renameTo(file);
    }
    
     public static void fallout4ChangeProperty(String filename, String key, String value) throws IOException {
        File tmpFile = new File(filename + ".tmp");
        File file = new File(filename);
        try (PrintWriter pw = new PrintWriter(tmpFile); BufferedReader br = new BufferedReader(new FileReader(file))) {
            boolean found = false;
            final String toAdd = key + "=" + value;
            for (String line; (line = br.readLine()) != null; ) {
                if (line.startsWith(key)) {
                    line = toAdd;
                    found = true;
                }
                pw.println(line);
            }
            if (!found)
                pw.println(toAdd);
        }
        file.delete();
        tmpFile.renameTo(file);
    }
    
    
    public SensitivityChangeUI() {
        initComponents();
    }
    
    String username = System.getProperty("user.name");
    //tf2 vars
    String tf2pth = ("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Team Fortress 2\\tf\\cfg\\config.cfg");
    //csgo vars
    boolean csCheck = false;
    boolean csDefault = false;
    String cspth = ("C:\\Program Files (x86)\\Steam\\userdata\\161534417\\730\\local\\cfg\\config.cfg");
    String csCustomPath = "";
    //csgo vars end
    //pubg vars
    boolean pubgCheckValue = false;
    boolean pubgDefault = false;
    String pubgpth = ("C:\\Users\\" +username + "\\AppData\\Local\\TslGame\\Saved\\Config\\WindowsNoEditor\\GameUserSettings.ini");
    String pubgCustomPath = "";
    //pubg vars end
    //fallout 4 vars 0.0058*csgosens
    boolean fallout4CheckValue = false;
    boolean fallout4Default = false;
    String fallout4pth = ("C:\\Users\\" + username + "\\Documents\\My Games\\Fallout4\\Fallout4Prefs.ini");
    String fallout4CustomPath = "";
    //fallout 4 vars end
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        csgoCheck = new javax.swing.JCheckBox();
        csDefaultCheck = new javax.swing.JCheckBox();
        pubgCheck = new javax.swing.JCheckBox();
        pubgDefaultCheck = new javax.swing.JCheckBox();
        pubgCustom = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        csCustomButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sensi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        zoomSensi = new javax.swing.JTextPane();
        sync = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        csgoCheck.setText("CS:GO");
        csgoCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csgoCheckActionPerformed(evt);
            }
        });

        csDefaultCheck.setText("Default config path");
        csDefaultCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csDefaultCheckActionPerformed(evt);
            }
        });

        pubgCheck.setText("PUBG");
        pubgCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubgCheckActionPerformed(evt);
            }
        });

        pubgDefaultCheck.setText("Default config path");
        pubgDefaultCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubgDefaultCheckActionPerformed(evt);
            }
        });

        pubgCustom.setText("Custom path");
        pubgCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pubgCustomActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Fallout 4");

        jCheckBox2.setText("Default config path");

        jButton1.setText("Custom path");

        csCustomButton.setText("Custom path");
        csCustomButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csCustomButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(csgoCheck)
                .addGap(25, 25, 25)
                .addComponent(csDefaultCheck)
                .addGap(18, 18, 18)
                .addComponent(csCustomButton)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pubgCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pubgDefaultCheck))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pubgCustom))
                .addGap(62, 62, 62))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(csCustomButton)
                    .addComponent(csDefaultCheck)
                    .addComponent(csgoCheck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox2)
                        .addComponent(jCheckBox1))
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(pubgCheck)
                        .addComponent(pubgDefaultCheck))
                    .addComponent(pubgCustom))
                .addContainerGap(331, Short.MAX_VALUE))
        );

        jLabel1.setText("Select games and config paths to change the sensitivity");

        jLabel2.setText("Enter sensitivity on scale of 0 to 10");

        sensi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensiActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter zoom ratio as a decimal from 0 to 1");

        jScrollPane2.setViewportView(zoomSensi);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sensi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, Short.MAX_VALUE))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sensi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );

        jScrollPane1.setViewportView(jPanel2);

        sync.setText("Syncronize");
        sync.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                syncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(sync, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sync)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void csCustomButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csCustomButtonActionPerformed
        FileDialog csDialog = new FileDialog((Frame)null, "Select the config file");
        csDialog.setMode(FileDialog.LOAD);
        csDialog.setVisible(true);
        String p = csDialog.getDirectory() + csDialog.getFile();
        csCustomPath = StringEscapeUtils.escapeJava(p);
        System.out.println(csCustomPath);
    }//GEN-LAST:event_csCustomButtonActionPerformed

    private void csgoCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csgoCheckActionPerformed
        csCheck = !csCheck;
    }//GEN-LAST:event_csgoCheckActionPerformed

    private void pubgCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubgCheckActionPerformed
        pubgCheckValue = !pubgCheckValue;
    }//GEN-LAST:event_pubgCheckActionPerformed
   
    private void csDefaultCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csDefaultCheckActionPerformed
        csDefault = !csDefault;
        System.out.println(csDefault);
    }//GEN-LAST:event_csDefaultCheckActionPerformed

    private void syncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_syncActionPerformed
        String sensitivityString = sensi.getText();
        double sensitivityDouble =  Double.parseDouble(sensitivityString);
        String zoomSensitivityString = zoomSensi.getText();
        double zoomSensitivityVal = 1;
        if (zoomSensitivityString != "" || zoomSensitivityString != " "){
            zoomSensitivityVal = Double.parseDouble(zoomSensitivityString);
            zoomSensitivityVal = zoomSensitivityVal * sensitivityDouble;
        }
        String zoomSensitivityFinal =  Double.toString(zoomSensitivityVal);
        
        double sensitivityVal = Double.parseDouble(sensitivityString);
        double zoomXsens = zoomSensitivityVal * sensitivityVal;
        String scopeSensitivity = Double.toString(zoomXsens);
        System.out.println(scopeSensitivity);
        if (csCheck){
            if (csDefault){
            try {
                csChangeProperty(cspth, "sensitivity", "\"" + sensitivityString + "\"");
                if (zoomSensitivityString != "" || zoomSensitivityString != " "){
                    csChangeProperty(cspth, "zoom_sensitivity_ratio_mouse", "\"" + zoomSensitivityString + "\"");
            }
            } catch (IOException ex) {
                Logger.getLogger(SensitivityChangeUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            else{
                try {
                csChangeProperty(csCustomPath, "sensitivity", "\"" + sensitivityString + "\"");
                if (zoomSensitivityString != "" || zoomSensitivityString != " "){
                    csChangeProperty(csCustomPath, "zoom_sensitivity_ratio_mouse", "\"" + zoomSensitivityString + "\"");
            }
            } catch (IOException ex) {
                Logger.getLogger(SensitivityChangeUI.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Enter the correct custom path or select the default path");
                }
            }
        }
        if (pubgCheckValue){
            if (pubgDefault){
                try {
                    pubgChangeProperty(pubgpth,"CustomInputSettins", sensitivityString );
                    if (zoomSensitivityString != "" || zoomSensitivityString != " "){
                       pubgScopeFalse(pubgpth, "CustomInputSettins" , "False");
                       pubgIronChangeProperty(pubgpth, "CustomInputSettins", sensitivityString);
                       pubgScopeChangeProperty(pubgpth, "CustomInputSettins",zoomSensitivityFinal);
                    }
                }
                   catch (IOException ex) {
                Logger.getLogger(SensitivityChangeUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                try {
                    pubgChangeProperty(pubgCustomPath,"CustomInputSettins", sensitivityString);
                    if (zoomSensitivityString != "" || zoomSensitivityString != " "){
                        pubgScopeFalse(pubgCustomPath, "CustomInputSettins" , "False");
                        pubgIronChangeProperty(pubgCustomPath, "CustomInputSettins",sensitivityString);
                        pubgScopeChangeProperty(pubgpth, "CustomInputSettins",zoomSensitivityFinal);
                    }
                } catch (IOException ex) {
                Logger.getLogger(SensitivityChangeUI.class.getName()).log(Level.SEVERE, null, ex);
                System.out.println("Enter the correct custom path or select the default path");
                }
            }
        }
        
    }//GEN-LAST:event_syncActionPerformed

    private void sensiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sensiActionPerformed

    private void pubgDefaultCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubgDefaultCheckActionPerformed
        pubgDefault = !pubgDefault;
    }//GEN-LAST:event_pubgDefaultCheckActionPerformed

    public void pubgCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pubgCustomActionPerformed
        FileDialog pubgDialog = new FileDialog((Frame)null, "Select the config file");
        pubgDialog.setMode(FileDialog.LOAD);
        pubgDialog.setVisible(true);
        String p = pubgDialog.getDirectory() + pubgDialog.getFile();
        pubgCustomPath = StringEscapeUtils.escapeJava(p);
    }//GEN-LAST:event_pubgCustomActionPerformed

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
            java.util.logging.Logger.getLogger(SensitivityChangeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SensitivityChangeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SensitivityChangeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SensitivityChangeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             
                new SensitivityChangeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JButton csCustomButton;
    private javax.swing.JCheckBox csDefaultCheck;
    private javax.swing.JCheckBox csgoCheck;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox pubgCheck;
    public javax.swing.JButton pubgCustom;
    private javax.swing.JCheckBox pubgDefaultCheck;
    private javax.swing.JTextField sensi;
    private javax.swing.JButton sync;
    private javax.swing.JTextPane zoomSensi;
    // End of variables declaration//GEN-END:variables
    
}
