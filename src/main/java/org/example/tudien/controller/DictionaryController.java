package org.example.tudien.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Controller
public class DictionaryController {

    private static final Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("hello", "xin chào");
        dictionary.put("world", "thế giới");
        dictionary.put("computer", "máy tính");
        dictionary.put("programming", "lập trình");
        dictionary.put("banana", "quả chuối");
        dictionary.put("dog", "con chó");
    }

    @RequestMapping("/")
    public String home() {
        return "index";
    }

    @RequestMapping("/dictionaly")
    public ModelAndView dictionaly(@RequestParam("word") String word) {
        ModelAndView modelAndView = new ModelAndView("index");
        String meaning = dictionary.get(word.toLowerCase());
        if (meaning != null) {
            modelAndView.addObject("word", word);
            modelAndView.addObject("meaning", meaning);
        } else {
            modelAndView.addObject("word", word);
            modelAndView.addObject("message", "Không tìm thấy nghĩa của từ này.");
        }
        return modelAndView;
    }
}