/*
 * This file is part of wegenenverkeer common-resteasy.
 * Copyright (c) AWV Agentschap Wegen en Verkeer, Vlaamse Gemeenschap
 * The program is available in open source according to the Apache License, Version 2.0.
 * For full licensing details, see LICENSE.txt in the project root.
 */

package be.wegenenverkeer.common.resteasy.exception;

/**
 * Exception which can be thrown if the service fails. This indicates a problem in the server which is not caused by
 * (faulty) client input.
 * <p/>
 * This is not intended for recoverable errors. For recoverable errors, it is recommended to use
 * {@link ValidationException} instead.
 * <p/>
 * Contrary to the other AbstractRestExceptions, ServiceExceptions are logged as errors. The other exceptions require
 * fixes on the client side. This exception indicates a problem which needs fixing on the server side.
 */
public class ServiceException extends AbstractRestException {

    /**
     * No-arguments constructor.
     */
    public ServiceException() {
        super();
    }

    /**
     * Constructor with message.
     *
     * @param message message
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Constructor with message and cause.
     *
     * @param message message
     * @param cause cause
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructor with cause.
     *
     * @param cause cause
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }

}
