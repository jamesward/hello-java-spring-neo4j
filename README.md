# Spring MVC and Neo4j

This is a template for a web application that uses Spring MVC and Neo4j. The sample code is a simple CRUD page that manipulates records for a single model object.

## Running the application locally

First build with:

    $ mvn clean install

Then run it with:

    $ java -jar target/dependency/webapp-runner.jar target/*.war

## Running on Heroku

Create a git repo (if you don't have one already):

    $ git init

Add and commit the files:

    $ git add .
    $ git commit -m init

Create a new app on Heroku (make sure you have the [Heroku Toolbelt](http://toolbelt.heroku.com) installed):

    $ heroku login
    $ heroku create -s cedar

Add the Neo4j Heroku Add-on:

    $ heroku addons:add neo4j

Upload the app to Heroku:

    $ git push heroku master

Open the app in your browser:

    $ heroku open
