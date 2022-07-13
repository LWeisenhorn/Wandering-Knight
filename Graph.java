public class Graph {
    class Edge {
       int source, destination;
    }
    int vertices, edges;
    Edge[] edge;
    Graph(int vertices, int edges) {
       this.vertices = vertices;
       this.edges = edges;
       edge = new Edge[edges];
       for(int i = 0; i < edges; i++) {
          edge[i] = new Edge();
       }
    }
    public Graph() {
    }
    int boardSize = 8; // Dim of chessboard

    private void findConnections() {
        int vertices_count = boardSize ^ 2;
       int edges_count = 336; // adjust based on vertice count

       Graph graph_object = new Graph(vertices_count, edges_count);
       System.out.println("A graph object is defined.");
        int edgeCounter = 0;
        for(int xCoor = 0; xCoor < boardSize; xCoor++) {
            for(int yCoor = 0; yCoor < boardSize; yCoor++) {
                int vertexNum = calculateVertexNum(xCoor, yCoor);

                if((xCoor + 2 <= boardSize - 1) && (yCoor + 1 <= boardSize - 1)) {
                    int vertexDest = calculateVertexNum(xCoor + 2, yCoor + 1);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor + 2 <= boardSize - 1) && (yCoor - 1 >= 0)) {
                    int vertexDest = calculateVertexNum(xCoor + 2, yCoor - 1);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor + 1 <= boardSize - 1) && (yCoor + 2 <= boardSize - 1)) {
                    int vertexDest = calculateVertexNum(xCoor + 1, yCoor + 2);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor + 1 <= boardSize - 1) && (yCoor - 2 >= 0)) {
                    int vertexDest = calculateVertexNum(xCoor + 1, yCoor - 2);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor - 1 >= 0) && (yCoor + 2 <= boardSize - 1)) {
                    int vertexDest = calculateVertexNum(xCoor - 1, yCoor + 2);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor - 1 >= 0) && (yCoor - 2 >= 0)) {
                    int vertexDest = calculateVertexNum(xCoor - 1, yCoor - 2);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor - 2 >= 0) && (yCoor + 1 <= boardSize - 1)) {
                    int vertexDest = calculateVertexNum(xCoor - 2, yCoor + 1);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }
                if((xCoor - 2 >= 0) && (yCoor - 1 >= 0)) {
                    int vertexDest = calculateVertexNum(xCoor - 2, yCoor - 1);
                    graph_object.edge[edgeCounter].source = vertexNum;
                    graph_object.edge[edgeCounter].destination = vertexDest;
                    edgeCounter++;
                }

            }
        }

        for(int i = 0; i < edges_count; i++) {
            System.out.println(graph_object.edge[i].source + " - " + graph_object.edge[i].destination);
         }
    }

    private int calculateVertexNum(int x, int y) {
        return 8 * x + y;
    }
    private int calculateVertexXCoor(int vertexNum) {
        return vertexNum / 8;
    }
    private int calculateVertexYCoor(int vertexNum) {
        return vertexNum - (8 * calculateVertexXCoor(vertexNum));
    }
    public void chessGraph() {
        return;
    }
    public static void main(String[] args) {
        Graph g = new Graph();
        g.findConnections();
    }

 }