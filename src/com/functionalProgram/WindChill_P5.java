package com.functionalProgram;

public class WindChill_P5
{
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]); // temperature (F)
        double v = Double.parseDouble(args[1]); // velocity of wind

        // careful to add all three * signs:
        double windChillTemp = 35.74 + (0.6215 * t) + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        if ((t <= 50) && (v <= 120) && (v >= 3))
        {
            System.out.println(windChillTemp); // windchill (F)
        }
    }
}