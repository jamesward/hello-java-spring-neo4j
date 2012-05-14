# Spring MVC and Neo4j

This is a template for a web application that uses Spring MVC and Neo4j. The sample code is a simple CRUD page that manipulates records for a single model object.

## Running the application locally

First build with:

    $ mvn clean install

Then run it with:

    $ java -jar target/dependency/webapp-runner.jar target/*.war

## Running on Heroku

Clone this project locally:

    $ git clone git://github.com/jamesward/hello-java-spring-neo4j.git

Create a new app on Heroku (make sure you have the [Heroku Toolbelt](http://toolbelt.heroku.com) installed):

    $ heroku login
    $ heroku create -s cedar

Add the Neo4j Heroku Add-on (this requires a verified account):

    $ heroku addons:add neo4j

Upload the app to Heroku:

    $ git push heroku master

Open the app in your browser:

    $ heroku open
