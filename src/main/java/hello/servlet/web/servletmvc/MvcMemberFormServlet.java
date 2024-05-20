package hello.servlet.web.servletmvc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";
        // Controller 에서 View로 이동할 때 사용됨
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);
        // Servlet에서 JSP를 호출 가능하게 해줌
        // 다른 서블릿이나 JSP로 이동할 수 있는 기능, 서버 내부에 다시 호출이 발생
        dispatcher.forward(request, response);

    }
}
