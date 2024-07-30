==**Class User**==
- **Atributes**
	- String username;
	- String id;
	- String password;
- **Methods**
	- String getText();


==**Class Words**==
- **Atributes**
	- String word;
	- ArrayList paragraph;
- **Methods**
	- String showParagraph();
	- String showWords();


==**Class VoiceInput**==
- **Atributes**
	- file audioFIle;
	- String transcribedText;
	- String password;
- **Methods**
	- void captureAudio();
	- void transcribeAudio();
	- String getTranscribedText();


==**Class SpeechRecognizer**==
- **Atributes**
	- SpeechAPI speechAPI;
- **Methods**
	- String transcribe(File audioFile);


==**Class FeedbackGenerator**==
- **Atributes**
	- SpeechAPI speechAPI;
- **Methods**
	- String generateFeedback(File audioFile);
	- int calculateScore();


### Example Sequence of Usage

1. **User Interaction**: The user selects a paragraph to practice.
2. **Voice Input**: The user speaks the paragraph, and their voice is captured as an audio file.
3. **Transcription**: The `SpeechRecognizer` transcribes the audio file into text.
4. **Comparison**: The `FeedbackGenerator` compares the transcribed text with the original paragraph, generates feedback, and calculates a score.
5. **Feedback Display**: The feedback, including missed words and score, is displayed to the user.