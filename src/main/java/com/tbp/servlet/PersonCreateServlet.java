package com.tbp.servlet;

import com.tbp.repository.Person;
import com.tbp.repository.PersonRepository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "person-create-servlet",
        urlPatterns = "/person/create"
)
public class PersonCreateServlet extends HttpServlet {

    PersonRepository personRepository;

    public PersonCreateServlet() {
        personRepository = new PersonRepository();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/person/create.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String msisdn = req.getParameter("msisdn");
        Person person = new Person(name, address, msisdn);
        personRepository.save(person);
        resp.sendRedirect(req.getContextPath() + "/person/list");
    }
}
