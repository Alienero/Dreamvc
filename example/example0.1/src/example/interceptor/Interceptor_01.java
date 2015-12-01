package example.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.majorxie.dreamvc.annotation.InterceptorURI;
import org.majorxie.dreamvc.helpers.ActionContext;
import org.majorxie.dreamvc.interceptor.AbstractInterceptor;
@InterceptorURI(url="/user/string.do")//�������Ƕ�string.do����
public class Interceptor_01 extends AbstractInterceptor {

	@Override
	public boolean doInterceptor() {
		HttpServletRequest req=ActionContext.getActionContext().getHttpServletRequest();//Ҳ���Եõ�����
		HttpSession session=ActionContext.getActionContext().getHttpSession();
		//Ȼ���session���в���
		System.out.println("FIRST START JSESSIONID:"+session.getId());
		return true;//trueΪ���У�ִ����һ��������������false�򲻻��������
	}
	
	@Override
	public void afterInterceptor() {//���Ǹ��෽��
		//ִ���귽��֮��ִ�еķ���
		System.out.println("FIRST END ");
		super.afterInterceptor();
	}

}
