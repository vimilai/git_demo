package demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jfinal.handler.Handler;

public class aaa extends Handler {

	@Override
	public void handle(String target, HttpServletRequest request, HttpServletResponse response, boolean[] isHandled) {
                             
                              System.out.println("bbbbb");
                              System.out.println("aaaa");
	}

	public void aa() {
		System.out.println();
	}
}
