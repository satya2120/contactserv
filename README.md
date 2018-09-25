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

# Add contact

POST /contact/

Request payload: {
	"user_id": 52,
	"first_name": "Satya",
	"last_name": "Jain",
	"primary_mobile": "9738803717",
	"primary_email": "satyendra.ja7in@live.com",
	"linkedin_link": "",
	"facebook_link": "",
	"twitter_link":"",
	"email":[],
	"mobile":[]
}

Response payload: {
    "id": 2,
    "user": {
        "id": 52
    },
    "firstName": "Satya",
    "lastName": "Jain",
    "primaryEmail": "satyendra.ja7in@live.com",
    "primaryMobile": "9738803717"
}

# Get contact

GET /contact/

Response payload: [
    {
        "id": 2,
        "user": {
            "id": 52,
            "userName": "plivo",
            "password": "plivo"
        },
        "firstName": "Satya",
        "lastName": "Jain",
        "primaryEmail": "satyendra.ja7in@live.com",
        "primaryMobile": "9738803717"
    }
]

GET /contact/2

Response payload: {
    "id": 2,
    "user": {
        "id": 52
    },
    "firstName": "Satya",
    "lastName": "Jain",
    "primaryEmail": "satyendra.ja7in@live.com",
    "primaryMobile": "9738803717"
}



