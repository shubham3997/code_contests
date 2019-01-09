package learning.interview.string;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

public class StringSearchTest {

    @Test
    public void testStrStr() {
        StringSearch stringSearch = new StringSearch();
        assertThat(stringSearch.strStr("hello", "ll")).isEqualTo(2);
        assertThat(stringSearch.strStr("aaaaa", "bba")).isEqualTo(-1);
        assertThat(stringSearch.strStr("aaa", "aaaa")).isEqualTo(-1);
        assertThat(stringSearch.strStr("mississippi", "mississippi")).isEqualTo(0);
        assertThat(stringSearch.strStr("mississippi", "mississippd")).isEqualTo(-1);
    }
    @Test
    public void testStrStrRobinKarp() {
        StringSearch stringSearch = new StringSearch();
//        assertThat(stringSearch.strStrRobinKarp("hello", "ll")).isEqualTo(2);
//        assertThat(stringSearch.strStrRobinKarp("aaaaa", "bba")).isEqualTo(-1);
//        assertThat(stringSearch.strStrRobinKarp("aaa", "aaaa")).isEqualTo(-1);
//        assertThat(stringSearch.strStrRobinKarp("mississippi", "mississippi")).isEqualTo(0);
//        assertThat(stringSearch.strStrRobinKarp("mississippi", "mississippd")).isEqualTo(-1);
        assertThat(stringSearch.strStrRobinKarp("mississippi", "issi")).isEqualTo(1);
    }
}