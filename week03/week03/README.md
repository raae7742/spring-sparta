## 3주차

* 프로젝트 개발 순서 : Repository -> Service -> Controller


### 🔧 API 설계
|기능|Method|URL|Return|
|-------------|----|-------|-----|
|메모 생성하기|POST|/api/memos|Memo|
|메모 조회하기|GET|/api/memos|List\<Memo\>|
|메모 변경하기|PUT|/api/memos/{id}|Long|
|메모 삭제하기|DELETE|/api/memos/{id}|Long|

</br>

### 🌲 프로젝트 구조 트리
```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂sparta
 ┃ ┃ ┃ ┃ ┗ 📂week03
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemoController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂domain
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Memo.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemoRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜MemoRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Timestamped.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜MemoService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜Week03Application.java
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┣ 📂images
 ┃ ┃ ┃ ┃ ┣ 📜delete.png
 ┃ ┃ ┃ ┃ ┣ 📜done.png
 ┃ ┃ ┃ ┃ ┣ 📜edit.png
 ┃ ┃ ┃ ┃ ┗ 📜send.png
 ┃ ┃ ┃ ┗ 📜index.html
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┗ 📜application.properties
 ┗ 📂test
 ```
 
-----
</br>
  
### 1️⃣ HTML 기초
* head 태그 = CSS, Javascript
* body 태그 = 뼈대 전체
* 문법
  * h1~h6 : headline, 신문 제목
  * div : division, 나누기
  * p : paragraph, 신문 기사 단락/텍스트
  * ul, ol, li : (un)ordered list
  * span : 글을 잘라내어 색을 입힐 때 사용
  * table, th, tr, td : 표
  * img : 이미지
  * 등등

</br>

### 2️⃣ CSS 기초
* 문법
  * head > style 태그 안에 작성
  * 세미콜론(;)으로 마무리
* 선택자
  * id: HTML 파일을 통틀어 단 하나만 존재 -> #
  * class : 중복 적용 가능 -> .

</br>

### 3️⃣ Javascript 기초
* 클릭 시 색 변화, 숨기기, 나타내기 등등
* 문법
  * 변수 선언
  ```
  let a = 3;
  ```
  
  * 함수
  ```
  function sample() {
    alert('얼럿!');
  }
  ```
  
  * 백틱
  ```
  let name = '내 이름';
  let text = `${name}님의 스프링 5주 완주를 축하합니다!`;
  ```
  
</br>

### 4️⃣ jQuery 기초
* 미리 작성된 자바스크립트 함수 모음집
* 사용법
  * HTML 숨기기       : `$('#post-box').hide();`
  * HTML 나타내기     : `$('#post-box').show();`
  * input 값 가져오기 : `$('#post-url').val();`
  * input 값 넣기     : `$('#post-url').val('new text');`
  * HTML 없애기       : `$('#contents').empty();`
  * HTML 추가하기     : `$('#contents').append( <추가할 HTML 코드> );`
  
  
