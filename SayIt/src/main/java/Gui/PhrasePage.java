package Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logic.Phrase;
import java.util.ArrayList;
import java.util.Arrays;

public class PhrasePage extends javax.swing.JFrame {
      
    public PhrasePage() {
       setUndecorated(true);
        initComponents();
        setSize(600, 420);
        setResizable(false);

        // Add mouse listeners to enable window dragging
        jPanel1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent evt) {
                mouseX = evt.getX();
                mouseY = evt.getY();
            }
        });

        jPanel1.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseDragged(MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                setLocation(x - mouseX, y - mouseY);
            }
        });

         ArrayList<String> sentenceStarters = new ArrayList<>(Arrays.asList(
            "The dog jumps", "The cat sleeps", "A bird sings", "The boy runs",
            "A girl laughs", "The fish swims", "A baby cries", "The sun shines",
            "A car drives", "The tree grows", "The dog barks", "The cat purrs",
            "A bird chirps", "The boy plays", "A girl dances", "The fish dives",
            "A baby smiles", "The sun sets", "A car honks", "The tree falls",
            "The dog eats", "The cat drinks", "A bird flies", "The boy jumps",
            "A girl talks", "The fish hides", "A baby yawns", "The sun rises",
            "A car stops", "The tree sways", "The dog runs", "The cat watches",
            "A bird nests", "The boy writes", "A girl paints", "The fish bites",
            "A baby sleeps", "The sun blazes", "A car speeds", "The tree blooms",
            "The dog digs", "The cat watches", "A bird watches", "The boy reads",
            "A girl swims", "The fish swims", "A baby kicks", "The sun shines",
            "A car cruises", "The tree shades"
        ));        
        ArrayList<String> sentenceFinishers = new ArrayList<>(Arrays.asList(
            "over the bed", "in the park", "on the grass", "under the tree",
            "near the lake", "at the beach", "in the sky", "by the river",
            "on the road", "at night", "over the hill", "in the house",
            "on the roof", "under the bridge", "near the school", "at the market",
            "in the garden", "by the pool", "on the boat", "at sunrise",
            "over the fence", "in the forest", "on the ground", "under the table",
            "near the mountain", "at the mall", "in the yard", "by the stream",
            "on the trail", "at sunset", "over the river", "in the city",
            "on the pier", "under the bench", "near the ocean", "at the office",
            "in the field", "by the shore", "on the patio", "at the party",
            "over the rainbow", "in the shop", "on the stage", "under the sun",
            "near the farm", "at the station", "in the museum", "by the cliff",
            "on the dock", "at midday"
        ));
        
        Phrase myPhrase = new Phrase(sentenceStarters, sentenceFinishers);
        starter.setText("\"" + myPhrase.randomStarter());
        finisher.setText(myPhrase.randomFinisher() + "\"");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        audioBtn = new javax.swing.JToggleButton();
        exitBtn = new javax.swing.JButton();
        starter = new javax.swing.JLabel();
        backBtn = new javax.swing.JToggleButton();
        finisher = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        whiteBackground = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Say it! Phrase Test");
        setMinimumSize(new java.awt.Dimension(600, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 420));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        audioBtn.setBackground(new java.awt.Color(255, 255, 255));
        audioBtn.setForeground(new java.awt.Color(255, 255, 255));
        audioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/audioBtn.png"))); // NOI18N
        audioBtn.setBorder(null);
        audioBtn.setBorderPainted(false);
        audioBtn.setContentAreaFilled(false);
        jPanel1.add(audioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 290, 50, 50));

        exitBtn.setFont(new java.awt.Font("Poppins Black", 0, 36)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("X");
        exitBtn.setBorder(null);
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.setFocusPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(547, 12, 40, 40));

        starter.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        starter.setForeground(new java.awt.Color(157, 157, 157));
        starter.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        starter.setText(" ");
        jPanel1.add(starter, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 180, 450, -1));

        backBtn.setBackground(new java.awt.Color(255, 255, 255));
        backBtn.setFont(new java.awt.Font("Poppins Black", 0, 48)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/backBtn.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.setFocusPainted(false);
        backBtn.setFocusable(false);
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 80, 40, 20));

        finisher.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        finisher.setForeground(new java.awt.Color(157, 157, 157));
        finisher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        finisher.setText(" ");
        jPanel1.add(finisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 215, 450, -1));

        subtitle.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        subtitle.setForeground(new java.awt.Color(0, 0, 0));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitle.setText("Read with calm the next phrase:");
        jPanel1.add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 115, -1, -1));

        title.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Say it!");
        title.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, -1, -1));

        whiteBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/whiteBackground.png"))); // NOI18N
        jPanel1.add(whiteBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/background.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton audioBtn;
    private javax.swing.JToggleButton backBtn;
    private javax.swing.JLabel background;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel finisher;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel starter;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
    private int mouseX;
    private int mouseY;


}
