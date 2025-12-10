# 🔁 Palindrome Number Checker (Java)

This Java program checks whether a given integer is a **palindrome**.
A palindrome number is a number that reads the same forward and backward—such as **121**, **1221**, or **4554**.

The program takes a number from the user, reverses it digit by digit, and compares it with the original number.

---

## 📌 Features

* Accepts an integer input from the user
* Reverses the number using a `while` loop
* Compares original and reversed values
* Displays whether the number **is** or **is not** a palindrome
* Beginner-friendly logic and clear steps

---

## 🛠️ Technologies Used

* **Java**
* `Scanner` class for user input
* `while` loop and modulus operations for reversing digits

---

## 🚀 How to Run the Program

1. Save the file as `PalindromeChecker.java` (or use your class name).

2. Make sure Java JDK 8+ is installed.

3. Open a terminal and navigate to the file location.

4. Compile the program:

   ```bash
   javac PalindromeChecker.java
   ```

5. Run the program:

   ```bash
   java PalindromeChecker
   ```

---

## 📂 Program Logic

1. User enters a number.
2. Store the number in a temporary variable (`userNumber`).
3. Reverse the number using:

   ```java
   extractnum = num % 10;     // get last digit  
   reversednum = reversednum * 10 + extractnum;  
   num = num / 10;            // remove last digit  
   ```
4. After reversing, compare:

   * If `userNumber == reversednum` → **Palindrome**
   * Else → **Not a palindrome**

---

## 🧾 Example Output

```
Please enter numbers to reverse
121
The reversed number is: 121
The number is Palindrome: 121
```

Another example:

```
Please enter numbers to reverse
987
The reversed number is: 789
The number is not Palindrome: 789
```

---

## 🔧 Code Snippet

```java
while (num != 0) {
    int extractnum = num % 10;
    reversednum = reversednum * 10 + extractnum;
    num = num / 10;
}

if (userNumber == reversednum) {
    System.out.println("The number is Palindrome: " + userNumber);
} else {
    System.out.println("The number is not Palindrome: " + reversednum);
}
```

---

## 📘 Notes

* Only works for **positive integers** in this version.
* Can be extended to:

  * Handle negative numbers
  * Check palindrome strings (e.g., "madam")
  * Handle long input values
  * Validate non-numeric input

---

## 📜 License

Free to use for learning and practice.

Just tell me!

