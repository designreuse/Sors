package com.jubaka.sors.serverSide;

import com.jubaka.sors.beans.branch.BranchStatBean;
import com.jubaka.sors.beans.InfoBean;
import com.jubaka.sors.beans.SecPolicy;
import com.jubaka.sors.beans.SecPolicyBean;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class NodeView
 */
@WebServlet("/NodeView")
public class NodeView extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NodeView() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nodeName =  request.getParameter("nodeName");
		ConnectionHandler ch = ConnectionHandler.getInstance();
		Node n = ch.getNode(nodeName);
		String user = (String) request.getSession().getAttribute("user");
		
		InfoBean ib = n.getInfo();
		SecPolicyBean scb = n.getSecPolicyBean();
		BranchStatBean bsb = n.getBranchStat(user);
		List<String> liveDevs = n.getIfsList(user);
		
		SecPolicy sp = scb.getUserPolicy().get(user);
		if (sp==null) sp = scb.getUserPolicy().get("*");		// if special secPolicy for current user did not exist we return secPolicies for allUsers
		if (sp!=null) request.setAttribute("secPolicy", sp);
		request.setAttribute("infoBean", ib);
		request.setAttribute("branchStat", bsb);
		request.setAttribute("ifs", liveDevs);
		
		request.getRequestDispatcher("Node.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
