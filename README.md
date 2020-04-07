# IOTA Sample Client
## Setup
### Install Dependencies
```
$ mvn dependency:tree
```
### Compile
```
$ mvn compile
```
### Unit Test
```
$ mvn test
```
## Interaction
### Conect To Node
```
$ mvn exec:java -Dexec.mainClass="com.iota.ConnectToNode"
```
### Get Transaction Inoformation
```
$ mvn exec:java -Dexec.mainClass="com.iota.GetTransaction"
```
### Send Tokens
```
$ mvn exec:java -Dexec.mainClass="com.iota.TransferFrom
```
## Spring Boot
### Start
```
$ mvn spring-boot:run
```
