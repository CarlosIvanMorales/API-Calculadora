package es.springbootrestapi.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import es.springbootrestapi.controller.apidoc.CalculadoraApiDoc;
import es.springbootrestapi.service.CalculadoraService;

/**
 * The Class CalculadoraController.
 *
 */

@RestController
@RequestMapping("/api")
public class CalculadoraController implements CalculadoraApiDoc {

	/** The user service. */
	@Autowired
	private CalculadoraService calculadoraService;

	@GetMapping(value = "/suma", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@Override
	public BigDecimal suma(@RequestParam("numero1") BigDecimal numero1, @RequestParam("numero2") BigDecimal numero2) {

		return calculadoraService.suma(numero1, numero2);
	}

	@GetMapping(value = "/resta", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	@Override
	public BigDecimal resta(@RequestParam("numero1") BigDecimal numero1, @RequestParam("numero2") BigDecimal numero2) {

		return calculadoraService.resta(numero1, numero2);
	}
}