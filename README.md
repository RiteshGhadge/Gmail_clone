📧 Gmail Clone Application
A Java Swing-based Gmail Clone that simulates core email functionalities including sending, reading, deleting, and updating messages. This application is designed with a simple, user-friendly graphical interface and uses a backend database to manage email records.

📌 Features
✅ User Authentication

Login with username and password.

Create a new account.

✅ Send Emails

Compose and send messages to other registered users.

✅ Inbox Management

View received messages.

Read full message details.

✅ Update Emails

Update message content before final sending.

✅ Delete Emails

Remove unwanted messages from inbox/sent items.

✅ Simple GUI Interface

Built using Java Swing.

Form-based design using NetBeans IDE.

🛠️ Technologies Used
Java SE (Core Java)

Java Swing (for GUI)

JDBC (Java Database Connectivity)

MySQL (Database Backend)

NetBeans IDE (Optional but recommended for form editing)

📁 Project Structure
File Name	Purpose
LoginPage.java	Login window and authentication logic
CreateAccount.java	New account registration window
MainPage1.java	Main dashboard simulating Gmail interface
connection.java	JDBC database connection handling
IntershipProject.java	Main project entry point
.form Files	GUI layout files (used by NetBeans GUI Designer)

📊 Database Design
Database Name: gmail_clone

Suggested Table: emails

sql
Copy
Edit
CREATE TABLE emails (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender VARCHAR(100),
    receiver VARCHAR(100),
    subject VARCHAR(255),
    message TEXT,
    sent_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
Suggested Table: users

sql
Copy
Edit
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);
⚙️ Setup Instructions
1️⃣ Prerequisites
Java JDK 8 or higher.

MySQL Server running.

MySQL JDBC Driver added to project libraries.

(Optional) NetBeans IDE for GUI form handling.

2️⃣ Configuration
In connection.java file:

java
Copy
Edit
String url = "jdbc:mysql://localhost:3306/gmail_clone";
String user = "your_mysql_username";
String pass = "your_mysql_password";
Replace credentials as necessary.

3️⃣ Running the Application
Compile all .java files:

bash
Copy
Edit
javac *.java
Run the main class:

bash
Copy
Edit
java IntershipProject
Use the GUI to log in, send emails, view inbox, update, or delete messages.

📷 Screenshots
(Optional: Insert screenshots of login page, inbox view, and message composition screen.)

🚀 Future Improvements
Add password hashing for secure storage.

Implement email attachments.

Search/filter functionality in inbox.

Pagination for large inboxes.

Responsive UI design improvements.

Real SMTP/POP3 integration for actual email services.

⚡ Contribution
Contributions and feature suggestions are welcome!

📄 License
This project is for educational purposes only and is not associated with Google or Gmail.

👤 Author
Ritesh Ghadge
