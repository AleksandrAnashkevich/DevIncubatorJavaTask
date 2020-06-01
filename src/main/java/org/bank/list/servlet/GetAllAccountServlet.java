package org.bank.list.servlet;

import org.bank.list.dao.DAOFactory;
import org.bank.list.model.Account;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet(urlPatterns = "/userList")
public class GetAllAccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        List<Account> accountList =DAOFactory.getInstance().getAccountDAO().getAll();
        req.setAttribute("accountList", accountList);
        RequestDispatcher dispatcher=this.getServletContext()
                .getRequestDispatcher("/userList.jsp");
        dispatcher.forward(req,resp);
    }
}
