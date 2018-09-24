package com.plivo.contactserv.repositories;

import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends BaseRepository<User, Integer>{
}
