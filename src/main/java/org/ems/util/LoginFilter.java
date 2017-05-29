package org.ems.util;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;


@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class LoginFilter implements Filter {

    private static final boolean CONDITION = true;

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest reqt = (HttpServletRequest)request;
		System.out.println("reqt.getQueryString(): "+reqt.getQueryString());
		if(true){
		System.out.println("in do Filter: "+request.getParameterMap());
		if(CONDITION){
			System.out.println("before doFilter");
            chain.doFilter(request,response);
		}
        else{
            ((HttpServletResponse)response).setStatus(HttpServletResponse.SC_BAD_REQUEST);
        }
		
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("inside init filter");
		
	}

   
}
