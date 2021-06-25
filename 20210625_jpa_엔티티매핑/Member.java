package hellojpa;

import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
import java.util.Date;

@Entity
/*
//3. sequence 전략 매핑
@SequenceGenerator(
        name = “MEMBER_SEQ_GENERATOR",
        sequenceName = “MEMBER_SEQ", //매핑할 데이터베이스 시퀀스 이름
        initialValue = 1, allocationSize = 50)
*/
/*
//4. table 전략 매핑
@TableGenerator(
        name = "MEMBER_SEQ_GENERATOR",
        table = "MY_SEQUENCES",
        pkColumnValue = “MEMBER_SEQ", allocationSize = 1)*/
public class Member {
    /*
    //1. 엔티티 매핑
    @Id
    private Long id;

    @Column(name = "name", nullable = false, length = 10, columnDefinition = "varchar(100) default 'EMPTY'")
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    //최신버전이면 밑에처럼 쓰면 됨
    //private LocalDate testLocalDate;
    //private LocalDateTime testLocalDateTime;

    @Lob
    private String description;

    public Member(){

    }
    //getter,setter...
    */


    /*
    //2. 기본키 맵핑 어노테이션 관련 내용
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //DB방언에 맞게 생성됨
    private Long id;

    @Column(name="name")
    private String username;

    public Member(){}

   //getter, setter...
   */

   /*
   //3. sequence 전략 매핑
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "MEMBER_SEQ_GENERATOR")
    private Long id;
    private String username;
    //getter, setter...
    */

   /*
   //4. table 전략 매핑
   @Id
   @GeneratedValue(strategy = GenerationType.TABLE,
           generator = "MEMBER_SEQ_GENERATOR")
   private Long id;
   private String username;
   //getter, setter...
   */
}