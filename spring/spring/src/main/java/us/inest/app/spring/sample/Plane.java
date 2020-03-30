package us.inest.app.spring.sample;

public class Plane {
    private RouteFinder routeFinder;

    public void routeCheck() {
        routeFinder.findRoute();
    }

    public RouteFinder getRouteFinder() {
        return routeFinder;
    }

    public void setRouteFinder(RouteFinder routeFinder) {
        System.out.println("Inside setter method in Plane class");
        this.routeFinder = routeFinder;
    }

}
