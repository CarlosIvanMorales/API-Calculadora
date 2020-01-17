package es.springbootrestapi.service.impl;

import org.springframework.stereotype.Service;

import es.springbootrestapi.service.TracerAPI;

/**
 * Implementación por defecto de {@link TracerAPI} - no es especialmente brillante, pero para la realización de la POC es más que de sobra.
 */
@Service("TraceAPI")
public class TracerImpl implements TracerAPI {

    /**
     * {@inheritDoc}
     */
    public <T> void trace( final T result ) {
        System.out.println( "result :: " + result.toString() );
    }

}
