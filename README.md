Demo video: https://www.youtube.com/watch?v=QU5V-dgUjhY

Design doc: https://docs.google.com/document/d/1o8S0fauxCnO0-k3lM3zE3ypMH7BMzvti8E-8Yz02Rx0/edit?usp=sharing

# WeLive 

a community management system to facilitate 3-way (manager/resident/staff) communication.

## Overview

Our goal is to design a community management system that promotes better communication among residents, managers, and staff so that they can solve community-related problems faster and achieve better results. 

## Features

Basic Features (MVP):

* Registration & Login - Allow different types of users to register and log into/out of the system.
*   Use Registration Controller to save user information from front-end to database.
Different user type has different authorities.
Apply Spring Security to implement authentication
Dashboard - Notify users with newest update of each ticket, payment due, and other important notifications.
Ticket Submitting - Generate tickets of different issues categories by residents, and assign tickets with available maintenance staff.
Calendar - Sort notifications into calendar form, and enable 

Advanced features:

Payment - Produce late payment notification and bill of rent and maintenance.

Chat board - Allow residents to post anecdotes and communicate with others.

Major Tech Stack
Frontend: 
React
Ant design component library
Axios
Backend:
Spring MVC
Tomcat
Hibernate
MySQL database (built on Amazon RDS) 
