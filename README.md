# FXApi

Currency Agrregator

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Prerequisites

What things you need to install the software and how to install them

```
* [install java8](https://askubuntu.com/questions/464755/how-to-install-openjdk-8-on-14-04-lts) 
* [install Apache Maven 3.6.0](https://www.mkyong.com/maven/how-to-install-maven-in-ubuntu/) 

```

### To run in your local machine

```
$ git clone https://github.com/rai-prashanna/FXApi
$ cd <Working Directory>/FXApi/currencyAggregator
$ mvn clean install 
$ cd target
$ java -jar currencyAggregator-0.0.1-SNAPSHOT.jar
$ copy this url (http://localhost:8080/2018-01-01/2019-01-01/agg?func=median&symbols=sek&base=usd)

```

End with an example of getting some data out of the system or using it for a little demo

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment


## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Patrick Rai** 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Thanks to Modular Finance for assignment

