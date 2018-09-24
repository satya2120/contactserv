package com.plivo.contactserv.repositories;

import org.springframework.data.repository.CrudRepository;

import java.io.Serializable;

public interface BaseRepository<T, ID extends Serializable> extends CrudRepository<T, ID> {
}
