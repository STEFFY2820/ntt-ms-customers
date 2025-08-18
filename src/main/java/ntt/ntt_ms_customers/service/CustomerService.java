package ntt.ntt_ms_customers.service;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.entity.Customer;
import ntt.ntt_ms_customers.repository.CustomerRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;

    public Flux<Customer> findAll() {
        return repository.findAll();
    }

    public Mono<Customer> findById(String id) {
        return repository.findById(id);
    }

    public Mono<Customer> save(Customer customer) {
        return repository.save(customer);
    }

    public Mono<Void> deleteById(String id) {
        return repository.deleteById(id);
    }
}
