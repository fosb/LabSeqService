# Labseq Service

This project uses Quarkus to create a Web Service that performs the calculation of the Labseq sequence.

You can see the project board at https://trello.com/b/CAqvcRHd.

## Running the application

You can run your application using:
```shell script
./mvnw compile quarkus:dev
```

You can then use the service from localhost:8080.

## API Documentation

```
openapi: 3.0.3
info:
  title: getting-started API
  version: 1.0.0-SNAPSHOT
paths:
  /labseq/{inputNumber}:
    get:
      tags:
      - Lab Seq Controller
      parameters:
      - name: inputNumber
        in: path
        required: true
        schema:
          type: string
      responses:
        "200":
          description: OK
          content:
            text/plain:
              schema:
                type: string
                ```


