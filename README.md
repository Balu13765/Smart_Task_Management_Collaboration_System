# Smart Task Management & Collaboration System
Java Spring Boot + React.js + MySQL + JWT + REST APIs project.

## Features
- JWT authentication APIs
- Task CRUD
- Assign tasks
- TODO / IN_PROGRESS / DONE status
- LOW / MEDIUM / HIGH priority
- Due dates and projects
- Team comments API
- Dashboard statistics
- Search and filtering
- Responsive React UI

## Run
Create MySQL database `taskflow`, then update `backend/src/main/resources/application.properties`.

Backend:
`cd backend`
`mvn spring-boot:run`

Frontend:
`cd frontend`
`npm install`
`npm run dev`

Frontend: http://localhost:5173
Backend: http://localhost:8080
