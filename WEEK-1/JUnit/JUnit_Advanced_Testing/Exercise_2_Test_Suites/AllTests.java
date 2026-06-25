package junit.JUnit_Advanced_Testing.Exercise_2_Test_Suites;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    AdditionTest.class,
    MultiplicationTest.class
})
public class AllTests {
}