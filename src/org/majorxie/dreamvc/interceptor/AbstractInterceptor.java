package org.majorxie.dreamvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����
 * @author xiezhaodong
 *
 */
public abstract class AbstractInterceptor implements Interceptor {

	public void destory() {

	}

	public void init() {
		
	}

	public abstract boolean  doInterceptor();
	
	public void afterInterceptor() {
		
	}

}
