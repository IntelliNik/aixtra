/*
 * Catalog Reader
 * The students solution to identifying prices on a furniture catalog
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.aixtra.couchcode.controller;

import com.aixtra.couchcode.model.Product;
import com.aixtra.couchcode.model.Solution;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.CompletedFileUpload;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.JavaMicronautServerCodegen", date = "2022-10-22T12:32:57.327248+02:00[Europe/Berlin]")
@Controller
@Tag(name = "Students", description = "The Students API")
public class StudentsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentsController.class);

    /**
     * A simple endpoint to test interaction
     * This endpoint is used to determine, whether or not the system is  generally available. It is used before every rating run. System which  are not available or unable to react to the ping in time, will be  disqualified and not further considered during the rating run.
     */
    @Operation(
            operationId = "ping",
            summary = "A simple endpoint to test interaction",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK")
            }
    )
    @Get(uri = "/ping")
    @Produces(value = {})
    public Mono<Void> ping() {
        LOGGER.info("Got pinged");
        return Mono.empty();
    }


    /**
     * Tries to extract the information of a given task.
     * For a task image, provided in the request body in base64 format, the service tries to retrieve the information  about the product and embed it in the provided model.
     *
     * @param _body The task image in base64 encoding.  (optional)
     * @return Solution
     */
    @Operation(
            operationId = "solve",
            summary = "Tries to extract the information of a given task.",
            responses = {
                    @ApiResponse(responseCode = "200", description = "Solved", content = {
                            @Content(mediaType = "application/json", schema = @Schema(implementation = Solution.class))
                    }),
                    @ApiResponse(responseCode = "418", description = "I tried nothing and am all out of ideas")
            },
            parameters = {
                    @Parameter(name = "_body", description = "The task image in base64 encoding. ")
            }
    )
    @Post(uri = "/solve")
    @Produces(value = {"application/json"})
    @Consumes(value = {"image/png"})
    public Mono<Solution> solve(
            @Body @Nullable CompletedFileUpload _body
    ) {

        return Mono.error(new HttpStatusException(HttpStatus.NOT_IMPLEMENTED, null));
    }

}
