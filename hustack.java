import java.util.*;

@SuppressWarnings({"unchecked", "deprecation"})
public class Main { 
    static int n, m;
    static int[][] a;
    static boolean[][] visited;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x, y, dist;
        Node(int x, int y, int dist) {
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    static boolean isBorder(int x, int y) {
        return x == 0 || x == n - 1 || y == 0 || y == m - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();
        int r = sc.nextInt() - 1; // 0-based
        int c = sc.nextInt() - 1;

        a = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();

        // ô xuất phát là tường
        if (a[r][c] == 1) {
            System.out.println(-1);
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(new Node(r, c, 0));
        visited[r][c] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            // đang ở biên → thêm 1 bước để ra ngoài
            if (isBorder(cur.x, cur.y)) {
                System.out.println(cur.dist + 1);
                return;
            }

            for (int k = 0; k < 4; k++) {
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!visited[nx][ny] && a[nx][ny] == 0) {
                        visited[nx][ny] = true;
                        q.add(new Node(nx, ny, cur.dist + 1));
                    }
                }
            }
        }

        // không thoát được
        System.out.println(-1);
    }
}
