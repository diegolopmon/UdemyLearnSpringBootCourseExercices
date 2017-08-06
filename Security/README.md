# [Exercise] Securing you application
## Overview

We are going to create a new application and take the steps to secure our application. We are going to keep improving this application but I want you to see the steps from out of the box to complete customizations.

## Exercise

* Create a new application with the following dependencies
  * Web
  * Thymeleaf
  * JPA
  * Security
  * H2
* Basic Authentication
  * use the default username and password to login
  * create your own username and password to login
* Custom
  * customize spring security to use form login (hint - all you need is a configuration class to get this)
  * add some in memory users with roles
* Create a Controller package
  * create some methods with mappings
  * secure those mappings with different roles
  * test that security is doing what it should
  * create a mapping with multiple roles
* Create a custom login form
  * create your own login form
  * change the username field to an email address field
  * use the thymeleaf spring security dialect to display info about our user and their roles in our templates
* Persist our Users
  * persist our users using JPA to a database

### Bonus
  
Create a admin application to allow us to create new posts, update existing ones and remove posts. There is no public facing website for this only our admin application with one role of "ROLE_ADMIN".