package org.edgar.cookiesmatu.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.edgar.cookiesmatu.models.Producto;
import org.edgar.cookiesmatu.services.LoginService;
import org.edgar.cookiesmatu.services.LoginServiceSessionImplement;
import org.edgar.cookiesmatu.services.ProductoService;
import org.edgar.cookiesmatu.services.ProductoServiceImplement;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;


@WebServlet("/productos")
public class ProductoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductoService service = new ProductoServiceImplement();
        List<Producto> productos = service.listar();

        resp.setContentType("text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();

        LoginService auth = new LoginServiceSessionImplement();
        Optional<String> usernameOptional = auth.getUserName(req);

        if (usernameOptional.isPresent()) {
            // Creo la plantilla html
            out.print("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Listar Producto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listar producto</h1>");
            out.println("<h2>Hola " + usernameOptional.get() + " estos son los productos con sus precios</h2>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>ID PRODUCTO</th>");
            out.println("<th>NOMBRE</th>");
            out.println("<th>CATEGORIA</th>");
            out.println("<th>PRECIO</th>");
            out.println("</tr>");

            productos.forEach(p -> {
                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getNombre() + "</td>");
                out.println("<td>" + p.getTipo() + "</td>");
                out.println("<td>" + p.getPrecio() + "</td>");
                out.println("</tr>");
            });
        } else {
            // Creo la plantilla html
            out.print("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"utf-8\">");
            out.println("<title>Listar Producto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listar producto</h1>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>ID PRODUCTO</th>");
            out.println("<th>NOMBRE</th>");
            out.println("<th>CATEGORIA</th>");
            out.println("</tr>");
            productos.forEach(p -> {
                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getNombre() + "</td>");
                out.println("<td>" + p.getTipo() + "</td>");
                out.println("</tr>");
            });
        }

        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
    }
}
