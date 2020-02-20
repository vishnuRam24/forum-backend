package com.ce.forim.Forum.Repo;

import com.ce.forim.Forum.Model.Login;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILogin extends MongoRepository<Login,String> {
}
