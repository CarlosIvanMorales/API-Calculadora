package es.springbootrestapi.controller.apidoc;

import java.math.BigDecimal;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestParam;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "Operaciones", produces = MediaType.APPLICATION_JSON_VALUE)
public interface CalculadoraApiDoc {

	/**
	 * Define operación suma entre 2 elementos
	 *
	 * @return Resultado operación suma entre 2 elementos
	 */
	@ApiOperation(value = "Suma entre 2 elementos", notes = "Devuelve resultado de la suma entre 2 elementos", response = double.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = double.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "User not found") })
	BigDecimal suma(@RequestParam("numero1") BigDecimal numero1, @RequestParam("numero2") BigDecimal numero2);

	/**
	 * Define operación resta entre 2 elementos
	 *
	 * @return Resultado operación resta entre 2 elementos
	 */
	@ApiOperation(value = "Resta entre 2 elementos", notes = "Devuelve resultado de la resta entre 2 elementos", response = double.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = double.class),
			@ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "User not found") })
	BigDecimal resta(@RequestParam("numero1") BigDecimal numero1, @RequestParam("numero2") BigDecimal numero2);
}
