package ntt.ntt_ms_customers.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ntt.ntt_ms_customers.dto.PersonalCustomerRequestDto;
import ntt.ntt_ms_customers.dto.PersonalCustomerResponseDto;
import ntt.ntt_ms_customers.exception.NotFoundException;
import ntt.ntt_ms_customers.mapper.PersonalCustomerMapper;
import ntt.ntt_ms_customers.repository.PersonalCustomerRepository;
import ntt.ntt_ms_customers.service.PersonalCustomerService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class PersonalCustomersServiceImpl implements PersonalCustomerService {

    private final PersonalCustomerRepository repository;

    public Flux<PersonalCustomerResponseDto> finAllPersonalCustomers() {
        return repository.findByType("PERSONAL")
                .map(PersonalCustomerMapper::toResponse);
    }

    public Mono<PersonalCustomerResponseDto> findPersonalCustomerById(String id) {
        return repository.findById(id).map(PersonalCustomerMapper::toResponse);
    }

    public Mono<PersonalCustomerResponseDto> savePersonalCustomer(PersonalCustomerRequestDto request) {
        return repository.save(PersonalCustomerMapper.toEntity(request))
                .map(PersonalCustomerMapper::toResponse);
    }

    public Mono<PersonalCustomerResponseDto> updatePersonalCustomer(String id, PersonalCustomerRequestDto request) {
        return repository.findById(id)
                .switchIfEmpty(Mono.error(new NotFoundException("cliente no encontrado")))
                .doOnError(e -> log.error("Error, cliente no encontrado", e))
                .map(entity -> {
                    PersonalCustomerMapper.updateEntity(entity, request);
                    return entity;
                })
                .flatMap(repository::save)
                .doOnError(e -> log.error("Fallo al actualizar cliente", id, e))
                .map(PersonalCustomerMapper::toResponse);
    }

    public Mono<Void> deletePersonalCustomer(String id) {
        return repository.deleteById(id);
    }

}
