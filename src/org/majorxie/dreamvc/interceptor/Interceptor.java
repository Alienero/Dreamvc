package org.majorxie.dreamvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������tag
 * @author xiezhaodong
 *2014-10-27
 */
public interface Interceptor {
	/**
	 * ����
	 */
	void destory();
	
	/**
	 * ��ʼ��
	 */
	void init();
	/**
	 * ��ʱ����Ľӿ�
	 */
	boolean doInterceptor();
	
	
	void afterInterceptor();

}
