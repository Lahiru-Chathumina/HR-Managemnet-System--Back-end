package edu.lahiru_chathumina_bandara.ecom.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

public class config {
    @Bean
    public ModelMapper getMapper(){
        return new ModelMapper();
    }
}
