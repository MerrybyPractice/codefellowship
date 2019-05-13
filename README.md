# codefellowship
---
### Description
An app that allows a user to create an account, log in, and has the structure for posting and following other users.
---
### Technologies
Java 1.8
Spring
Thymeleaf 
---
### Setup and running localhost
After pulling the project from github.
Go to resources/application.properties and update postgres information.
Make sure that spring.jpa.hibernate.ddl-auto is set to 'create' for your first run. Then 'update' for all runs after that.
Use the gradle run command in the root of the project.
Boot up preferred web browser.
Go to localhost:8080/signup to create accounts.
Once an account is created, any subsequent visits should start at the login page.
Have fun!
