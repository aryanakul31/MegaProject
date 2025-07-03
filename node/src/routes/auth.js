const express = require('express');
const jwt = require('jsonwebtoken');
const router = express.Router();

const users = [
    {id:1,username:'admin',password:'admin123',role:'admin'},
    {id:2,username:'user',password:'user123',role:'user'},
]

/**
 * @swagger
 * tags:
 *   name: Auth
 *   description: Authentication and login
 */

/**
 * @swagger
 * /auth/login:
 *   post:
 *     summary: Login with username and password
 *     tags: [Auth]
 *     requestBody:
 *       required: true
 *       content:
 *         application/json:
 *           schema:
 *             type: object
 *             properties:
 *               username:
 *                 type: string
 *                 example: admin
 *               password:
 *                 type: string
 *                 example: admin123
 *     responses:
 *       200:
 *         description: JWT token returned
 *       400:
 *         description: Invalid credentials
 */

router.post('/login', (req,res)=>{
    const {username,password} = req.body;
    const user = users.find(u=> u.username == username && u.password == password)

    if(!user) return res.statusCode(400).json({
        message : "Invalid credentials"
    })

    const token = jwt.sign({id:user.id,username:user.username,role:user.role},process.env.JWT_SECRET,{
        expiresIn : '1h',
    })
    res.json({token});
});

module.exports = router;