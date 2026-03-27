# 3/26 프로젝트에서의 Kafka 동작

### kafka

- kafka Docker를 사용하여 설치
- intellij로 consumer와 producer 생성
- 예시로 항공예약 프로젝트에서 kafka가 어떻게 동작하는지 살펴보고 가자면
  
  ```
  ? 질문
  kafka는 실제 프로젝트 내부에서 어떻게 동작하는지? 
  https://github.com/Cool-Potatoes/flight-booking 해당 프로젝트에서 보면
  여러 msa 구조의 서비스들이 있고
  Eureka server의 통제 하에 그 내부에서 서로 프로젝트끼리 통신하는데
  각각 내부에서 kafka를 사용해서 통신하고있어
  ```

  - 한마디로 Eureka는 외부 노출 api 엔드포인트고
  - kafka는 다른 서비스가 Consumer로 동작, 내부적으로 통신할 수 있게 +
    - 예약 서비스는 Payment 존재도 모름
      Ticket 존재도 모름
      그냥 이벤트만 던짐
  
      👉 이게 Kafka의 본질:

      서비스 간 “완전한 느슨한 결합 (Loose Coupling)”
  - <img width="681" height="329" alt="image" src="https://github.com/user-attachments/assets/d86f630c-6353-40e7-8e30-44d165a21383" />

    - 이런식의 구조를 가지고 있으며
    - 각 service마다 kafka가 들어가 있는 것이 아니라,
      - Booking Service 실행 → 내부에 Kafka 있음?
        Ticket Service 실행 → 내부에 Kafka 또 있음?    --> 둘 다 아님
    - 위에서 썼듯 Docker 내부에 설치되어있음
