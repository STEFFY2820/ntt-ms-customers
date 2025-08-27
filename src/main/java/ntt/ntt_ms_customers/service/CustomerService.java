package ntt.ntt_ms_customers.service;

import ntt.ntt_ms_customers.dto.CustomerDto;
import reactor.core.publisher.Flux;

public interface CustomerService {

    public Flux<CustomerDto> findAllCustomers();

    /*public Mono<Customer> saveCustomer(Customer customer);*/

}
