package ntt.ntt_ms_customers.mapper;

import ntt.ntt_ms_customers.dto.PersonalCustomerRequestDto;
import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import ntt.ntt_ms_customers.entity.PersonalCustomer;
import ntt.ntt_ms_customers.enums.CustomerType;

import java.util.function.Consumer;

public class PersonalCustomerMapper {

    public static PersonalCustomerResponseDto toResponse(PersonalCustomer entity) {
        return PersonalCustomerResponseDto.builder()
                .id(entity.getId())
                .type(entity.getType())
                .subType(entity.getSubType())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .firstName(entity.getFirstName())
                .lastName(entity.getLastName())
                .documentType(entity.getDocumentType())
                .documentNumber(entity.getDocumentNumber())
                .build();
    }

    public static PersonalCustomer toEntity(PersonalCustomerRequestDto request) {
        return PersonalCustomer.builder()
                .type(CustomerType.PERSONAL)
                .subType(request.getSubType())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .documentType(request.getDocumentType())
                .documentNumber(request.getDocumentNumber())
                .build();
    }

    public static <T> void updateIfNotNull(Consumer<T> setter, T value) {
        if (value != null) {
            setter.accept(value);
        }
    }

    public static void updateEntity(PersonalCustomer entity, PersonalCustomerRequestDto request) {
        updateIfNotNull(entity::setType, request.getType());
        updateIfNotNull(entity::setSubType, request.getSubType());
        updateIfNotNull(entity::setEmail, request.getEmail());
        updateIfNotNull(entity::setPhone, request.getPhone());
        updateIfNotNull(entity::setAddress, request.getAddress());
        updateIfNotNull(entity::setFirstName, request.getFirstName());
        updateIfNotNull(entity::setLastName, request.getLastName());
        updateIfNotNull(entity::setDocumentType, request.getDocumentType());
        updateIfNotNull(entity::setDocumentNumber, request.getDocumentNumber());
    }



}
