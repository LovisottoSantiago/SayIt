package Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logic.Phrase;
import Logic.ScoreSystem;
import Logic.TextTTS;
import Logic.Voice;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JRadioButton;

public class HomePage extends javax.swing.JFrame {
    public String sentenceStarter;
    public String sentenceFinisher;
    public TextTTS speaker;
    public int startSelected;   
    public Phrase myPhrase;
    public ArrayList<String> sentenceStarters;
    public ArrayList<String> sentenceFinishers;
    
    public HomePage() {
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
        
        // Add an ActionListener to each radio button
        ActionListener actionListener = (var e) -> {
            // Disable the previously selected button if any
            JRadioButton selectedButton = (JRadioButton) e.getSource();
            for (Component comp : jPanel1.getComponents()) {
                if (comp instanceof JRadioButton && comp != selectedButton) {
                    ((JRadioButton) comp).setEnabled(true);
                }
            }
            // Disable the newly selected button
            selectedButton.setEnabled(false);
            startSelected = selectedButton.hashCode();
       };
        
        entertainmentBtn.addActionListener(actionListener);
        travelBtn.addActionListener(actionListener);
        foodBtn.addActionListener(actionListener);
        dailyBtn.addActionListener(actionListener);
        jobsBtn.addActionListener(actionListener);
        
        
        // <! ------------------------------------ ARRAYLISTS ------------------------------------ !/>   
        // <! ------------ Entertainment  ------------ !/>    
        ArrayList<String> startersTest = new ArrayList<>(Arrays.asList(
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
        ArrayList<String> finishersTest = new ArrayList<>(Arrays.asList(
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
        
        // <! ------------ Travel and places  ------------ !/>   
        
        
        // <! ------------ Food & Drink ------------ !/>   
        
        
        // <! ------------ Daily life ------------ !/>   
        
        
        // <! ------------ Jobs and career  ------------ !/>   
        
        sentenceStarters = startersTest;
        sentenceFinishers = finishersTest;

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        topicGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        exitBtn = new javax.swing.JButton();
        entertainmentBtn = new javax.swing.JRadioButton();
        travelBtn = new javax.swing.JRadioButton();
        foodBtn = new javax.swing.JRadioButton();
        dailyBtn = new javax.swing.JRadioButton();
        jobsBtn = new javax.swing.JRadioButton();
        buttonsBG = new javax.swing.JLabel();
        startBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        startBg = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Say it! Phrase Test");
        setMinimumSize(new java.awt.Dimension(600, 420));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 420));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 420));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        topicGroup.add(entertainmentBtn);
        entertainmentBtn.setToolTipText("entertainment");
        entertainmentBtn.setBorder(null);
        entertainmentBtn.setContentAreaFilled(false);
        entertainmentBtn.setFocusPainted(false);
        entertainmentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/Entertainment.png"))); // NOI18N
        entertainmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entertainmentBtnActionPerformed(evt);
            }
        });
        jPanel1.add(entertainmentBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 117, 210, 50));

        topicGroup.add(travelBtn);
        travelBtn.setToolTipText("");
        travelBtn.setBorder(null);
        travelBtn.setContentAreaFilled(false);
        travelBtn.setFocusPainted(false);
        travelBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/TravelAndPlaces.png"))); // NOI18N
        travelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                travelBtnActionPerformed(evt);
            }
        });
        jPanel1.add(travelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 167, 210, 50));

        topicGroup.add(foodBtn);
        foodBtn.setToolTipText("food");
        foodBtn.setBorder(null);
        foodBtn.setContentAreaFilled(false);
        foodBtn.setFocusPainted(false);
        foodBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/FoodAndDrink.png"))); // NOI18N
        foodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                foodBtnActionPerformed(evt);
            }
        });
        jPanel1.add(foodBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 217, 210, 50));

        topicGroup.add(dailyBtn);
        dailyBtn.setToolTipText("daily");
        dailyBtn.setBorder(null);
        dailyBtn.setContentAreaFilled(false);
        dailyBtn.setFocusPainted(false);
        dailyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/DailyLife.png"))); // NOI18N
        dailyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(dailyBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 267, 210, 50));

        topicGroup.add(jobsBtn);
        jobsBtn.setToolTipText("jobs");
        jobsBtn.setBorder(null);
        jobsBtn.setContentAreaFilled(false);
        jobsBtn.setFocusPainted(false);
        jobsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/JobsAndCarrers.png"))); // NOI18N
        jobsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jobsBtnActionPerformed(evt);
            }
        });
        jPanel1.add(jobsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 317, 210, 50));

        buttonsBG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/whiteBackground.png"))); // NOI18N
        jPanel1.add(buttonsBG, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 97, 260, 290));

        startBtn.setBackground(new java.awt.Color(255, 255, 255));
        startBtn.setForeground(new java.awt.Color(255, 255, 255));
        startBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/startBtn.png"))); // NOI18N
        startBtn.setBorder(null);
        startBtn.setBorderPainted(false);
        startBtn.setContentAreaFilled(false);
        startBtn.setDefaultCapable(false);
        startBtn.setFocusPainted(false);
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        jPanel1.add(startBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(369, 317, 154, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 127, 80, 80));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Say it!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 228, 200, 19));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/title.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 145, 75));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("start improving!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 190, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Choose the topic and");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 257, 190, -1));

        startBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/startBg.png"))); // NOI18N
        jPanel1.add(startBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 97, 210, 290));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/background.png"))); // NOI18N
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

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitBtnActionPerformed

    private void entertainmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entertainmentBtnActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_entertainmentBtnActionPerformed

    private void travelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_travelBtnActionPerformed

    }//GEN-LAST:event_travelBtnActionPerformed

    private void foodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_foodBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_foodBtnActionPerformed

    private void dailyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailyBtnActionPerformed

    private void jobsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jobsBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jobsBtnActionPerformed

    
    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        //System.out.println(startSelected);
        PhrasePage phrasePage = new PhrasePage(sentenceStarters, sentenceFinishers);
        phrasePage.setVisible(true);
        phrasePage.setLocationRelativeTo(null);
    }//GEN-LAST:event_startBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel buttonsBG;
    private javax.swing.JRadioButton dailyBtn;
    private javax.swing.JRadioButton entertainmentBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JRadioButton foodBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jobsBtn;
    private javax.swing.JLabel startBg;
    private javax.swing.JButton startBtn;
    private javax.swing.ButtonGroup topicGroup;
    private javax.swing.JRadioButton travelBtn;
    // End of variables declaration//GEN-END:variables
    private int mouseX;
    private int mouseY;



}
