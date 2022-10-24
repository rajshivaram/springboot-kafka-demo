# Apache Kafka Demo for Spring Boot

Example code for connecting to a Apache Kafka cluster and authenticate with SASL/JAAS Config


## **Configure**

All of the authentication settings can be found in the service key for your Kafka Brokered instance

You will need to configure Spring boot in the application.properties file, here you set the brokers to connect to and the credentials for authentication

You can also modify the Kafka Topics Name and Consumer Group ID name in the application.properties file



**Make the following changes in the application.properties file**

```
1. Update the bootstrap server address in the {spring.kafka.bootstrap-servers} property field

2. Update the username and password in the 

3. Copy the contents of the certificate found in the service key of the Brokered Kafka instance into the ca.pem file. In this example code it is located under the resources folder. In case you want to change the path then you will also need to modify the following property {spring.kafka.ssl.trust-store-location}
```


**POST API**

Public route of the app will be the base endpoint. Body is JSON and the example is mentioned below

```
base_endpoint/api/v1/kafka/publish

{
    "patientId":4,
    "firstName": "Jolly",
    "lastName": "Doe"
}
```
