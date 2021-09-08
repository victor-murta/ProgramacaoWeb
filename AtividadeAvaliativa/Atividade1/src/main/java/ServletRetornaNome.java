
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRetornaNome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ServletRetornaNome() {
        super();
         
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		saida.write("<Html><Body>");

		
		Enumeration<String> parametros = request.getParameterNames();
		
		while(parametros.hasMoreElements() ) {
			saida.write("<h3>" + parametros.nextElement().toString() + "</h3>");
		}
		
		saida.write("</Html></Body>");
	}

		 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
