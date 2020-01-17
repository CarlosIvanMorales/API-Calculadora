package es.springbootrestapi.service.impl;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import es.springbootrestapi.service.CalculadoraService;



/**
 * Implementación del servicio CalculadoraService
 */
@Service("calculadoraService")
public class CalculadoraServiceImpl implements CalculadoraService{
	
	@Override
	public BigDecimal suma(BigDecimal numero1, BigDecimal numero2) {
		return numero1.add(numero2);
	}

	@Override
	public BigDecimal resta(BigDecimal numero1, BigDecimal numero2) {
		return numero1.subtract(numero2);
	}	
}
