package org.application.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR,reason="This ticket has been already checked in.")
public class TicketAlreadyCheckedInException extends Exception {
	private static final long serialVersionUID = 100L;
}
