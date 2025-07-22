# 🚀 Gmail Clone Application (Java Swing + MySQL)

A desktop-based Gmail-like application to send, receive, update, and delete emails with user account management.

---

## 📦 Features

* ✅ **User Authentication** — Login / Register
* ✅ **Send Emails** — Compose & send messages
* ✅ **View Inbox** — Check received messages
* ✅ **Update Messages** — Edit drafts before sending
* ✅ **Delete Messages** — Remove emails from inbox
* ✅ **Graphical Interface** — Built with Java Swing

---

## ⚙️ Technologies Used

* Java SE (Swing for GUI)
* MySQL Database
* JDBC for database connectivity
* NetBeans IDE (optional for GUI designing)

---

## 📂 Project Structure

| File                  | Description                       |
| --------------------- | --------------------------------- |
| LoginPage.java        | Login screen logic                |
| CreateAccount.java    | Account creation page             |
| MainPage1.java        | Dashboard after login             |
| connection.java       | Database connection (JDBC)        |
| IntershipProject.java | Project main entry point          |
| \*.form Files         | GUI forms designed using NetBeans |

---

## 💄 Database Schema

**Database Name:** `gmail_clone`

**Users Table:**

```sql
CREATE TABLE users (
    username VARCHAR(50) PRIMARY KEY,
    password VARCHAR(50)
);
```

**Emails Table:**

```sql
CREATE TABLE emails (
    id INT AUTO_INCREMENT PRIMARY KEY,
    sender VARCHAR(100),
    receiver VARCHAR(100),
    subject VARCHAR(255),
    message TEXT,
    sent_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

---

## 🛠️ Setup Instructions

### 1️⃣ Prerequisites

* Java JDK 8+
* MySQL Server
* MySQL JDBC Driver

### 2️⃣ Configure database in `connection.java`:

```java
String url = "jdbc:mysql://localhost:3306/gmail_clone";
String user = "your_mysql_username";
String pass = "your_mysql_password";
```

### 3️⃣ Compile:

```bash
javac *.java
```

### 4️⃣ Run:

```bash
java IntershipProject
```

---

## 📷 Screenshots

*(Optional section for GUI images if documenting in Markdown)*

---

## 🚧 Future Enhancements

* 🔐 Password hashing for secure storage
* 📎 Email attachments
* 🔍 Search & filtering
* 📬 Pagination for inbox
* 🌐 SMTP/POP3 integration

---

## 👤 Author

Ritesh Ghadge

---

## 📃 License

This project is built for educational use. No affiliation with Google or Gmail.
