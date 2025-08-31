package ntt.ntt_ms_customers.entity;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import ntt.ntt_ms_customers.enums.CustomerSubType;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = PersonalCustomer.class, name = "personal"),
        @JsonSubTypes.Type(value = BusinessCustomer.class, name = "empresarial")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Document(collection = "customers")
public class Customer {
    @Id
    private String id;
    private String type;
    private CustomerSubType subType;
    private String email;
    private String phone;
    private String address;
}
