/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sqlite.caloriecounter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author scottfoltz
 */
public class MainFrame extends javax.swing.JFrame {
    Connection conn = null;
    PreparedStatement prep = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    private String categorySelected = null;
    private String user = null;
    private ArrayList<Integer> calorieLimitList = new ArrayList<Integer>();
    
    /**
     * Creates new form MainFrame
     */ 
    public MainFrame(String username) {
        user = username;
        initComponents();
        initList(calorieLimitList);
        accountMenu.setText(user);

    }

    
    public ArrayList initList(ArrayList list){
        ArrayList listtemp = list;
        list.add(1800);
        list.add(2200);
        list.add(2800);
        list.add(3200);
        list.add(3600);
        list.add(4000);
        
        for (int i = 0; i < list.size(); i++)
            jComboBoxLimit.addItem(list.get(i).toString());
        
        
        
        
        return listtemp;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        calorieCountLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel4 = new javax.swing.JLabel();
        jComboBoxLimit = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btnNewCategory = new javax.swing.JButton();
        btnChooseFood = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        accountMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setText("Food Category");

        calorieCountLabel.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        calorieCountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        calorieCountLabel.setText("0");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Calories consumed today");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Percent Daily Limit");

        jComboBoxLimit.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxLimitItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(calorieCountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jComboBoxLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(calorieCountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabs.addTab("tab1", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        tabs.addTab("tab2", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 324, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        tabs.addTab("tab3", jPanel3);

        btnNewCategory.setText("Add Category");
        btnNewCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewCategoryActionPerformed(evt);
            }
        });

        btnChooseFood.setText("Choose Food");
        btnChooseFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFoodActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jScrollPane3.setViewportView(jScrollPane1);

        accountMenu.setText("blah");

        jMenuItem1.setText("Logout");
        jMenuItem1.setToolTipText("");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        accountMenu.add(jMenuItem1);

        jMenuBar2.add(accountMenu);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnNewCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnChooseFood, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tabs)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3)
                        .addGap(18, 18, 18)
                        .addComponent(btnNewCategory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnChooseFood)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                
         tabs.setTitleAt(0, "Today");
         tabs.setTitleAt(1, "History");
         tabs.setTitleAt(2, "Search");
    }//GEN-LAST:event_formWindowOpened

    private void btnNewCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewCategoryActionPerformed
        // TODO add your handling code here:
        //lets create a new food category
        conn = SQLiteDriver.connectDB();
        try{
            String newCategory = (String)JOptionPane.showInputDialog(null,"Enter in a name of our new Food Category:");
            if(newCategory != null){
                String query3 = "INSERT INTO FoodCategory(name) values(?)";
                prep = conn.prepareStatement(query3);
                prep.setString(1,newCategory);
                prep.executeUpdate();
            }   
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();

        }finally{
        try{
            prep.close();
            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();//was getting errors, so this was how i debugged
        }}
        
        
        
    }//GEN-LAST:event_btnNewCategoryActionPerformed

    private void btnChooseFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFoodActionPerformed
        // TODO add your handling code here:
        //made it simple, as long as nothing is selected don't do anything
        if(categorySelected != null){
            //helper function that takes in the selected value
            FoodFrame food = new FoodFrame(user);
            
            food.setVisible(true);
            food.foodButtonHelper(categorySelected);
            
        }else{
            JOptionPane.showMessageDialog(null, "Please select a category");

        }
        
        //not necessarily sure how to handle multiple, probably just an array of strings rather than just one string.
    }//GEN-LAST:event_btnChooseFoodActionPerformed

    
    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
         // TODO add your handling code here:
        conn = SQLiteDriver.connectDB();
        DefaultListModel m = new DefaultListModel();
        try{

            String query1 = "SELECT * FROM FoodCategory;";
            prep = conn.prepareStatement(query1);
            rs = prep.executeQuery();

            while(rs.next()){
                String name = rs.getString("name");
                m.addElement(name);
            }
            jList1.setModel(m);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }finally{
        try{
            rs.close();
            prep.close();
            //dont close yet
            //conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }}
        
        
        //this could be where i update the jlabel to add up the total calories a user has eaten
        //query to userEatsFood table, for the current user get all he/she has eaten and add up those food.calories
        try{

            String query2 = "SELECT SUM(Food.Calories) AS dailySum\n" +
                            "FROM UserEatsFood, Food, user\n" +
                            "WHERE user.userid = UserEatsFood.UserID\n" +
                            "AND Food.foodID = UserEatsFood.FoodID\n" +
                            "AND user.username = ?\n" +
                            "AND UserEatsFood.Date >= datetime('now','-1 day');";
            prep = conn.prepareStatement(query2);
            prep.setString(1,user);
            rs = prep.executeQuery();

            while(rs.next()){
                int sum = rs.getInt("dailySum");
                calorieCountLabel.setText(Integer.toString(sum));
            }
            jList1.setModel(m);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }finally{
        try{
            rs.close();
            prep.close();
            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }}

        
        
    }//GEN-LAST:event_formWindowActivated

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        // TODO add your handling code here:
        categorySelected = jList1.getSelectedValue();
       
    }//GEN-LAST:event_jList1ValueChanged

    private void jComboBoxLimitItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxLimitItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxLimitItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        dispose();
        //user = null;
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu accountMenu;
    private javax.swing.JButton btnChooseFood;
    private javax.swing.JButton btnNewCategory;
    private javax.swing.JLabel calorieCountLabel;
    private javax.swing.JComboBox<String> jComboBoxLimit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane tabs;
    // End of variables declaration//GEN-END:variables
}
