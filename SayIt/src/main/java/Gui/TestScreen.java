package Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logic.Voice;

public class TestScreen extends javax.swing.JFrame {  
    
    public TestScreen() {
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



    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        audioBtn = new javax.swing.JToggleButton();
        exitBtn = new javax.swing.JButton();
        userWord = new javax.swing.JLabel();
        backBtn = new javax.swing.JToggleButton();
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
        audioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audioBtnActionPerformed(evt);
            }
        });
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

        userWord.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        userWord.setForeground(new java.awt.Color(157, 157, 157));
        userWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userWord.setText(" ");
        jPanel1.add(userWord, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 180, 450, -1));

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
    
    Voice voice = new Voice();
    private void audioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioBtnActionPerformed
        // Disable the button to prevent multiple clicks
        audioBtn.setEnabled(false);

        // Create a new thread to handle voice recognition
        new Thread(() -> {
            
            userWord.setText("Recording...");
            String recognizedText = voice.recognizeSpeech();

            javax.swing.SwingUtilities.invokeLater(() -> {
                if (recognizedText != null && !recognizedText.isEmpty()) {
                    userWord.setText(recognizedText);
                } else {
                    userWord.setText("No speech recognized.");
                }                
                audioBtn.setEnabled(true);
            });
        }).start();
        
        
    }//GEN-LAST:event_audioBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton audioBtn;
    private javax.swing.JToggleButton backBtn;
    private javax.swing.JLabel background;
    private javax.swing.JButton exitBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel userWord;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
    private int mouseX;
    private int mouseY;


}
