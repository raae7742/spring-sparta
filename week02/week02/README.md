## 2주차

![sparta-sping-image](https://user-images.githubusercontent.com/63450463/125190063-436a7280-e276-11eb-88bc-7c482c422dee.png)


### RDBMS (Relational DataBase Management System)
  + 관계형 데이터베이스
  + ex) MySQL, PostgreSQL, Oracle Database


  + *SQL*: 데이터를 CRUD하기 위한 구체적인 문법
    + 테이블 생성
      ```
      CREATE TABLE IF NOT EXISTS courses (
        id bigint(5) NOT NULL AUTO_INCREMENT, 
        title varchar(255) NOT NULL,
        tutor varchar(255) NOT NULL,
        PRIMARY KEY (id)
      );
      ```
      
      
    + 데이터 삽입
      ```
      INSERT INTO courses (title, tutor) VALUES
      ('웹개발의 봄, Spring', '남병관'), ('웹개발 종합반', '이범규');
      ```
      
      
    + 데이터 조회
      ```
      SELECT * FROM courses;
      ```
</br>
      
### JPA(Spring Data JPA)
  + 자바만으로 SQL을 작동시키기 위한 번역기 -> repository에서 작동
    + 설정
      + 1️⃣ `implementation 'org.springframework.boot:spring-boot-starter-data-jpa'`
      + 2️⃣ application.properties에 `spring.jpa.show-sql=true` 추가
      
      
    + *Domain* (= 테이블)
    + *Repository* (= SQL)
    + *CRUD*
      + 생성(Create)
      + 조회(Read)
      + 변경(Update)
      + 삭제(Delete)
    + *Service*
      + 중간 부분, 실제 중요한 작동이 많이 일어나는 부분
    + *Controller*
      + 가장 바깥 부분, 요청/응답 처리
   
</br>
   
### DTO(Data Transfer Object)
  + 테이블 수정에 활용하는 _완충재_
  
</br>

### API
  + 클라이언트(Request) - 서버(Response) 간의 약속 
  + *REST*
    + 주소에 명사, 요청 방식에 동사(CRUD)를 사용해 의도를 명확히 드러냄을 의미
    + 생성(POST)/조회(GET)/수정(PUT)/삭제(DELETE) 요청
    + 주의사항
      + 주소에 들어가는 명사는 복수형
      + 주소에 동사는 가급적 사용하지 x

