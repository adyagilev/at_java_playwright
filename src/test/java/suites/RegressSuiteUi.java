package suites;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@DisplayName("Регрессионное тестирование UI")
@Suite
@SelectPackages("testui")
public class RegressSuiteUi {
}
