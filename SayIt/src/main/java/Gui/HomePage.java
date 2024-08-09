package Gui;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Logic.Phrase;
import Logic.ScoreSystem;
import Logic.TextTTS;
import Logic.Voice;
import java.awt.Component;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class HomePage extends javax.swing.JFrame {
    public TextTTS speaker;
    public String startSelected;   
    public Phrase myPhrase;
    public ArrayList<String> sentenceList;
    
    
    
         // <! ------------------------------------ ARRAYLISTS ------------------------------------ !/>   
        // <! ------------ Entertainment  ------------ !/>    
        private final ArrayList<String> entertainmentPhrases = new ArrayList<>(Arrays.asList(
            "Have you seen the latest movie?",
            "What is your favorite TV show?",
            "Do you listen to rock music?",
            "Can you recommend a good book?",
            "Who is your favorite actor?",
            "Let's watch a movie this weekend.",
            "Did you like the recent concert?",
            "What kind of books do you read?",
            "Are you into playing video games?",
            "Have you been to a theater show?",
            "What's your favorite song right now?",
            "Do you enjoy watching documentaries?",
            "Can you name a classic film?",
            "Who is your favorite musician?",
            "Let's go to a comedy club.",
            "Do you play any musical instruments?",
            "What is your favorite movie genre?",
            "Have you read any good novels?",
            "Do you like superhero movies?",
            "What's the best concert you've attended?",
            "Who is your favorite director?",
            "Do you enjoy animated films?",
            "What video games do you play?",
            "Have you watched any new shows?",
            "Do you like going to the cinema?",
            "What's your favorite book series?",
            "Can you recommend a TV series?",
            "Do you follow any YouTube channels?",
            "What's the best movie you've seen?",
            "Do you enjoy reading fiction books?",
            "Who is your favorite comedian?",
            "Do you like listening to podcasts?",
            "What's your favorite movie quote?",
            "Do you enjoy watching live sports?",
            "What's the last book you read?",
            "Do you like classical music concerts?",
            "What's your favorite movie soundtrack?",
            "Have you been to a music festival?",
            "Do you watch any reality TV?",
            "What's the best TV show ever?",
            "Do you read graphic novels or comics?",
            "What's your favorite video game series?",
            "Do you enjoy watching stand-up comedy?",
            "What's the last movie you watched?",
            "Do you like fantasy or sci-fi books?",
            "What's your favorite song to sing?",
            "Do you follow celebrity news or gossip?",
            "What's the best book you've read?",
            "Do you enjoy playing board games?",
            "What's your favorite movie from childhood?",
            "Do you like romantic comedies?",
            "What's the last concert you went to?",
            "Do you watch movies in other languages?",
            "What's your favorite TV show theme song?",
            "Do you enjoy listening to live music?",
            "What's your favorite book to recommend?",
            "Do you like thriller or mystery novels?",
            "What's your favorite movie snack?",
            "Do you follow any sports teams?",
            "What's the best live performance you've seen?",
            "Do you enjoy watching musicals?",
            "What's your favorite video game character?",
            "Do you like reading biographies?",
            "What's your favorite music album?",
            "Do you enjoy attending film festivals?",
            "What's your favorite scene in a movie?",
            "Do you like horror movies?",
            "What's the best play you've seen?",
            "Do you enjoy karaoke nights?",
            "What's your favorite author's latest book?",
            "Do you like streaming services for movies?",
            "What's your favorite live-action show?",
            "Do you follow any TV series closely?",
            "What's the best book-to-movie adaptation?",
            "Do you enjoy classical or jazz music?",
            "What's your favorite quote from a book?",
            "Do you watch any cooking shows?",
            "What's your favorite holiday movie?",
            "Do you like documentaries or mockumentaries?",
            "What's the best video game you've played?",
            "Do you enjoy live theater performances?",
            "What's your favorite animated TV show?",
            "Do you like listening to audiobooks?",
            "What's the best stand-up comedy special?",
            "Do you follow any celebrity podcasts?",
            "What's your favorite movie trilogy?",
            "Do you enjoy binge-watching TV series?",
            "What's your favorite TV show from childhood?",
            "Do you like listening to indie music?",
            "What's your favorite game to play online?",
            "Do you enjoy watching award shows?",
            "What's the best live show you've seen?",
            "Do you follow any streaming platforms?",
            "What's your favorite holiday tradition?",
            "Do you like crime or detective shows?",
            "What's the best video game soundtrack?",
            "Do you enjoy reading fantasy novels?",
            "What's your favorite late-night talk show?",
            "Do you like watching game shows?"
        ));
        
         // <! ------------ Travel and places  ------------ !/>   
         private final ArrayList<String> travelPhrases = new ArrayList<>(Arrays.asList(
            "Where is the nearest hotel?",
            "I would like to book a table.",
            "How much does this cost?",
            "Can you help me find a taxi?",
            "I need directions to the airport.",
            "Is breakfast included with the room?",
            "Can I get the bill, please?",
            "Do you have a vegetarian menu?",
            "What time does the last train leave?",
            "Where can I buy a ticket?",
            "Can you recommend a good restaurant?",
            "I would like a room with a view.",
            "Is there a pharmacy nearby?",
            "How do I get to the museum?",
            "I need a wake-up call at 7 AM.",
            "Do you have a map of the city?",
            "Can you show me how to use this?",
            "Where is the nearest ATM?",
            "I’d like to order room service.",
            "How far is the beach from here?",
            "Can you help me with my luggage?",
            "Where can I rent a car?",
            "What is the Wi-Fi password?",
            "Is there a laundry service available?",
            "Can I have a taxi to the airport?",
            "Where is the nearest grocery store?",
            "Do you have any local tours available?",
            "How can I get to the nearest hospital?",
            "Where is the best place to shop?",
            "I need a reservation for two people.",
            "Can I get directions to the nearest bank?",
            "What time does the museum close?",
            "Is there a bus that goes to downtown?",
            "I need a wake-up call at 6 AM.",
            "Where is the closest coffee shop?",
            "Can you recommend a local guide?",
            "What is the best way to get around?",
            "How can I get to the train station?",
            "Do you offer airport shuttle services?",
            "Where can I buy souvenirs?",
            "Can you call a cab for me?",
            "What is the address of this place?",
            "Are there any good nearby attractions?",
            "How much is a one-way ticket?",
            "Where can I find a good place to eat?",
            "Do you have a phone charger I can borrow?",
            "Can I pay with a credit card?",
            "What time does the bus arrive?"
        ));
        
        // <! ------------ Food & Drink ------------ !/>           
        private final ArrayList<String> foodPhrases = new ArrayList<>(Arrays.asList(
            "Can I see the menu, please?",
            "I’d like to order a coffee.",
            "What are today’s specials?",
            "Does this dish contain nuts?",
            "Can I get the bill, please?",
            "Do you have any vegetarian options?",
            "Can I have a glass of water?",
            "Could you recommend a wine?",
            "Is this dish spicy?",
            "I’m allergic to shellfish.",
            "Can I get this to go?",
            "Do you offer gluten-free options?",
            "What’s in this salad?",
            "Can we sit by the window?",
            "Can I have the check, please?",
            "Do you have a children’s menu?",
            "How long is the wait?",
            "Do you serve breakfast all day?",
            "Can I get extra napkins?",
            "Is this dish dairy-free?",
            "Could you bring more bread?",
            "Can I get a refill, please?",
            "Do you have any low-fat options?",
            "Can I see the wine list?",
            "Is this meal made from scratch?",
            "Do you have any non-alcoholic drinks?",
            "Can I substitute the fries for a salad?",
            "What is today’s soup?",
            "Can you make it less salty?",
            "Do you offer any dessert options?",
            "Can I have a side of vegetables?",
            "Is this steak cooked well done?",
            "Can I get a different side dish?",
            "Do you have any local specialties?",
            "Can I have the dressing on the side?",
            "What’s the soup of the day?",
            "Can I get this with no onions?",
            "Do you have any vegan options?",
            "Can you make it less spicy?",
            "Is the fish fresh today?",
            "Can I get a to-go box?",
            "Is this dish served hot?",
            "Do you have any sugar-free desserts?",
            "Can I get a table for two?",
            "What’s the best dish here?",
            "Do you offer any drink specials?",
            "Can you split the bill, please?",
            "Can I have the sauce on the side?",
            "Are there any daily specials today?",
            "Can I get extra cheese on this?",
            "Is there a waiting list for tables?"
        ));
        
        // <! ------------ Daily life ------------ !/>   
        private final ArrayList<String> dailyStarters = new ArrayList<>(Arrays.asList(
            "Can I use this machine?",
            "What time does the class start?",
            "Hello, how are you today?",
            "May I use your phone?",
            "How much does this cost?",
            "Do you have any recommendations?",
            "I need to complete this form",
            "Where is the nearest gym?",
            "Is this seat taken?",
            "Can I borrow a pen?",
            "Where is the bathroom?",
            "Do you accept credit cards?",
            "How do I get to the station?",
            "I need help with this assignment",
            "Can I have the bill, please?",
            "Is this item on sale?",
            "What’s your name?",
            "Could you please repeat that?",
            "When does the next bus arrive?",
            "Where can I find the library?",
            "Can I have a glass of water?",
            "How long is the wait time?",
            "Can you help me find this address?",
            "Do you have a map of the city?",
            "How do I fill out this form?",
            "What is the Wi-Fi password?",
            "Can I get a refund for this?",
            "Where is the nearest restaurant?",
            "Can I see the menu, please?",
            "Is there a discount for students?",
            "When does the store close?",
            "How do I make an appointment?",
            "Can I pay with cash?",
            "Is there a fee for this service?",
            "Where is the nearest ATM?",
            "Can I try this on?",
            "Do you have any vegetarian options?",
            "Can I get a doggy bag?",
            "How much is the entry fee?",
            "Can you recommend a good place?",
            "Where is the lost and found?",
            "What time does the movie start?",
            "Can I speak to the manager?",
            "Do you have any allergy-free products?",
            "How do I use this machine?",
            "Can I have a receipt, please?",
            "Is it safe to walk around here?", // y de Florencio Varela, es el Noba y te resuena
            "Where can I buy tickets?",
            "Can I get a ride to the airport?"
         ));
        
        // <! ------------ Jobs and career  ------------ !/>   
        private final ArrayList<String> jobsStarters = new ArrayList<>(Arrays.asList(
            "What are your main responsibilities here?",
            "Can you describe the company culture?",
            "What skills are needed for this role?",
            "How do you measure success in this position?",
            "Could you explain this assignment further?",
            "When is the deadline for this project?",
            "What are the course requirements?",
            "How often do performance reviews occur?",
            "What are the opportunities for advancement?",
            "What training or development programs are available?",
            "How does the team handle conflicts?",
            "Can you describe a typical workday here?",
            "What goals are expected for this role?",
            "What is the company's approach to work-life balance?",
            "Are there any specific projects you’re working on?",
            "How do you prioritize tasks and projects?",
            "What resources are available for career growth?",
            "What is the typical career path in this role?",
            "Can you give an example of a recent challenge?",
            "How do you stay updated with industry trends?",
            "What are the key qualities for success here?",
            "What are the most common reasons for promotion?",
            "How is feedback typically given in this role?",
            "What tools or software will I be using?",
            "How does this role fit within the company?",
            "Can you describe the team structure?",
            "What are the main goals for this position?",
            "What support is provided for professional development?",
            "What is the onboarding process like?",
            "Can you provide examples of career growth?",
            "What are the expectations for this role?",
            "How does the company handle career transitions?",
            "What are the current major projects or initiatives?",
            "What is the management style like here?",
            "Are there opportunities for cross-departmental work?",
            "What are the most rewarding aspects of this role?",
            "How does the company support work-life balance?",
            "What types of professional development are encouraged?",
            "How does the company measure employee performance?",
            "Can you describe the work environment here?",
            "What challenges might I face in this role?",
            "What are the typical career paths in this field?",
            "How do you ensure effective communication in the team?",
            "What is the company’s approach to mentoring?",
            "What is the most important skill for this position?",
            "How does the company handle employee feedback?",
            "What are the current priorities for this department?",
            "How does the role contribute to company goals?",
            "Can you describe the company’s mission and values?",
            "What are the common career trajectories here?",
            "How often do team meetings take place?",
            "What is the company’s policy on remote work?",
            "How does the company support academic pursuits?",
            "What are the key performance indicators for this role?",
            "How does the team collaborate on projects?",
            "What kind of support is available for new hires?"
        ));
        
        
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
            startSelected = selectedButton.getToolTipText();
            //System.out.println(startSelected);

       };
        
        entertainmentBtn.addActionListener(actionListener);
        travelBtn.addActionListener(actionListener);
        foodBtn.addActionListener(actionListener);
        dailyBtn.addActionListener(actionListener);
        jobsBtn.addActionListener(actionListener);
        
                
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
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        arrow = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoBtn = new javax.swing.JButton();
        helpBtn = new javax.swing.JButton();
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
        exitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/closeBtn.png"))); // NOI18N
        exitBtn.setBorder(null);
        exitBtn.setBorderPainted(false);
        exitBtn.setContentAreaFilled(false);
        exitBtn.setFocusPainted(false);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(exitBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(563, 10, 25, 25));

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
        travelBtn.setToolTipText("travel");
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
        jPanel1.add(startBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 307, 210, 35));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Poppins", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Welcome to Say it!");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 231, 200, 19));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/title.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 5, 560, 60));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("start improving!");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 275, 190, 20));

        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/arrow.png"))); // NOI18N
        jPanel1.add(arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Poppins SemiBold", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Select a topic and");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 255, 190, 20));

        logoBtn.setBackground(new java.awt.Color(255, 255, 255));
        logoBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/HomePage/Logo.png"))); // NOI18N
        logoBtn.setBorder(null);
        logoBtn.setBorderPainted(false);
        logoBtn.setContentAreaFilled(false);
        logoBtn.setDefaultCapable(false);
        logoBtn.setFocusPainted(false);
        logoBtn.setFocusable(false);
        logoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 117, 104, 100));

        helpBtn.setBackground(new java.awt.Color(255, 255, 255));
        helpBtn.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        helpBtn.setForeground(new java.awt.Color(51, 153, 255));
        helpBtn.setText("need help?");
        helpBtn.setBorder(null);
        helpBtn.setBorderPainted(false);
        helpBtn.setContentAreaFilled(false);
        helpBtn.setDefaultCapable(false);
        helpBtn.setFocusPainted(false);
        helpBtn.setFocusable(false);
        helpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                helpBtnActionPerformed(evt);
            }
        });
        jPanel1.add(helpBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 349, 100, -1));

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
        System.exit(0);
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
        // Update sentenceStarters and sentenceFinishers based on the selected button
        switch (startSelected) {
            case "entertainment" -> {
                openPhrasePage(entertainmentPhrases);
                score = scoreChosen(20);               
            }
            case "travel" -> {
                sentenceList = travelPhrases;
                openPhrasePage(sentenceList);
                score = scoreChosen(17);    
            }
            case "food" -> {
                sentenceList = foodPhrases;
                openPhrasePage(sentenceList);
                score = scoreChosen(17);    
            }
            case "daily" -> {
                sentenceList = dailyStarters;
                openPhrasePage(sentenceList);
                score = scoreChosen(14);    
            }
            case "jobs" -> {
                sentenceList = jobsStarters;
                openPhrasePage(sentenceList);
                score = scoreChosen(17);    
            }
            case null -> {
                sentenceList = travelPhrases;
                openPhrasePage(sentenceList);
                score = scoreChosen(17);    
            }      
            default -> {
                System.out.println("No class selected");
                score = scoreChosen(20);    
            }                
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void helpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_helpBtnActionPerformed
        helpBtn.setEnabled(false);        
        try {
                String url = "https://github.com/LovisottoSantiago/SayIt";
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            } catch (java.io.IOException e) {
                System.out.println(e.getMessage());
            }
            new Thread(() -> {
            try {
                // Delay for 3 seconds (5000 milliseconds)
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            // Enable the button on the Event Dispatch Thread
            SwingUtilities.invokeLater(() -> logoBtn.setEnabled(true));
        }).start();            
    }//GEN-LAST:event_helpBtnActionPerformed

    private void logoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoBtnActionPerformed
        logoBtn.setEnabled(false);    
        try {
                String url = "https://github.com/LovisottoSantiago";
                java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            } catch (java.io.IOException e) {
                System.out.println(e.getMessage());
            }
                new Thread(() -> {
            try {
                // Delay for 3 seconds (5000 milliseconds)
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            }
            // Enable the button on the Event Dispatch Thread
            SwingUtilities.invokeLater(() -> logoBtn.setEnabled(true));
        }).start();
    }//GEN-LAST:event_logoBtnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel arrow;
    private javax.swing.JLabel background;
    private javax.swing.JLabel buttonsBG;
    private javax.swing.JRadioButton dailyBtn;
    private javax.swing.JRadioButton entertainmentBtn;
    private javax.swing.JButton exitBtn;
    private javax.swing.JRadioButton foodBtn;
    private javax.swing.JButton helpBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jobsBtn;
    private javax.swing.JButton logoBtn;
    private javax.swing.JLabel startBg;
    private javax.swing.JButton startBtn;
    private javax.swing.ButtonGroup topicGroup;
    private javax.swing.JRadioButton travelBtn;
    // End of variables declaration//GEN-END:variables
    private int mouseX;
    private int mouseY;
    
    private ScoreSystem score;

    // Initialize before open method
    private PhrasePage phrasePage; 
    Voice voice1 = new Voice();
    
    public ScoreSystem scoreChosen(int value){
           return new ScoreSystem(value);
       }
    
    public void openPhrasePage(ArrayList<String> sentenceList) {
    // Check if the PhrasePage is already open
       if (phrasePage != null && phrasePage.isVisible()) {
           phrasePage.dispose();  // Dispose of the existing instance
           phrasePage = null;     // Nullify the reference after disposal
       }    
             
       // Create a new instance of PhrasePage
       phrasePage = new PhrasePage(sentenceList, voice1, this, score);
       phrasePage.setVisible(true);
       phrasePage.setLocationRelativeTo(null);
       this.setVisible(false);
    }
    
}
  
