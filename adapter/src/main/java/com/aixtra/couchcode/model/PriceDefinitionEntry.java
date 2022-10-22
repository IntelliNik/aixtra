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
import java.util.Arrays;
import com.aixtra.couchcode.model.Money;
import com.aixtra.couchcode.model.OptionSelection;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * PriceDefinitionEntry
 */
@JsonPropertyOrder({
  PriceDefinitionEntry.JSON_PROPERTY_ID,
  PriceDefinitionEntry.JSON_PROPERTY_VALUE,
  PriceDefinitionEntry.JSON_PROPERTY_OPTION_SELECTIONS
})
@JsonTypeName("PriceDefinitionEntry")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2022-10-22T16:30:57.436439+02:00[Europe/Berlin]")
@Introspected
public class PriceDefinitionEntry {
    public static final String JSON_PROPERTY_ID = "id";
    private UUID id;

    public static final String JSON_PROPERTY_VALUE = "value";
    private Money value;

    public static final String JSON_PROPERTY_OPTION_SELECTIONS = "optionSelections";
    private List<OptionSelection> optionSelections = null;

    public PriceDefinitionEntry() {
    }

    public PriceDefinitionEntry id(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     **/
    @Nullable
    @Schema(name = "id", required = false)
    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public UUID getId() {
        return id;
    }

    @JsonProperty(JSON_PROPERTY_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setId(UUID id) {
        this.id = id;
    }

    public PriceDefinitionEntry value(Money value) {
        this.value = value;
        return this;
    }

    /**
     * Get value
     * @return value
     **/
    @Valid
    @Nullable
    @Schema(name = "value", required = false)
    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Money getValue() {
        return value;
    }

    @JsonProperty(JSON_PROPERTY_VALUE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setValue(Money value) {
        this.value = value;
    }

    public PriceDefinitionEntry optionSelections(List<OptionSelection> optionSelections) {
        this.optionSelections = optionSelections;
        return this;
    }

    public PriceDefinitionEntry addOptionSelectionsItem(OptionSelection optionSelectionsItem) {
        if (this.optionSelections == null) {
            this.optionSelections = new ArrayList<>();
        }
        this.optionSelections.add(optionSelectionsItem);
        return this;
    }

    /**
     * Get optionSelections
     * @return optionSelections
     **/
    @Nullable
    @Schema(name = "optionSelections", required = false)
    @JsonProperty(JSON_PROPERTY_OPTION_SELECTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<OptionSelection> getOptionSelections() {
        return optionSelections;
    }

    @JsonProperty(JSON_PROPERTY_OPTION_SELECTIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOptionSelections(List<OptionSelection> optionSelections) {
        this.optionSelections = optionSelections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PriceDefinitionEntry priceDefinitionEntry = (PriceDefinitionEntry) o;
        return Objects.equals(this.id, priceDefinitionEntry.id) &&
            Objects.equals(this.value, priceDefinitionEntry.value) &&
            Objects.equals(this.optionSelections, priceDefinitionEntry.optionSelections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, optionSelections);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PriceDefinitionEntry {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    optionSelections: ").append(toIndentedString(optionSelections)).append("\n");
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