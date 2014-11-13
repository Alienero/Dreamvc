package org.majorxie.dreamvc.ioc.factory;

import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;



/**
 *IOC ���� �����ӿ�
 *
 * @author xiezhaodong(majorxie@139.com)
 *2014-10-24
 */
public interface IocFactory {
	/**
	 * ��������
	 * @param config
	 */
	void init(ServletContext context);
	
	
	/**
	 * destory ioc
	 */
	void destroy();
	
	
	/**
	 * �õ����е�controller����
	 * @return
	 */
	List<Object> getControllers()throws Exception;
	
	/**
	 * �Ƿ���������
	 * @return
	 */
	List<Object> getInterceptors();
	
	/**
	 * �õ���������
	 * @return
	 */
	List<Object> getOthers();
	
	
	
	
	
}
