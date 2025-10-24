package ex11;
    public class Circle {
        public double radius = 1.0;
        public String color = "red";

        public Circle(){
        }
        public Circle(double r ){
        }
        public double getRadius(){
            return radius;
        }
        public double getArea(){
            double area=radius*radius*Math.PI;
            return area;
        }

}
