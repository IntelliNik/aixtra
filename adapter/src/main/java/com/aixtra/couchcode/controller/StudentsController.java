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

import com.aixtra.couchcode.handler.SolveHandler;
import com.aixtra.couchcode.model.Solution;
import com.aixtra.couchcode.util.data.option.Option;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.*;
import io.micronaut.http.exceptions.HttpStatusException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;

import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.JavaMicronautServerCodegen", date = "2022-10-22T16:30:57.436439+02:00[Europe/Berlin]")
@Controller
@Tag(name = "Students", description = "The Students API")
public class StudentsController {
    private static final Logger LOGGER = LoggerFactory.getLogger(StudentsController.class);
    private final SolveHandler solverHandler;

    StudentsController(SolveHandler solverHandler) {
        this.solverHandler = solverHandler;
    }

    /**
     * A simple endpoint to test interaction
     * This endpoint is used to determine, whether or not the system is  generally available. It is used before every rating run. System which  are not available or unable to react to the ping in time, will be  disqualified and not further considered during the rating run.
     */
    @Operation(
            operationId = "ping",
            summary = "A simple endpoint to test interaction",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK")
            },
            security = {
                    @SecurityRequirement(name = "oAuth2", scopes = {})
            }
    )
    @Get(uri = "/ping")
    @Produces(value = {})
    public Mono<Void> ping(@Nullable HttpHeaders headers) {
        LOGGER.info("Got pinged with Headers: {}", headers.asMap());
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
            },
            security = {
                    @SecurityRequirement(name = "oAuth2", scopes = {})
            }
    )
    @Post(uri = "/solve")
    @Produces(value = {"application/json"})
    @Consumes(value = {"image/png"})
    public Mono<Solution> solve(@Nullable HttpHeaders headers, @Body @Nullable byte[] _body) {
        LOGGER.info("Got solve request with Headers: {} Body: {}", headers.asMap(), _body);
        return solverHandler.solve(Option.of(_body))
                .onErrorResume(e -> Mono.error(new HttpStatusException(HttpStatus.I_AM_A_TEAPOT, e.getMessage())));
    }

}