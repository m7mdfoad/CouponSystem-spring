/**
 * 
 */
package com.m7md.couponSystemSpring.login;

import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * @author scary
 *
 */
@Component
public @Data class Session {

	private ClientLogin login;
	private long lastAccesed;

}
