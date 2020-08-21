package healthBoard.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.util.Utils;
import healthBoard.model.service.HealthBoardService;
import healthBoard.model.vo.HealthBoard;

/**
 * Servlet implementation class HealthBoardFinderServlet
 */
@WebServlet("/healthBoard/healthBoardFinder")
public class HealthBoardFinderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HealthBoardFinderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String searchType = request.getParameter("searchType");
		String searchKeyword = request.getParameter("searchKeyword");
		int numPerPage =10;
		int cPage=1;
		try {
			cPage = Integer.parseInt(request.getParameter("cPage"));
		}catch(NumberFormatException e) {
//			예외가 던져진 경우, cPage = 1로 유지
		}
		
		List<HealthBoard> list = new HealthBoardService().searchBoard(searchType, searchKeyword, cPage, numPerPage);
		
		int totalContents = new HealthBoardService().selectTotalContents(searchType,searchKeyword);
		
		String url = request.getRequestURI() + "?searchType=" +searchType
				+"&searchKeyword="+searchKeyword+"&";
		String pageBar = Utils.getPageBarHtml2(cPage, numPerPage, totalContents, url);
		
		request.setAttribute("list", list);
		request.setAttribute("pageBar", pageBar);
		request.getRequestDispatcher("/WEB-INF/views/healthBoard/health_boardFinder.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
