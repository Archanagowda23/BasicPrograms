public class Distance {
    public static void main(String[] args) {

        // parse x- and y-coordinates from command-line arguments

        int x = (args.length > 0) ? Integer.parseInt(args[0]) : 3;
        int y = (args.length > 0) ? Integer.parseInt(args[1]) : 4;

        // compute distance to (0, 0)
        double distance = Math.sqrt(x*x + y*y);

        // output distance
        System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + distance);
    }
}

