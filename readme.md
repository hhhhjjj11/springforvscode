how to use SpringBoot in VScode
방법1 : spring boot extension pack 설치 
 - 한번에 필요한거 삭 설치, 커맨드팔레트에서 스프링부트 프로젝트 바로시작 가능
방법2 : 따로 걍 설치하기
 - 이 경우 에러가 나는데 java / com /example 하위에 메인 클래스를 이동시켜줘야 not found class 에러가 안난다..

Extension Pack for Java 설치
- command palette에서  java: create java project

Java Code Generators
- extensions 
- 자바코드 자동완성기능


--------------------------------------------------------------

1. build.gradle
  - 플러그인 추가 : 스프링부트, spring dependency-management
  - 의존성 추가: spring-boot-starter-web, 롬복, spring-boot-devtools, spring-boot-starter-test

2. 