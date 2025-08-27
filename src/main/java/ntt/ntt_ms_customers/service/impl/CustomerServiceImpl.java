package ntt.ntt_ms_customers.service.impl;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.dto.CustomerDto;
import ntt.ntt_ms_customers.entity.Customer;
import ntt.ntt_ms_customers.mapper.ListCustomerMapper;
import ntt.ntt_ms_customers.repository.CustomerRepository;
import ntt.ntt_ms_customers.service.CustomerService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    public Flux<CustomerDto> findAllCustomers() {
        return repository.findAll().map(ListCustomerMapper::listCustomers);
    }

    public Mono<Customer> saveCustomer(Customer customer){
        return repository.save(customer);
    }

    /*public Mono<Customer> save(Customer customer) {
        return repository.save(customer);
    }*/

    /*public Mono<Customer> findById(String id) {
        return repository.findById(id);
    }



    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }*/
}
