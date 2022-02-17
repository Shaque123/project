# project

ProjectApplication is a Java  rest api application
Accepts numeric array as JSON and Computes the square root of the sum of squares of the 3 highest numeric inputs

# Setup
Clone repository
```console
  git clone https://github.com/Shaque123/project.git
```
# Eclipse Instruction
## Prerequisites:
 Install Eclipse, the Maven plugin and optionally the GitHub plugin.

## Import project:

 Click on Open projects from file system and go to the checkout project folder
 Click ok

## Run

 Right-click on project

 Run As > Java Application

 If asked, type "ProjectApplication" and click OK

 # Accessing web API
  Install postman or any command line tool to post request

  In Postman, select methog POST and URL is http://localhost:8080/calculate

  Request body will be : {"inputData":[1,2,3]}
  
  In PowerShell the service can be invoked as follows:

  ```console
  curl.exe -v -X POST localhost:8080/calculate -H 'Content-Type:application/json' -d '{\"inputData\":[1,2,3,4] }'
  ```


