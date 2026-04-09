# docker 및 kafka 설치

### docker
- docker 설치 홈페이지 가서 다운로드 후 설치하면 끝
- 제대로 설치되어있는지 확인하려면 cmd에 docker 나 docker -version 치면 완료

### kafka
- docker에다가 kafka를 설치하기 위해서 docker-compose 사용
- 메모장에 docker-compose.yml 파일 만들어서 내용 저장 후 docker compose up -d 명령어 사용으로 kafka 설치
  - 기존 강의에 있는 yml 파일은 버전이 오래되어서 gpt로 수정 후 돌
- 카프카가 정상적으로 설치되면 localhost:9090 으로 들어가서 확인(아래 사진 참고)
<img width="1917" height="953" alt="image" src="https://github.com/user-attachments/assets/4f4fd7fa-7fac-473e-828d-659a75292e8f" />

