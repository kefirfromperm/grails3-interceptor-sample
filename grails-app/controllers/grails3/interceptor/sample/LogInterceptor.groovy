package grails3.interceptor.sample


class LogInterceptor {
    LogInterceptor() {
        matchAll()
        match(uri:'/**')
        match(uri:'/static/rio.jpg')
    }

    boolean before() {
        log.info(request.requestURI)
        true
    }

    boolean after() { true }

    void afterView() {
        // no-op
    }
}
