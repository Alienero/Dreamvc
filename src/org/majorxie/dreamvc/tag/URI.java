package org.majorxie.dreamvc.tag;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.majorxie.dreamvc.interceptor.Interceptor;

/**
 * uri ��
 * @author xiezhaodong
 *
 */
public class URI {
	
	private String uri;

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public URI(String uri) {
		super();
		this.uri = uri;
	}
	/**
	 * ƥ����Ӧ��interceptor
	 * @param interceptor_map  װ��interceptor��map
	 * @return ������·������������
	 */
	public List<Interceptor> getMatchedInterceptor(Map<String,Interceptor> interceptor_map){
		List<Interceptor> list=new ArrayList<Interceptor>();
		for (String interceptorUri:interceptor_map.keySet()) {
			String returnInterceptor=matcher(this.uri, interceptorUri);
			if(returnInterceptor!=null){
				list.add(interceptor_map.get(returnInterceptor));
			}		
		}	
		return list;
	}
	
	
	/**
	 * �ж�url��������·���Ƿ���Եȼ۱��� /user/login��/user/*����Եȼ۵ģ����ܹ�ƥ��
	 * @param url ����url
	 * @param interceptors ������url
	 * @return ƥ��ɹ����أ����򷵻�null
	 */
public String matcher(String url,String interceptors){
		
		
		if(url.equals(interceptors))return interceptors;//��ȫ��ͬ		
		if(interceptors.endsWith("/"))return null;//����������β
		String[] urlsArray=url.split("/");
		String[] interceptorsArray=interceptors.split("/");
		
		
		if(interceptorsArray.length<urlsArray.length){
			boolean isMatched=true;
			if(interceptorsArray[interceptorsArray.length-1].equals("*")){
				//�������url��������Ҫ��*��β
			for(int i = 0; i < interceptorsArray.length; i++) {
				if(!isMatched(urlsArray[i], interceptorsArray[i])){//�Զ̵�һ��Ϊ����
					isMatched=false;
					break;
				}
			}
				if(isMatched)return interceptors;
			
			}else{		
				return null;
			}
			
		}
		
		if(interceptorsArray.length==urlsArray.length){
			//����
			boolean isMatched=true;
			for (int i = 0; i < interceptorsArray.length; i++) {//���ȶ�һ��
				if(!isMatched(urlsArray[i], interceptorsArray[i])){			
					isMatched=false;
					break;
				}
			}
			if(isMatched){//������ƥ���껹����ͬ�Ļ�		
				return interceptors;
			}			
		}
	
		return null;
	
	}
	/**
	 * ƥ��ÿһ���ڵ�
	 * @param urlPart ԭʼ·���ڵ�
	 * @param intersPart ����·���ڵ�
	 * @return
	 */
	private  boolean isMatched(String urlPart,String interceptorPart){
		return urlPart.equals(interceptorPart)||interceptorPart.equals("*");
	}
	
	//��дhashcode()��equals������Ҫ��Ϊmap��key
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return uri.hashCode();
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj){
			return true;
		}else if(obj instanceof URI){
			return ((URI) obj).uri.equals(this.uri);
			
		}
		return false;

	}
	

}
