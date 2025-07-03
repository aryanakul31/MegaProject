# Node.js JWT Auth & Role Management Example

This project demonstrates a simple Node.js backend with:

- **User authentication using JWT**
- **Role-based access control**
- **Express.js API structure**
- **Middleware for authentication and authorization**
- **Sample protected and admin-only routes**
- **Swagger API documentation**

## What I Learned

- How to set up an Express.js server with modern middleware (CORS, morgan, error handling)
- How to implement JWT-based authentication for stateless APIs
- How to create and verify JWT tokens securely
- How to use middleware to protect routes and enforce user roles
- How to structure a Node.js project with routes, controllers, and middleware
- How to use environment variables for secrets and configuration
- How to use nodemon for auto-reloading during development
- How to document APIs using Swagger and JSDoc comments

## Project Structure

```
node/
├── src/
│   ├── app.js                # Main Express app
│   ├── routes/
│   │   ├── auth.js           # Login endpoint
│   │   └── users.js          # Protected user and admin routes
│   ├── middleware/
│   │   ├── auth.js           # JWT authentication & role middleware
│   │   └── errorHandler.js   # Centralized error handling
│   ├── swagger.js            # Swagger JSDoc config
│   ├── controllers/          # (Ready for business logic)
│   ├── models/               # (Ready for DB models)
│   ├── services/             # (Ready for service logic)
│   ├── utils/                # (Ready for helpers)
│   └── config/               # (Ready for config files)
├── package.json
├── nodemon.json
├── .gitignore
└── README.md
```

## API Endpoints

### Auth

- `POST /api/auth/login`  
  Login with username and password. Returns a JWT token.

### Users

- `GET /api/users`  
  Protected route. Requires a valid JWT.

- `GET /api/users/admin`  
  Protected admin-only route. Requires a valid JWT with `role: admin`.

## Example Usage

1. **Login**  
   Send a POST request to `/api/auth/login` with JSON body:
   ```json
   {
     "username": "admin",
     "password": "admin123"
   }
   ```
   You'll receive a JWT token.

2. **Access Protected Route**  
   Send a GET request to `/api/users` with header:
   ```
   Authorization: Bearer <your_token>
   ```

3. **Access Admin Route**  
   Send a GET request to `/api/users/admin` with an admin token.

## Security

- JWT secret is stored in `.env`
- All protected routes require a valid JWT
- Role-based middleware restricts access to admin-only endpoints

## API Documentation (Swagger)

- Interactive API docs are available at: [http://localhost:3000/api/docs](http://localhost:3000/api/docs)
- Endpoints are documented using JSDoc comments in the route files (see `src/routes/`)
- To add or update documentation, use the `@swagger` JSDoc format above each route handler
- Example:
  ```js
  /**
   * @swagger
   * /users/admin:
   *   get:
   *     summary: Admin-only endpoint
   *     tags: [Users]
   *     security:
   *       - bearerAuth: []
   *     responses:
   *       200:
   *         description: Authenticated admin info
   *       401:
   *         description: Unauthorized
   *       403:
   *         description: "Forbidden: insufficient role"
   */
  ```

## Development

- Run the server with `nodemon` for auto-reload:
  ```
  npx nodemon src/app.js
  ```

---

This project is a great starting point for building secure, documented, role-based APIs in Node.js!
