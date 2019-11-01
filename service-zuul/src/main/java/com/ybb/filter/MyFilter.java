package com.ybb.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 pre：路由之前
 routing：路由之时
 post： 路由之后
 error：发送错误调用
 filterOrder：过滤的顺序
 shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
 run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
 * Created by ybb on 2019/11/1.
 */
@Component
public class MyFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
      RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                //提示token为空
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        return null;
    }
}
