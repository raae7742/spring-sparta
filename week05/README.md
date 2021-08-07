## 5주차, 웹서비스 배포

#### :one: AWS RDS로 MySQL 세팅
 
 </br>
 
#### :two: OG 태그로 카카오톡 공유 탭 만들기
  + index.html
 
 ```
<meta property="og:title" content="혀내만의 셀렉샵">
<meta property="og:description" content="관심상품을 선택하고, 최저가 알림을 확인해보세요!">
<meta property="og:image" content="images/og_selectshop.png">
 ```
   
 </br>

#### :three: EC2 서버 작동
+ SSH(Secure Shell Protocol)
  + 다른 컴퓨터에 접속할 때 사용하는 프로그램
  + 22번 포트가 열려있어야 접속 가능(AWS EC2는 이미 22번 포트가 열린 상태)


+ 기본적인 리눅스 명령어
```
pwd: 내 위치(경로) 출력
cp -r [복사할 것] [붙여넣기 할 것] : 복사 붙여넣기
rm -rf [파일] : 지우기
sudo [명령어들] : 관리자 권한으로 명령어 실행
sudo su: 관리자 권한으로 접속 (나올 때는 exit)
```
 
 </br>

#### :four: 배포 파일을 빌드하고 Filezilla를 이용해 업로드
1. 우측 Gradle 탭 > Tasks > build > build 더블 클릭
2. ubuntu에 OpenJDK 설치
```
sudo apt-get update
sudo apt-get install openjdk-8-jdk
java -version // 확인용
```
3. Filezilla로 서버 설정 후, 빌드 파일 업로드
4. AWS 관리 콘솔에서 80, 8080 포트 열어주기
5. AWS 서버에서 스프링 부트 작동!
```
java -jar JAR파일명.jar
```

6. `http://AWS아이피:8080`으로 접속
 
 </br>

#### :five: 포트포워딩 & nohup
+ 포트포워딩(port forwarding)
  + 8080 포트를 기본 포트인 80으로 변경해 포트 번호를 입력하지 않아도 자동 연결 되도록 함
  
  ```
  sudo iptables -t nat -A PREROUTING -i eth0 -p tcp --dport 80 -j REDIRECT --to-port 8080
  ```
  
+ SSH 접속을 끊어도 서버가 계속 돌게 하려면?
  + 서버 실행 방법
  
  ```
  nohup java -jar JAR파일명.jar &
  ```
  
  + 서버 강제종료
  ```
  # pid 값 확인
  ps -ef | grep java
  
  # 프로세스 킬
  kill -9 [pid 값]
  ```
 
 </br>  
  
#### :six: 도메인 연결
+ 가비아 사이트에서 도메인 결제
