# E-commerce-Platform
The project aims to develop a Java-based E-Commerce Web Application that allows users to browse products, add them to a cart, place orders, and for admins to manage products and inventory. The solution includes clear requirement analysis, use-case diagrams, ER diagrams, class diagrams, and logical workflow charts. 
📦 Java E-Commerce Web Application

A complete Java-based E-Commerce Web Platform built using Servlets, JSP, JDBC, MVC Architecture, and MySQL.
It allows users to browse products, manage cart, place orders, and provides an admin panel for product & inventory management.

🚀 Project Overview

This project demonstrates a full-stack web application developed using Core Java, Java Web Technologies, and Database Integration.
It follows clean MVC architecture and meets all deliverables as per GUVI – HCL – Galgotias University Web-Based Project Rubric.

🧩 Features
👤 User Features

User Registration & Login (Session-based)

Browse Products by Category

Add to Cart / Remove from Cart

Update Cart Quantity

Order Placement

Order History

Logout Feature

🛠️ Admin Features

Add New Products

Edit / Delete Products

Manage Categories

Manage Orders

Inventory Management

🧱 Tech Stack
Layer	Technology
Backend	Java, Servlets, JDBC
Frontend	JSP, HTML, CSS, JavaScript, JSTL
Database	MySQL
Architecture	MVC (Model–View–Controller)
Server	Apache Tomcat
Build Tool	Maven (optional)
📂 Project Structure
src/
 ├── model/          → Java Beans (Product, User, Cart, Order)
 ├── dao/            → JDBC Data Access Classes
 ├── controller/     → Servlet Controllers (Login, Cart, Product)
 ├── utils/          → DBConnection, Helper Classes
 ├── views/          → JSP Pages
 └── web.xml         → Deployment Descriptor

🗄️ Database Structure (MySQL)
Tables:

users

products

categories

cart

orders

order_items

All tables are normalized and connected using foreign keys where required.
