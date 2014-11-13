package org.majorxie.dreamvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InterceptorChain {
	
	private Execution execution;
	private Interceptor[] interceptors;
	int index=0;
	public Execution getExecution() {
		return execution;
	}
	public void setExecution(Execution execution) {
		this.execution = execution;
	}
	public Interceptor[] getInterceptors() {
		return interceptors;
	}
	public void setInterceptors(Interceptor[] interceptors) {
		this.interceptors = interceptors;
	}
	public InterceptorChain(Execution execution, Interceptor[] interceptors) {
		super();
		this.execution = execution;
		this.interceptors = interceptors;
	}
	/**
	 * ִ����֮�󷵻�
	 * @return
	 * @throws Exception
	 */
 public	Object exeInterceptor()throws Exception{
		boolean flag=true;
		for (int i = 0; i < interceptors.length; i++) {
			index=i;
			if(!interceptors[i].doInterceptor()){
				flag=false;
				break;		
			}
			
		}
		if(flag){
			Object result=execution.execute();
			return result;
		}
		return null;
		
	}
 /**
  * ִ�к�������
  */
 public void exeAfterInterceptor(){
	 if(interceptors.length!=0){//����������ִ�У����û��������index����0
	 for (int i = index; i>= 0; i--) {
			interceptors[i].afterInterceptor();
		}
	 }
 }
	
	
}
