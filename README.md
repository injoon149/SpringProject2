# SpringProject3
나만의 스프링 부트 프로젝트(쇼핑몰 - 성능 최적화, api 개발)

기존에 만들었던 쇼핑몰 프로젝트에서 v1, v2, v3, v3.1, v4 등으로 버젼을 업그레이드해 가면서 성능을 최적화한 프로젝트입니다. 엔티티 기준으로 반환해 간 것을 대체로 v1, 이를 DTO 기준으로 반환한 것을 v2, 거기서 발생하는 N+1 문제를 개선한 것을 V3, 거기서 쿼리문을 N개에서 1개로 한번에 조인하여 반환한 것을 대체로 V3.1로 api에 이름 붙여서 개발하였습니다.

지금은 Spring Data Jpa 없이 그냥 Jpa로 개발하였는데, 추후에 Spring Data jpa, 그리고 QueryDsl 등을 붙여서 개발할 예정이고, 현재는 aws로 배포하였지만 도커를 학습하여 무중단 배포를 시도할 예정입니다.

http://ec2-52-78-39-35.ap-northeast-2.compute.amazonaws.com:8080/
위 링크로 배포하였었으나, 현재는 AWS 요금 문제로 인해 서비스 중단한 상태
