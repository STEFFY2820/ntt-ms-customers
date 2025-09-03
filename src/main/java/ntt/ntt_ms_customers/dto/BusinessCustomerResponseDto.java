package ntt.ntt_ms_customers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ntt.ntt_ms_customers.entity.AuthorizedSigner;
import ntt.ntt_ms_customers.entity.Headlines;

import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BusinessCustomerResponseDto extends CustomerDto{
    private String companyName;
    private String ruc;
    private List<Headlines> headlines;
    private List<AuthorizedSigner> authorizedSigners;
}
