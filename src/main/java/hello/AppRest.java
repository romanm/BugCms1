package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppRest {
	@RequestMapping(value = "/page1/readJsonFromRam", method = RequestMethod.GET)
	public  @ResponseBody Map<String, Object> readJsonFromRam() {
		Map<String, Object> map = new HashMap<>();
		map.put("text", "Hello World");
		map.put("int", 123);
		map.put("date", new Date());
		List<Integer> intList = new ArrayList<Integer>(Arrays.asList(new Integer[]{1,2,3}));
		map.put("intList", intList);
		return map;
	}
	
}