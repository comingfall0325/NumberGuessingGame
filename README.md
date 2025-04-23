
# Number Guessing Game

A simple console-based Java game where the computer picks a random number, and the player tries to guess it.

## 🕹️ How It Works

- The computer randomly selects a number between **1 and 10**.
- The player has **3 attempts** to guess the correct number.
- After each guess, the game will tell the player if their guess is **too high** or **too low**.
- If the player guesses correctly, the game ends with a victory message.
- If the player fails all 3 attempts, the correct number is revealed.

## 📁 File Structure

```
day7/
└── NumberGuessingGame.java
```

## 🚀 How to Run

1. Make sure you have **Java installed** on your system.
2. Compile the code:

   ```bash
   javac day7/NumberGuessingGame.java
   ```

3. Run the program:

   ```bash
   java day7.NumberGuessingGame
   ```

## 🧠 Example Output

```
Welcome to the Number Guessing Game!
Guess a number from 1 to 10
You have 3 attempts. Good luck!
Attempt1: 
5
Too high
Attempt2: 
2
Too low
Attempt3: 
3
Too low
The random number is: 4
```

## 📌 Notes

- The random number is generated using `Math.random()` and cast to an integer between 0 and 9. You might want to adjust it to properly include 1 to 10 (e.g., add `+1` to the result).
- Great starting point for learning about input, loops, and conditionals in Java.
