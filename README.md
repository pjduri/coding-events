# coding-events

PURPOSE
This app is designed to connect coders and aspiring coders to events that are themed around their current interests and career pursuits.

CURRENT STATE
In development:  
  - It allows users to create events, event categories, and tags
  - It stores created events, categories and tags in a Sql database
  - It allows users to see a list of all events, each of which includes an embedded link to that event's details page
  - It allows users to see a list of all categories, each of which includes an embedded link to a list of events that fall under that category
  - It allows a user to See a list of all tags and add tags to individual events

TODOS:
  - Embed links in the tag lists - make the listed tags in each event contain links as well
  - Refactor tag controller to manage errors more effectively
  - Add a Person class to store information about the app's users
  
PERSON CLASS:
Should extend AbstractEntity
Fields:
Id - auto-generated
First Name
Last Name
Password
Getters and Setters - All except Id should be setter only

Person will likely be linked via one-to-one relationship to a class to hold profile information (coding languages, 
interests, contact email, links to owned events, etc).  

Person's relationships with other classes:
Events (using List object unless otherwise noted)
       - one to many for events owned
       - many to many for events co-hosting
       - many to many for events attending
Tags
       - many to many (displayed as interests/skills in personal profile)
