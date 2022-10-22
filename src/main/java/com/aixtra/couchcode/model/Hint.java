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

package com.aixtra.couchcode.model;

import java.util.Objects;
import java.util.UUID;
import com.fasterxml.jackson.annotation.*;

import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Hint
 */
@JsonPropertyOrder({
  Hint.JSON_PROPERTY_PRICE_ENTRY_ID,
  Hint.JSON_PROPERTY_CODE
})
@JsonTypeName("Hint")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-10-22T12:32:57.327248+02:00[Europe/Berlin]")
@Introspected
public class Hint {
    public static final String JSON_PROPERTY_PRICE_ENTRY_ID = "priceEntryId";
    private UUID priceEntryId;

    public static final String JSON_PROPERTY_CODE = "code";
    private HintCode code;

    public Hint() {
    }

    public Hint priceEntryId(UUID priceEntryId) {
        this.priceEntryId = priceEntryId;
        return this;
    }

    /**
     * Get priceEntryId
     * @return priceEntryId
     **/
    @Nullable
    @Schema(name = "priceEntryId", required = false)
    @JsonProperty(JSON_PROPERTY_PRICE_ENTRY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getPriceEntryId() {
        return priceEntryId;
    }

    @JsonProperty(JSON_PROPERTY_PRICE_ENTRY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setPriceEntryId(UUID priceEntryId) {
        this.priceEntryId = priceEntryId;
    }

    public Hint code(HintCode code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     **/
    @Nullable
    @Schema(name = "code", required = false)
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public HintCode getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setCode(HintCode code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Hint hint = (Hint) o;
        return Objects.equals(this.priceEntryId, hint.priceEntryId) &&
            Objects.equals(this.code, hint.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceEntryId, code);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Hint {\n");
        sb.append("    priceEntryId: ").append(toIndentedString(priceEntryId)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
