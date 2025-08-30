package ntt.ntt_ms_customers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PersonalCustomer extends Customer{
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
}
