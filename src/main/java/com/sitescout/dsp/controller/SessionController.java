package com.sitescout.dsp.controller;

import com.sitescout.dsp.model.UserSession;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class SessionController {

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody String login(HttpServletRequest request) {

        // Authenticate the user
        Authentication authentication = new UsernamePasswordAuthenticationToken("user", "password");
        SecurityContext securityContext = SecurityContextHolder.getContext();
        securityContext.setAuthentication(authentication);

        // Create a new session and add the security context.
        UserSession userSession = new UserSession();
        userSession.setAccountId(1);
        userSession.setAdvertiserId(1);
        HttpSession session = request.getSession(true);
        session.setAttribute("SPRING_SECURITY_CONTEXT", securityContext);
        session.setAttribute("user", userSession);

        return "Success";
    }
}
