package ntt.ntt_ms_customers.dto;

import lombok.Data;
import ntt.ntt_ms_customers.enums.CustomerSubType;
import ntt.ntt_ms_customers.enums.CustomerType;

@Data
public class BusinessCustomerRequestDto {
    private CustomerType type;
    private CustomerSubType subType;
    private String email;
    private String phone;
    private String address;
    private String companyName;
    private String ruc;
}
