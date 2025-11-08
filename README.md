#  Java Bank Account Simulation — Exception Handling Project

##  Project Overview

The program allows users to:
- **Deposit** and **withdraw** money from a virtual bank account.
- Handle invalid inputs and insufficient balance situations safely using exceptions.
- Understand how to use **try-catch-finally** blocks and **throw custom exceptions**.

---
##  Concepts Covered

###  1. Compile-Time (Checked) Exceptions
- These are exceptions **checked by the compiler** at compile time.
- You **must handle** them using `try-catch` or declare them using `throws`.
- Example from this project:
  ```java
  class InsufficientBalanceException extends Exception {
      public InsufficientBalanceException(String message) {
          super(message);
      }
  }
-----
  ### 2. Runtime (Unchecked) Exceptions
  - These occur during program execution (not checked by the compiler).
  - They are subclasses of RuntimeException.
  - The compiler doesn’t force you to handle them.
  - Example used in this project:

    ```java
    if (amount <= 0) {
    throw new IllegalArgumentException("Amount must be positive!");
    }

  ----
  Here, IllegalArgumentException is a built-in runtime exception.

#### Common examples of runtime exceptions include:
  - NullPointerException
  - ArrayIndexOutOfBoundsException
  - ArithmeticException
  - NumberFormatException

    ### User-Defined (Custom) Exceptions
    - These are exceptions created by programmers to handle application-specific errors.
    - They usually extend Exception (checked) or RuntimeException (unchecked).
     Example:
 ```java
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
