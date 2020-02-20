package com.ce.forim.Forum.Repo;

import com.ce.forim.Forum.Model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface INewUser extends MongoRepository<Users,Long> {
}
