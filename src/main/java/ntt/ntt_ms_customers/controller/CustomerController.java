package ntt.ntt_ms_customers.controller;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.dto.CustomerDto;
import ntt.ntt_ms_customers.service.CustomerService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @GetMapping
    public Flux<CustomerDto> getAll() {
        return customerService.findAllCustomers();
    }

    /*@PostMapping
    public Mono<Customer> save(@Valid @RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/{id}")
    public Mono<CustomerDto> getById(@PathVariable String id) {
        return service.findById(id).map(CustomerMapper::toDto);
    }

    @PutMapping("/{id}")
    public Mono<CustomerDto> update(@PathVariable String id, @Valid @RequestBody CustomerDto dto) {
        dto.setId(id);
        return service.save(CustomerMapper.toEntity(dto))
                .map(CustomerMapper::toDto);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> delete(@PathVariable String id) {
        return service.deleteById(id);
    }*/

}
