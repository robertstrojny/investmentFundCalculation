# investmentFundCalculation
Demo for investment fund calculation

Project is created as java application based on 
- spring boot,
- h2 memory database,
- Swagger2 as ui for testing REST services

to test application :

```sh
git clone https://github.com/robertstrojny/investmentFundCalculation.git
```

to build application :

```sh
mvn clean install
```

to run application :

```sh
mvn spring-boot:run
```
To do tests from documentation go to swagger ui :

```sh 
http://localhost:8080/swagger-ui.html
```

There are two services: 
- fund-rest-service-impl
- fund-rest-service-impl
to run it with swagger click `Try in out`, prepare input parameters if needed and click `execute`

fund-rest-service-impl is for getting information about declared investment funds
It returns list off funds:

```
[
  {
    "id": 1,
    "name": "Fundusz Polski 1",
    "type": "POLISH"
  },
  {
    "id": 2,
    "name": "Fundusz Polski 2",
    "type": "POLISH"
  },
  {
    "id": 3,
    "name": "Fundusz Zagraniczny 1",
    "type": "FOREIGN"
  },
  {
    "id": 4,
    "name": "Fundusz Zagraniczny 2",
    "type": "FOREIGN"
  },
  {
    "id": 5,
    "name": "Fundusz Zagraniczny 3",
    "type": "FOREIGN"
  },
  {
    "id": 6,
    "name": "Fundusz Pieniężny 1",
    "type": "FINANCIAL"
  },
  {
    "id": 7,
    "name": "Fundusz Polski 3",
    "type": "POLISH"
  }
]
```

Test cases from documentation (use inventments-funnd-rest-service-impl service):

1. set calculateDto 

```
{
  "fundList": [
    1,2,3,4,5,6
  ],
  "style": "SAFE",
  "value": 10000
}
```

response body :

```
{
  "calculationResultRows": [
    {
      "lp": 1,
      "fundType": "POLISH",
      "name": "Fundusz Polski 1",
      "value": 1000,
      "percent": 10
    },
    {
      "lp": 2,
      "fundType": "POLISH",
      "name": "Fundusz Polski 2",
      "value": 1000,
      "percent": 10
    },
    {
      "lp": 3,
      "fundType": "FOREIGN",
      "name": "Fundusz Zagraniczny 1",
      "value": 2500,
      "percent": 25
    },
    {
      "lp": 4,
      "fundType": "FOREIGN",
      "name": "Fundusz Zagraniczny 2",
      "value": 2500,
      "percent": 25
    },
    {
      "lp": 5,
      "fundType": "FOREIGN",
      "name": "Fundusz Zagraniczny 3",
      "value": 2500,
      "percent": 25
    },
    {
      "lp": 6,
      "fundType": "FINANCIAL",
      "name": "Fundusz Pieniężny 1",
      "value": 500,
      "percent": 5
    }
  ],
  "unresolved": 0
}
```


2. set calculateDto 

```
{
  "fundList": [
    1,2,3,4,5,6
  ],
  "style": "SAFE",
  "value": 10001
}
```

response body :

```
{
  "calculationResultRows": [
    {
      "lp": 1,
      "fundType": "POLISH",
      "name": "Fundusz Polski 1",
      "value": 1000,
      "percent": 10
    },
    {
      "lp": 2,
      "fundType": "POLISH",
      "name": "Fundusz Polski 2",
      "value": 1000,
      "percent": 10
    },
    {
      "lp": 3,
      "fundType": "FOREIGN",
      "name": "Fundusz Zagraniczny 1",
      "value": 2500,
      "percent": 25
    },
    {
      "lp": 4,
      "fundType": "FOREIGN",
      "name": "Fundusz Zagraniczny 2",
      "value": 2500,
      "percent": 25
    },
    {
      "lp": 5,
      "fundType": "FOREIGN",
      "name": "Fundusz Zagraniczny 3",
      "value": 2500,
      "percent": 25
    },
    {
      "lp": 6,
      "fundType": "FINANCIAL",
      "name": "Fundusz Pieniężny 1",
      "value": 500,
      "percent": 5
    }
  ],
  "unresolved": 1
}
```
