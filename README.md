# MVC 개념 ~ Spring 프레임워크 이해
- HttpServletRequest : HTTP 요청 메시지의 스펙을 편리하게 조회하기 위해 사용
    - StartLine 정보
    - Header 정보
    - 편리한 Header 정보
    - 기타

#### HTTP 요청데이터
##### Cline -> Server 메시지 보내는 방식은 크게 3가지
1. GET 방식으로 URL에 Query 파라미터를 보내는 방식
- ex) /url?username=kim&age=20

2. POST 방식으로 "HTMForm" 데이터 전송
- Content Type 선언 필요
- GET 방식의 쿼리 파라미터와 폼 데이터는 같은 형식을 사용한다.

3. HTTP message body에 원하는 데이터를 "직접" 담아서 요청
    - HTTP API에서 주로 사용됨.
    - 대부분 데이터를 주고받는 방식은 JSON을 사용
    - POST, PUT, PATCH 사용
    - HTTP 스펙 상 폼 데이터를 body로 전송할 때에는 POST 방식 허용

#### HTTP 응답 데이터
  - setSatus() : 상태코드(SC)지정 가능
  - setHeader() : header값 지정 가능
  - content(), cookie(), redirect()와 같은 기능 지원

