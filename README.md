# Say it | Improve your speaking skills🗣️
Welcome to Say it, an innovative desktop application designed to enhance your English speaking skills. Whether you're a language learner looking to gain confidence or someone who can understand English but struggles with spoken fluency, "Say it" is your go-to tool. With a simple yet effective interface, this app is all about turning your understanding of English into the ability to speak fluently and confidently.

## Table of Contents
_________________
* [Overview](#overview)
* [Features](#features)
* [How It Works](#how)
* [Technologies Used](#tech)
* [Java Classes](#java)
* [Screenshots](#screenshots)
* [Installation](#installation)
* [Usage](#usage)
* [Future Enhancements](#future)
* [Contributing](#contributing)
* [Contact](#contact)
_________________
<a name="overview"/>

## Overview
"Say it" is designed with the primary goal of improving your spoken English. While it indirectly supports vocabulary enhancement, the main focus is on helping users practice and perfect their pronunciation and fluency in a safe, structured environment. The app uses a combination of random phrase generation, text-to-speech (TTS), and voice recognition to create a dynamic practice experience.

<a name="features"/>

## Features
### 🎯 Targeted Phrase Generation
Choose from five diverse categories—Entertainment, Travel and Places, Food and Drink, Daily Life, and Jobs and Careers. Each category contains a wide array of phrases tailored to real-life scenarios, helping you practice speaking in contexts that matter.

### 🔊 Text-to-Speech (TTS) Integration
Listen to the generated phrase by clicking the speaker button. The current TTS system uses an open-source library that provides clear and accurate pronunciation, though we’re actively working on upgrading it for even better performance.

### 🎤 Voice Recognition with Sphinx
Click the audio button to start the voice recognition process. We’ve integrated the Sphinx library, known for its precise command recognition capabilities. While Sphinx excels in specific scenarios, it requires users to pronounce phrases correctly for optimal results—adding an extra layer of challenge and learning.

### 🧠 Levenshtein Distance for Accuracy Assessment
To ensure that you're saying the phrases correctly, "Say it" uses the Levenshtein distance algorithm. This string metric measures the difference between your spoken input and the generated phrase, calculating how many single-character edits (insertions, deletions, substitutions) are needed to match the two sequences. The app then provides immediate feedback—either "Success" or "Wrong"—based on the accuracy of your pronunciation.

### 💬 Real-time Feedback
Receive instant feedback on your pronunciation accuracy.

### 🚀 Open Source and Extensible
"Say it" is an open-source project, meaning it's designed to grow and evolve with contributions from developers like you. We're excited to see what the community can build upon this foundation.
_________________
<a name="how"/>

## How It Works
* **Choose a Category:** Upon launching the app, select a category that interests you. Each category is packed with relevant phrases.

* **Generate a Phrase:** Once you’ve selected your category, click the "Generate Phrase" button to see a new phrase. This phrase will be your speaking challenge.

* **Listen to the Phrase:** Unsure how to pronounce the phrase? No worries! Click the speaker button to hear the phrase spoken aloud. The TTS system reads it out clearly for you to mimic.

* **Speak the Phrase:** Ready to give it a shot? Click the audio button to start the voice recognition process. Say the phrase as accurately as possible.

* **Get Instant Feedback:** After you’ve spoken, the app compares your input with the original phrase using the Levenshtein distance algorithm and gives you instant feedback. Did you nail it, or is there room for improvement?
_________________
<a name="tech"/>

## Technologies Used
**Java:** The backbone of the application, all core functionalities are implemented in Java.
**NetBeans:** The Integrated Development Environment (IDE) used for coding and debugging.
**Figma:** Used for creating the initial design and UI mockups.
**Levenshtein Distance Algorithm:** Utilized for evaluating the accuracy of the user's spoken input.
**Sphinx:** An open-source voice recognition library tailored for precise command recognition.
**FreeTTS Library:** Converts text phrases into audible speech.
_________________
<a name="java"/>

## Java Classes
* Phrase: This class is responsible for generating random phrases. It pulls phrases from ArrayLists based on the selected category.
* Score: Implements the algorithm for evaluating the user's spoken phrase against the generated phrase using the Levenshtein distance. This class determines if the user's pronunciation was accurate or if corrections are needed.
* Voice: Handles the voice recognition process using the Sphinx library. It captures the user's spoken input and prepares it for comparison.
* TextTTS: Converts the generated text phrases into speech using the TTS library. While the current implementation serves its purpose, future updates will bring significant improvements in voice quality and naturalness.
_________________
<a name="screenshots"/>

## Screenshots
  ### Home Page
  <img src="https://github.com/user-attachments/assets/ccb89c39-a88e-4e53-8c5a-8994034c90b3">

  ### Phrase Page
 <img src="https://github.com/user-attachments/assets/59dcb9dd-cb6e-47de-b6fe-ca00e2506421">

### Test your mic
<img src="https://github.com/user-attachments/assets/78bca530-a9ee-4dfc-8985-2d86a1a3b210">
_________________
<a name="installation"/>
  
## Installation
### Prerequisites
* Java JDK (version 21 or higher)
* NetBeans IDE (optional, for developers)
* Windows OS (for running the .exe file)

### Steps to Install (for users)
1. Clone the Repository
* **git clone [https://github.com/yourusername/say-it.git](https://github.com/LovisottoSantiago/SayIt)**
2. Navigate to the Project Directory
* **cd say-it**
3. Simply double-click the .exe file included in the release to launch the app.

## **Download**
You can download the latest version of **Say it** from the link below:
[Download Say It!](https://github.com/LovisottoSantiago/SayIt/blob/main/SayIt.exe)
 _________________
<a name="usage"/>

## Usage
* **Daily Practice:** Set aside a few minutes each day to practice your speaking skills. Choose different categories to broaden your vocabulary and context understanding.
* **Test Yourself:** Challenge yourself by attempting to speak without listening to the TTS first. See how well you can perform from memory.
* **Track Progress:** Keep an eye on your success rate. The more you use "Say it," the more you'll notice improvements in your fluency and confidence.
 _________________

## Future Enhancements
### Enhanced TTS Quality
We're actively searching for a more advanced TTS library that offers more natural and human-like speech.

### Additional Categories
New categories will be added to cover a wider range of topics.

### Voice Recognition Improvements
Future updates will aim to make the voice recognition process more flexible, reducing the strictness of phrase matching.
 _________________
<a name="contributing"/>

 ## Contributing
We welcome contributions from the community! Whether it's bug fixes, new features, or suggestions, your input is invaluable. Please follow these steps to contribute:
1. Fork the Repository
2. Create a New Branch
3. Commit Your Changes
4. Push to the Branch
5. Open a Pull Request
We'll review your pull request and get back to you as soon as possible.
 _________________
<a name="contact"/>

 ## Contact
If you have any questions, suggestions, or feedback, feel free to reach out:
* **Email:** santiagolovisotto@gmail.com
 _________________
 
Say it is an evolving project, and we’re thrilled to have you along for the journey. Happy practicing! 🎉





