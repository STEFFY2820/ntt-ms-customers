package ntt.ntt_ms_customers.repository;

import ntt.ntt_ms_customers.entity.BusinessCustomer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;

public interface BusinessCustomerRepository extends ReactiveMongoRepository<BusinessCustomer, String> {

    Flux<BusinessCustomer> findByType(String type);

}
