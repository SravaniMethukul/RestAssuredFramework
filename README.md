Rest Assured API Testing Project:

Web application: https://swift.techwithjatin.com/
Swagger Doc: http://64.227.160.186:8080/swagger-ui/index.html#/

RestAssuredFramework is an API testing framework for a banking application, built with RestAssured and TestNG. 
The framework uses the Builder design pattern to simplify object creation, especially for complex request and response models.

```
RestAssuredFramework/
├── .github/
│   └── workflows/
├── .settings/
├── logs/
├── src/
│   └── test/
│       └── java/
│           └── com/
│               └── api/
│                   └── base/
│                       └── AuthService.java
│                       └── BaseService.java
│                       └── UserManagementService.java
│                   └── filters/
│                       └── LoggingFilter.java
│                   └── Listeners/
│                       └── TestListener.java
│                   └── models/
│                       └── Request
│                           └── LoginRequest.java
│                           └── ProfileRequest.java
│                           └── SignUpRequest.java
│                       └── Response
│                           └── LoginResponse.java
│                           └── ProfileResponse.java
│                   └── Reporting/
│                       └── ExtentReportManager.java
│                   └── tests/
│                       └── LoginAPITest1.java
│                       └── LoginAPITest2.java
│                       └── LoginAPITest3.java
│                       └── AccountCreationTest.java
│                       └── BaseTest.java
│                       └── ForgotPasswordTest.java
│                       └── GetProfileRequestTest.java
│                       └── UpdateProfileTest.java
├── target/
├── test-output/
├── .classpath
├── .project
├── pom.xml
├── suite.xml
```

For CI/CD, the project uses GitHub Actions to automate build and test workflows
