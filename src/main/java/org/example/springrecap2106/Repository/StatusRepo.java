package org.example.springrecap2106.Repository;

import org.example.springrecap2106.Model.Status;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusRepo extends MongoRepository<Status, String> {

}
