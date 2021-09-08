
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RetornaNomeServlet")
public class RetornaNomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public RetornaNomeServlet() {
        super();
         
    }

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");


		Enumeration<String> parametros = request.getParameterNames();
		saida.write("<h3> Seja bem vindo </h3>");
		
		
		while(parametros.hasMoreElements() ) {
			saida.write(request.getParameter(parametros.nextElement().toString())+ " <br>");
		}
		
		saida.write("</HTML></BODY>");
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
