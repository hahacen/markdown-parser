import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class MarkdownParseTest {
    private static MarkdownParse mark;
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test

    

    public void getLinks() {
        //first entry will be what we want them to print
        //second entry call the getLinks()
        //assertEquals(List.of("https://something.com","some-thing.html"),getLinks(("test-file.md").readtostring));

    }
    @Test
    public void testSnippet1() throws IOException{
        Path fileName=Path.of("Snippe1.md");
        String content = Files.readString(fileName);
        ArrayList<String> expected= new ArrayList<>();
        expected.add("another link");
        
        assertEquals(expected,mark.getLinks(content));
    }

}
