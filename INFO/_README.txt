GET http://localhost:8080/api/clients

POST http://localhost:8080/api/clients
INPUT:
{
	"firstName": "Alice",
	"lastName": "Tomson",
	"phone": "555 123-4587"
}

{
	"firstName": "Adam",
	"lastName": "Mudrak",
	"phone": "555 777-9999"
}

{
	"firstName": "Rita",
	"lastName": "Mudrak",
	"phone": "555 555-8888"
}

GET http://localhost:8080/api/clients
OUTPUT:
[
    {
        "id": 1,
        "firstName": "Alice",
        "lastName": "Tomson",
        "phone": "555 123-4587"
    },
    {
        "id": 2,
        "firstName": "Adam",
        "lastName": "Mudrak",
        "phone": "555 777-9999"
    },
    {
        "id": 3,
        "firstName": "Rita",
        "lastName": "Mudrak",
        "phone": "555 555-8888"
    }
]

GET http://localhost:8080/api/clients/3
OUTPUT:
{
    "id": 3,
    "firstName": "Rita",
    "lastName": "Mudrak",
    "phone": "555 555-8888"
}

PUT http://localhost:8080/api/clients
INPUT:
{
    "id": 3,
	"firstName": "Rita",
	"lastName": "Mudrak",
	"phone": "555 333-1111"
}
OUTPUT:
{
    "id": 3,
    "firstName": "Rita",
    "lastName": "Mudrak",
    "phone": "555 333-1111"
}

DELETE http://localhost:8080/api/clients/3

RESULT:

GET http://localhost:8080/api/clients
OUTPUT:
[
    {
        "id": 1,
        "firstName": "Alice",
        "lastName": "Tomson",
        "phone": "555 123-4587"
    },
    {
        "id": 2,
        "firstName": "Adam",
        "lastName": "Mudrak",
        "phone": "555 777-9999"
    }
]