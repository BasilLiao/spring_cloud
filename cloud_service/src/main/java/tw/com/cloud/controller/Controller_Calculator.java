package tw.com.cloud.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tw.com.cloud.service.Service_Calculator;

/**
 * <br>
 * 計算器 分散式結構: <br>
 * <br>
 * RESTful API 規格 <br>
 * GET 讀取資源 <br>
 * PUT 替換資源 <br>
 * PATCH 更換資源部分內容 <br>
 * DELETE 刪除資源 <br>
 * OPTIONS 回傳該資源所支援的所有 HTTP 請求方法 <br>
 * CONNECT 將連線請求轉換至 TCP/IP 隧道 <br>
 * POST 新增資源
 **/
@RestController
public class Controller_Calculator {
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
	
	@RequestMapping(value = "/calculator_verification", method = {
			RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public String calculator_verification(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_verification 驗證");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_analytical", method = {
			RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public String calculator_analytical(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_analytical 解析");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_count", method = {
			RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public String calculator_count(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_count 計算");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_package", method = {
			RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public String calculator_package(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_package 包裝");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_saveFile", method = {
			RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public String calculator_saveFile(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_saveFile 儲存檔案");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_loadFile", method = {
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String calculator_loadFile(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_loadFile 下載檔案");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	/**
	 * GET：取得(想要的服務)的資料或是狀態。（safe & idempotent） <br>
	 * POST：新增一項資料。<br>
	 * PUT：利用更新的方式於"指定位置"新增一項資料。 （idempotent） <br>
	 * PATCH：在現有的資料欄位中，更新一筆新的資料。<br>
	 * DELETE：指定資料刪除。 （idempotent）<br>
	 * 
	 */
	@RequestMapping(value = "/calculator_createSQL", method = {
			RequestMethod.POST }, produces = "application/json;charset=UTF-8")
	public String calculator_createSQL(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_createSQL 新增SQL");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_searchSQL", method = {
			RequestMethod.GET }, produces = "application/json;charset=UTF-8")
	public String calculator_searchSQL(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_searchSQL 查詢SQL");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_updateSQL", method = {
			RequestMethod.PATCH }, produces = "application/json;charset=UTF-8")
	public String calculator_updateSQL(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_updateSQL 更新SQL");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

	@RequestMapping(value = "/calculator_deleteSQL", method = {
			RequestMethod.DELETE }, produces = "application/json;charset=UTF-8")
	public String calculator_deleteSQL(@RequestBody String ajaxJSON) {
		System.out.println("Controller : calculator_deleteSQL 移除SQL");

		JSONObject object = new JSONObject(ajaxJSON);
		object.toString();
		return object.toString();
	}

}
