package io.mosip.pmp.misp.exception;

import io.mosip.kernel.core.exception.BaseUncheckedException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MISPException  extends BaseUncheckedException {

	private static final Logger MispLogger = LoggerFactory.getLogger(MISPException.class);
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -816564124301416073L;

	public MISPException(String errorCode, String errorMessage)
	{		
		super(errorCode, errorMessage);
		MispLogger.error(errorCode,errorMessage);
	}
	
	public MISPException(String errorCode, String errorMessage, Throwable rootCause)
	{
		super(errorCode, errorMessage, rootCause);
		MispLogger.error(errorCode,errorMessage);
	}

	public MISPException(String errorCode, Exception e) {
		super(errorCode,errorCode,e);		
	}

}
