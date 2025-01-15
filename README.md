# 🛒 E-Commerce Backend Project

## 🌟 Overview

This is an **E-Commerce backend application** built using **Spring Boot**. The project currently focuses on the foundational setup, with a completed **Product** entity and a RESTful API for product management. The application uses an **H2 database** for development and testing purposes, ensuring quick and efficient integration.

## ✨ Features

- 🔄 RESTful API for managing products.
- 💾 H2 in-memory database for lightweight and fast data handling.
- 🖼️ Image handling for product images (upload and fetch).

## 🛠️ Technology Stack

- **Backend Framework:** Spring Boot
- **Database:** H2 Database
- **Language:** Java
- **Build Tool:** Maven

## ✅ Current Functionalities

1. **Product Management**
   - ➕ Add new products with image upload.
   - ✏️ Update existing products with image updates.
   - 🔍 Fetch product details, including images.
   - ❌ Delete products.

## 📦 Product Entity

The `Product` entity is the foundation of the application. Below are its attributes:

| 🏷️ Attribute      | 🔢 Type      | 📝 Description                          |
| ------------------ | ------------ | --------------------------------------- |
| `id`               | `int`        | Auto-generated unique identifier.       |
| `name`             | `String`     | Name of the product.                    |
| `description`      | `String`     | Detailed information about the product. |
| `brand`            | `String`     | Brand of the product.                   |
| `price`            | `BigDecimal` | Price of the product.                   |
| `category`         | `String`     | Product category.                       |
| `stockQuantity`    | `int`        | Available stock quantity.               |
| `productAvailable` | `boolean`    | Availability status of the product.     |
| `releaseDate`      | `Date`       | Release date of the product.            |
| `imageName`        | `String`     | Name of the image file.                 |
| `imageType`        | `String`     | Type of the image (e.g., PNG, JPEG).    |
| `imageData`        | `byte[]`     | Binary data of the image.               |

### 📝 Notes:

- The `@Lob` annotation is used for the `imageData` field to handle large objects.
- The `releaseDate` field is designed to store the product's launch date.

## 🔗 API Endpoints

### 🛍️ Product Endpoints

| 🌐 HTTP Method | 🛣️ Endpoint              | 📄 Description                        |
| -------------- | ------------------------- | ------------------------------------- |
| GET            | `/api/products`           | Get all products                      |
| GET            | `/api/product/{id}`       | Get product by ID                     |
| POST           | `/api/product`            | Add a new product with an image       |
| GET            | `/api/product/{id}/image` | Fetch the image of a specific product |
| PUT            | `/api/product/{id}`       | Update a product with an image        |
| DELETE         | `/api/product/{id}`       | Delete a product                      |

### 📨 Sample Request and Response

#### ➕ Add a Product (POST `/api/product`)

**Request:**

- `@RequestPart Product product`
- `@RequestPart MultipartFile imageFile`

**Response:**

- Returns the created product with HTTP status `201 CREATED`.

#### 🖼️ Get Product Image (GET `/api/product/{id}/image`)

**Response:**

- Returns the image in the appropriate MIME type (e.g., `image/jpeg`).

## ⚙️ Setup and Installation

### ✅ Prerequisites

- Java 17 or later
- Maven
- IDE (e.g., IntelliJ IDEA, Eclipse)

### 🛠️ Steps to Run the Project

1. Clone the repository:

   ```bash
   git clone https://github.com/Thandu-darshana/E-Commerce.git
   ```

2. Navigate to the project directory:

   ```bash
   cd ecommerce-backend
   ```

3. Create an `application.properties` file in the `src/main/resources/` directory with the following content:

   ```properties
   # H2 Database Configuration
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=
   spring.jpa.show.sql=true
   spring.jpa.hibernate.ddl-auto=update

   spring.jpa.defer-datasource-initialization=true 

   ```

4. Build the project using Maven:

   ```bash
   mvn clean install
   ```

5. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run
   ```

6. Access the H2 console for the in-memory database at:

   ```
   http://localhost:8080/h2-console
   ```

   - **JDBC URL:** `jdbc:h2:mem:testdb`
   - **Username:** `sa`
   - **Password:** (leave blank)

## 🚀 Future Enhancements

- Add other entities such as Users, Orders, and Payments.
- Implement authentication and authorization.
- Integrate with a production-grade database such as MySQL or PostgreSQL.
- Add unit and integration tests.










