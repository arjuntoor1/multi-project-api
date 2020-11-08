package com.toor.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AppService {
    private final static Logger LOG = LoggerFactory.getLogger(AppService.class);

    public AppService(@Value("${com.toor.test-prop-one}") String testPropOne,
                      @Value("${com.toor.test-prop-two}") String testPropTwo) {
        LOG.info("testPropOne[value:'{}', endsWith:'{}']", testPropOne, getLastChar(testPropOne));
        LOG.info("testPropTwo[value:'{}', endsWith:'{}']", testPropTwo, getLastChar(testPropTwo));
    }

    private Character getLastChar(String val) {
        return Optional.ofNullable(val)
                .map(v -> v.charAt(v.length()-1))
                .orElseThrow(() -> new IllegalArgumentException("val was null"));
    }
}
