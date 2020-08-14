package com.jinseong.pratice.controller;

import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jinseong.pratice.util.Hashing;

@Controller
public class TestController {

	@RequestMapping(value = "/test/hashing")
	public String hashing()
	{
		return "/test/hashing";
	}

	@ResponseBody
    @RequestMapping(value="/test/hashingAjax", method=RequestMethod.POST)
    public String serialize(@RequestParam(name = "inputText", required = false) String input, ModelMap modelMap) throws NoSuchAlgorithmException {
        
		System.out.println("inputData >>>>> " + input);
		String result = null;

    	if (input != null) {
			Hashing hashing = new Hashing();
			result = hashing.sha256(input);
		}

    	return result;
    }
	
}
