package ntt.ntt_ms_customers.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BusinessCustomer extends Customer{
    private String companyName;
    private String ruc;
}
