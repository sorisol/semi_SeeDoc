# 병원 예약 홈페이지(SeeDoc)

Servlet/JSP와 MVC2패턴을 이용한 프로젝트입니다.
네이버 예약을 벤치마킹하였습니다.

## 구현 기능
* 병원 : 병원 정보 수정, 의사 관리(조회,수정,삭제), 예약 내역 조회

* 일반 회원 : 회원정보 수정, 예약하기, 예약 내역 조회

* 병원 검색
	- 검색어(병원명, 의사명, 진료과목), 지도, 진교과목 별 병원 검색
* 예약내역 조회
	- 전체 예약, 이용 예정, 이용 완료, 취소 내역을 조회
	- 이용 예정인 예약은 예약을 변경하거나 취소 가능
	- 이용 완료된 예약은 별점주기와 리뷰 작성 가능
	- 병원 측은 예약을 이용 완료로 변경하거나 취소 가능, 예약 목록에서 의사, 회원, 날짜별 검색 가능
* 건강상식 게시판
	- 병원 측에서 작성한 글 조회
	- 병원계정만 글 작성, 수정, 삭제 가능
	- 댓글, 답글을 작성하거나 삭제

## 주요 기능
### 검색어,지도,진료과목 별 병원 검색
![image](https://user-images.githubusercontent.com/66931821/99339192-0f96a300-28c9-11eb-9e2a-3bbe16ddf072.png)

### 캘린더를 통한 병원 예약하기
![image](https://user-images.githubusercontent.com/66931821/99339073-d2caac00-28c8-11eb-9828-d415cef4fb93.png)

### 병원 이용자만 작성할 수 있는 리뷰
![image](https://user-images.githubusercontent.com/66931821/99339121-eb3ac680-28c8-11eb-9bdd-ff7e48b67600.png)
![image](https://user-images.githubusercontent.com/66931821/99339166-ff7ec380-28c8-11eb-8046-cf99d9e30d7d.png)

### 병원에서 직접 작성하는 건강 게시판
![image](https://user-images.githubusercontent.com/66931821/99339313-4967a980-28c9-11eb-975b-23e06663f0db.png)
