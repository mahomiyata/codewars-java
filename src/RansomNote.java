import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        // hashmapにmagazine使われている文字とその数を入れる
        // ransomeNoteの文字を前からチェックして、hashmapにその文字があるかチェック
        // 文字があればhashmapから数を減らす
        // なければfalse
        HashMap<String, Integer> chars = new HashMap<>();
        for (String c : magazine.split("")) {
            chars.putIfAbsent(c, 0);
            chars.put(c, chars.get(c) + 1);
        }
        for (String c : ransomNote.split("")) {
            if (!chars.containsKey(c) || chars.get(c) == 0) {
                return false;
            }
            chars.put(c, chars.get(c) - 1);
        }
        return true;
    }

    @Test
    public void ransomeNoteTest() {
        assertTrue(RansomNote.canConstruct("aa", "aab"));
        assertFalse(RansomNote.canConstruct("a", "b"));
        assertFalse(RansomNote.canConstruct("aa", "ab"));
    }
}
