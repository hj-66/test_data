# Spring Boot 백엔드 연습 프로젝트

## 만들 엔티티

### Member

| 필드명 | 설명 |
|---|---|
| id | 회원 ID |
| username | 로그인 아이디 |
| password | 비밀번호 |
| nickname | 닉네임 |
| email | 이메일 |
| role | 권한 |
| createDate | 생성일 |

---

### Question 또는 Post

| 필드명 | 설명 |
|---|---|
| id | 게시글 ID |
| subject / title | 제목 |
| content | 내용 |
| author | 작성자 |
| category | 카테고리 |
| viewCount | 조회수 |
| createDate | 생성일 |
| modifyDate | 수정일 |

---

### Answer 또는 Comment

| 필드명 | 설명 |
|---|---|
| id | 댓글 ID |
| content | 댓글 내용 |
| author | 작성자 |
| post | 연결된 게시글 |
| createDate | 생성일 |
| modifyDate | 수정일 |

---

### Category

| 필드명 | 설명 |
|---|---|
| id | 카테고리 ID |
| name | 카테고리 이름 |

---

### Like

| 필드명 | 설명 |
|---|---|
| id | 좋아요 ID |
| member | 좋아요를 누른 회원 |
| post 또는 comment | 좋아요 대상 |

---

## 연습할 수 있는 기능

- 회원가입
- 로그인
- 게시글 등록 / 수정 / 삭제
- 댓글 등록 / 수정 / 삭제
- 카테고리별 게시글 조회
- 게시글 검색
- 페이징
- 정렬
- 조회수 증가
- 좋아요 기능
- 작성자 권한 체크

---

## JPA 관계 연습

| 관계 | 설명 |
|---|---|
| Member 1 : N Post | 한 명의 회원은 여러 개의 게시글을 작성할 수 있다 |
| Post 1 : N Comment | 하나의 게시글에는 여러 개의 댓글이 달릴 수 있다 |
| Category 1 : N Post | 하나의 카테고리에는 여러 개의 게시글이 포함될 수 있다 |
| Member N : M PostLike | 여러 회원이 여러 게시글에 좋아요를 누를 수 있다 |

---

## 관계 구조 요약

```text
Member
  └── Post
        └── Comment

Category
  └── Post

Member
  └── Like
        └── Post 또는 Comment