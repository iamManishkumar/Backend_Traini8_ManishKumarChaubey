Project Setup
1. Clone the Repository
Clone this repository to your local machine using Git:

git clone <repository-url>

2. Open the Project in IntelliJ IDEA
Make sure you have JDK 17 and Maven 3.x installed on your system.

Open IntelliJ IDEA.
Navigate to File -> Open.
Browse to the folder where you cloned the project and select it.
Click Open to open the project in IntelliJ.

Database Configuration
1. Create Database
Create a new database named trainingcenter in MySQL database.

2. Update application.properties
Update the application.properties file located in src/main/resources with your database connection details:


spring.datasource.url=jdbc:mysql://localhost:3306/trainingcenter
spring.datasource.username=<your-username>
spring.datasource.password=<your-password>


Run the Application
Find the main Spring Boot application file (search for @SpringBootApplication).
Right-click on the file and select Run as Java Application.

Access the APIs
Once the application is running, you can access the APIs using the following endpoints:

Create Training Center API (POST): http://localhost:8080/training-centers
Retrieve All Training Centers API (GET): http://localhost:8080/training-centers

Testing
You can test the APIs using tools like Postman or curl. Send POST requests to create a new training center, and GET requests to retrieve all stored training centers.
