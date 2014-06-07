package com.campitos.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

 @Configuration
 
public class ServiciosCampos {
     @Bean
     Persona ejecutarGracia(){
         return new CuentaChistes();    
         
     }
    
}
