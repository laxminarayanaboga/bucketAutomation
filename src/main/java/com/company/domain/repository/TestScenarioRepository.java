package com.company.domain.repository;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;

import com.company.domain.entity.TestScenario;

@Component
public interface TestScenarioRepository extends MongoRepository<TestScenario, String>  {
	@Query("{ '_id' : ?0 }")
    TestScenario getTestScenario(ObjectId id);
}
