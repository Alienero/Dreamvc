package org.majorxie.dreamvc.exception;
/**
 * �Ƿ�����������
 * @author xiezhaodong
 *2014-10-29
 */
public class NoIocInstanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public NoIocInstanceException() {
		super();
	}
	
	
	public NoIocInstanceException(String message){
		super(message);
	}
}
