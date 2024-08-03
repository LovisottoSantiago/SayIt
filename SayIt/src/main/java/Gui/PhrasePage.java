package Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logic.Phrase;
import Logic.ScoreSystem;
import Logic.TextTTS;
import Logic.Voice;
import java.util.ArrayList;
import java.util.Arrays;

public class PhrasePage extends javax.swing.JFrame {
    public String sentenceStarter;
    public String sentenceFinisher;
    public TextTTS speaker;
    
    public PhrasePage() {
       setUndecorated(true);
        initComponents();
        setSize(600, 420);
        setResizable(false);
        speaker = new TextTTS();

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
            "Stephen King writes", "The Dark Tower rises", "A ghost haunts", 
            "A child discovers", "A writer struggles", "The clown terrifies", 
            "A town secrets", "The monster emerges", "A family unravels", 
            "The hotel beckons", "The wizard casts", "Harry Potter learns", 
            "Hermione studies", "Ron Weasley jokes", "A spell backfires", 
            "The owl delivers", "A potion brews", "The broomstick flies", 
            "Dumbledore advises", "Voldemort plots", "The calculus student solves", 
            "The derivative measures", "The integral calculates", "A function graphs", 
            "A limit approaches", "A sequence converges", "The theorem proves", 
            "An equation balances", "The variable changes", "The curve bends", 
            "Buenos Aires shines", "An Argentine tango", "A gaucho rides", 
            "The pampas stretch", "A football match", "The Andes tower", 
            "A Malbec pours", "The mate circulates", "The asado sizzles", 
            "San Martin studies", "The glacier calms", "A street artist", 
            "The plaza fills", "A train travels", "The wine vineyard", 
            "A mountain trail", "The coastal city", "A river flows", 
            "The Patagonia wilderness"
        ));

        ArrayList<String> sentenceFinishers = new ArrayList<>(Arrays.asList(
            "in a small town.", "in the Overlook Hotel.", "under the bed.", 
            "in the haunted house.", "in Derry, Maine.", "in the eerie woods.", 
            "in the basement.", "on the isolated island.", "in the dark room.", 
            "at the creepy carnival.", "at Hogwarts.", "in the Forbidden Forest.", 
            "in the Potions class.", "in the Gryffindor common room.", "in the Quidditch match.", 
            "in Diagon Alley.", "in the Chamber of Secrets.", "in the Great Hall.", 
            "at Hogsmeade.", "in the Room of Requirement.", "during the exam.", 
            "on the coordinate plane.", "under the curve.", "within the limit.", 
            "in the complex plane.", "on the function's graph.", "within the series.", 
            "under the theorem.", "on the x-axis.", "at the point of inflection.", 
            "in the heart of Buenos Aires.", "on the dance floor.", "across the pampas.", 
            "in the football stadium.", "in the Andes.", "in the vineyard.", 
            "at the asado.", "around the mate circle.", "in the shadow of the glacier.", 
            "in the street market.", "at the Obelisk.", 
            "through the subway.", "on the mountain path.", "along the coast.", 
            "near the river delta.", "in the Patagonian steppe."
        ));
        
        Phrase myPhrase = new Phrase(sentenceStarters, sentenceFinishers);
        sentenceStarter = myPhrase.randomStarter();
        sentenceFinisher = myPhrase.randomFinisher();
                
        String sentence = "<html><div style='text-align: center;'><span style='color: black;'>\"</span><span style='color: rgb(157,157,157);'>" + sentenceStarter + "<br/>" + sentenceFinisher + "</span><span style='color: black;'>\"</span></div></html>";
        sentenceLabel.setText(sentence);
        

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        speakerBtn = new javax.swing.JToggleButton();
        audioBtn = new javax.swing.JToggleButton();
        exitBtn = new javax.swing.JButton();
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

        exitBtn.setFont(new java.awt.Font("Poppins Black", 0, 24)); // NOI18N
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
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 15, 25, 25));

        sentenceLabel.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        sentenceLabel.setForeground(new java.awt.Color(157, 157, 157));
        sentenceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sentenceLabel.setText(" ");
        jPanel1.add(sentenceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 160, 450, -1));

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
              
    }//GEN-LAST:event_backBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    Voice voice = new Voice();
    ScoreSystem score = new ScoreSystem(15);

    private void audioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_audioBtnActionPerformed
                // Disable the button to prevent multiple clicks
        String fullSentence = sentenceStarter + sentenceFinisher;
        audioBtn.setEnabled(false);
        // Create a new thread to handle voice recognition
        new Thread(() -> {
            
            spellCheck.setText("Recording...");
            String recognizedText = voice.recognizeSpeech();

            javax.swing.SwingUtilities.invokeLater(() -> {
                if (recognizedText != null && !recognizedText.isEmpty()) {
                    
                    //Logic to evaluate your answer
                    boolean result = score.returnResult(fullSentence, recognizedText);
                    if (result){
                       spellCheck.setText("SUCCESS!");
                       voice.stop();
                    }
                    else{
                        spellCheck.setText("FALSE!");
                        voice.stop();
                    }
                    
                } else {
                    spellCheck.setText("ERROR");
                }                
                audioBtn.setEnabled(true);
            });
        }).start();
    }//GEN-LAST:event_audioBtnActionPerformed

    private void speakerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_speakerBtnActionPerformed
            // Combine sentenceStarter and sentenceFinisher into a single string
        String phrase = sentenceStarter + sentenceFinisher;

        // Check for non-null and non-empty phrase
        if (phrase != null && !phrase.trim().isEmpty()) {
            // Use a background thread to handle the TTS operation
            new Thread(() -> {
                try {
                    speaker.Talk(phrase);
                } catch (Exception e) {
                    System.err.println("Error during TTS operation: " + e.getMessage());
                }
            }).start();
        } else {
            System.err.println("Phrase is empty or null.");
        }
    }//GEN-LAST:event_speakerBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton audioBtn;
    private javax.swing.JToggleButton backBtn;
    private javax.swing.JLabel background;
    private javax.swing.JButton exitBtn;
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


}
