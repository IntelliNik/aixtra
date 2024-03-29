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

package com.aixtra.couchcode.client.challenge.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;

import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Feature
 */
@JsonPropertyOrder({
  Feature.JSON_PROPERTY_ID,
  Feature.JSON_PROPERTY_NAME_IN_FORMULA,
  Feature.JSON_PROPERTY_OPTION_RANGES
})
@JsonTypeName("Feature")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2022-10-22T18:01:35.219427+02:00[Europe/Berlin]")
@Introspected
public class Feature {
    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_NAME_IN_FORMULA = "nameInFormula";
    private String nameInFormula;

    public static final String JSON_PROPERTY_OPTION_RANGES = "optionRanges";
    private List<OptionRange> optionRanges = new ArrayList<>();

    public Feature(UUID id, String nameInFormula, List<OptionRange> optionRanges) {
        this.id = id;
        this.nameInFormula = nameInFormula;
        this.optionRanges = optionRanges;
    }

    public Feature id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setId(UUID id) {
        this.id = id;
    }

    public Feature nameInFormula(String nameInFormula) {
        this.nameInFormula = nameInFormula;
        return this;
    }

    /**
     * Get nameInFormula
     * @return nameInFormula
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_NAME_IN_FORMULA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getNameInFormula() {
        return nameInFormula;
    }

    @JsonProperty(JSON_PROPERTY_NAME_IN_FORMULA)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setNameInFormula(String nameInFormula) {
        this.nameInFormula = nameInFormula;
    }

    public Feature optionRanges(List<OptionRange> optionRanges) {
        this.optionRanges = optionRanges;
        return this;
    }

    public Feature addOptionRangesItem(OptionRange optionRangesItem) {
        this.optionRanges.add(optionRangesItem);
        return this;
    }

    /**
     * Get optionRanges
     * @return optionRanges
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_OPTION_RANGES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<OptionRange> getOptionRanges() {
        return optionRanges;
    }

    @JsonProperty(JSON_PROPERTY_OPTION_RANGES)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setOptionRanges(List<OptionRange> optionRanges) {
        this.optionRanges = optionRanges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Feature feature = (Feature) o;
        return Objects.equals(this.id, feature.id) &&
            Objects.equals(this.nameInFormula, feature.nameInFormula) &&
            Objects.equals(this.optionRanges, feature.optionRanges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nameInFormula, optionRanges);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Feature {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nameInFormula: ").append(toIndentedString(nameInFormula)).append("\n");
        sb.append("    optionRanges: ").append(toIndentedString(optionRanges)).append("\n");
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
