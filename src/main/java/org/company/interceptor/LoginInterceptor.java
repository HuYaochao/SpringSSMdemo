package org.company.interceptor;

import com.alibaba.fastjson2.JSON;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginInterceptor implements HandlerInterceptor {


    /**
     * 在接口调用前 执行
     *
     * @param request
     * @param response
     * @param handler
     * @return true 放行 不拦截  否则...
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        if (username != null) {
            //放行
            return true;
        }
        Map<String, Object> map = new HashMap<>();
        map.put("code", 403);
        map.put("data", "list");
        map.put("message", "failure");
        String data = JSON.toJSONString(map);
        response.getWriter().println(data);
        return  false;
    }
}
