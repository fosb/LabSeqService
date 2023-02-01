package org.labseq;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class LabSeqControllerTest {

    @Test
    public void testLabsecComputeEndpoint() {
        given()
          .when().get("/labseq/0")
          .then()
             .statusCode(200)
             .body(is("0"));

        given()
                .when().get("/labseq/1")
                .then()
                .statusCode(200)
                .body(is("1"));

        given()
                .when().get("/labseq/9")
                .then()
                .statusCode(200)
                .body(is("2"));

        given()
                .when().get("/labseq/13")
                .then()
                .statusCode(200)
                .body(is("5"));
    }



}