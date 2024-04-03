package com.mycompany.bms;

public class Main_Form extends javax.swing.JFrame {

    
    public Main_Form() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        add_user = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        add_customer = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        add_supplier = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        add_department = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        make_deposit = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        make_withdrawal = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        request_loan = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        user_list = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        customers_list = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        suppliers_list = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        department_list = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("jMenu3");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenuItem5.setText("jMenuItem5");

        jMenuItem6.setText("jMenuItem6");

        jMenuItem7.setText("jMenuItem7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("File");

        jMenuItem8.setText("Logout");
        jMenu1.add(jMenuItem8);
        jMenu1.add(jSeparator1);
        jMenu1.add(jSeparator10);

        jMenuItem18.setText("EXIT");
        jMenu1.add(jMenuItem18);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("People");

        add_user.setText("Add User");
        add_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_userActionPerformed(evt);
            }
        });
        jMenu2.add(add_user);
        jMenu2.add(jSeparator2);

        add_customer.setText("Add Customer");
        add_customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_customerActionPerformed(evt);
            }
        });
        jMenu2.add(add_customer);
        jMenu2.add(jSeparator3);

        add_supplier.setText("Add Supplier");
        add_supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_supplierActionPerformed(evt);
            }
        });
        jMenu2.add(add_supplier);
        jMenu2.add(jSeparator4);

        add_department.setText("Add Department");
        jMenu2.add(add_department);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Transactions");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        make_deposit.setText("Make Deposit");
        make_deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                make_depositActionPerformed(evt);
            }
        });
        jMenu4.add(make_deposit);
        jMenu4.add(jSeparator5);

        make_withdrawal.setText("Make Withdrawal");
        jMenu4.add(make_withdrawal);
        jMenu4.add(jSeparator6);

        request_loan.setText("Request Loan");
        jMenu4.add(request_loan);

        jMenuBar1.add(jMenu4);

        jMenu7.setText("Lists");

        user_list.setText("User's List");
        jMenu7.add(user_list);
        jMenu7.add(jSeparator7);

        customers_list.setText("Customers List");
        jMenu7.add(customers_list);
        jMenu7.add(jSeparator8);

        suppliers_list.setText("Suppliers List");
        jMenu7.add(suppliers_list);
        jMenu7.add(jSeparator9);

        department_list.setText("Department List");
        jMenu7.add(department_list);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void make_depositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_make_depositActionPerformed
        Depositform dform = new Depositform(null , true);
        dform.setVisible(true);
    }//GEN-LAST:event_make_depositActionPerformed

    private void add_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_userActionPerformed
        
        
        new_user nuser = new new_user(null,  true);
        nuser.setVisible(true);
    }//GEN-LAST:event_add_userActionPerformed

    private void add_customerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_customerActionPerformed
        
    }//GEN-LAST:event_add_customerActionPerformed

    private void add_supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_supplierActionPerformed
        Suppliers_form suppliers = new Suppliers_form(null, true);
        suppliers.setVisible(true);
    }//GEN-LAST:event_add_supplierActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed

    }//GEN-LAST:event_jMenu4ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem add_customer;
    private javax.swing.JMenuItem add_department;
    private javax.swing.JMenuItem add_supplier;
    private javax.swing.JMenuItem add_user;
    private javax.swing.JMenuItem customers_list;
    private javax.swing.JMenuItem department_list;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem make_deposit;
    private javax.swing.JMenuItem make_withdrawal;
    private javax.swing.JMenuItem request_loan;
    private javax.swing.JMenuItem suppliers_list;
    private javax.swing.JMenuItem user_list;
    // End of variables declaration//GEN-END:variables
}
