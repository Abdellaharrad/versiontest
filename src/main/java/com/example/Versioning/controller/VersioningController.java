package com.example.Versioning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@RestController
public class VersioningController {

    @RequestMapping(value = "/")
    public String home() throws Exception{
        StringBuilder builder = new StringBuilder();
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("C:\\Abdellah\\4IIR\\StageOritech\\testVersioning\\Versioning\\src\\main\\resources\\version.txt"));
            String line = null;
            while ((line = reader.readLine()) != null)
                builder.append(line);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        if (reader != null) {
            try {
                reader.close();
            }
            catch (IOException ignored) {}
        }
        }
        return "<h1>v"+builder.toString()+"</h1>";
    }
}
