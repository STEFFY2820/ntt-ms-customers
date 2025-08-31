package ntt.ntt_ms_customers.dto;

import lombok.Data;
import ntt.ntt_ms_customers.enums.CustomerSubType;

@Data
public class PersonalCustomerRequestDto {
    private String type;
    private CustomerSubType subType;
    private String email;
    private String phone;
    private String address;
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
}
