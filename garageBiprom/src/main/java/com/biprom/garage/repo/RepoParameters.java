package com.biprom.garage.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.biprom.garage.model.Parameters;

@Repository("repository")
public interface RepoParameters extends MongoRepository<Parameters,Long> {
	public Parameters findByParam(String param);
}
