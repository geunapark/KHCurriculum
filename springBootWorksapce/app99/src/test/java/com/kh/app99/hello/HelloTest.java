package com.kh.app99.hello;

import com.kh.app99.HelloWorld;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class HelloTest {

    @BeforeAll
    public static void 비포올(){
        System.out.println("HelloTest.비포올");
    }
    @BeforeEach
    public void 비포이치(){
        System.out.println("HelloTest.비포이치");
    }
    @AfterAll
    public static void 애프터올(){
        System.out.println("HelloTest.애프터올");
    }
    @AfterEach
    public void 에프터이치(){
        System.out.println("HelloTest.에프터이치");
    }
    
    //    @DisplayName("테스트메서드01")
    @Test
    public void  회원가입_성공_테스트(){
        System.out.println("HelloTest.회원가입_성공_테스트");
        HelloWorld helloWorld=new HelloWorld();
        int result=helloWorld.write();

        Assertions.assertThat(result).isEqualTo(1);

    }
    //------------------1+2가 3 이 맞는지
    @Test
    public  void 테스트02(){
        System.out.println("HelloTest.테스트02");
        Assertions.assertThat(1+2).isEqualTo(3);
    }


    @Test
    public  void 테스트03(){
        System.out.println("HelloTest.테스트03");
        Assertions.assertThat(10+20).isEqualTo(30);
    }
}
