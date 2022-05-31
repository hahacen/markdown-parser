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
        Path fileName=Path.of("/Users/a/Documents/GitHub/markdown-parser/Snippet1.md");
        String content = Files.readString(fileName);
        List<String> expected= List.of("google.com","google.com", "ucsd.edu");
        //expected.add("google.com, google.com, ucsd.edu");
        assertEquals(expected,mark.getLinks(content));
    }     

    @Test
    public void testSnippet2() throws IOException{
        Path fileName=Path.of("/Users/a/Documents/GitHub/markdown-parser/Snippet2.md");
        String content = Files.readString(fileName);
        List<String> expected= List.of("a.com","a.com(())", "example.com");

        assertEquals(expected,mark.getLinks(content));

}

@Test
    public void testSnippet3() throws IOException{
        Path fileName=Path.of("/Users/a/Documents/GitHub/markdown-parser/Snippet3.md");
        String content = Files.readString(fileName);
        List<String> expected= List.of("https://www.twitter.com"," https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule"," https://cse.ucsd.edu/");
        assertEquals(expected,mark.getLinks(content));

}


}
