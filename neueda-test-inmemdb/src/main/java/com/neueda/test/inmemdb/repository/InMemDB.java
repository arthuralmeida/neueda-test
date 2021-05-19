package com.neueda.test.inmemdb.repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class InMemDB {

    private static final ConcurrentMap<String, String> db = new ConcurrentHashMap<>();

    static void save(String id, String value) {
        db.put(id, value);
    }

    static String get(String id) {
        return db.get(id);
    }
}
