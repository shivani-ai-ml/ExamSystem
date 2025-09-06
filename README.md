# ExamSystem 🎓
### A Java-based Exam System with Login Authentication

This project is a desktop-based, multiple-choice exam system built using **Java Swing** for the graphical user interface. The application includes a straightforward **login authentication mechanism** and a user-friendly interface for taking an exam. It serves as a great example of core Java concepts, including GUI development, event handling, and basic user authentication logic.

---

## Key Features ✨

* **User Authentication**: The system provides a login page with credential validation and limits login attempts to enhance security.
* **Access Control**: After three consecutive failed login attempts, the application blocks access, requiring a restart.
* **Multiple-Choice Exam**: The application presents a series of multiple-choice questions.
* **Score Display**: Upon completion of the exam, the final score is calculated and displayed in an informative popup.
* **Error Handling**: Clear popup messages are provided for invalid inputs and errors.

---

## Project Structure 📁

The project is organized into logical packages to maintain a clean codebase:

* `com.examsystem.auth`: Contains classes for user authentication, such as the `LoginPage`.
* `com.examsystem.exam`: Manages the exam flow and questions.
* `com.examsystem.ui`: Houses generic UI components.

---

## Getting Started 🚀

### Prerequisites

To run this project, you will need:

* A **Java Development Kit (JDK)**, version **21.0.6** or later.
* An Integrated Development Environment (**IDE**) such as **Eclipse**.

### ▶️ How to Run  

1. **Clone the repository**  
   ```bash
   git clone https://github.com/shivani-ai-ml/ExamSystem.git
2.  **Open Eclipse IDE**:

   Navigate to **File > Open Projects from File System...**.
 
3. A dialog will appear. Click **Directory…**
    
4. Browse to the folder where you cloned ExamSystem (the folder containing src/ and com/examsystem).

5.   Select it → click Finish..

7.  **Run the application**:

👉 Now the ExamSystem project will appear in the Project Explorer panel on the left.
    
    =>Locate the main class, typically in the `com.examsystem` package.
    Right-click the main class file.
    Select **Run As > Java Application**.

---

## Screenshots 🖼️

| **Login Page** | **Exam Page** |
| :---: | :---: |
| ![Login Page](https://github.com/user-attachments/assets/04c1b25a-d74d-49f1-9ee2-470ff2c4323e) | ![Exam Page](https://github.com/user-attachments/assets/89079f02-7a3b-44f7-8afd-296db71a0a6e) |
| The main entry point where users enter their credentials. | The interface for the multiple-choice exam. |
| **Final Score** | **Access Denied** |
| ![Final Score](https://github.com/user-attachments/assets/9182589d-3452-4051-9b1e-9fd8845dd4b8) | ![Access Denied](https://github.com/user-attachments/assets/705dbb4e-013c-4a46-b6fe-b24fc8768009) |
| The final score popup, displayed after completing the exam. | The error message shown after too many failed login attempts. |
