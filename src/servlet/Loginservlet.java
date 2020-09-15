package servlet;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
* Servlet implementation class LoginServlet
*/
@WebServlet("/login")
public class Loginservlet extends HttpServlet {
private static final long serialVersionUID = 1L;
private static final String USER_NAME = "ああああ";
private static final String USER_SA = "愛媛県松山市";
private static final String USER_EMAIL = "test@ezweb.ne.jp";
private static final String USER_TEL = "000-1111-2222";
private static final String USER_PASSWORD = "login0000";

/**
* @see HttpServlet#HttpServlet()
*/
public Loginservlet() {
super();
// TODO Auto-generated constructor stub
}
/**
* @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
*/
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// ログインフォームへ遷移(フォワード).
RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher( "/WEB-INF/jsp/login.jsp" );
dispatcher.forward( request, response );
}
/**
* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
*/
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// エンコード設定.
	request.setCharacterEncoding( "UTF-8" );
	//name取得
	String userName = request.getParameter( "name" );
	if ( null == userName ) {
		userName = "";
	}
	//Sa取得
	String userSa = request.getParameter( "Sa" );
	if ( null == userSa ) {
		userSa = "";
	}
	// E-MAIL を取得.
	String userEmail = request.getParameter( "email" );
	if ( null == userEmail ) {
		userEmail = "";
		}
	//Tel取得
	String userTel = request.getParameter( "Tel" );
	if ( null == userTel ) {
		userTel = "";
		}
	// PASSWORD を取得.
	String userPassword = request.getParameter( "password" );
	if ( null == userPassword ) {
		userPassword = "";
		}
	// ログイン認証.
	if ( USER_NAME.equals( userName ) &&USER_SA.equals( userSa ) &&USER_EMAIL.equals( userEmail ) && USER_TEL.equals( userTel ) && USER_PASSWORD.equals( userPassword ) ) {
		// トップページへ遷移(リダイレクト).
		RequestDispatcher dispatcher =
	        request.getRequestDispatcher
	        ("/WEB-INF/jsp/index.jsp");
		dispatcher.forward(request, response);
	    } else {
	    	// ログインフォームへ遷移(リダイレクト).
	    	response.sendRedirect("./login");
	    	}
	}
}