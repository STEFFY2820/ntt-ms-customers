package ntt.ntt_ms_customers.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PersonalCustomer extends Customer{
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
}
