

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecebeCalculadora
 */
@WebServlet("/RecebeCalculadora")
public class RecebeCalculadoraServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecebeCalculadoraServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");
		saida.write("<form action='MostraCalculadoraServlet' method='get'>");
		saida.write("<h3>Somador de numeros</h3>");
		saida.write("<input type='number' placeholder='Numero 1' name='n1'></input>");
		saida.write("<input type='number' placeholder='Numero 2' name='n2'></input>");
		saida.write("<button type='submit'>Somar</button>");
		saida.write("</form>");
		saida.write("</HTML></BODY>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
