package org.majorxie.dreamvc.ioc.factory;

import java.util.List;


/**
 * �����Spring�����������Լ�destory,�����Ŀ��Լ̳и��า�Ǵ˷���
 * �����Ҫ��չioc�������ѡ��ʹ��extends����implements
 *  @author xiezhaodong
 *2014-10-25
 */
public abstract class AbstractIocFactory implements IocFactory {
	/**
	 * Ĭ��ʵ��Ϊ��
	 */
	public void destroy() {
		
		
	}
	
	public List<Object> getOthers() {
		
		return null;
	}
	
	
}
