package ntt.ntt_ms_customers.service;

import ntt.ntt_ms_customers.dto.PersonalCustomerRequestDto;
import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonalCustomerService {

    public Flux<PersonalCustomerResponseDto> finAllPersonalCustomers();

    public Mono<PersonalCustomerResponseDto> findPersonalCustomerById(String id);

    public Mono<PersonalCustomerResponseDto> savePersonalCustomer(PersonalCustomerRequestDto request);

    public Mono<PersonalCustomerResponseDto> updatePersonalCustomer(String id, PersonalCustomerRequestDto request);

    public Mono<Void> deletePersonalCustomer(String id);

}
