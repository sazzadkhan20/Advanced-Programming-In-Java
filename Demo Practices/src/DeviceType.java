public enum DeviceType {
    LIGHT("Smart Light", 60),
    THERMOSTAT("Smart Thermostat", 15),
    CAMERA("Security Camera", 25);

    final String label;
    final int powerRating;
    DeviceType(String l,int pr)
    {
        label = l;
        powerRating = pr;
    }

    int getPowerRating()
    {
        return this.powerRating;
    }

    @Override
    public String toString()
    {
        return this.label + " (Power: " + this.powerRating + "W)";
    }
}