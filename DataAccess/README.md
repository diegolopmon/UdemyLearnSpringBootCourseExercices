# [Exercise] Data Access with JPA & h2 
## Overview

Accessing data is one the most critical components of any application. In this exercise we are going to create a web application that loads data into a database and uses that data. Feel free to use the web application you created in the last section or just create a new one. Try not to use the blog sample (post/author) so that you can begin to think about how you model your applications. Also (hint hint) I might ask you to recreate the blog sample later.

## Exercise

* Create an application with the following dependencies 
  * web
  * view template (your choice)
  * JPA
  * H2
* Setup H2
  * enable the H2 console
  * setup a custom path that points to /console
  * launch the application and make sure you can view the database from the console
* Create a domain package
  * Create at least 2 entities with properties
  * Create at least one relationship between them (Post > Author)
  * Run the application and see that the tables were created
* Create a repository package
  * create a repository for each entity you created
* Loading data
  * Create a sql script to load data and view your results
  * Load data programmatically
* Create a service package
  * create a service (@Service) for one of your entities
  * inject the corresponding repository using constructor based injection
  * create a list method that will return data to a controller (hint - use the repository here)
* Create a controller package
  * create a controller
  * inject the service you created above
  * create a list method that calls the service for data
  * populate a model to return to a view
* Create views
  * create a list view template
  * access the data in the model and display it here in your template.