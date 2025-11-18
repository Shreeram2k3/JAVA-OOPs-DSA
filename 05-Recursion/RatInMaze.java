import java.util.Scanner;

public class RatInMaze {

  static int min = Integer.MAX_VALUE;
  public static boolean solveMaze(int[][]maze,int[][]path,boolean[][]visited,int x, int y, int n , int count)
  {
    if(x==n-1&&y==n-1 && maze[x][y]==0)
    {
      path[x][y]=1;
      visited[x][y]=true;
      count++;
      min = Math.min(min, count);
      return true;
    }

    if(x>=0&& x<n && y>=0 && y<n && maze[x][y]==0&& !visited[x][y])
    {
      path[x][y]=1;
      visited[x][y]=true;

      if (solveMaze(maze, path, visited, x+1, y, n, count+1))return true;
      if(solveMaze(maze, path, visited, x-1, y, n, count+1))return true;
      if(solveMaze(maze, path, visited, x, y+1, n, count+1))return true;
      if(solveMaze(maze, path, visited, x, y-1, n, count+1))return true;

      path[x][y]=0;
      return false;

    }
    return false;

  }
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    int n = inp.nextInt();

    int[][]maze = new int[n][n];
    int[][]path = new int[n][n];
    boolean[][]visited = new boolean[n][n];

    for(int i=0;i<n;i++)for(int j=0;j<n;j++)maze[i][j]=inp.nextInt();

    if(solveMaze(maze,path,visited,0,0,n,0))
    {
      System.out.println("Min steps :"+min);
      for(int i=0;i<n;i++)
      {
        for(int j=0;j<n;j++)
        {
          System.out.print(path[i][j]+" ");
        }
        System.out.println();
      }
    }
    else
    {
      System.out.println("No solution exists");
    }

  }
}
