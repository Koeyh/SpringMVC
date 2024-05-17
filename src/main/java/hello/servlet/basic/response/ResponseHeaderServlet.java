package hello.servlet.basic.response;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.setStatus(200)과 동일한 기능, OK라는 의미를 바로 확인 가능
        response.setStatus(HttpServletResponse.SC_OK);

        // [response-headers] 세팅
        response.setHeader("Content-Type", "text/plain; charset=utf-8");
        response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
        response.setHeader("Pragma", "no-cache");
        response.setHeader("my-header","hello");

        // [Header 편의 메서드]
//        content(response);
//        cookie(response);
        redirect(response); // Status Code와 Location이 지정되어있는 값과 같다면 해당 url을 호출하라.

        PrintWriter writer = response.getWriter();
        writer.println("ok");
    }

    private void content(HttpServletResponse response) {
        //Content-Type: text/plain; charset="utf-8"
        //Content-Length: 2
        //response.setHeader("Content-Type", "text/plain; charset=utf-8")
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        //response.setContentLength(2); // 생략 시 자동 생성
    }

    private void cookie(HttpServletResponse response) {
        //Set-Cookie: my-cookie=good; Max-Age=600;
        //response.setHeader("Set-Cookie", "myCookie=good; Max-Age=600";
        Cookie cookie = new Cookie("my-cookie", "good");
        //쿠키 유효기간 설정 (초)
        cookie.setMaxAge(600);
        //응답에 쿠키 추가
        response.addCookie(cookie);
    }

    private void redirect(HttpServletResponse response) throws IOException {
        //Status Code 302
        //Location: /basic/hello-form.html
        //SC : Status Code (HTTP 응답 상태 코드)
//        아래 두 줄의 동작을 response.sendRedirect() 한 줄의 코드로 실행 가능.
//        response.setStatus(HttpServletResponse.SC_FOUND); //302
//        response.setHeader("Location", "/basic/hello-form.html");
//
        //location에 해당하는 url을 다시 호출하라.
        response.sendRedirect("/basic/hello-form.html");
    }
}
