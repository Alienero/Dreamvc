package example.interceptor;

import org.majorxie.dreamvc.annotation.InterceptorURI;
import org.majorxie.dreamvc.interceptor.Interceptor;
@InterceptorURI(url="/*/string.do")//����Ҳ�ܶ�/user/string.do�������ػ���/*/*Ҳ����
public class Interceptor_02 implements Interceptor {

	public void destory() {

	}

	public void init() {

	}

	public boolean doInterceptor() {
		System.out.println("second start");
		return false;
	}

	public void afterInterceptor() {
		System.out.println("second end");

	}

}
