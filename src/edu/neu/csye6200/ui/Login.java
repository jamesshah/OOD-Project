package edu.neu.csye6200.ui;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;

import edu.neu.csye6200.util.DBConn;

public class Login extends javax.swing.JFrame {

    /**
     * Creates new form 
     */
    public Login() {
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

        roleGroup = new javax.swing.ButtonGroup();
        loginLbl = new javax.swing.JLabel();
        passwordLbl = new javax.swing.JLabel();
        usernameLbl = new javax.swing.JLabel();
        passwordTF = new javax.swing.JTextField();
        usernameTF = new javax.swing.JTextField();
        roleLbl = new javax.swing.JLabel();
        admin = new javax.swing.JRadioButton();
        student = new javax.swing.JRadioButton();
        teacher = new javax.swing.JRadioButton();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        loginLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLbl.setText("Log In");

        passwordLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        passwordLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLbl.setText("Password");

        usernameLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        usernameLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLbl.setText("Username");

        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });

        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });

        roleLbl.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        roleLbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        roleLbl.setText("Role");

        roleGroup.add(admin);
        admin.setText("Admin");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        roleGroup.add(student);
        student.setText("Student");
        student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentActionPerformed(evt);
            }
        });

        roleGroup.add(teacher);
        teacher.setText("Teacher");
        teacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherActionPerformed(evt);
            }
        });

        loginBtn.setText("Login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99	, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(admin)
                                .addGap(52, 52, 52)
                                .addComponent(student)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(teacher)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(loginLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passwordTF, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(roleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admin)
                    .addComponent(student)
                    .addComponent(teacher))
                .addGap(47, 47, 47)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordTFActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameTFActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adminActionPerformed

    private void studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentActionPerformed

    private void teacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
            	
    	// Login credential validation and logging in process.
    	
    	MongoCollection<Document> collection = DBConn.getInstance().getCollection("Credentials");    	
    	
    	if(usernameTF.getText().equals("") || passwordTF.getText().equals("")) {
    		JOptionPane.showMessageDialog(this, "Please enter valid username and password", "ERROR!", JOptionPane.ERROR_MESSAGE);
    	} else if(!admin.isSelected() && !student.isSelected() && !teacher.isSelected()) {
    		JOptionPane.showMessageDialog(this, "Please select a role", "ERROR!", JOptionPane.ERROR_MESSAGE);
    	} else if(admin.isSelected()) {    		
    		System.out.println("Admin selected");
    		
    		Document adminObj = collection.find(eq("id", "admin")).first();
    		
//    		System.out.println(doc.toJson());
    		
    		if(usernameTF.getText().equals(adminObj.get("username")) && passwordTF.getText().equals(adminObj.get("password"))) {
    			System.out.println("Admin access granted!");
    			JFrame o = new AdminView();
    			o.setVisible(true);
    			dispose();
    		} else 
    			JOptionPane.showMessageDialog(this, "Username/password is incorrect", "ERROR!", JOptionPane.ERROR_MESSAGE);
    		
    	} else if(student.isSelected()) {
    		    		    		
    		Document studentObj = collection.find(eq("username", usernameTF.getText())).first();
    		System.out.println(studentObj == null);
    		
    		if(!(studentObj == null) && passwordTF.getText().equals(studentObj.get("password"))) {    			
    				System.out.println("Student access granted!");    			
    		} else {
    			JOptionPane.showMessageDialog(this, "Username/password is incorrect", "ERROR!", JOptionPane.ERROR_MESSAGE);
    		}
    	} else {
    		Document teacherObj = collection.find(eq("username", usernameTF.getText())).first();
    		
    		if(!(teacherObj == null) && passwordTF.getText().equals(teacherObj.get("password"))) {    			
				System.out.println("Teacher access granted!");
    		} else {
    			JOptionPane.showMessageDialog(this, "Username/password is incorrect", "ERROR!", JOptionPane.ERROR_MESSAGE);
    		}
    	}    	
    	    	    
    }//GEN-LAST:event_loginBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void launch() {
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton admin;
    private javax.swing.JButton loginBtn;
    private javax.swing.JLabel loginLbl;
    private javax.swing.JLabel passwordLbl;
    private javax.swing.JTextField passwordTF;
    private javax.swing.ButtonGroup roleGroup;
    private javax.swing.JLabel roleLbl;
    private javax.swing.JRadioButton student;
    private javax.swing.JRadioButton teacher;
    private javax.swing.JLabel usernameLbl;
    private javax.swing.JTextField usernameTF;
    // End of variables declaration//GEN-END:variables
}