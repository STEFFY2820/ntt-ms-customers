package ntt.ntt_ms_customers.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class BusinessCustomerResponseDto extends CustomerDto{
    private String companyName;
    private String ruc;
}
