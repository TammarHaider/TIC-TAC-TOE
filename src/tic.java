
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tammar haider rizvi
 */
public class tic extends javax.swing.JFrame {
private String startGame="X";
private int xCount=0;
private int oCount=0;
    /**
     * Creates new form tic
     */
    public tic() {
        initComponents();
        setSize(1200, 600);
        setLocationRelativeTo(null);
    }
private void gameScore()
{
    jLabel5.setText(String.valueOf(xCount));
    jLabel6.setText(String.valueOf(oCount));
    
}
private void choose_a_Player()
{
    if(startGame.equalsIgnoreCase("X"))
    {
        startGame="o";
    }
    else 
    {
        startGame="X";
    }
}
private void winningGame()
{
    String b1=jButton1.getText();
    String b3=jButton3.getText();
    String b4=jButton4.getText();
    
    String b5=jButton5.getText();
    String b6=jButton6.getText();
    String b2=jButton2.getText();
    
    String b7=jButton7.getText();
    String b8=jButton8.getText();
    String b9=jButton9.getText();
    
    
   if(b1 ==("X") && b3 ==("X") && b4==("X"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton1.setBackground(Color.yellow);
        jButton3.setBackground(Color.yellow);
        jButton4.setBackground(Color.yellow);
    }
   if(b5 ==("X") && b6 ==("X") && b2==("X"))
    {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton5.setBackground(Color.red);
        jButton6.setBackground(Color.red);
        jButton2.setBackground(Color.red);
     }
   if(b7 ==("X") && b8 ==("X") && b9==("X"))
     {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton7.setBackground(Color.cyan);
        jButton8.setBackground(Color.cyan);
        jButton9.setBackground(Color.cyan);
     }
   if(b1 ==("X") && b5 ==("X") && b7==("X"))
     {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton1.setBackground(Color.MAGENTA);
        jButton5.setBackground(Color.MAGENTA);
        jButton7.setBackground(Color.MAGENTA);
      }
   if(b1 ==("X") && b6 ==("X") && b9==("X"))
     {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton1.setBackground(Color.orange);
        jButton6.setBackground(Color.orange);
        jButton9.setBackground(Color.orange);
      }
   if(b3 ==("X") && b6 ==("X") && b8==("X"))
      {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton3.setBackground(Color.PINK);
        jButton6.setBackground(Color.PINK);
        jButton8.setBackground(Color.PINK);
       }
   if(b4 ==("X") && b2 ==("X") && b9==("X"))
       {
         JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         jButton4.setBackground(Color.LIGHT_GRAY);
         jButton2.setBackground(Color.LIGHT_GRAY);
         jButton9.setBackground(Color.LIGHT_GRAY);
       }
   if(b4 ==("X") && b6 ==("X") && b7==("X"))
      {
        JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        xCount++;
        gameScore();
        jButton4.setBackground(Color.blue);
        jButton6.setBackground(Color.blue);
        jButton7.setBackground(Color.blue);
      }
   if(b1 ==("o") && b3 ==("o") && b4==("o"))
      {
        JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton1.setBackground(Color.yellow);
        jButton3.setBackground(Color.yellow);
        jButton4.setBackground(Color.yellow);
      }
   if(b5 ==("o") && b6 ==("o") && b2==("o"))
      {
        JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
        oCount++;
        gameScore();
        jButton5.setBackground(Color.red);
        jButton6.setBackground(Color.red);
        jButton2.setBackground(Color.red);
       }
   if(b7 ==("o") && b8 ==("o") && b9==("o"))
    {
         JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         jButton7.setBackground(Color.cyan);
         jButton8.setBackground(Color.cyan);
         jButton9.setBackground(Color.cyan);
       }
   if(b1 ==("o") && b5 ==("o") && b7==("o"))
       {
         JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         jButton1.setBackground(Color.MAGENTA);
         jButton5.setBackground(Color.MAGENTA);
         jButton7.setBackground(Color.MAGENTA);
       }
   if(b1 ==("o") && b6 ==("o") && b9==("o"))
       {
         JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         jButton1.setBackground(Color.orange);
         jButton6.setBackground(Color.orange);
         jButton9.setBackground(Color.orange);
       }
   if(b3 ==("o") && b6 ==("o") && b8==("o"))
       {
         JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         jButton3.setBackground(Color.PINK);
         jButton6.setBackground(Color.PINK);
         jButton8.setBackground(Color.PINK);
       }
   if(b4 ==("o") && b2 ==("o") && b9==("o"))
       {
         JOptionPane.showMessageDialog(this, "Player O wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         oCount++;
         gameScore();
         jButton4.setBackground(Color.LIGHT_GRAY);
         jButton2.setBackground(Color.LIGHT_GRAY);
         jButton9.setBackground(Color.LIGHT_GRAY);
       }
   if(b4 ==("o") && b6 ==("o") && b7==("o"))
       {
         JOptionPane.showMessageDialog(this, "Player X wins","Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
         xCount++;
         gameScore();
         jButton4.setBackground(Color.blue);
         jButton6.setBackground(Color.blue);
         jButton7.setBackground(Color.blue);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jlb1PlayerX = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jlb1Player0 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 100)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.GridLayout(3, 5, 2, 2));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb1PlayerX.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlb1PlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb1PlayerX.setText("Player X:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb1PlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb1PlayerX, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel10);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlb1Player0.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jlb1Player0.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb1Player0.setText("Player 0:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb1Player0, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jlb1Player0, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton10.setText("Reset");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel16);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jButton11.setText("Exit");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton11, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel12);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel18, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       jButton1.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton1.setForeground(Color.green);
    }
    else 
    {
       jButton1.setForeground(Color.BLUE);
    }
    choose_a_Player();
winningGame();
    }//GEN-LAST:event_jButton1ActionPerformed
private JFrame frame;
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
 frame =new JFrame("Exit");
 if(JOptionPane.showConfirmDialog(frame, "confirm if you want to exit ","Tic Tac Toe",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION);
 {
     System.exit(0);
 }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
             jButton3.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton3.setForeground(Color.green);
    }
    else 
    {
       jButton3.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
             jButton4.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton4.setForeground(Color.green);
    }
    else 
    {
       jButton4.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
             jButton5.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton5.setForeground(Color.green);
    }
    else 
    {
       jButton5.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
             jButton6.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton6.setForeground(Color.green);
    }
    else 
    {
       jButton6.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
             jButton2.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton2.setForeground(Color.green);
    }
    else 
    {
       jButton2.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
             jButton7.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton7.setForeground(Color.green);
    }
    else 
    {
       jButton7.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
             jButton8.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton8.setForeground(Color.green);
    }
    else 
    {
       jButton8.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
             jButton9.setText(startGame);
    if(startGame.equalsIgnoreCase("X"))
    {
        jButton9.setForeground(Color.green);
    }
    else 
    {
       jButton9.setForeground(Color.BLUE);
    }
    choose_a_Player();
    winningGame();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
               jButton1.setText(null);
               jButton3.setText(null);
               jButton4.setText(null);

               jButton5.setText(null);
               jButton6.setText(null);
               jButton2.setText(null);
                     
               jButton7.setText(null);
               jButton8.setText(null);
               jButton9.setText(null);
               
               jButton1.setBackground(Color.LIGHT_GRAY);
               jButton3.setBackground(Color.LIGHT_GRAY);
               jButton4.setBackground(Color.LIGHT_GRAY);
               
               jButton5.setBackground(Color.LIGHT_GRAY);
               jButton6.setBackground(Color.LIGHT_GRAY);
               jButton2.setBackground(Color.LIGHT_GRAY);
               
               jButton7.setBackground(Color.LIGHT_GRAY);
               jButton8.setBackground(Color.LIGHT_GRAY);
               jButton9.setBackground(Color.LIGHT_GRAY);
                           
                        
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlb1Player0;
    private javax.swing.JLabel jlb1PlayerX;
    // End of variables declaration//GEN-END:variables
}
