package org.majorxie.dreamvc.template;

import org.majorxie.dreamvc.tag.Contextconfig.StrategyConfig;

/**
 * ���󹤳������ڳ�ʼ��ģ�幤��
 * @author xiezhaodong
 *2014-11-14
 */
public abstract class TemplateFactory {
	private static TemplateFactory instance;
	
	
	public static void setInstance(TemplateFactory instance) {
		TemplateFactory.instance = instance;
	}
	
	public static TemplateFactory getInstance(){
		return instance;
	}
	
	/**
	 * ��ʼ��һЩ����������
	 * @param config
	 */
	public abstract void init(StrategyConfig config);
	
	/**
	 * ����ģ��
	 * @param path Ҫ���ص�·��
	 */
	public abstract Template initTemplate(String path,ForwardType type);
	
	
}
