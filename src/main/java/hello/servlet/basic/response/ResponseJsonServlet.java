package hello.servlet.basic.response;

import com.fasterxml.jackson.databind.ObjectMapper;
import hello.servlet.basic.HelloData;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

// json 데이터 뿌리기
@WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
public class ResponseJsonServlet extends HttpServlet {

    private ObjectMapper objectMapper = new ObjectMapper();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Content-Type: application/json
        //HTTP 응답으로 JSON을 반환할 때는 "application/json"로 지정해야 한다.
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        HelloData helloData = new HelloData();
        helloData.setName("kim");
        helloData.setAge(20);

        //json 형식으로 변환 -> {"username": "kim", "age": 20}
        //객체를 값으로 써서 문자열로 변환하라
        //Jackson 라이브러리가 제공하는 ObjectMapper 객체의 writeValueAsString()메서드를 이용하면
        //객체를 JSON 문자로 변환할 수 있다.
        String result = objectMapper.writeValueAsString(helloData);
        response.getWriter().write(result);
    }
}
