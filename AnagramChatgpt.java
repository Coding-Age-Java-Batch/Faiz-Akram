package Stringgg;

import java.util.Arrays; // Arrays.equals() का उपयोग करने के लिए

public class AnagramChatgpt {

    public boolean areAnagrams(String str1, String str2) {
        if (str1.length()!= str2.length()) {
            return false;
        }

        // Step 2: फ्रीक्वेंसी एरेज़ बनाएं।
        // हम मान रहे हैं कि हम सिर्फ अंग्रेजी अक्षरों (A-Z, a-z) को गिन रहे हैं।
        // 26 अक्षर के लिए 26 साइज़ का एरे बनाएं।
        // इंडेक्स 0 'a'/'A' के लिए, 1 'b'/'B' के लिए, आदि।
        int[] count1 = new int[26]; // str1 के अक्षरों की गिनती के लिए
        int[] count2 = new int[26]; // str2 के अक्षरों की गिनती के लिए

        // Arrays को 0 से इनिशियलाइज़ करना Java में डिफ़ॉल्ट है, लेकिन explicit भी कर सकते हैं:
        // Arrays.fill(count1, 0);
        // Arrays.fill(count2, 0);

        // Step 3: str1 के अक्षरों की फ्रीक्वेंसी गिनें।
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);

            // अगर अक्षर 'a' से 'z' के बीच है, तो लोअरकेस इंडेक्स में गिनें।
            if (ch >= 'a' && ch <= 'z') {
                count1[ch - 'a']++; // 'a' - 'a' = 0, 'b' - 'a' = 1, आदि।
            }
            // अगर अक्षर 'A' से 'Z' के बीच है, तो इसे भी लोअरकेस इंडेक्स में गिनें
            // (एनाग्राम चेक के लिए अक्सर केस-इनसेनसेटिव तुलना की जाती है)
            else if (ch >= 'A' && ch <= 'Z') {
                count1[ch - 'A']++; // 'A' - 'A' = 0, 'B' - 'A' = 1, आदि।
            }
            // अन्य कैरेक्टर्स (नंबर्स, सिंबल्स, स्पेस) को इग्नोर करें या अलग से हैंडल करें
            // इस उदाहरण में, हम उन्हें इग्नोर कर रहे हैं।
        }

        // Step 4: str2 के अक्षरों की फ्रीक्वेंसी गिनें।
        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                count2[ch - 'a']++;
            } else if (ch >= 'A' && ch <= 'Z') {
                count2[ch - 'A']++;
            }
        }

        // Step 5: दोनों फ्रीक्वेंसी एरेज़ की तुलना करें।
        // अगर वे समान हैं, तो स्ट्रिंग्स एनाग्राम्स हैं।
        return Arrays.equals(count1, count2);
    }

    public static void main(String[] args) {
        AnagramChatgpt checker = new AnagramChatgpt();

        System.out.println(checker.areAnagrams("listen", "silent")); // true
        System.out.println(checker.areAnagrams("TRIANGLE", "INTEGRAL")); // true
        System.out.println(checker.areAnagrams("Earth", "Heart")); // true (case-insensitive)
        System.out.println(checker.areAnagrams("hello", "world")); // false
        System.out.println(checker.areAnagrams("anagram", "nagaram")); // true
        System.out.println(checker.areAnagrams("rat", "car")); // false
        System.out.println(checker.areAnagrams("Aabb", "bbaa")); // true
        System.out.println(checker.areAnagrams("restful", "fluster")); // true
    }
}