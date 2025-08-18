package ntt.ntt_ms_customers.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessCustomerDto extends CustomerDto{
    private String companyName;
    private String ruc;
}
