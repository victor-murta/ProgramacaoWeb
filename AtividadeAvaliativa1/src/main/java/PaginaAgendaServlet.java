

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RecebeNomeServlet
 */
@WebServlet("/PaginaAgendaServlet")
public class PaginaAgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PaginaAgendaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		saida.write("<HTML><BODY>");
		saida.write("<form action='RetornaNomeServlet' method='get'>");
		saida.write("<h3>Insira seu nome</h3>");
		saida.write("<input type='text' placeholder='Nome' name='nome'></input>");
		saida.write("<h3>Insira seu telefone</h3>");
		saida.write("<input type='text' placeholder='telefone' name='telefone'></input>");
		saida.write("<h3>Insira sua data de nascimento</h3>");
		saida.write("<input type='text' placeholder='Data de nascimento' name='data_nascimento'></input>");
		saida.write("<button type='submit'>Enviar</button>");
		saida.write("</form>");
		saida.write("</HTML></BODY>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
