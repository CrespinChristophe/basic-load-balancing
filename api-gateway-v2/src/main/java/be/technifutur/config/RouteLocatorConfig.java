package be.technifutur.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    public RouteLocator routeLocator(RouteLocatorBuilder builder /*NumberOfParamsRoutePredicateFactory pf*/){
        return builder.routes()
                .route("mot",
                        r -> r.path("/mot")
                                .and()
                                .method("GET")
                                .filters( ( req ) -> req.addRequestParameter("mot", "gateway"))
                                .uri("lb://print-service"))
                .build();
    }

}
