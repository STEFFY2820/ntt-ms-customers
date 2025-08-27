package ntt.ntt_ms_customers.dto;

import lombok.Data;

@Data
public class PersonalCustomerRequestDto {
    private String firstName;
    private String lastName;
    private String documentType;
    private String documentNumber;
    private String type;
    private String email;
    private String phone;
    private String address;
}
