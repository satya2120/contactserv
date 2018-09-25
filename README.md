# contactserv

host: http://18.206.158.25
port: 8080

Basic auth: 

username: plivo
password: plivo

# Add user
POST /user/

Request payload: {
	"user_name":"",
	"password":""
}

Response payload: {
    "id": 52,
    "userName": "plivo",
    "password": "plivo"
}

# Get user
GET /user/

Response payload: [
    {
        "id": 52,
        "userName": "plivo",
        "password": "plivo"
    }
]

GET /user/52

Response payload: {
    "id": 52,
    "userName": "plivo",
    "password": "plivo"
}
