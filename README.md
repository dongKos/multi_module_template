![스크린샷 2024-05-01 오후 3 04 44](https://github.com/dongKos/multi_module_template/assets/47417427/1665cb6c-5d58-48c8-9d5b-802a7ff312c8)
# 실행 방법
- api 모듈의 SpringWebfluxR2dbcApplication.kt를 실행합니다.

# 모듈 구조
## api
- Spring Boot Application launcher 모듈. 어플리케이션의 시작점입니다.

## presentation
- API Layer 모듈. 
- Rest Api를 제공합니다.
- filter, interceptor, security 등을 포함합니다.

## application
- Service Layer 모듈.
- 도메인의 비즈니스 로직을 호출합니다.
- input port를 제공해서 presentation 모듈과 domain 모듈을 연결합니다.
- output port를 제공해서 domain 모듈과 infrastructure 모듈을 연결합니다.

## domain
- Domain Layer 모듈.
- 핵심 도메인 객체와 비즈니스 로직이 위치 합니다.
- 순수한 pojo 클래스이며 외부 모듈에 의존하지 않습니다.

## infrastructure
- Infrastructure Layer 모듈.
- 외부 시스템과의 연동을 담당합니다.
  - Database, Redis, External API 등
- application 모듈에서 제공한 output port를 구현합니다.
