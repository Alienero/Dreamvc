package org.majorxie.dreamvc.tag.Contextconfig;

import javax.servlet.ServletContext;
/**
 * 2014-10-28
 * @author xiezhaodong
 *
 */
public interface StrategyConfig {
	
	/**
	 * �õ�ָ���˲���
	 * @return
	 */
	String getInitParameter(String name);
	/**
	 * 
	 * @return servlet context
	 */
	ServletContext getServletContext();

}
