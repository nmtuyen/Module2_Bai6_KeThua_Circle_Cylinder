public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder(double height, double radius){
        this.height = height;
        setRadius(radius);
    }

    private double getHeight() {
        return height;
    }

    private void setHeight(double height) {
        this.height = height;
    }

    public double getArea(double radius, double height){
        return 2*Math.PI*super.getRadius()*super.getRadius()+2*Math.PI*super.getRadius();
    }
    public double getVolume(double radius, double height){
        return Math.PI*radius*radius*height;
    }
    public String toString(){
        return "Hình trụ có bán kính "+getRadius()+ "có diện tích là "+ getArea(super.radius, height);
    }
}
