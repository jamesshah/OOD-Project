package edu.neu.csye6200.ui;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.util.regex.Matcher;
import com.toedter.calendar.JDateChooser;

import edu.neu.csye6200.controller.RegistrationController;
import edu.neu.csye6200.util.Helper;

public class Registration extends javax.swing.JDialog{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8614134488274551692L;
	private static RegistrationController controller = new RegistrationController();

	public Registration() {
		
		initComponents();
	}
	                      
    private void initComponents() {

        titleLbl = new JLabel();
        fNameLbl = new JLabel();
        lNameLbl = new JLabel();
        dobLbl = new JLabel();
        ageLbl = new JLabel();
        regDateLbl = new JLabel();
        addressLbl = new JLabel();
        grdFNameLbl = new JLabel();
        grdLNameLbl = new JLabel();
        emailLbl = new JLabel();
        phoneLbl = new JLabel();
        enrollStudent = new JButton();
        fName = new JTextField();
        lName = new JTextField();
        age = new JTextField();
        dob = new JTextField();
        address = new JTextField();
        grdFName = new JTextField();
        grdLName = new JTextField();
        email = new JTextField();
        phone = new JTextField();
        regDate = new JDateChooser(new Date());

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pre-school Day Care");

        titleLbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        titleLbl.setText("Pre-school Day Care");

        fNameLbl.setText("First Name:");

        lNameLbl.setText("Last Name:");

        dobLbl.setText("Date of Birth:");

        ageLbl.setText("Age:");

        regDateLbl.setText("Registration Date:");

        addressLbl.setText("Address:");

        grdFNameLbl.setText("Guardian First Name:");

        grdLNameLbl.setText("Guardian Last Name:");

        emailLbl.setText("Email:");

        phoneLbl.setText("Phone number:");
        
        regDate.setEnabled(false);

        enrollStudent.setText("Enroll Student");
        enrollStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clickedEnrollStudent(evt);
            }
        });

        //fName.setInputVerifier(InputVerifier);
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });

        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        grdFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        grdLName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lNameLbl)
                            .addComponent(fNameLbl)
                            .addComponent(dobLbl)
                            .addComponent(ageLbl)
                            .addComponent(regDateLbl)
                            .addComponent(addressLbl)
                            .addComponent(grdFNameLbl)
                            .addComponent(grdLNameLbl)
                            .addComponent(emailLbl)
                            .addComponent(phoneLbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lName)
                            .addComponent(phone)
                            .addComponent(age)
                            .addComponent(dob, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(address)
                            .addComponent(grdFName)
                            .addComponent(grdLName)
                            .addComponent(email)
                            .addComponent(regDate)
                            .addComponent(fName)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(enrollStudent)))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(titleLbl)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fNameLbl)
                    .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lNameLbl)
                    .addComponent(lName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dobLbl)
                    .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLbl)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLbl)
                    .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grdFNameLbl)
                    .addComponent(grdFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grdLNameLbl)
                    .addComponent(grdLName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLbl)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneLbl)
                    .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regDateLbl)
                    .addComponent(regDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(enrollStudent)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void clickedEnrollStudent(java.awt.event.ActionEvent evt) {
    	
//    	String regex = "^(.+)@(.+)$";
//    	String regex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@\" \n"
//    			+ "        + \"[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$";
    	System.out.println(regDate.getDate());
    	Pattern pattern  = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    	Matcher matcher = pattern.matcher(email.getText());
    	
    	// All the fields are filled!
    	if((fName.getText().equals("")) || (lName.getText().equals("")) || (age.getText().equals("")) || (dob.getText().equals("")) || (address.getText().equals(""))
    			|| (email.getText().equals("")) || (phone.getText().equals(""))) {
    		JOptionPane.showMessageDialog(this, "Please enter all the fields", "ERROR!", JOptionPane.ERROR_MESSAGE);    		
    	} else if(!matcher.matches()) {
    		JOptionPane.showMessageDialog(this, "Please enter a valid email address", "ERROR!", JOptionPane.ERROR_MESSAGE);
    	} else
			try {
				if(!controller.enrollStudent(fName.getText(), lName.getText(), age.getText(),
					Helper.getDateFromString(dob.getText()), address.getText(), grdFName.getText(),
					email.getText(), phone.getText(), regDate.getDate())) {
					JOptionPane.showMessageDialog(this, "An error occurred while enorlling the student", "ERROR!", JOptionPane.ERROR_MESSAGE);
				} else {    	    	    	            	    
					JOptionPane.showMessageDialog(this, "Student enrolled successfully", "Success!", JOptionPane.INFORMATION_MESSAGE);
					fName.setText("");
					lName.setText("");
					age.setText("");
					dob.setText("");
					address.setText("");
					grdFName.setText("");
					grdLName.setText("");
					email.setText("");
					phone.setText("");
				}
			} catch (HeadlessException e) {				
				JOptionPane.showMessageDialog(this, "Please enter valid Date of Birth", "ERROR!", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(this, "Please enter valid Date of Birth", "ERROR!", JOptionPane.ERROR_MESSAGE);
				e.printStackTrace();
			}
    }

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }

    private void regDateActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    	
    }    

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Registration.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Registration().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify                     
    private JButton enrollStudent;
    private JLabel titleLbl;
    private JLabel emailLbl;
    private JLabel phoneLbl;
    private JLabel fNameLbl;
    private JLabel lNameLbl;
    private JLabel dobLbl;
    private JLabel ageLbl;
    private JLabel regDateLbl;
    private JLabel addressLbl;
    private JLabel grdFNameLbl;
    private JLabel grdLNameLbl;
    
    
    private JTextField fName;
    private JTextField lName;
    private JTextField age;
    private JTextField dob;
    private JTextField address;
    private JTextField grdFName;
    private JTextField grdLName;
    private JTextField email;
    private JTextField phone;
    private JDateChooser regDate;
	
	public static void launch() {
		java.awt.EventQueue.invokeLater(new Runnable() {
          public void run() {
              new Registration().setVisible(true);
          }
      });
	}

}
