package com.cydeo.config;

import com.cydeo.Currency;
import com.cydeo.account.Current;
import com.cydeo.account.Saving;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.UUID;

@Configuration
public class Config {

    @Bean
    Currency currency(){
        return new Currency("1","USD");
    }

    @Bean
    Saving saving(Currency currency){
        return new Saving(currency,new BigDecimal("1000"),UUID.randomUUID());
    }

    @Bean
    Current current(Currency currency){
        return new Current(currency,new BigDecimal("1500"),UUID.randomUUID());
    }

}
