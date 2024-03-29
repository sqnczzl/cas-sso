/* 
 * Licensed to Jasig under one or more contributor license 
 * agreements. See the NOTICE file distributed with this work 
 * for additional information regarding copyright ownership. 
 * Jasig licenses this file to you under the Apache License, 
 * Version 2.0 (the "License"); you may not use this file 
 * except in compliance with the License.  You may obtain a 
 * copy of the License at the following location: 
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, 
 * software distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY 
 * KIND, either express or implied.  See the License for the 
 * specific language governing permissions and limitations 
 * under the License. 
 */
package org.jasig.cas.authentication.handler;

import org.jasig.cas.ticket.TicketException;
/** 
 * The exception to throw when we know the authcode is null 
 *  
 * @author zzl 
 * @version $Revision$ $Date$ 
 * @since 3.0 
 */
public class NullAuthcodeAuthenticationException extends TicketException {

	/** Serializable ID for unique id. */
	private static final long serialVersionUID = 5501212207531289993L;

	/** Code description. */
	public static final String CODE = "required.authcode";

	/**
	 * Constructs a TicketCreationException with the default exception code.
	 */
	public NullAuthcodeAuthenticationException() {
		super(CODE);
	}

	/**
	 * Constructs a TicketCreationException with the default exception code and
	 * the original exception that was thrown.
	 * 
	 * @param throwable
	 *            the chained exception
	 */
	public NullAuthcodeAuthenticationException(final Throwable throwable) {
		super(CODE, throwable);
	}
}