const express = require("express")
const router = express.Router()
const { authenticateToken, authorizeRoles} = require('../middleware/auth')

/**
 * @swagger
 * tags:
 *   name: Users
 *   description: User and admin protected endpoints
 */

/**
 * @swagger
 * /users:
 *   get:
 *     summary: Get user info (protected)
 *     tags: [Users]
 *     security:
 *       - bearerAuth: []
 *     responses:
 *       200:
 *         description: Authenticated user info
 *       401:
 *         description: Unauthorized
 */

router.get("/",authenticateToken,(req,res)=>{
    res.json({ message: `Hello ${req.user.username}, you are authenticated.` });
})

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
 *         description: "Authenticated admin info"
 *       401:
 *         description: "Unauthorized"
 *       403:
 *         description: "Forbidden: insufficient role"
 */

router.get("/admin",authenticateToken, authorizeRoles('admin') ,(req,res)=>{
    res.json({ message: `Hello ${req.user.username}, you are authenticated.` });
})

module.exports = router