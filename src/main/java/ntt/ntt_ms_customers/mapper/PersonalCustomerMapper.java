package ntt.ntt_ms_customers.mapper;

import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import ntt.ntt_ms_customers.entity.PersonalCustomer;
import org.springframework.stereotype.Component;

@Component
public class PersonalCustomerMapper {

    public PersonalCustomerResponseDto toPersonalResponse(PersonalCustomer entity) {
        return PersonalCustomerResponseDto.builder()
                .id(entity.getId())
                .type(entity.getType())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .documentType(entity.getDocumentType())
                .documentNumber(entity.getDocumentNumber())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .build();
    }

}
