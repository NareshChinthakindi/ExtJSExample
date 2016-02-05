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

/**
 * @author nchinthakindi
 *
 */
@Controller
public class LoginController extends BaseController {

	@RequestMapping(value = "/index")
	public String saveUser(Model model) {
		// securityQuestionsService.getResults();
		return "index";
	}
	
	@RequestMapping(value = "/userLogin/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, HttpServletRequest httpReq, Principal principal) {
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

		return "user/welcome";

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
