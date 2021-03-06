package com.first.market.server.web;

import com.first.market.server.domain.App;
import com.sun.jersey.spi.resource.Singleton;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Singleton
@Path("/app")
public class AppRestApi {
    @GET
    @Path("/list/{page}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<App> list(@PathParam("page") int page) {
        List<App> appList = new ArrayList<App>();
        for (int i = 0; i < 10; i++) {
            int index = ((page - 1) * 10 + i + 1);
            App app = new App();
            app.setId("com.chris.app.a" + index);
            app.setName("App-" + index);
            appList.add(app);
        }

        return appList;
    }

}
