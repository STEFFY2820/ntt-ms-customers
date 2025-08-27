package ntt.ntt_ms_customers.dto;

import lombok.Data;

@Data
public class BusinessCustomerRequestDto {
    private String companyName;
    private String ruc;
    private String type;
    private String email;
    private String phone;
    private String address;
}
