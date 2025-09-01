package ntt.ntt_ms_customers.service.impl;

import lombok.RequiredArgsConstructor;
import ntt.ntt_ms_customers.dto.BusinessCustomerRequestDto;
import ntt.ntt_ms_customers.dto.BusinessCustomerResponseDto;
import ntt.ntt_ms_customers.mapper.BusinessCustomerMapper;
import ntt.ntt_ms_customers.repository.BusinessCustomerRepository;
import ntt.ntt_ms_customers.service.BusinessCustomerService;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class BusinessCustomerServiceImpl implements BusinessCustomerService {

    private final BusinessCustomerRepository repository;
    private final BusinessCustomerMapper businessMapper;

    public Flux<BusinessCustomerResponseDto> findAllBusinessCustomers() {
        return repository.findByType("BUSINESS")
                .map(businessMapper::toResponse);
    }

    public Mono<BusinessCustomerResponseDto> findBusinessCustomerById(String id) {
        return repository.findById(id)
                .map(businessMapper::toResponse);
    }

    public Mono<BusinessCustomerResponseDto> saveBusinessCustomer(BusinessCustomerRequestDto request) {
        return repository.save(businessMapper.toEntity(request))
                .map(businessMapper::toResponse);
    }

    public Mono<BusinessCustomerResponseDto> updateBusinessCustomer(String id, BusinessCustomerRequestDto request) {
        return repository.findById(id)
                .map(x -> {
                    businessMapper.updateEntity(x, request);
                    return x;
                })
                .flatMap(repository::save)
                .map(businessMapper::toResponse);
    }

    public Mono<Void> deleteBusinessCustomer(String id) {
        return repository.deleteById(id);
    }

}
