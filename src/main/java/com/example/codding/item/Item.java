package com.example.codding.item;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter //모든 변수에 자동 set 함수 만들 어줌
@Entity
@ToString //object 안의 변수 들을 전부 한번에 출력 쉽게 하고 싶으면
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false) // 이 컬럼이 비어 있으면 테이블 입력 막음
    private String title;
    @Column(nullable = false)
    private Integer price; // private 쓰면 다른 클래스 에서 못씀 -> getter(가져옴) , setter (수정) 쓰면 가능
    @Column(columnDefinition = "TEXT")
    private String description;

    //static 는 new 키워드 없이 직접 사용 가능. ex) Item.title


}
