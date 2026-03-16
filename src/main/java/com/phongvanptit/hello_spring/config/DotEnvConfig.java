package com.phongvanptit.hello_spring.config;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MapPropertySource;

import java.util.HashMap;
import java.util.Map;

public class DotEnvConfig implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment environment,
                                       SpringApplication application) {
        String profile = environment.getProperty("spring.profiles.active", "dev");

        Dotenv dotenv = Dotenv.configure()
                .filename(".env." + profile)
                .ignoreIfMissing()
                .load();

        Map<String, Object> envVars = new HashMap<>();
        dotenv.entries().forEach(entry ->
                envVars.put(entry.getKey(), entry.getValue())
        );

        environment.getPropertySources()
                .addFirst(new MapPropertySource("dotenvProperties", envVars));
    }
}