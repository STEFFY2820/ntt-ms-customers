package ntt.ntt_ms_customers.controller;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.dto.PersonalCustomerRequestDto;
import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import ntt.ntt_ms_customers.service.PersonalCustomerService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/personal")
@RequiredArgsConstructor
public class PersonalCustomerController {

    private final PersonalCustomerService personalService;

    @GetMapping
    public Flux<PersonalCustomerResponseDto> getAllPersonalCustomer() {
        return personalService.finAllPersonalCustomers();
    }

    @GetMapping("/{id}")
    public Mono<PersonalCustomerResponseDto> getPersonalCustomerById (@PathVariable String id) {
        return personalService.findPersonalCustomerById(id);
    }

    @PostMapping
    public Mono<PersonalCustomerResponseDto> createPersonalCustomer(@RequestBody
                                                                  PersonalCustomerRequestDto request) {
        return personalService.savePersonalCustomer(request);
    }

    @PutMapping("/{id}")
    public Mono<PersonalCustomerResponseDto> updatePersonalCustomer(@PathVariable String id, @RequestBody PersonalCustomerRequestDto reques) {
        return personalService.updatePersonalCustomer(id, reques);
    }

    @DeleteMapping("/{id}")
    public Mono<Void> deletePersonalCustomer(@PathVariable String id) {
        return personalService.deletePersonalCustomer(id);
    }

}
