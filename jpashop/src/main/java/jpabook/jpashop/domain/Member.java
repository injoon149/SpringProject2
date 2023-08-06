package jpabook.jpashop.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @NotEmpty
    private String name;
    @Embedded
    private Address address;

    @OneToMany(mappedBy = "member") //order 테이블에 있는 member 테이블을 통해 매핑된 것이라고 표현
    private List<Order> orders = new ArrayList<>();

}
