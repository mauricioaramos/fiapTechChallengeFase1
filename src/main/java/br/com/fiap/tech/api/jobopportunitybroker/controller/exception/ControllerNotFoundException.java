package br.com.fiap.tech.api.jobopportunitybroker.controller.exception;

public class ControllerNotFoundException extends  RuntimeException {
    public ControllerNotFoundException(String message) {
        super(message);
    }
}
