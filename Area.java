public class Area {


        public static void main(String[] args) {
            area(5.0);
            area(4,5);
        }

        public static double area (double radius){
            if (radius < 0){
                return -1.0;
            }
            double PI= Math.PI;
            double area = PI * radius * radius;
            System.out.println("Circle Area:" + area);
            return area;

        }

        public static double area (double x, double y){
            if (x<0 || y<0){
                return -1.0;
            }

            double area = x * y;
            System.out.println("Rectangle Area:" + area);
            return area;
        }

    }


