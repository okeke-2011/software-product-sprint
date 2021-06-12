package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays; 

/** Handles requests sent to the /hello URL. Try running a server and navigating to /hello! */
@WebServlet("/hello")
public class HelloWorldServlet extends HttpServlet {
  private String[] quotes = new String[] {
      "Between those who have experienced the same suffering, there can be no hatred - Gaara.",
      "Do or do not. There is no try - Yoda.",
      "Shinobi who abandon the mission are scum, but those who abandon their commrades are worse than scum - Naruto."
    };

    @Override
    public void doGet(final HttpServletRequest request, final HttpServletResponse response) throws IOException {
    // response.setContentType("text/html;");
    // response.getWriter().println("Hey there,\n"); 
    // response.getWriter().println("I'm Favour, the owner of this site. Nice to meet you!");

    String json = convertToJson(quotes);

    response.setContentType("application/json;");
    response.getWriter().println(json);
  }
  private String convertToJson(String[] quotes) {
    String json = "{";
    json += "\"quote1\": ";
    json += "\"" + quotes[0] + "\"";
    json += ", ";
    json += "\"quote2\": ";
    json += "\"" + quotes[1] + "\"";
    json += ", ";
    json += "\"quote3\": ";
    json += "\"" + quotes[2] + "\"";
    json += "}";
    return json;
  }

  
}
