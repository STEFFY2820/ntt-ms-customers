package ntt.ntt_ms_customers.controller;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.entity.Customer;
import ntt.ntt_ms_customers.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService service;

    @GetMapping
    public Flux<Customer> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Customer> getById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping
    public Mono<Customer> create(@RequestBody Customer customer) {
        return service.save(customer);
    }

    @PutMapping("/{id}")
    public Mono<Customer> update(@PathVariable String id, @RequestBody Customer customer) {
        customer.setId(id);
        return service.save(customer);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }
}
