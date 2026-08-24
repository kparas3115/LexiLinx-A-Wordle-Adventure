# 🔤 LexiLinx: A Wordle Adventure

**Guess smart. Think fast. Crack the word.**

LexiLinx is a Java-based word-guessing game inspired by the classic Wordle format. Players race against a limited number of attempts to uncover a hidden word, using logic, vocabulary, and deduction to narrow down the possibilities with every guess.

![Language](https://img.shields.io/badge/language-Java-orange?style=flat-square&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/status-active-brightgreen?style=flat-square)
![License](https://img.shields.io/badge/license-MIT-blue?style=flat-square)

---

## 📖 Table of Contents

1. [About the Game](#-about-the-game)
2. [How to Play](#-how-to-play)
3. [Features](#-features)
4. [Tech Stack](#-tech-stack)
5. [Project Structure](#-project-structure)
6. [Installation](#-installation)
7. [Usage](#-usage)
8. [Contributing](#-contributing)
9. [License](#-license)

---

## 🎮 About the Game

LexiLinx challenges players to decipher a secret word by guessing its letters in the correct order and position. With each attempt, feedback reveals how close the guess is — helping players narrow down the answer before they run out of tries.

---

## 🧩 How to Play

1. Enter a valid word as your guess.
2. After each guess, feedback is shown for every letter:
   - 🟩 **Green** — correct letter, correct position
   - 🟨 **Yellow** — correct letter, wrong position
   - ⬜ **Gray** — letter not in the word
3. Use the feedback to refine your next guess.
4. Solve the word within the allotted number of attempts to win!

---

## ✨ Features

- 🎯 Randomized secret word selection each round
- 🔁 Limited-attempt gameplay for high-stakes guessing
- 🎨 Letter-by-letter feedback for intuitive play
- 📊 Score and attempt tracking
- 🧠 Built-in word validation against a dictionary word list
- 💻 Lightweight, console-based interface (Java Swing/GUI-ready)

---

## 🛠️ Tech Stack

| Category | Technology |
|---|---|
| Language | Java |
| Build Tool | Maven / Gradle *(update to match your setup)* |
| Interface | Java Console / Swing |
| Data | Local word list (`.txt` / `.json`) |

---

## 📂 Project Structure

```
LexiLinx-A-Wordle-Adventure/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── Main.java
│   │   │   ├── Game.java
│   │   │   ├── WordValidator.java
│   │   │   └── FeedbackEngine.java
│   │   └── resources/
│   │       └── words.txt
│   └── test/
│       └── java/
│           └── GameTest.java
│
├── pom.xml
└── README.md
```

---

## 🚀 Installation

Clone the repository:

```bash
git clone https://github.com/<your-username>/LexiLinx-A-Wordle-Adventure.git
cd LexiLinx-A-Wordle-Adventure
```

**Using Maven:**

```bash
mvn clean install
```

**Using Gradle:**

```bash
gradle build
```

**Or compile directly with javac:**

```bash
javac -d bin src/main/java/*.java
```

---

## 📋 Usage

**Run with Maven:**

```bash
mvn exec:java -Dexec.mainClass="Main"
```

**Run with Gradle:**

```bash
gradle run
```

**Run compiled classes directly:**

```bash
java -cp bin Main
```

| Step | Action |
|---|---|
| 1 | Launch the game from your terminal or IDE |
| 2 | Enter your first guess when prompted |
| 3 | Review the letter-by-letter feedback |
| 4 | Refine your next guess using the clues |
| 5 | Solve the word before you run out of attempts |

---

## 🤝 Contributing

Contributions are welcome and appreciated!

1. Fork the repository
2. Create a new branch for your feature or bug fix
3. Make your changes and submit a pull request
4. Ensure your code compiles cleanly and follows the project's coding conventions

---

## 📄 License

This project is licensed under the [MIT License](LICENSE). You are free to use, modify, and distribute this software as long as you include the original copyright notice and disclaimers. See the [LICENSE](LICENSE) file for full details.

---

⭐ Enjoyed the game? Consider starring the repository!
