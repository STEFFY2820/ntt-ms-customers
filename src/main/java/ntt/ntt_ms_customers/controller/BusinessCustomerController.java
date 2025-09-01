package ntt.ntt_ms_customers.controller;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.dto.BusinessCustomerRequestDto;
import ntt.ntt_ms_customers.dto.BusinessCustomerResponseDto;
import ntt.ntt_ms_customers.service.BusinessCustomerService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/business")
@RequiredArgsConstructor
public class BusinessCustomerController {

    private final BusinessCustomerService businessService;

    @GetMapping
    public Flux<BusinessCustomerResponseDto> getAllBusinessCustomers() {
        return businessService.findAllBusinessCustomers();
    }

    @GetMapping("/{id}")
    public Mono<BusinessCustomerResponseDto> getBusinessCustomerById(@PathVariable String id) {
        return businessService.findBusinessCustomerById(id);
    }

    @PostMapping
    public Mono<BusinessCustomerResponseDto> createBusinessCustomer(@RequestBody BusinessCustomerRequestDto request) {
        return businessService.saveBusinessCustomer(request);
    }

    @PutMapping("/{id}")
    public Mono<BusinessCustomerResponseDto> updateBusinessCustomer(@PathVariable String id,
                                                                    @RequestBody BusinessCustomerRequestDto request) {
        return businessService.updateBusinessCustomer(id, request);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deleteBusinessCustomer(@PathVariable String id) {
        return businessService.deleteBusinessCustomer(id);
    }

}
