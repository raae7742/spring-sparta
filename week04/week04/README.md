## 4주차, 나만의 셀렉샵

 ### 필요한 기능
 1. 키워드로 상품 검색 -> 그 결과를 목록으로 보여주기
 2. 관심 상품 등록하기
 3. 관심 상품 조회하기
 4. 관심 상품에 원하는 가격을 등록하고, 그 가격보다 낮은 경우 표시하기
 
 </br>
 
 ### API 설계
 
 |기능|Method|URL|Return|
|-------------|----|-------|-----|
|키워드로 상품 검색하고 그 결과를 목록으로 보여주기|GET|/api/search?query=검색어|List<ItemDto>|
|관심 상품 등록하기|POST|/api/products|Product|
|관심 상품 조회하기|GET|/api/products|List<Product>|
|관심 상품에 가격 등록하고, 그 가격보다 낮은 경우 표시하기|PUT|/api/products/{id}|Id|

  </br>
  
  
### 🌲 프로젝트 구조 트리
```
📦src
 ┣ 📂main
 ┃ ┣ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂sparta
 ┃ ┃ ┃ ┃ ┗ 📂week04
 ┃ ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRestController.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜SearchRequestController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂models
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ItemDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜Product.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductMypriceRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRepository.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRequestDto.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜TimeStamped.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂utils
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜NaverShopSearch.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Scheduler.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜Week04Application.java
 ┃ ┗ 📂resources
 ┃ ┃ ┣ 📂static
 ┃ ┃ ┃ ┣ 📂images
 ┃ ┃ ┃ ┃ ┣ 📜icon-save.png
 ┃ ┃ ┃ ┃ ┗ 📜icon-search.png
 ┃ ┃ ┃ ┣ 📜basic.js
 ┃ ┃ ┃ ┣ 📜index.html
 ┃ ┃ ┃ ┗ 📜style.css
 ┃ ┃ ┣ 📂templates
 ┃ ┃ ┗ 📜application.properties
 ┗ 📂test
 ┃ ┗ 📂java
 ┃ ┃ ┗ 📂com
 ┃ ┃ ┃ ┗ 📂sparta
 ┃ ┃ ┃ ┃ ┗ 📂week04
 ┃ ┃ ┃ ┃ ┃ ┗ 📜Week04ApplicationTests.java
 ```
  -----

 
#### 1️⃣ Controller
  + ProductRestController: 관심 상품 관련 컨트롤러
  + SearchRequestController: 검색 관련  컨트롤러
  
  
#### 2️⃣ Service
  + ProductService: 관심 상품 가격 변경
  

#### 3️⃣ Repository
  + Product: 관심 상품 테이블
  + ProductRepository: 관심 상품 조회, 저장
  + ProductRequestDto: 관심 상품 등록하기
  + ProductMypriceRequestDto: 관심 가격 변경하기
  + ItemDto: 검색 결과 주고받기
  
