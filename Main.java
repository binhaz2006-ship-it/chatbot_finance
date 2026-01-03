import java.io.*;
import java.util.*;
    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
            StringTokenizer st = new StringTokenizer (br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int [][] a = new int[n][m];
            for (int i=0;i < n;i++) {
                st = new StringTokenizer(br.readLine());
                for (int j=0;j < m; j++)
                    a[i][j] = Integer.parseInt(st.nextToken());}
            for ( int i=0;i < n ; i++)
                System.out.println(Arrays.toString(a[i]));
        }
    static int [] dx = {-1, 1, 0 , 0};
    static int [] dy = { 0, 0, -1, 1};
        static class Node {
            int x,y, dist;
            Node(int x, int y, int dist)
            {
                this.x = x;
                this.y = y;
                this.dist = dist;
            }
        }
        static boolean isBorder ( int x,int y,int n, int m) {
            return x == 0 || x == n-1 || y == 0 || y == m-1;
        }
        if (a[x][y] == 1) {
            System.out.println(-1);
            return;
        }
Queue<Node> q = new ArrayDeque<>();
q.add( new Node(x,y,0));
vis[r][c] = true;
while (!q.isEmpty()) {
        Node cur = q.poll();
        if ( isBorder (cur.x, cur.y)) {
            System.out.println(cur.dist +1);
            return;
        }
}
for (int k = 0; k <4; k++) {
    int nx = cur.x + dx[k];
    int ny = cur.y + dy[k];
}
      if (nx >= 0 && nx < n && ny>=0 && ny < m) {
        
      }
    }
    /* 
        }
    }

    import java.io.*;
    import java.util.*;

    public class Main {
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st;
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[][] a = new int[n][m];

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < m; j++) {
                    a[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            // Test
            for (int i = 0; i < n; i++) {
                System.out.println(Arrays.toString(a[i]));
            }
        }
    } */
/*import java.io.*;
import java.util.*;

public class Main {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
    }

    static int n, m;
    static int[][] a;
    static boolean[][] vis;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x, y, d;
        Node(int x, int y, int d) {
            this.x = x;
            this.y = y;
            this.d = d;
        }
    }

    static boolean isBorder(int x, int y) {
        return x == 0 || x == n - 1 || y == 0 || y == m - 1;
    }

    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner();

        n = fs.nextInt();
        m = fs.nextInt();
        int r = fs.nextInt() - 1; // 0-based
        int c = fs.nextInt() - 1;

        a = new int[n][m];
        vis = new boolean[n][m];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = fs.nextInt();

        // ô xuất phát là tường
        if (a[r][c] == 1) {
            System.out.println(-1);
            return;
        }

        Queue<Node> q = new ArrayDeque<>();
        q.add(new Node(r, c, 0));
        vis[r][c] = true;

        while (!q.isEmpty()) {
            Node cur = q.poll();

            // đang ở biên → thêm 1 bước để thoát
            if (isBorder(cur.x, cur.y)) {
                System.out.println(cur.d + 1);
                return;
            }

            for (int k = 0; k < 4; k++) {
                int nx = cur.x + dx[k];
                int ny = cur.y + dy[k];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    if (!vis[nx][ny] && a[nx][ny] == 0) {
                        vis[nx][ny] = true;
                        q.add(new Node(nx, ny, cur.d + 1));
                    }
                }
            }
        }

        System.out.println(-1);
    }
}*/
