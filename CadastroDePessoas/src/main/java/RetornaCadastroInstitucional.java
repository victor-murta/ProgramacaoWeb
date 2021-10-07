

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RetornaCadastroInstitucional
 */
@WebServlet("/RetornaCadastroInstitucional")
public class RetornaCadastroInstitucional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetornaCadastroInstitucional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter saida = response.getWriter();
		
		saida.write("<html>");
		saida.write("<head>");
		saida.write("<title>Registro</title>");
		saida.write("</head>");
		saida.write("<body>");
		saida.write("<h3>Registro realizado com sucesso!</h3><br/><br/>");
		saida.write("<h2>Seus dados pessoais:</h2>");
		saida.write(request.getParameter("nome") + " " + request.getParameter("sobrenome"));
		saida.write("<br/>");
        
		saida.write(request.getParameter("rua"));
		saida.write("<br/>");
        
		saida.write(request.getParameter("complemento"));
		saida.write("<br/>");
        
		saida.write(request.getParameter("cidade"));
        saida.write(", ");
        
        saida.write(request.getParameter("cep"));
        saida.write(", ");
        
        saida.write(request.getParameter("estado"));
        saida.write("<br/>");
        
        saida.write("<h2>Seus dados profissionais:</h2>");
        saida.write(request.getParameter("empresa"));
        saida.write("<br/>");
        
        saida.write(request.getParameter("ruaEmpresa"));
        saida.write("<br/>");
        
        saida.write(request.getParameter("complementoEmpresa"));
        saida.write("<br/>");
        
        saida.write(request.getParameter("cidadeEmpresa"));
        saida.write(", ");
        
        saida.write(request.getParameter("cepEmpresa"));
        saida.write(", ");
        
        saida.write(request.getParameter("estadoEmpresa"));
        saida.write("</body></html>");
	}

}
