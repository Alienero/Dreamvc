package org.majorxie.dreamvc.template;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ����python��ģ�����
 * @author xiezhaodong
 *2014-11-14
 */
public interface Template {

	
	
	/**
	 * 
	 * @param req  request
	 * @param resp response
	 * @param models Ҫ���ݵ����ݣ�Ĭ����model
	 * @throws Exception
	 */
	void handleRender(HttpServletRequest req,HttpServletResponse resp,Map<String, Object> models)throws Exception;
}
