/**
 * 
 */
package org.naresh.javariders.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author nchinthakindi
 *
 */
@Controller
@RequestMapping("api")
public class LoginController extends BaseController {

	@RequestMapping(value = "/index")
	public String saveUser(Model model) {
		// securityQuestionsService.getResults();
		return "index";
	}
	
	@RequestMapping(value = "/userLogin/welcome")
	@ResponseBody
	public String printWelcome() {
		System.out.println("Hello Naresh");
		/*UserVo userVo = null;

		String strLoginId = principal.getName();
		if (null != strLoginId) {
			userVo = userService.getUserByLoginId(strLoginId);
		}
		if (null != userVo) {
			httpReq.getSession().setAttribute("userVo", userVo);
		}
		List<SecurityQuestions> securityQuestionsList = securityQuestionsService.getSecurityQuestions();
		model.addAttribute("securityQuestionsList", securityQuestionsList);*/
		
		String getMessage = message();

		return getMessage;

	}

	private String message() 
	{
		StringBuffer bf = new StringBuffer("");
		
		
		   // bf.append("\"success\": true,");
		   // bf.append("\"users\": [");
		    bf.append("[{\"id\": 1, \"name\": 'Ed',    \"email\": \"ed@sencha.com\"},");
		    bf.append("{\"id\": 2, \"name\": 'Tommy', \"email\": \"tommy@sencha.com\"}  ]");
		return bf.toString();
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap model) {

		return "index";

	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {

		model.addAttribute("error", "true");
		return "index";

	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap model, HttpServletRequest httpReq) {
		
		//httpReq.getSession().invalidate();

		return "index";

	}
}
