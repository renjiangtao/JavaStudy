package homework.day08.filter;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import java.io.IOException;

@Slf4j
public class MyWebFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("fileter init");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("doFilter start");
        chain.doFilter(request, response);
        log.info("doFilter end");
    }

    @Override
    public void destroy() {
        log.info("fileter destroy");
    }
}
