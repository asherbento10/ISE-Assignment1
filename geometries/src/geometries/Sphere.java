/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometries;

/**
 *
 * @author ssc
 */
public class Sphere {
    Point3D p;
    double radius
            ;

    public Sphere(Point3D p, double radius) {
        this.p = p;
        this.radius = radius;
    }
      public Vector getnormal(Point3D p)
    {
        return p;
    }
    
}
