package tw.com.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tw.com.cloud.service.Service_Calculator;

/**
 * <br>
 * 計算器 Web結構: <br>
*/
@Controller
public class Controller_Calculator_Web {
	@Autowired
	Service_Calculator twitterApi;

	/**
	 * 計算機
	 * 
	 **/
	
	@RequestMapping(value="/index",method = {RequestMethod.GET})
    public String index() {
		System.out.println("Controller : calculator_index 首頁");
        return "t_Calculator";
    }
}
