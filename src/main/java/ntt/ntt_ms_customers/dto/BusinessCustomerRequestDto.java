package ntt.ntt_ms_customers.dto;

import lombok.Data;
import ntt.ntt_ms_customers.entity.AuthorizedSigner;
import ntt.ntt_ms_customers.entity.Headlines;
import ntt.ntt_ms_customers.enums.CustomerSubType;
import ntt.ntt_ms_customers.enums.CustomerType;

import java.util.List;

@Data
public class BusinessCustomerRequestDto {
    private CustomerType type;
    private CustomerSubType subType;
    private String email;
    private String phone;
    private String address;
    private String companyName;
    private String ruc;
    private List<Headlines> headlines;
    private List<AuthorizedSigner> authorizedSigners;
}
