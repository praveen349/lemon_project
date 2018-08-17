package com.praveen.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.praveen.businessLogic.BusinessLogic;
import com.praveen.model.*;

import com.google.gson.Gson;


@Component
@Controller
public class TestController {
	
	@Autowired
	BusinessLogic businessLogic;
	
	@Autowired
	GenericResponse GenericResponse;
	
	
	
	//private final static org.slf4j.Logger logger = LoggerFactory.getLogger(TestController.class);
	Gson gson = new Gson();


	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
	
	
	@ResponseBody
	@RequestMapping(value = "blog/list", method = RequestMethod.GET)
	public void referAffiliateStatus(HttpServletRequest request) {
		System.out.println("Awesome move");
		
	}
	
	@ResponseBody
	@RequestMapping(value = "personal/detail/save", method = RequestMethod.POST)
	public GenericResponse savePersonalDetail(HttpServletRequest request, @RequestBody String data) {
		GenericResponse objResponse = new GenericResponse();
		//BusinessLogic businessLogic = new BusinessLogic();
		PersonalDetailResponse personalDetailResponse = gson.fromJson(data, PersonalDetailResponse.class);
		System.out.println("good job");
		try {
			
			businessLogic.savePersonalDetail(personalDetailResponse);
			/*GenericBackendResponse beResponse = ApiManager.updateSetting(data, FeUtils.createAPIMeta(session, request));
			if (beResponse != null) {
				if (beResponse.isS()) {
					objResponse.setSuccessMsg(beResponse.getMsg());
					objResponse.setStatus(Constants.SUCCESS);
				} else {
					objResponse.setErrorDetails(beResponse.getEd());
					objResponse.setStatus(Constants.FAILED);
				}
			} else
				objResponse.setStatus(Constants.FAILED);*/
		} catch (Exception e) {
			System.out.println((e.getMessage()));
		}
		return objResponse;
	}

}
