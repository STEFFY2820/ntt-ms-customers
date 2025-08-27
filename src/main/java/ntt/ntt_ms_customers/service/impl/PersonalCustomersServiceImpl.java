package ntt.ntt_ms_customers.service.impl;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import ntt.ntt_ms_customers.mapper.PersonalCustomerMapper;
import ntt.ntt_ms_customers.repository.PersonalCustomerRepository;
import ntt.ntt_ms_customers.service.PersonalCustomerService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class PersonalCustomersServiceImpl implements PersonalCustomerService {

    private final PersonalCustomerRepository repository;
    private final PersonalCustomerMapper personalMapper;

    public Flux<PersonalCustomerResponseDto> finAllPersonalCustomers() {
        return repository.findAll().map(personalMapper::toPersonalResponse);
    }

}
