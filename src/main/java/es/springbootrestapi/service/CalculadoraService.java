package es.springbootrestapi.service;

import java.math.BigDecimal;

/**
 * Interfaz del servicio Calculadora
 */
public interface CalculadoraService {

	/**
	 * Operación suma
	 * 
	 * @param numero1 - primer elemento
	 * @param numero2 - segundo elemento
	 * 
	 * @return suma de 2 elementos
	 */
	BigDecimal suma(BigDecimal numero1, BigDecimal numero2);
	

	/**
	 * Operación resta
	 * 
	 * @param numero1 - primer elemento
	 * @param numero2 - segundo elemento
	 * 
	 * @return resta de 2 elementos
	 */
	BigDecimal resta(BigDecimal numero1, BigDecimal numero2);
}
