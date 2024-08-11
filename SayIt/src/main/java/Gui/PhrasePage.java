package Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logic.Phrase;
import Logic.ScoreSystem;
import Logic.TextTTS;
import Logic.Voice;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class PhrasePage extends javax.swing.JFrame {
    public TextTTS speaker;
    public String sentence;
    public String RandomSentence;
    public Voice voice;
    public HomePage homePage;
    public ScoreSystem score;
    public ArrayList<String> sentenceList;
    
    
public PhrasePage(ArrayList<String> sentenceList, Voice voice,  HomePage homePage, ScoreSystem scoreSystem) {
System.out.println("Initializing PhrasePage...");
    setUndecorated(true);
    initComponents();
    setSize(600, 420);
    setResizable(false);
    speaker = new TextTTS();    

    // Initialize sentence lists
    this.voice = voice;
    this.homePage = homePage;
    this.score = scoreSystem;
    this.sentenceList = sentenceList;

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
    
    // Set initial sentence
    updateSentence();
    System.out.println("PhrasePage initialized.");
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        speakerBtn = new javax.swing.JToggleButton();
        audioBtn = new javax.swing.JToggleButton();
        sentenceLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JToggleButton();
        spellCheck = new javax.swing.JLabel();
        subtitle = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
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

        speakerBtn.setBackground(new java.awt.Color(255, 255, 255));
        speakerBtn.setForeground(new java.awt.Color(255, 255, 255));
        speakerBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/speakerBtn.png"))); // NOI18N
        speakerBtn.setBorder(null);
        speakerBtn.setBorderPainted(false);
        speakerBtn.setContentAreaFilled(false);
        speakerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                speakerBtnActionPerformed(evt);
            }
        });
        jPanel1.add(speakerBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 250, 50, 50));

        audioBtn.setBackground(new java.awt.Color(255, 255, 255));
        audioBtn.setForeground(new java.awt.Color(255, 255, 255));
        audioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/audioGradientBtn.png"))); // NOI18N
        audioBtn.setBorder(null);
        audioBtn.setBorderPainted(false);
        audioBtn.setContentAreaFilled(false);
        audioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                audioBtnActionPerformed(evt);
            }
        });
        jPanel1.add(audioBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 250, 50, 50));

        sentenceLabel.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        sentenceLabel.setForeground(new java.awt.Color(157, 157, 157));
        sentenceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sentenceLabel.setText(" ");
        jPanel1.add(sentenceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 160, 410, 70));

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
        jPanel1.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 80, 40, 20));

        spellCheck.setFont(new java.awt.Font("Poppins", 1, 20)); // NOI18N
        spellCheck.setForeground(new java.awt.Color(0, 0, 0));
        spellCheck.setText("Result:");
        spellCheck.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jPanel1.add(spellCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 325, -1, -1));

        subtitle.setFont(new java.awt.Font("Poppins SemiBold", 0, 16)); // NOI18N
        subtitle.setForeground(new java.awt.Color(0, 0, 0));
        subtitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        subtitle.setText("Read with calm the next phrase:");
        jPanel1.add(subtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(105, 115, -1, -1));

        nextBtn.setBackground(new java.awt.Color(255, 255, 255));
        nextBtn.setForeground(new java.awt.Color(255, 255, 255));
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/PhrasePage/nextBtn.png"))); // NOI18N
        nextBtn.setBorder(null);
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });
        jPanel1.add(nextBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 325, 30, 30));

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
        homePage.setVisible(true);
        this.dispose();       
    }//GEN-LAST:event_backBtnActionPerformed

    private void audioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioBtnActionPerformed
         // Disable the button to prevent multiple clicks
        audioBtn.setEnabled(false);
        // Create a new thread to handle voice recognition
        new Thread(() -> {            
            spellCheck.setText("Recording...");
            String recognizedText = voice.recognizeSpeech();
            javax.swing.SwingUtilities.invokeLater(() -> {
                if (recognizedText != null && !recognizedText.isEmpty()) {                    
                    //Logic to evaluate your answer
                    boolean result = score.returnResult(RandomSentence, recognizedText);
                    if (result){
                       //spellCheck.setText("SUCCESS!");
                       spellCheck.setText("<html><span style='color: rgb(51,255,0);'>" + "SUCCESS!"  + "</span></html>");
                       //voice.stop();
                    }
                    else{
                        spellCheck.setText("<html><span style='color: rgb(255,0,0);'>" + "FALSE!"  + "</span></html>");
                        //spellCheck.setText("FALSE!");
                        //voice.stop();
                    }                    
                } else {
                    spellCheck.setText("ERROR");
                }                
                audioBtn.setEnabled(true);
            });
        }).start();
    }//GEN-LAST:event_audioBtnActionPerformed

    private void speakerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerBtnActionPerformed
        // Check for non-null and non-empty phrase
        if (RandomSentence != null && !RandomSentence.trim().isEmpty()) {
            // Use a background thread to handle the TTS operation
            new Thread(() -> {
                try {
                    speaker.Talk(RandomSentence);
                } catch (Exception e) {
                    System.err.println("Error during TTS operation: " + e.getMessage());
                }
            }).start();
        } else {
            System.err.println("Phrase is empty or null.");
        }
    }//GEN-LAST:event_speakerBtnActionPerformed


    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        updateSentence();
    }//GEN-LAST:event_nextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton audioBtn;
    private javax.swing.JToggleButton backBtn;
    private javax.swing.JLabel background;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton nextBtn;
    private javax.swing.JLabel sentenceLabel;
    private javax.swing.JToggleButton speakerBtn;
    private javax.swing.JLabel spellCheck;
    private javax.swing.JLabel subtitle;
    private javax.swing.JLabel title;
    private javax.swing.JLabel whiteBackground;
    // End of variables declaration//GEN-END:variables
    private int mouseX;
    private int mouseY;

    private void updateSentence() {
        Phrase myPhrase = new Phrase(sentenceList);
        RandomSentence = myPhrase.randomSentence();
        sentence = "<html><div style='text-align: center;'><span style='color: black;'>\"</span><span style='color: rgb(157,157,157);'>" + RandomSentence + "</span><span style='color: black;'>\"</span></div></html>";
        sentenceLabel.setText(sentence);
    }     
    
    
    
}
