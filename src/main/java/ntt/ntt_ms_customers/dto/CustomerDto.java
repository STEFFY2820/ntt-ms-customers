package ntt.ntt_ms_customers.dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PersonalCustomerDto.class, name = "personal"),
        @JsonSubTypes.Type(value = BusinessCustomerDto.class, name = "empresarial")
})
@Data
public class CustomerDto {
    private String id;

    @NotBlank
    private String type;

    private String email;

    private String phone;
    private String address;
}
