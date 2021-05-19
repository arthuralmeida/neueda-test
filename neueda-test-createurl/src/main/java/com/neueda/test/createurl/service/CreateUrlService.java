package com.neueda.test.createurl.service;

import com.neueda.test.repository.UrlRepository;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUrlService {

    @Autowired
    private UrlRepository urlRepository;

    public String save(String url) {
        String id = generateId();
        urlRepository.save(id, url);
        return id;
    }

    private String generateId() {
        String id = RandomStringUtils.random(6, true, true);
        String url = urlRepository.get(id);
        if (url != null) {
            return generateId();
        }
        return id;
    }
}
