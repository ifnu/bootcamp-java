package co.g2academy.regex;

import org.junit.Test;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class RegexTest {

    @Test
    public void testSingleCharacterRegexUsingIterativeCode() {
        Pattern pattern = Pattern.compile(".s"); //single character test
        Matcher matcher = pattern.matcher("1s");
        boolean actual = matcher.matches();
        assertTrue(actual);
    }

    @Test
    public void testSingleCharacterRegexUsingChainingCode(){
        assertTrue(Pattern.compile(".s").matcher("xs").matches());
    }

    @Test
    public void testSingleCharacterRegexUsingPatternMatchesMethod() {
        assertTrue(Pattern.matches(".s", "as"));
    }

    //email matching regex ^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$
    @Test
    public void testValidEmailUsingRegex() {
        assertTrue(
                Pattern.matches(
                        "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",
                        "abc@gmail.com"));
    }

    @Test
    public void testInvalidEmailUsingRegex() {
        assertFalse(
                Pattern.matches(
                        "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$",
                        "abc@gmailcom"));
    }

    @Test
    public void testMatchOneCharacterInBracket(){
        //[] is exactly one character inside the bracket
        assertTrue(Pattern.matches("[abc]", "a"));
    }

    @Test
    public void testMatchZeroOrOneCharacterInBracket(){
        //? is one or none
        assertTrue(Pattern.matches("[abc]?", ""));
    }

    @Test
    public void testMatchZeroOrManyCharacterInBracket(){
        //* is zero or many
        assertTrue(Pattern.matches("[abc]*", "aaaabbbbccccc"));
    }

    @Test
    public void testMatchOneOrManyCharacterInBracket(){
        //+ is one or many
        assertTrue(Pattern.matches("[abc]+", "aaaabbbbccccc"));
    }

    //http://www.rexegg.com/regex-quickstart.html#ref

}
