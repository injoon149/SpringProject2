# SpringProject3
나만의 스프링 부트 프로젝트(쇼핑몰 - 성능 최적화, api 개발)

기존에 만들었던 쇼핑몰 프로젝트에서 v1, v2, v3, v3.1, v4 등으로 버젼을 업그레이드해 가면서 성능을 최적화한 프로젝트입니다. 엔티티 기준으로 반환해 간 것을 대체로 v1, 이를 DTO 기준으로 반환한 것을 v2, 거기서 발생하는 N+1 문제를 개선한 것을 V3, 거기서 쿼리문을 N개에서 1개로 한번에 조인하여 반환한 것을 대체로 V3.1로 api에 이름 붙여서 개발하였습니다.

지금은 Spring Data Jpa 없이 그냥 Jpa로 개발하였는데, 추후에 Spring Data jpa, 그리고 QueryDsl 등을 붙여서 개발할 예정이고, 현재는 aws로 배포하였지만 추후 공부하여 무중단 배포 및 CI/CD 배포를 시도할 예정입니다.

http://ec2-52-78-39-35.ap-northeast-2.compute.amazonaws.com:8080/
위 링크로 배포하였으나, 현재는 AWS 요금 문제로 인해 서비스 중단한 상태

-> 2023.12.25
무중단 배포, AWS CodeDeploy와 Github Action을 통한 CI/CD 개발 완료했습니다. 이제 깃허브에서 커밋을 하면 자동으로 jar 파일이 s3에 저장되고, 이를 자동으로 ec2에 배포가 됩니다.
따라서 기존처럼 깃허브에 commit을 할 때마다 재배포를 할 필요가 없어졌습니다.
https://rainy-galette-555.notion.site/AWS-CodeDeploy-32f173b2c4e14969a87ceaaee4deafc4?pvs=4 
위 링크에 CI/CD 배포하는 방법을 자세히 적어 두었습니다.
