package demoj.practice;
public class toosimple {
    public static void main(String[] args) {
        int two = (int) Math.E;
        int three = (int) Math.PI;
        int five = two + three;

        System.out.print((char) ((five + two) * (five * two) + two));
        System.out.print((char) ((five * two) * (five * two) + (three - two)));
        System.out.print((char) ((five * two) * (five * two) + five + three));
        System.out.print((char) ((five * two) * (five * two) + five + three));
        System.out.print((char) ((five * two) * (five * two) + five + three + three));
        System.out.print((char) ((two * two) * (five * two) + two + two));
        System.out.print((char) (three * (five * two) + two));
        System.out.print((char) ((five + three) * (five * two) + five + two));
        System.out.print((char) ((five * two) * (five * two) + five + three + three));
        System.out.print((char) ((five * two) * (five * two) + five + five + two + two));
        System.out.print((char) ((five * two) * (five * two) + five + three));
        System.out.print((char) ((five * two) * (five * two)));
        System.out.print((char) (three * (five * two) + three));
    }
}
