package com.meipu.meitu.pushfront;

import com.meitu.tardis.web.TardisConfigListener;
import org.springframework.core.annotation.Order;
import org.springframework.web.WebApplicationInitializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

/**
 * @Description
 * @Author yhz
 * @Date 2018/10/24 上午10:02
 * @Version 1.0
 **/
//@Order(-2147483648)
public class PushFrontServletContainerInitializer implements WebApplicationInitializer {

    /**
     * Configure the given {@link ServletContext} with any servlets, filters, listeners
     * context-params and attributes necessary for initializing this web application. See
     * examples {@linkplain WebApplicationInitializer above}.
     *
     * @param servletContext the {@code ServletContext} to initialize
     * @throws ServletException if any call against the given {@code ServletContext}
     *                          throws a {@code ServletException}
     */
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(TardisConfigListener.class);
        servletContext.setInitParameter("tardisConfigLocation", "tardis.properties");
    }
}
