/*
 * Client API
 * API called by backend
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.aixtra.couchcode.client.challenge.api;

import io.micronaut.http.annotation.*;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Mono;
import com.aixtra.couchcode.client.challenge.model.EvaluationScore;
import com.aixtra.couchcode.client.challenge.model.Solution;
import javax.annotation.Generated;

import javax.validation.Valid;
import javax.validation.constraints.*;

@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-10-22T18:01:35.219427+02:00[Europe/Berlin]")
@Client("${openapi-micronaut-client-base-path}")
public interface EvaluationApi {
    /**
     * Evaluate a given Product based on a generated catalog to the actual Product
     *
     * @param taskId the task/catalog id to compare the given Product to (required)
     * @param solution the Product (required)
     * @return EvaluationScore
     */
    @Post(uri="/api/evaluate/{taskId}")
    @Consumes({"application/json"})
    @Produces({"application/json"})
    Mono<EvaluationScore> evaluate(
        @PathVariable(name="taskId") @NotNull String taskId, 
        @Body @NotNull @Valid Solution solution
    );

}