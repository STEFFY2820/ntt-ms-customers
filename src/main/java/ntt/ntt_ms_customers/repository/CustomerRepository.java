package ntt.ntt_ms_customers.repository;

import ntt.ntt_ms_customers.entity.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
}
