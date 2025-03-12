package com.example.ss10.controller;

import com.example.ss10.model.Customer;
import com.example.ss10.service.CustomerService;
import com.example.ss10.service.ICustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customers")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customerList = customerService.findAll();
        req.setAttribute("customerList", customerList);
        req.getRequestDispatcher("/views/customer/list.jsp").forward(req, resp);
    }
}
