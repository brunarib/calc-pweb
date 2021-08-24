package br.com.calculdora.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculadora
 */
@WebServlet("/Calculadora")
public class Calculadora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculadora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
   
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String sValorA = request.getParameter("valorA");
		String sValorB = request.getParameter("valorB");
		String sOpcao= request.getParameter("opcoes");
		
		float dValorA = Float.parseFloat(sValorA);
		float dValorB = Float.parseFloat(sValorB);
		float resultado = 0F;
		
		switch (sOpcao){
			case "+":
				resultado = dValorA + dValorB;
				out.print("<h1>Resultado:<br>"+resultado+ "<br></h1> <a href=\"/calculdora/calculadora.html\"> voltar</a> ");
				break;
			case "-":
				resultado = dValorA - dValorB;
				out.print("<h1>Resultado:<br>"+resultado+ "<br></h1> <a href=\"/calculdora/calculadora.html\"> voltar</a> ");
				break;
			case "*":
				resultado = dValorA * dValorB;
				out.print("<h1>Resultado:<br>"+resultado+ "<br></h1> <a href=\"/calculdora/calculadora.html\"> voltar</a> ");
				break;
			case "/":
				resultado = dValorA / dValorB;
				out.print("<h1>Resultado:<br>"+resultado+ "<br></h1> <a href=\"/calculdora/calculadora.html\"> voltar</a> ");
				break;
		}
			
		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

}
