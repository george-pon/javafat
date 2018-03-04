package test.my;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = { "mps" }, loadOnStartup = 1)
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPostGetCommon(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPostGetCommon(request, response);
	}

	void doPostGetCommon(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String mps = request.getParameter("mps");
		if (mps == null) {
			mps = "1";
		}

		String count = request.getParameter("count");
		if (count == null) {
			count = "0";
		}

		String sum = request.getParameter("sum");
		if (sum == null) {
			sum = "0";
		}

		long longsum = Long.parseLong(sum);
		long longmps = Long.parseLong(mps);
		long longcount = Long.parseLong(count);

		{
			// óêêî
			Random r = new Random();
			// generate string data
			String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			StringBuffer sb = new StringBuffer();
			while (sb.length() < longmps * 1024 * 1024) {
				// ÉâÉìÉ_ÉÄÇ…àÍï∂éöí«â¡
				int idx = r.nextInt(s.length());
				sb.append(s.charAt(idx));
				// écÇËÇÕìØÇ∂
				sb.append(s);
			}
			// save to singleton hash map
			HashMapSingleton.getInstance().getMap().put(count, sb.toString());
			longsum += longmps;
		}

		request.setAttribute("mps", mps);
		longcount++;
		request.setAttribute("count", "" + longcount);
		request.setAttribute("sum", "" + longsum);
		request.getRequestDispatcher("response.jsp").forward(request, response);
	}

}
