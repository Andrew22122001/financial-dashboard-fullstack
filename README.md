# 💼 Financial Dashboard – Full Stack Web Application

A responsive full-stack application that enables users to manage financial fund transactions. Built with **Spring Boot** (Java backend), **Angular** (frontend), and **PostgreSQL** (database).

---

## 🧩 Features

- View all transactions in a tabular UI
- Add a new transaction
- Edit and update any record
- Delete transaction entries
- Integrated Angular UI with RESTful backend

---

## 🛠️ Technology Stack

| Layer     | Technology                         |
|-----------|-------------------------------------|
| Frontend  | Angular 17 (Standalone Components)  |
| Backend   | Spring Boot, Spring Data JPA        |
| Database  | PostgreSQL                          |
| Protocol  | REST API                            |
| Tools     | Maven, Git, Postman                 |

---

## 📁 Project Structure

financial-dashboard/
├── backend/ # Spring Boot backend
│ ├── src/
│ ├── pom.xml
│ └── application.properties
│
├── financial-dashboard-frontend/ # Angular frontend
│ ├── src/
│ │ ├── app/
│ │ │ ├── components/
│ │ │ │ └── dashboard/
│ │ │ ├── models/
│ │ │ ├── services/
│ │ │ └── app.routes.ts
│ ├── angular.json
│ └── package.json
│
└── README.md


---

## 🔧 Backend Setup

1. **Navigate to the backend folder**:
   ```bash
   cd backend
Configure application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/financialdb
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Start the backend server:
./mvnw spring-boot:run
API Base URL:
http://localhost:8080/api/transactions
🌐 Frontend Setup

Navigate to frontend folder:
cd financial-dashboard-frontend
Install dependencies:
npm install
Start Angular app:
ng serve
Open your browser:
http://localhost:4200
🧪 Sample Data for POST (JSON)

{
  "fundName": "Growth Fund Alpha",
  "type": "Buy",
  "amount": 1200,
  "role": "Admin"
}
You can use Postman or the Angular form to post this data to /api/transactions.

🖼️ Screenshots

Add screenshots of your frontend UI here if available.
🗂️ Future Improvements

Add pagination and filtering
Role-based user login
Export transactions as CSV
📌 Author

Andrew Bala Abhilash Polisetty
🔗 LinkedIn
📘 MS in Computer Science, Kennesaw State University