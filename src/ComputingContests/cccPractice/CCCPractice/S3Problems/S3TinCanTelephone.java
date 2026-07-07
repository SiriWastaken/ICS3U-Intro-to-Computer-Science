import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3TinCanTelephone {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] first = input.readLine().split(" ");

        int rx = Integer.parseInt(first[0]);
        int ry = Integer.parseInt(first[1]);
        int jx = Integer.parseInt(first[2]);
        int jy = Integer.parseInt(first[3]);

        int buildingsBlocking = 0;

        int numBuildings = Integer.parseInt(input.readLine());

        for (int i = 0; i < numBuildings; i++) {

            String[] line = input.readLine().split(" ");
            int corners = Integer.parseInt(line[0]);

            int[] x = new int[corners];
            int[] y = new int[corners];

            for (int j = 0; j < corners; j++) {
                x[j] = Integer.parseInt(line[1 + 2 * j]);
                y[j] = Integer.parseInt(line[2 + 2 * j]);
            }

            boolean blocked = false;

            for (int j = 0; j < corners; j++) {

                int next = (j + 1) % corners;

                if (intersects(
                        rx, ry,
                        jx, jy,
                        x[j], y[j],
                        x[next], y[next])) {

                    blocked = true;
                }
            }

            if (blocked)
                buildingsBlocking++;
        }
        System.out.println(buildingsBlocking);
    }

    static int orientation(int ax, int ay, int bx, int by, int cx, int cy) {
        int val = (bx - ax) * (cy - ay) - (by - ay) * (cx - ax);

        if (val == 0)
            return 0;
        return (val > 0) ? 1 : 2;
    }

    static boolean onSegment(int ax, int ay, int bx, int by, int cx, int cy) {
        return cx <= Math.max(ax, bx) && cx >= Math.min(ax, bx) &&
                cy <= Math.max(ay, by) && cy >= Math.min(ay, by);
    }

    static boolean intersects(
            int ax, int ay, int bx, int by,
            int cx, int cy, int dx, int dy) {

        int o1 = orientation(ax, ay, bx, by, cx, cy);
        int o2 = orientation(ax, ay, bx, by, dx, dy);
        int o3 = orientation(cx, cy, dx, dy, ax, ay);
        int o4 = orientation(cx, cy, dx, dy, bx, by);

        if (o1 != o2 && o3 != o4)
            return true;

        if (o1 == 0 && onSegment(ax, ay, bx, by, cx, cy))
            return true;
        if (o2 == 0 && onSegment(ax, ay, bx, by, dx, dy))
            return true;
        if (o3 == 0 && onSegment(cx, cy, dx, dy, ax, ay))
            return true;
        if (o4 == 0 && onSegment(cx, cy, dx, dy, bx, by))
            return true;

        return false;
    }

}
