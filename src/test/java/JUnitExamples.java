import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Here is beforeAll test");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Here is beforeEach test");
    }
    @AfterEach
    void afterEach(){
        System.out.println("Here is afterEach test");
    }
    @Test
    void firstTest(){
        System.out.println("Here is first test()");
    }
    @Test
    void secondTest(){
        System.out.println("Here is second test()");
    }
}




