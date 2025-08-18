package ntt.ntt_ms_customers.mapper;

import ntt.ntt_ms_customers.dto.BusinessCustomerDto;
import ntt.ntt_ms_customers.dto.CustomerDto;
import ntt.ntt_ms_customers.dto.PersonalCustomerDto;
import ntt.ntt_ms_customers.entity.BusinessCustomer;
import ntt.ntt_ms_customers.entity.Customer;
import ntt.ntt_ms_customers.entity.PersonalCustomer;

public class CustomerMapper {

    public static CustomerDto toDto(Customer entity) {
        if (entity instanceof PersonalCustomer) {
            PersonalCustomer p = (PersonalCustomer) entity;
            PersonalCustomerDto dto = new PersonalCustomerDto();
            dto.setId(p.getId());
            dto.setType(p.getType());
            dto.setEmail(p.getEmail());
            dto.setPhone(p.getPhone());
            dto.setAddress(p.getAddress());
            dto.setFirstName(p.getFirstName());
            dto.setLastName(p.getLastName());
            dto.setDocumentType(p.getDocumentType());
            dto.setDocumentNumber(p.getDocumentNumber());
            return dto;
        } else if (entity instanceof BusinessCustomer) {
            BusinessCustomer b = (BusinessCustomer) entity;
            BusinessCustomerDto dto = new BusinessCustomerDto();
            dto.setId(b.getId());
            dto.setType(b.getType());
            dto.setEmail(b.getEmail());
            dto.setPhone(b.getPhone());
            dto.setAddress(b.getAddress());
            dto.setCompanyName(b.getCompanyName());
            dto.setRuc(b.getRuc());
            return dto;
        }
        return null;
    }

    public static Customer toEntity(CustomerDto dto) {
        if (dto instanceof PersonalCustomerDto) {
            PersonalCustomerDto p = (PersonalCustomerDto) dto;
            PersonalCustomer entity = new PersonalCustomer();
            entity.setId(p.getId());
            entity.setType(p.getType());
            entity.setEmail(p.getEmail());
            entity.setPhone(p.getPhone());
            entity.setAddress(p.getAddress());
            entity.setFirstName(p.getFirstName());
            entity.setLastName(p.getLastName());
            entity.setDocumentType(p.getDocumentType());
            entity.setDocumentNumber(p.getDocumentNumber());
            return entity;
        } else if (dto instanceof BusinessCustomerDto) {
            BusinessCustomerDto b = (BusinessCustomerDto) dto;
            BusinessCustomer entity = new BusinessCustomer();
            entity.setId(b.getId());
            entity.setType(b.getType());
            entity.setEmail(b.getEmail());
            entity.setPhone(b.getPhone());
            entity.setAddress(b.getAddress());
            entity.setCompanyName(b.getCompanyName());
            entity.setRuc(b.getRuc());
            return entity;
        }
        return null;
    }

}
