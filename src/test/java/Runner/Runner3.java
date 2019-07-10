package Runner;

import org.junit.Test;

import cucumber.api.cli.Main;

public class Runner3 {
	@Test
	public void test() {
		String[] params = new String[] { "-p", "timeline:target/cucumber-parallel-report", "-g",
				"Step_defs", "src/test/resources", "--threads", "2" };
	Main.run(params, Thread.currentThread().getContextClassLoader());
	}

}
