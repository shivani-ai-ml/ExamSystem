# ExamSystem 🎓
### A Java-based Exam System with Login Authentication

This project is a desktop-based, multiple-choice exam system built using **Java Swing** for the graphical user interface. The application includes a straightforward **login authentication mechanism** and a user-friendly interface for taking an exam. It serves as a great example of core Java concepts, including GUI development, event handling, and basic user authentication logic.

---

## Key Features ✨

* [cite_start]**User Authentication**: The system provides a login page with credential validation and limits login attempts to enhance security[cite: 17, 18, 19, 20].
* [cite_start]**Access Control**: After three consecutive failed login attempts, the application blocks access, requiring a restart[cite: 20, 21].
* [cite_start]**Multiple-Choice Exam**: The application presents a series of multiple-choice questions[cite: 15].
* **Score Display**: Upon completion of the exam, the final score is calculated and displayed in an informative popup.
* [cite_start]**Error Handling**: Clear popup messages are provided for invalid inputs and errors[cite: 18, 19, 20].

---

## Project Structure 📁

The project is organized into logical packages to maintain a clean codebase:

* [cite_start]`com.examsystem.auth`: Contains classes for user authentication, such as the `LoginPage`[cite: 14, 17].
* [cite_start]`com.examsystem.exam`: Manages the exam flow and questions[cite: 15].
* `com.examsystem.ui`: Houses generic UI components.

---

## Getting Started 🚀

### Prerequisites

To run this project, you will need:

* [cite_start]A **Java Development Kit (JDK)**, version **21.0.6** or later[cite: 173].
* [cite_start]An Integrated Development Environment (**IDE**) such as **Eclipse**[cite: 162, 195].

### How to Run

1.  **Clone the repository**: Use Git to clone the project to your local machine:
    ```bash
    git clone [https://github.com/shivani-ai-ml/ExamSystem.git](https://github.com/shivani-ai-ml/ExamSystem.git)
    ```
2.  **Open in Eclipse**:
    * [cite_start]Navigate to **File > Open Projects from File System...**[cite: 14, 113].
    * [cite_start]Select the root directory of the cloned `ExamSystem` project[cite: 112].
3.  **Run the application**:
    * [cite_start]Locate the main class, typically in the `com.examsystem` package[cite: 13].
    * Right-click the main class file.
    * [cite_start]Select **Run As > Java Application**[cite: 13, 277].

---

## Screenshots 🖼️

| **Login Page** | **Exam Page** |
| :---: | :---: |
| ![Login Page](https://github.com/user-attachments/assets/04c1b25a-d74d-49f1-9ee2-470ff2c4323e) | ![Exam Page](https://github.com/user-attachments/assets/89079f02-7a3b-44f7-8afd-296db71a0a6e) |
| [cite_start]The main entry point where users enter their credentials[cite: 14, 17]. | [cite_start]The interface for the multiple-choice exam[cite: 15]. |
| **Final Score** | **Access Denied** |
| ![Final Score](https://github.com/user-attachments/assets/9182589d-3452-4051-9b1e-9fd8845dd4b8) | ![Access Denied](https://github.com/user-attachments/assets/705dbb4e-013c-4a46-b6fe-b24fc8768009) |
| The final score popup, displayed after completing the exam. | [cite_start]The error message shown after too many failed login attempts[cite: 21]. |

---

## Contributing 🤝

Contributions are welcome! If you find a bug or have an idea for an enhancement, please feel free to open an issue or submit a pull request.
