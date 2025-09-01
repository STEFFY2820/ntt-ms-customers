package ntt.ntt_ms_customers.mapper;

import ntt.ntt_ms_customers.dto.BusinessCustomerRequestDto;
import ntt.ntt_ms_customers.dto.BusinessCustomerResponseDto;
import ntt.ntt_ms_customers.entity.BusinessCustomer;
import ntt.ntt_ms_customers.enums.CustomerType;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@Component
public class BusinessCustomerMapper {

    public BusinessCustomerResponseDto toResponse(BusinessCustomer entity) {
        return BusinessCustomerResponseDto.builder()
                .id(entity.getId())
                .type(entity.getType())
                .subType(entity.getSubType())
                .email(entity.getEmail())
                .phone(entity.getPhone())
                .address(entity.getAddress())
                .companyName(entity.getCompanyName())
                .ruc(entity.getRuc())
                .build();
    }

    public BusinessCustomer toEntity(BusinessCustomerRequestDto request) {
        return BusinessCustomer.builder()
                .type(CustomerType.BUSINESS)
                .subType(request.getSubType())
                .email(request.getEmail())
                .phone(request.getPhone())
                .address(request.getAddress())
                .companyName(request.getCompanyName())
                .ruc(request.getRuc())
                .build();
    }

    private  <T> void updateIfNotNull(Consumer<T> setter, T value) {
        if (value != null) {
            setter.accept(value);
        }
    }

    public void updateEntity(BusinessCustomer entity, BusinessCustomerRequestDto request) {
        updateIfNotNull(entity::setType, request.getType());
        updateIfNotNull(entity::setSubType, request.getSubType());
        updateIfNotNull(entity::setEmail, request.getEmail());
        updateIfNotNull(entity::setPhone, request.getPhone());
        updateIfNotNull(entity::setAddress, request.getAddress());
        updateIfNotNull(entity::setCompanyName, request.getCompanyName());
        updateIfNotNull(entity::setRuc, request.getRuc());
    }

}
