package ntt.ntt_ms_customers.service;

import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import reactor.core.publisher.Flux;

public interface PersonalCustomerService {

    public Flux<PersonalCustomerResponseDto> finAllPersonalCustomers();

}
