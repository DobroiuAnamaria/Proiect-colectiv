package com.example.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@Component

public class CorsConfig implements Filter {


        private final Logger log = LoggerFactory.getLogger(CorsConfig.class);

        public CorsConfig() {
            log.info("SimpleCORSFilter init");
        }
        public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {

            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) res;

            response.setHeader("Access-Control-Allow-Origin", request.getHeader("Origin"));
            response.setHeader("Access-Control-Allow-Credentials", "true");
            response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With, remember-me");

            chain.doFilter(req, res);
        }


        public void init(FilterConfig filterConfig) {
        }
        public void destroy() {
        }


    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}

