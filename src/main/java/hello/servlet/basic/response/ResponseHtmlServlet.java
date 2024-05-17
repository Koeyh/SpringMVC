package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHtmlServlet", urlPatterns = "/response-html")
public class ResponseHtmlServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: text/html; charset=utf-8 // 컨텐트 타입 설정
        //웹 브라우저가 html인것을 인지하고 랜더링할 수 있도록 지정
        //HTTP 응답으로 HTML을 반환할 때는 "text/html"을 지정해야한다.
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        //웹 브라우저 소스보기 시 아래 html 코드가 출력됨.
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("</html>");
        writer.println("  <div>안녕?</div>");
        writer.println("<body>");
        writer.println("</body>");
    }
}
