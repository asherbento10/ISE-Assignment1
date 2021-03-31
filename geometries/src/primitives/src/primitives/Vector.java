
package primitives;

import static primitives.Util.isZero;


public class Vector {
    private Point3D head;
    private double s1,s2,s3;

    public Vector(Point3D head, double s1, double s2, double s3) {
        this.head = head;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
    
    public double add(Vector v)
    {
        
        return s1+s2+s3;
    }
        public Vector subtract(Vector v)
    {
        return v;
    }
        public Vector scale(double s)
        {
            Vector v=null;
            return v ;
        }
           public Vector crossproduct(Vector v)
    {
        return v;
    }
    public Vector  dotproduct(Vector v)
    {
        return v;
    }
    public double  lengthsquared(double l)
    {
        return l*l;
    }
    public Vector  normalize(Vector v)
    {
        return v;
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Coordinate)) return false;
        Coordinate other = (Coordinate)obj;
        return isZero(other.coord - other.coord);
    }
    
        

}
