package com.leapworx.notemaker.service;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;

@Service
public class ContentService {

    @Cacheable(value = "contentCache", key = "#noteID")
    public String getNoteContent(Integer noteID) throws Exception {
        String data = "";
        BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.home")
                + "/temp/DummyContent.txt"));

        String line = "";

        while((line = br.readLine()) != null) {
            data = data + line + System.lineSeparator();
        }

        br.close();

        return data;

    }
}
