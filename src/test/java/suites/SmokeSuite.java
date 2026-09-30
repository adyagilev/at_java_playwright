package suites;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@DisplayName("Smoke")
@Suite
@SelectPackages("testui")
@IncludeTags("Smoke")
public class SmokeSuite {
}
