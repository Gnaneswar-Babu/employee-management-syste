<div align="center">

<table border="1" cellpadding="20" cellspacing="0" width="80%">
  <tr>
    <td align="left">

<h1 align="center">Employee Management System</h1>

<p align="center">
A professional backend application built using <b>Spring Boot</b> to manage employee data securely and efficiently.
</p>

<hr>

<h2>🚀 Features</h2>

<ul>
  <li>Employee CRUD Operations (Create, Read, Update, Delete)</li>
  <li>RESTful APIs</li>
  <li>Layered Architecture (Controller, Service, Repository)</li>
  <li>JWT-based Authentication & Authorization</li>
  <li>Global Exception Handling</li>
  <li>Input Validation</li>
</ul>

<hr>

<h2>🛠️ Tech Stack</h2>

<ul>
  <li>Java</li>
  <li>Spring Boot</li>
  <li>Spring Security (JWT)</li>
  <li>Hibernate / JPA</li>
  <li>Maven</li>
  <li>MySQL</li>
  <li>IntelliJ IDEA</li>
</ul>

<hr>

<h2>📂 Project Structure</h2>

<pre>
src
└── main
    ├── java
    │   └── com.gnaneswar.employeemanagementsystem
    │       ├── controller
    │       ├── service
    │       ├── repository
    │       ├── entity
    │       ├── dto
    │       ├── security
    │       └── exception
    └── resources
        └── application.properties
</pre>

<hr>

<h2>⚙️ How to Run the Project</h2>

<ol>
  <li>Clone the repository</li>
</ol>

<pre>
git clone https://github.com/Gnaneswar-Babu/employee-management-system.git
</pre>

<ol start="2">
  <li>Open the project in IntelliJ IDEA</li>
  <li>Update database configuration in <b>application.properties</b></li>
  <li>Run <b>EmployeeManagementSystemApplication.java</b></li>
</ol>

<hr>

<h2>📘 API Documentation (Swagger)</h2>

<p>
Swagger (OpenAPI) is integrated to visualize and test REST APIs interactively.
It allows testing secured APIs using JWT without Postman.
</p>

<pre>
http://localhost:8080/swagger-ui/index.html
</pre>

<ul>
  <li>JWT Authentication supported via <b>Authorize</b> button</li>
  <li>All secured APIs can be tested directly from Swagger UI</li>
</ul>

<hr>

<h2>🔐 JWT Authentication Flow</h2>

<ol>
  <li>Call Login API to generate JWT token</li>
  <li>Copy the generated token</li>
  <li>Click <b>Authorize</b> button in Swagger UI</li>
  <li>Paste token in the format:</li>
</ol>

<pre>
Bearer &lt;JWT_TOKEN&gt;
</pre>

<p>
If token is missing or invalid, APIs return <b>401 / 403 Unauthorized</b>.
</p>

<hr>

<h2>📡 REST API Endpoints</h2>

<table border="1" cellpadding="8" cellspacing="0" width="100%">
  <tr>
    <th>HTTP Method</th>
    <th>Endpoint</th>
    <th>Description</th>
    <th>Secured</th>
  </tr>
  <tr>
    <td>POST</td>
    <td>/auth/login</td>
    <td>User login & JWT generation</td>
    <td>No</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/employees</td>
    <td>Get all employees</td>
    <td>Yes</td>
  </tr>
  <tr>
    <td>GET</td>
    <td>/api/employees/{id}</td>
    <td>Get employee by ID</td>
    <td>Yes</td>
  </tr>
  <tr>
    <td>POST</td>
    <td>/api/employees</td>
    <td>Create new employee</td>
    <td>Yes</td>
  </tr>
  <tr>
    <td>PUT</td>
    <td>/api/employees/{id}</td>
    <td>Update employee</td>
    <td>Yes</td>
  </tr>
  <tr>
    <td>DELETE</td>
    <td>/api/employees/{id}</td>
    <td>Delete employee</td>
    <td>Yes</td>
  </tr>
</table>

<hr>

<h2>🧠 Implementation Details</h2>

<ul>
  <li><b>Employee Module</b>
    <ul>
      <li>Create Employee</li>
      <li>Get Employee by ID</li>
      <li>Get All Employees</li>
      <li>Update Employee</li>
      <li>Delete Employee</li>
    </ul>
  </li>

  <li><b>Security Module</b>
    <ul>
      <li>JWT-based authentication</li>
      <li>Stateless security</li>
      <li>Secured APIs using Spring Security filters</li>
    </ul>
  </li>

  <li><b>Exception Handling</b>
    <ul>
      <li>Centralized global exception handling</li>
      <li>Custom exception classes</li>
      <li>Meaningful HTTP status codes</li>
    </ul>
  </li>
</ul>

<hr>

<h2>📌 Project Status</h2>

<ul>
  <li>✅ Backend implementation completed</li>
  <li>✅ JWT Security implemented</li>
  <li>✅ Swagger (OpenAPI) integrated</li>
  <li>🚧 Pagination, Sorting & Docker planned</li>
</ul>

<hr>

<h2>👨‍💻 Author</h2>

<p>
<b>Gnaneswar Babu</b><br>
Java Backend Developer
</p>
<br>

   
  </tr>
</table>

</div>
