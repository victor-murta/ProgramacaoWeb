

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrarServlet
 */
@WebServlet("/CadastroInstitucionalServlet")
public class CadastroInstitucionalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastroInstitucionalServlet() {
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
		saida.write("<title>Dados Profissionais</title>");
		saida.write("</head>");
		saida.write("<body>");
		saida.write("Preencha seus dados profissionais:");
		saida.write("<form action=\"RetornaCadastroInstitucional\">");
        
		saida.write("<input type=\"hidden\" name=\"nome\" value=\"");
		saida.write(request.getParameter("nome") + "\">");
        
		saida.write("<input type=\"hidden\" name=\"sobrenome\" value=\"");
		saida.write(request.getParameter("sobrenome") + "\">");
        
		saida.write("<input type=\"hidden\" name=\"rua\" value=\"");
		saida.write(request.getParameter("rua") + "\">");
        
		saida.write("<input type=\"hidden\" name=\"complemento\" value=\"");
		saida.write(request.getParameter("complemento") + "\">");
        
		saida.write("<input type=\"hidden\" name=\"cidade\" value=\"");
		saida.write(request.getParameter("cidade") + "\">");
        
		saida.write("<input type=\"hidden\" name=\"cep\" value=\"");
		saida.write(request.getParameter("cep") + "\">");
        
		saida.write("<input type=\"hidden\" name=\"estado\" value=\"");
		saida.write(request.getParameter("estado") + "\">");
        
		saida.write("Empresa:<input type=\"text\" name=\"empresa\"> <BR>");
		saida.write("Endereco profissional:<BR>");
		saida.write("Rua: <input type=\"text\" name=\"ruaEmpresa\">");
		saida.write("Complemento:<input type=\"text\" name=\"complementoEmpresa\"><BR>");
		saida.write("Cidade:<input type=\"text\" name=\"cidadeEmpresa\">");
		saida.write("CEP:<input type=\"text\" name=\"cepEmpresa\">");
		saida.write("Estado:<input type=\"text\" name=\"estadoEmpresa\"><BR>");
		saida.write("<input type=\"submit\" value=\"Confirmar\"><BR>");
		saida.write("</form>");
		saida.write("</body></html>");
	}

}
