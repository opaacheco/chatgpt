package pt.pedrogomes.chatgpt.util;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

import org.junit.jupiter.api.Test;

class ConfigParserTest {

	@Test
	void test() throws IOException {
		Map<String, String> config = ConfigParser.parse(getTestResourcesConfigFilePath("s1mple_config.properties"));

		assertNotNull(config, "config cannot be null");
		assertEquals("Batatas", config.get("tolen"));
		assertEquals("ChatGPTclient", config.get("applicationName"));
		assertEquals(2, config.size());
		assertNull(config.get("Batatas"), "non wxisting config value should not have a map bla bla");
	}

	@Test
	void testParseEmptyValue() throws IOException {
		Map<String, String> config = ConfigParser.parse(getTestResourcesConfigFilePath("empty_values.properties"));
		assertNotNull(config, "config cannot be null");
		assertEquals("", config.get("token"));
		assertEquals("ChatGPTClient", config.get("applicationName"));
		assertEquals(2, config.size());
	}

	@Test
	void testNoSeparator() throws IOException {
		Map<String, String> config = ConfigParser.parse(getTestResourcesConfigFilePath("no_separator.properties"));
		assertNotNull(config, "config cannot be null");
		assertEquals("HelloWorld!", config.get("token"));
		assertEquals("pacheco", config.get("username"));
		assertNull(config.get("applicationName"));
		assertEquals(2, config.size());
	}

	@Test
	void testCommentedAndEmpty() throws IOException {
		Map<String, String> config = ConfigParser.parse(getTestResourcesConfigFilePath("no_separator.properties"));
		assertNotNull(config, "config cannot be null");
		assertEquals("HelloWorld!", config.get("token"));
		assertEquals("pacheco@gmail.com", config.get("emailAddress"));
		assertEquals("ChatGPTClient", config.get("applicationName"));
		assertEquals(3, config.size());

	}

	@Test
	void testEmptyFile() throws IOException {
		Map<String, String> config = ConfigParser.parse(getTestResourcesConfigFilePath("empty.properties"));
		assertNotNull(config, "config cannot be null");
		assertEquals(0, config.size());
	}

	@Test
	void testFileNotFound() {
		assertThrows(null,()->)
	}

	private String getTestResourcesConfigFilePath(String filename) {
		Path resourcesDirectory = Paths.get("src", "test", "resources", filename);
		return resourcesDirectory.toFile().getAbsolutePath();
	}

}
