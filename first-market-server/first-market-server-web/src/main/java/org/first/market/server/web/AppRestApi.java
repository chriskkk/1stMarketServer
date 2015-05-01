package org.first.market.server.web;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.resource.Singleton;

@Singleton
@Path("/app")
public class AppRestApi {
	@GET
	@Path("/list/{page}")
	@Produces({ MediaType.APPLICATION_JSON })
	public List<App> list(@PathParam("page") int page) {
		List<App> appList = new ArrayList<App>();
		for (int i = 0; i < 10; i++) {
			int index = ((page - 1) * 10 + i + 1);
			App app = new App();
			app.setId("org.chris.app.a" + index);
			app.setName("App-" + index);
			appList.add(app);
		}
		
		return appList;
	}
	
	class App {
		String id;
		String name;
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	}
}
