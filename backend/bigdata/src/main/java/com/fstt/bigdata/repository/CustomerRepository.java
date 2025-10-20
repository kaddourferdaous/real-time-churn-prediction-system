package com.fstt.bigdata.repository;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;
import com.fstt.bigdata.Entity.Customer;

import java.util.List;
import java.util.UUID;

@Repository
public interface CustomerRepository extends CassandraRepository<Customer, UUID> {

}

