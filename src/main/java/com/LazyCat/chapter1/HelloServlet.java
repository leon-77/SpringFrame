package com.LazyCat.chapter1;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.ServletException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse reps) throws
            IOException, ServletException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        String currentDate = dateFormat.format(new Date());
        req.setAttribute("currentTime", currentDate);
        req.getRequestDispatcher("WEB-INF/jsp/hello.jsp").forward(req, reps);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse reps) throws
            IOException, ServletException {

    }
}
