package common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import member.model.vo.User;


/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter(urlPatterns= {"/member/edit-info","/member/deleteMember",
		"/booking/bookingfrm","/booking/bookingInsert","/booking/bookinglist","/booking/updateBookingFrm","/booking/bookingUpdate","/booking/deleteBooking"
		})
public class LoginFilter implements Filter {

    /**
     * Default constructor. 
     */
    public LoginFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpReq = (HttpServletRequest)request;
		HttpSession session = httpReq.getSession();
		User userLoggedIn = (User)session.getAttribute("userLoggedIn");
		
		if (userLoggedIn == null) {
			request.setAttribute("msg", "로그인후 이용하실수 있습니다.");
			request.setAttribute("loc", "/");
			request.getRequestDispatcher("/WEB-INF/views/common/msg.jsp").forward(request, response);
			return;//이하 코드가 처리되지 않도록함.
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
