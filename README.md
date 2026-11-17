# Session & Cookie Management (Jakarta EE)

A Java web app showing how to handle user state in Servlets: login with **HttpSession** (and an earlier cookie-based version, kept in the code as comments), plus a product listing that greets the user when they're logged in.

## What it shows
- `LoginServlet`: authenticates the user and stores the username in the session; shows a greeting if already logged in
- Comparison of **cookies vs. sessions** for keeping a user logged in
- `ProductoServlet`: reads the logged-in user from the session and lists products from a service layer
- Service interface plus implementation (`ProductoService` / `ProductoServiceImplement`)

## Tech stack
Java · Jakarta EE Servlets · JSP · Maven · Apache Tomcat

## Run it
```bash
./mvnw clean package
```
Deploy the WAR to Tomcat and open `/login`.
