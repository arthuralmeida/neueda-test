package com.neueda.test.inmemdb.repository;

import com.neueda.test.repository.UrlRepository;
import org.springframework.stereotype.Repository;

@Repository
public class InMemUrlRepository implements UrlRepository {

    @Override
    public void save(String id, String url) {
        InMemDB.save(id, url);
    }

    @Override
    public String get(String id) {
        return InMemDB.get(id);
    }
}
