# ExamSystem 🎓
### A Java-based Exam System with Login Authentication

[cite_start]This project is a simple, desktop-based multiple-choice exam system built using **Java Swing** for the graphical user interface[cite: 1, 12, 162]. It provides a straightforward **login authentication mechanism** and a user-friendly interface for taking an exam. The application is designed to be a clear demonstration of core Java programming concepts, including GUI development, event handling, and basic user authentication logic.

---

## Key Features ✨

* [cite_start]**User Authentication**: The system includes a robust login page with credential validation and a built-in security feature that limits login attempts[cite: 14, 17, 18, 19].
* [cite_start]**Access Control**: After three consecutive failed login attempts, the system locks the user out and requires a restart of the application[cite: 20, 21].
* [cite_start]**Multiple-Choice Exam**: The application presents a series of multiple-choice questions[cite: 15].
* **Score Display**: Upon completion of the exam, the final score is calculated and displayed to the user in an informative popup.
* [cite_start]**Error Handling**: The system provides clear pop-up messages for invalid login attempts and other errors[cite: 18, 19, 20, 21].

---

## Project Structure 📁

The project is organized into logical packages to ensure a clean and maintainable codebase:

* `com.examsystem.auth`: Contains classes related to user authentication, such as the `LoginPage`.
* [cite_start]`com.examsystem.exam`: Manages the exam flow and questions[cite: 15].
* `com.examsystem.ui`: Houses generic UI components and utility classes.

---

## Getting Started 🚀

### Prerequisites

To run this project, you will need:

* [cite_start]A **Java Development Kit (JDK)**, version **21.0.6** or later[cite: 173, 174].
* [cite_start]An Integrated Development Environment (**IDE**) such as **Eclipse**[cite: 1, 162, 195].

### How to Run

1.  **Clone the repository**: Use Git to clone the project to your local machine:
    ```bash
    git clone [https://github.com/shivani-ai-ml/ExamSystem.git](https://github.com/shivani-ai-ml/ExamSystem.git)
    ```
2.  **Open in Eclipse**:
    * [cite_start]Navigate to **File > Open Projects from File System...**[cite: 14].
    * [cite_start]Select the root directory of the cloned `ExamSystem` project[cite: 200, 205].
3.  **Run the application**:
    * [cite_start]Locate the main class, typically in the `com.examsystem` package[cite: 13].
    * Right-click the main class file.
    * [cite_start]Select **Run As > Java Application**[cite: 13].

---

## Screenshots 🖼️

| **Login Page** | **Exam Page** |
| :---: | :---: |
|  |  |
| The main entry point for the application, where users enter their credentials. | The interface for the multiple-choice exam. |
| **Final Score** | **Access Denied** |
|  |  |
| The final score pop-up, displayed after completing the exam. | The error message shown after too many failed login attempts. |

---

## Contributing 🤝

Contributions are welcome! If you find a bug or have an idea for an enhancement, please feel free to open an issue or submit a pull request.
