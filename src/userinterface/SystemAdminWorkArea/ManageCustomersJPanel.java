/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import java.awt.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Business.EcoSystem;
import Business.Organization;
import Business.UserAccount.UserAccount;

/**
 * @author braya
 */
public class ManageCustomersJPanel extends javax.swing.JPanel {
  JPanel userProcessContainer;
  EcoSystem ecosystem;
  Organization customerOrg;

  public ManageCustomersJPanel(JPanel userProcessContainer, EcoSystem ecosystem, Organization customerOrg) {
    initComponents();
    this.userProcessContainer = userProcessContainer;
    this.ecosystem = ecosystem;
    this.customerOrg = customerOrg;
    populateTable();
  }

  public void populateTable() {
    DefaultTableModel dtm = (DefaultTableModel) tblCustomerList.getModel();
    dtm.setRowCount(0);

    Organization organization2 = ecosystem.getCustomerDirectory().searchOrganization("Customer");
    for (UserAccount ua : organization2.getUserAccountDirectory().getUserAccountList()) {
      Object row[] = new Object[3];
      row[0] = ua.getEmployee().getName();
      row[1] = ua;
      row[2] = ua.getPassword();
      //row[4] = airliner.getFlightDir().getFlightList().size();
      dtm.addRow(row);
    }
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomerList = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(179, 55, 113));

        tblCustomerList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "UserName", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCustomerList);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Customer Details");

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Manage Customers");

        btnCreate.setText("Create>>");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(263, 263, 263)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(50, 50, 50)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(273, 273, 273))
        );
    }// </editor-fold>//GEN-END:initComponents

  private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
    // TODO add your handling code here:
    CreateNewCustomerJPanel panel = new CreateNewCustomerJPanel(userProcessContainer, ecosystem, customerOrg);
//          userProcessContainer.remove(this);
    userProcessContainer.add("CreateNewCustomerJPanel", panel);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.next(userProcessContainer);

  }//GEN-LAST:event_btnCreateActionPerformed


  private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
    // TODO add your handling code here:
    int selectedRow = tblCustomerList.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(null, "Please select a row");
      return;
    } else {
      UserAccount ua = (UserAccount) tblCustomerList.getValueAt(selectedRow, 1);
      UpdateUserJPanel panel = new UpdateUserJPanel(userProcessContainer, ua, "Customers");
      userProcessContainer.add("UpdateUserJPanel", panel);
      CardLayout layout = (CardLayout) userProcessContainer.getLayout();
      layout.next(userProcessContainer);
    }
  }                                         


  private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST
    // :event_btnUpdateActionPerformed
    // TODO add your handling code here:
    populateTable();
    tblCustomerList.revalidate();
    tblCustomerList.repaint();
  }//GEN-LAST:event_btnUpdateActionPerformed

  private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
    // TODO add your handling code here:
    int selectedRow = tblCustomerList.getSelectedRow();
    if (selectedRow < 0) {
      JOptionPane.showMessageDialog(null, "Please select a row");
      return;
    } else {
      UserAccount ua = (UserAccount) tblCustomerList.getValueAt(selectedRow, 1);
      customerOrg.getUserAccountDirectory().deleteUserAccount(ua);
      customerOrg.getEmployeeDirectory().deleteEmployee(ua.getEmployee());
      JOptionPane.showMessageDialog(null, "User Account deleted successfully");

      populateTable();
      tblCustomerList.revalidate();
      jScrollPane1.revalidate();
      tblCustomerList.repaint();
      jScrollPane1.repaint();
      jScrollPane1.setViewportView(tblCustomerList);
      this.revalidate();
      this.repaint();
    }
  }//GEN-LAST:event_btnDeleteActionPerformed

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:

    userProcessContainer.remove(this);
    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
    layout.previous(userProcessContainer);

    Component[] comps = this.userProcessContainer.getComponents();
    for (Component comp : comps) {
      if (comp instanceof SystemAdminWorkAreaJPanel) {
        SystemAdminWorkAreaJPanel systemAdminWorkAreaJPanel = (SystemAdminWorkAreaJPanel) comp;
        systemAdminWorkAreaJPanel.populateTree();
      }
    }
  }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCustomerList;
    // End of variables declaration//GEN-END:variables
}
