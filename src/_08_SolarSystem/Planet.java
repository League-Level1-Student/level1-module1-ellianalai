package _08_SolarSystem;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Random;

public class Planet {
    /*
     * Member variables
     */
    int x, y, width, height;
    int diameter;
    Color color;
    int distance;
    int orbitalPeriod;
    
    
    
    public Planet(int diameterPixels, Color colors, int dis, int orbit, int moons) {
        this.diameter = diameterPixels;
        this.color = colors;
        this.distance = dis;
        this.orbitalPeriod = orbit;
        for(int i = 0; i<moons;i++) {
        	addMoon();
        }
    }

    public void draw(Graphics g, int numDays) {
        /*
         * Local variables
         * Reassign or remove these after creating the correct member variables
         */
             // You can choose a different scaling than divided by 10
        
       
        
        /*
         * Update position
         */
        double angle = 2 * Math.PI * numDays / orbitalPeriod;
        x = (int)(Math.cos(angle) * distance);
        y = (int)(Math.sin(angle) * distance);
        
        /*
         * Draw orbit
         */
        g.setColor(color);
        g.drawOval(SolarSystem.CENTER_X - distance,
                   SolarSystem.CENTER_Y - distance,
                   2*distance, 2*distance);
        
        /*
         * Draw planet
         */
        int centerX = SolarSystem.CENTER_X + x;
        int centerY = SolarSystem.CENTER_Y + y;
        g.setColor(color);
        g.fillOval(centerX - (diameter/2), centerY - (diameter/2), diameter, diameter);
        
        /*
         * Draw moons, if any
         */
        for( int i = 0; i < moons.size(); i++ ) {
            Moon moon = moons.get(i);
            
            if( i == 0 ) {
                g.drawOval(centerX - moon.distPlanetToMoon, centerY - moon.distPlanetToMoon,
                           2*moon.distPlanetToMoon, 2*moon.distPlanetToMoon);
            }

            moon.draw(g, numDays, centerX, centerY);
        }
    }
    
    
    ArrayList<Moon> moons = new ArrayList<>();
    
    public void addMoon() {
        moons.add(new Moon());
    }
    
    class Moon {
        Color moonColor;
        int numMoons, moonDiameter, distPlanetToMoon, moonDaysToOrbit, daysOffset;
        
        public Moon() {
            Random rand = new Random();
            this.moonColor = Color.WHITE;
            this.moonDiameter = 10;
            this.distPlanetToMoon = (diameter/2) + 10;
            this.moonDaysToOrbit = 50;                 // arbitrarily chosen
            this.daysOffset = rand.nextInt(365);
        }
        
        public void draw(Graphics g, int days, int planetX, int planetY) {
            int numDays = daysOffset + days;
            double angle = 2 * Math.PI * numDays / moonDaysToOrbit;
            int moonX = (int)(Math.cos(angle) * distPlanetToMoon);
            int moonY = (int)(Math.sin(angle) * distPlanetToMoon);
            
            g.setColor(moonColor);
            g.fillOval(planetX - (moonDiameter/2) + moonX, planetY - (moonDiameter/2) + moonY, moonDiameter, moonDiameter);
        }
    }
}
