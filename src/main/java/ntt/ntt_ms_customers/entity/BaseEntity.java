package ntt.ntt_ms_customers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseEntity {
    private String id;
    private String fullName;
    private String documentType;
    private String documentNumber;
}
