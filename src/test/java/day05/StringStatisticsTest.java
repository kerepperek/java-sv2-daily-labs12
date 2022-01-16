package day05;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class StringStatisticsTest {

    @Test
    void testNumberOfDifferentCharactersByCharacter(){
        Map<Character,Integer> result=new StringStatistics().getCharsInText("almafa");
        assertEquals(3,result.get('a'));
        assertEquals(1,result.get('m'));

    }
}