package ntt.ntt_ms_customers.repository;

import ntt.ntt_ms_customers.entity.PersonalCustomer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PersonalCustomerRepository extends ReactiveMongoRepository<PersonalCustomer, String> {
    Flux<PersonalCustomer> findByType(String type);
}
