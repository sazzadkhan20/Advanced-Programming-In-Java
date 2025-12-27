public enum Planet {
    Earth(10.5,2.5),
    Jupiter(15.3,5.1),
    Venus(17.6,6.3);
    double mass,radius;
    Planet(double mass,double radius)
    {
        this.mass = mass;
        this.radius = radius;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getMass() {
        return this.mass;
    }
    public double getRadius() {
        return this.radius;
    }
    public double surface_gravity()
    {
        return (this.mass*10000)/this.radius;
    }
}
