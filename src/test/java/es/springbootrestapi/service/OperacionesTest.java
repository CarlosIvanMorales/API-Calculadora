package es.springbootrestapi.service;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class OperacionesTest {
	
    @Autowired
    CalculadoraService calculadoraService;

    @DisplayName("Test CalculadoraService suma")
    @Test
    public void CalculadoraServiceSumaTest() {   
    	 assertEquals(new BigDecimal(2), calculadoraService.suma(new BigDecimal(1), new BigDecimal(1)));
    }
    
    @DisplayName("Test CalculadoraService resta")
    @Test
    public void CalculadoraServiceRestaTest() {   
    	 assertEquals(new BigDecimal(2), calculadoraService.resta(new BigDecimal(4), new BigDecimal(2)));
    }
}