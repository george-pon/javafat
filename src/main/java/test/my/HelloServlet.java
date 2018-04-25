package test.my;

import java.io.IOException;
import java.util.Random;
import java.util.Date;

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

		String cps = request.getParameter("cps");
		if (cps == null) {
			cps = "1";
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
		long longcps = Long.parseLong(cps);
		long longcount = Long.parseLong(count);

		{
			// メモリ消費処理
			// 乱数
			Random r = new Random();
			// generate string data
			String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			StringBuffer sb = new StringBuffer();
			while (sb.length() < longmps * 1024 * 1024) {
				// ランダムに一文字追加
				int idx = r.nextInt(s.length());
				sb.append(s.charAt(idx));
				// 残りは同じ
				sb.append(s);
			}
			// save to singleton hash map
			HashMapSingleton.getInstance().getMap().put(count, sb.toString());
			longsum += longmps;
		}
		{
			// CPU消費処理
			long startDate = new Date().getTime();
			Random r = new Random();
			while (true) {
				long nowDate = new Date().getTime();
				// 時間のかかる処理をここで行う
				String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
				StringBuffer sb = new StringBuffer();
				while (sb.length() < longmps * 1024 * 1024) {
					// ランダムに一文字追加
					int idx = r.nextInt(s.length());
					sb.append(s.charAt(idx));
				}
				if ( nowDate - startDate > longcps * 1000 ) {
					break;
				}
			}
		}

		request.setAttribute("mps", mps);
		request.setAttribute("cps", cps);
		longcount++;
		request.setAttribute("count", "" + longcount);
		request.setAttribute("sum", "" + longsum);
		request.getRequestDispatcher("response.jsp").forward(request, response);
	}

}
