# lambda-java-maven-sqs-event

create Maven project.

![Screenshot 2023-02-24 at 09 14 40](https://user-images.githubusercontent.com/14834867/221127132-3ddad29e-01e5-4cae-a46f-0743bafa75b3.png)

select corretto-11 for creation.

follow pom.xml for dependencies

follow lambda code for sqs handle

creat jar file by command

mvn clean package shade:shade
mvn clean package

upload to lambda

 ![Screenshot 2023-02-24 at 09 17 15](https://user-images.githubusercontent.com/14834867/221127647-4b542315-0a04-4de8-ad03-b99ba90bf393.png)

org.example.HandlerSQS::handleRequest

where "org.example" is package name.
"HandlerSQS" is classname
"handleRequest" is function name

So your lambda will call this function on sqs event.
