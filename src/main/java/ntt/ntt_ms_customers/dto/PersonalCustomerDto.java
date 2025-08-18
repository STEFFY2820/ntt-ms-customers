package ntt.ntt_ms_customers.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PersonalCustomerDto extends CustomerDto{
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
}
