package org.bank.list.servlet;

import org.bank.list.dao.DAOFactory;
import org.bank.list.model.Account;
import org.bank.list.service.AccountService;
import org.bank.list.service.impl.AccountServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

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
        AccountService service=new AccountServiceImpl();
        List<Account> accountList =service.getAllAccount();
        req.setAttribute("accountList", accountList);
        RequestDispatcher dispatcher=this.getServletContext()
                .getRequestDispatcher("/userList.jsp");
        dispatcher.forward(req,resp);
    }
}
