package org.openshift.mlbparks.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

// Added by MiuAco for OpenShift webhook deploy.
@ApplicationPath("/ws")
public class JaxrsConfig extends Application{

}
