# [Exercise] Building a REST API
## Overview

We are going to create a new application and build out our own REST API. Again I would like you to you use something other than the blog application so we can practice building out our own domain model.

## Exercise

* Create a new application with the following dependencies
  * Web
  * JPA
  * H2
* Create domain package
  * create 1 or more JPA entities
* Create repository package
  * create 1 or more Spring Data Repositories for each entity created
* Create a controller package
  * create 1 or more controllers to manage your data (CRUD) (@RestController)
  * create method for Create Read Update Delete List
  * create mappings for each of them
* Create a service package
  * create 1 or more services (@Service)
  * create methods for CRUD(+list) that call our repositories to do the work
* Controllers
  * make all of our controller methods work by calling our service
* REST Clients
  * test all of our operations using a client such as CURL or POSTMAN
* Spring Data REST
  * remove your controllers and services
  * add spring-boot-starter-data-rest dependency
  * run your application and test all of the available routes
  * add some custom queries to repository
  * test your custom queries (/search/)
* Hal Browser
  * add the dependency spring-data-rest-hal-browser
  * start your app and visit it in a browser
  * check out the HAL browser its pretty cool
  
## Bonus

When we perform database operations in our services (where they should be) we may run into some issues. Create a scenario where an update method might update 1 side of a relationship and then save itself. What happens if one fails but the other doesn't? In this case we could have a scenario where we have stale data. This is where transactional services come into play. Do some reading on @Transactional