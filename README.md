# 🚗 Car Rental System (CRS)

A **Java-based GUI application** designed to manage **car rentals, customers, and payments**, developed as part of the **Object-Oriented Development with Java (OODJ)** university assignment.

> **Note:** This project follows specific academic requirements, including **file-based storage** and **plaintext password storage**, as per assignment guidelines. Future improvements may involve **database integration** and **secure authentication**.

---

## 📌 Features

### 🏢 **Admin Functionalities**
✔ **Car Management** – Add, edit, and delete cars (ensuring unique license plates).  
✔ **Customer Management** – Edit customer profiles and verify new accounts.  
✔ **Booking Confirmation** – Approve rentals and send booking confirmations.  
✔ **Payments & Receipts** – Collect payments, generate receipts, and handle car returns.  
✔ **Admin Controls** – Add, edit, or delete admin accounts.  
✔ **Send Notifications (PING System)** – Admins can send messages to customers.  
✔ **View Business Statistics** – Analyze customer demographics, rental trends, and feedback.

### 👤 **Customer Functionalities**
✔ **Register & Login** – Customers can sign up, log in, and edit their profile.  
✔ **Car Rental & Payment** – Select a car, enter rental details, and make payments.  
✔ **Car Return & Fine Calculation** – Return rented cars and pay penalties for late returns.  
✔ **Booking & Payment History** – View rental history, receipts, and statistics.  
✔ **Feedback System** – Provide ratings and feedback on rental experiences.  

---

## 🛠️ **Technologies Used**
- **Java (Swing GUI)** – For user interface  
- **Object-Oriented Programming (OOP)** – Implements **Encapsulation, Aggregation, Composition, and Modularity**  
- **File-Based Storage** – Uses `.txt` files for data handling (**as required by assignment**)  

---

## 🚀 **How to Run the Project**
### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/Denver1683/Car-Rental-System.git
```
### **2️⃣ Open the Project in an IDE**
- Open the project in **IntelliJ IDEA, Eclipse, or NetBeans**.
- Ensure **Java 8 or later** is installed.

### **3️⃣ Run the Main File**
- Navigate to `Main.java` and run the file.
- The GUI will launch automatically.

---

## 📜 Object-Oriented Concepts Applied
### 🔹 **Encapsulation**
- Protects customer data (e.g., password fields) using private variables with getters and setters.

### 🔹 **Aggregation**
- The **feedback system** is associated with a car but remains even if the car is removed from the system.

### 🔹 **Composition**
- If a **car is deleted**, all its related rental records are also removed.

### 🔹 **Modularity**
- Uses **separate classes** for user management, payments, and rentals to enhance maintainability.

---

## 📊 Business Insights
The system includes **admin statistics** to help track rental trends and customer behaviors:
- **Gender & Age Statistics** – Understand customer demographics.
- **Feedback Analysis** – Improve services based on user reviews.
- **Rental & Payment Statistics** – Track revenue and transaction details.

---

## 🔮 Future Enhancements
✔ **Database Integration** – Replace file-based storage with MySQL or Firebase.  
✔ **Secure Authentication** – Implement password hashing & role-based access control.  
✔ **Online Payment Integration** – Enable Stripe or PayPal payments.  
✔ **Enhanced Reporting** – Advanced analytics & business intelligence features.  

---

## 📄 License
This project is **for educational purposes and personal portfolio only**. Unauthorized redistribution or commercial use are strictly prohibited.

🚀 **Happy Coding!**

