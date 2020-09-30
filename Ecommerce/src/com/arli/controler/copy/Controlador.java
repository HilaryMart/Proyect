package com.arli.controler.copy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.arli.model.copy.Producto;


public class Controlador extends HttpServlet {


	private static final long serialVersionUID = 1L;
	Producto pdao=new Producto();
	List<Producto> productos=new ArrayList<>();
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String accion=request.getParameter("accion");
		productos=pdao.listar();
			switch (accion) {
			case "ejemplo":
				
				break;
				
			default:
			request.setAttribute("productos", productos);
			request.getRequestDispatcher("index.jsp").forward(request, response);
			
			}
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		processRequest(request, response);
	}
	
	public String getServletInfo() {
		return "Short description";
				
	}
	
		
}
