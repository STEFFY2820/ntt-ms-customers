package ntt.ntt_ms_customers.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PersonalCustomerResponseDto extends CustomerDto{
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
}
