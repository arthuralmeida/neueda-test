package com.neueda.test.repository;

public interface UrlRepository {

    void save(String id, String url);

    String get(String id);
}
