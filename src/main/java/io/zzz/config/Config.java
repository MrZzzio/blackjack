package io.zzz.config;

import io.zzz.interfaces.GameService;
import io.zzz.interfaces.Impl.GameServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by dmitry on 24.09.16.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "io.zzz")
public class Config {

}
