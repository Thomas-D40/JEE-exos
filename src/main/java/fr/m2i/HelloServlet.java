package fr.m2i;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		String text = 
				"<h3>Formulaire de contact</h3>\r\n"
				+ "    <form>\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"name\">Quels sont vos noms et prénoms?</label>\r\n"
				+ "        <input type=\"text\" name=\"name\" id=\"name\" required />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"birth\">Date et lieu de naissance :</label>\r\n"
				+ "        <input type=\"text\" name=\"birth\" id=\"birth\" required />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"country\">Quel est votre pays d'origine?</label>\r\n"
				+ "        <select name=\"countries\" id=\"country\">\r\n"
				+ "          <option value=\"france\">France</option>\r\n"
				+ "          <option value=\"japon\">Japon</option>\r\n"
				+ "          <option value=\"tiersMonde\">Autre pays</option>\r\n"
				+ "        </select>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example civil\">\r\n"
				+ "        <label>Quelle est votre civilité?</label>\r\n"
				+ "        <div>\r\n"
				+ "          <p><input type=\"radio\" name=\"civil\" id=\"homme\" checked /> Homme</p>\r\n"
				+ "          <p><input type=\"radio\" name=\"civil\" id=\"femme\" /> Femme</p>\r\n"
				+ "        </div>\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"bac\">Quelle note avez-vous eu au bac?</label>\r\n"
				+ "        <input\r\n"
				+ "          type=\"number\"\r\n"
				+ "          name=\"bac\"\r\n"
				+ "          id=\"bac\"\r\n"
				+ "          min=\"0\"\r\n"
				+ "          max=\"20\"\r\n"
				+ "          required\r\n"
				+ "          value=\"10\"\r\n"
				+ "        />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"formation\">Quelle formation voulez-vous suivre?</label>\r\n"
				+ "        <input type=\"text\" name=\"formation\" id=\"formation\" required />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"otherForm\">D'autres souhaits de formation?</label>\r\n"
				+ "        <input type=\"checkbox\" name=\"otherFormation\" id=\"otherFormation\" />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"email\">Quel est votre email?</label>\r\n"
				+ "        <input\r\n"
				+ "          type=\"email\"\r\n"
				+ "          name=\"email\"\r\n"
				+ "          id=\"email\"\r\n"
				+ "          placeholder=\"Ex : test@gmail.com\"\r\n"
				+ "          required\r\n"
				+ "        />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"phoneNumber\">Quel est votre numéro de téléphone?</label>\r\n"
				+ "        <input type=\"number\" name=\"phoneNumber\" id=\"phoneNumber\" required />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <label for=\"CV\">Merci d'insérer votre lettre de motivation</label>\r\n"
				+ "        <input type=\"file\" name=\"CV\" id=\"CV\" accept=\".pdf\" />\r\n"
				+ "      </div>\r\n"
				+ "\r\n"
				+ "      <div class=\"form-example\">\r\n"
				+ "        <input type=\"submit\" value=\"Envoyez\" />\r\n"
				+ "      </div>\r\n"
				+ "    </form>";
		

		response.setCharacterEncoding("UTF-8"); // J'ignore pourquoi il veut pas le prendre en compte
		response.getWriter().write(text);

//		response.sendRedirect("hello.html");
	}

}

