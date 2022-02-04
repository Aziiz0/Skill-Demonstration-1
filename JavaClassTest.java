import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.Path;


public class JavaClassTest {

  @Test
	public void testFile3() throws IOException{
        ArrayList<String> result = JavaClass.getLinks(Files.readString(Path.of("test-file.md")));
        List<String> newList = new ArrayList<String>();
        newList.add("https://something.com");
        newList.add("some-page.html");
        newList.add("google.com");

        assertEquals(newList, result);
	}
}
