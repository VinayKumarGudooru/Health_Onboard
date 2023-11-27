package ui.cases;

import businessFramework.person.Review;
import businessFramework.person.Helper;
import businessFramework.userAccount.User;
import businessFramework.requestPipeline.HelpRequest;
import businessFramework.requestPipeline.Request;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import ui.helper.ViewHelperProfile;

/**
 *
 * @author jhalaksurve
 */
public class WriteReviewForHelper extends javax.swing.JPanel {
       
       private JPanel userProcessContainer;
       private User user;  
       private Helper helper;
    
    /**
     * Creates new form WriteTestimonialForVolJPanel
     */
    public WriteReviewForHelper(JPanel userProcessContainer, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
       this.user = user;
    
       populateHelpReqJTable();
        writeTestPanel.setVisible(false);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
         Color c1 = new Color(210,240,114);
         Color c2 = new Color(210,240,114);
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    public void populateHelpReqJTable()
    {
      DefaultTableModel dtm = (DefaultTableModel)helpRequestsJTable.getModel();
        dtm.setRowCount(0);
        
        for(Request workRequest : user.getRequestPipeline().getRequestList())
        {
            if(workRequest.getReqMessage().equals("Need Help"))
            {
           HelpRequest helpWorkRequest = (HelpRequest)workRequest; 
     
           if(helpWorkRequest.getStatusOfRequest().equalsIgnoreCase("Completed"))
           {
           Object[] rowData = new Object[5];
           rowData[0] = helpWorkRequest.getReqId();
           rowData[1] = helpWorkRequest;
           rowData[2] = helpWorkRequest.getRequestDate();
           rowData[3] = helpWorkRequest.getReceiverDetails() == null ? null : workRequest.getReceiverDetails().getName() ;
           rowData[4] = helpWorkRequest.getResolveDate();
           
           dtm.addRow(rowData);
           }
           }
        }  
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageEnt = new javax.swing.JLabel();
        manageEnt1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        helpRequestsJTable = new javax.swing.JTable();
        writeReviewBtn = new javax.swing.JButton();
        writeTestPanel = new javax.swing.JLayeredPane();
        submitTestimnialBtn = new javax.swing.JButton();
        LastName = new javax.swing.JLabel();
        cancelBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lastNameField = new javax.swing.JTextField();
        viewYourProfile = new javax.swing.JLabel();
        helpNameTxtField = new javax.swing.JTextField();
        firstNameField = new javax.swing.JTextField();
        firstName = new javax.swing.JLabel();
        firstName1 = new javax.swing.JLabel();
        serviceTypeTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        testiTxtAreaField = new javax.swing.JTextArea();
        LastName1 = new javax.swing.JLabel();
        viewYourProfile1 = new javax.swing.JLabel();
        LastName2 = new javax.swing.JLabel();
        ViewHelperProfileBtn = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();

        manageEnt.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        manageEnt.setText("Write Review");

        manageEnt1.setFont(new java.awt.Font("Georgia", 1, 36)); // NOI18N
        manageEnt1.setText("Health Onboard");

        helpRequestsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Request ID", "Help Recieved", "Requested Date", "Volunteer Name", "Resolved Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(helpRequestsJTable);

        writeReviewBtn.setBackground(new java.awt.Color(0, 153, 153));
        writeReviewBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        writeReviewBtn.setForeground(new java.awt.Color(255, 255, 255));
        writeReviewBtn.setText("Write Review");
        writeReviewBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        writeReviewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                writeReviewBtnActionPerformed(evt);
            }
        });

        writeTestPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        submitTestimnialBtn.setBackground(new java.awt.Color(0, 153, 153));
        submitTestimnialBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        submitTestimnialBtn.setForeground(new java.awt.Color(255, 255, 255));
        submitTestimnialBtn.setText("Submit");
        submitTestimnialBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        submitTestimnialBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitTestimnialBtnActionPerformed(evt);
            }
        });

        LastName.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        LastName.setText("Last Name :");

        cancelBtn.setBackground(new java.awt.Color(0, 153, 153));
        cancelBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Cancel");
        cancelBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("Please enter characters below 500");

        lastNameField.setEditable(false);
        lastNameField.setEnabled(false);

        viewYourProfile.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        viewYourProfile.setText("Helper Details:");

        helpNameTxtField.setEditable(false);
        helpNameTxtField.setEnabled(false);
        helpNameTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpNameTxtFieldActionPerformed(evt);
            }
        });

        firstNameField.setEditable(false);
        firstNameField.setEnabled(false);

        firstName.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        firstName.setText("First Name :");

        firstName1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        firstName1.setText("Help Recieved :");

        serviceTypeTxtField.setEditable(false);
        serviceTypeTxtField.setEnabled(false);

        testiTxtAreaField.setColumns(20);
        testiTxtAreaField.setRows(5);
        jScrollPane1.setViewportView(testiTxtAreaField);

        LastName1.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        LastName1.setText("Help Type :");

        viewYourProfile1.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        viewYourProfile1.setText("Help Recieved:");

        LastName2.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        LastName2.setText("Review :");

        writeTestPanel.setLayer(submitTestimnialBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(LastName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(cancelBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(lastNameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(viewYourProfile, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(helpNameTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(firstNameField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(firstName, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(firstName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(serviceTypeTxtField, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(LastName1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(viewYourProfile1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        writeTestPanel.setLayer(LastName2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout writeTestPanelLayout = new javax.swing.GroupLayout(writeTestPanel);
        writeTestPanel.setLayout(writeTestPanelLayout);
        writeTestPanelLayout.setHorizontalGroup(
            writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writeTestPanelLayout.createSequentialGroup()
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(viewYourProfile)
                            .addGroup(writeTestPanelLayout.createSequentialGroup()
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LastName))
                                .addGap(18, 18, 18)
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lastNameField)
                                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(viewYourProfile1)
                            .addGroup(writeTestPanelLayout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(submitTestimnialBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cancelBtn))
                            .addGroup(writeTestPanelLayout.createSequentialGroup()
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LastName1)
                                    .addComponent(LastName2)
                                    .addComponent(firstName1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                                        .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(serviceTypeTxtField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(helpNameTxtField))
                                        .addGap(183, 183, 183))))))
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        writeTestPanelLayout.setVerticalGroup(
            writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(writeTestPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(viewYourProfile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName)
                    .addComponent(firstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastName)
                    .addComponent(lastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(viewYourProfile1)
                .addGap(18, 18, 18)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstName1)
                    .addComponent(helpNameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LastName1)
                    .addComponent(serviceTypeTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(LastName2))
                    .addGroup(writeTestPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(writeTestPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitTestimnialBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
        );

        ViewHelperProfileBtn.setBackground(new java.awt.Color(0, 153, 153));
        ViewHelperProfileBtn.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        ViewHelperProfileBtn.setForeground(new java.awt.Color(255, 255, 255));
        ViewHelperProfileBtn.setText("View Helper Profile");
        ViewHelperProfileBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ViewHelperProfileBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewHelperProfileBtnActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 153, 153));
        backJButton.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(backJButton))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(ViewHelperProfileBtn)
                        .addGap(53, 53, 53)
                        .addComponent(writeReviewBtn)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(writeTestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(244, 244, 244)
                    .addComponent(manageEnt1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(567, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(manageEnt)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ViewHelperProfileBtn)
                            .addComponent(writeReviewBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(writeTestPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(manageEnt1)
                    .addContainerGap(446, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void writeReviewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_writeReviewBtnActionPerformed
        int selectedRow = helpRequestsJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        HelpRequest nhwr = (HelpRequest)helpRequestsJTable.getValueAt(selectedRow, 1);
        if(nhwr.getReceiverDetails()==null)
        {
        JOptionPane.showMessageDialog(this, "Request has not been processed yet", "warning", JOptionPane.PLAIN_MESSAGE);
            return;    
        }
        helper = (Helper)nhwr.getReceiverDetails().getPerson();
        
        firstNameField.setText(helper.getFirstName());
        lastNameField.setText(helper.getLastName());
        helpNameTxtField.setText(nhwr.getHelp().getHelp());
        serviceTypeTxtField.setText(nhwr.getHelp().getServiceType());
        writeTestPanel.setVisible(true);
        
    }//GEN-LAST:event_writeReviewBtnActionPerformed

    private void helpNameTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpNameTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_helpNameTxtFieldActionPerformed

    private void submitTestimnialBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitTestimnialBtnActionPerformed
        
        if(testiTxtAreaField.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Please write few words about helepr service!", "warning", JOptionPane.PLAIN_MESSAGE);
          return;    
        }
         if(testiTxtAreaField.getText().length()>500)
         {
         JOptionPane.showMessageDialog(this, "Please enter text less than 500 characters", "warning", JOptionPane.PLAIN_MESSAGE);
          return;      
         }
        try
        {
       
        Review testimonial = helper.addReview();
        testimonial.setReviewTxt(testiTxtAreaField.getText().replaceAll("\n", " "));
       
        DateFormat df = new SimpleDateFormat("EEE, MMM d, YYYY hh:mm aaa");
        Calendar cal = Calendar.getInstance();
        String timestamp = df.format(cal.getTime());
        testimonial.setWriterName(user.getPerson().getName());
        testimonial.setDate(timestamp);
       
        JOptionPane.showMessageDialog(this, "Testimonial has been created Succesfully, Thank You", "success", JOptionPane.PLAIN_MESSAGE);
        testiTxtAreaField.setText("");
        }
        catch(Exception e)
        {
            e.printStackTrace();
          JOptionPane.showMessageDialog(this, "Please enter valid data", "warning", JOptionPane.WARNING_MESSAGE);
          return;       
        }
        
    }//GEN-LAST:event_submitTestimnialBtnActionPerformed

    private void ViewHelperProfileBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewHelperProfileBtnActionPerformed
         int selectedRow = helpRequestsJTable.getSelectedRow();
        if(selectedRow<0)
        {
            JOptionPane.showMessageDialog(this, "Please select a row", "warning", JOptionPane.PLAIN_MESSAGE);
            return;
        }
        
        HelpRequest nhwr = (HelpRequest)helpRequestsJTable.getValueAt(selectedRow, 1);
        if(nhwr.getReceiverDetails() == null)
        {
       JOptionPane.showMessageDialog(this, "Request has not been processed yet", "warning", JOptionPane.PLAIN_MESSAGE);
       return;     
        }
        User volAccnt = (User)nhwr.getReceiverDetails();
        
        ViewHelperProfile viewHelperProfile = new ViewHelperProfile(userProcessContainer, volAccnt);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("ViewHelperProfile", viewHelperProfile);
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ViewHelperProfileBtnActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LastName;
    private javax.swing.JLabel LastName1;
    private javax.swing.JLabel LastName2;
    private javax.swing.JButton ViewHelperProfileBtn;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel firstName;
    private javax.swing.JLabel firstName1;
    private javax.swing.JTextField firstNameField;
    private javax.swing.JTextField helpNameTxtField;
    private javax.swing.JTable helpRequestsJTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lastNameField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel manageEnt1;
    private javax.swing.JTextField serviceTypeTxtField;
    private javax.swing.JButton submitTestimnialBtn;
    private javax.swing.JTextArea testiTxtAreaField;
    private javax.swing.JLabel viewYourProfile;
    private javax.swing.JLabel viewYourProfile1;
    private javax.swing.JButton writeReviewBtn;
    private javax.swing.JLayeredPane writeTestPanel;
    // End of variables declaration//GEN-END:variables
}
