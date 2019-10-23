package com.dataStructuresGraph;

public class Main {
    public static void main ( String[] args ) {
//        Graph graph = new Graph ();
//        graph.addNode ( "A" );
//        graph.addNode ( "B" );
//        graph.addNode ( "C" );
//        graph.addEdge ( "A", "B" );
//        graph.addEdge ( "A", "C" );
//        graph.addEdge ( "B", "C" );
////        graph.removeEdge ( "A", "B" );
////        graph.removeNode ( "C" );
//        graph.print ();

////        For traversals;
//         /*A ---> B ---> D;
//         |             |;
//           ---> C <---
//
//          */
//
//         Graph graph = new Graph ();
//         graph.addNode ( "A" );
//         graph.addNode ( "B" );
//         graph.addNode ( "C" );
//         graph.addNode ( "D" );
//         graph.addEdge ( "A", "B" );
//         graph.addEdge ( "B", "D" );
//         graph.addEdge ( "D", "C" );
//         graph.addEdge ( "A", "C" );
////         graph.traverseDepthFirst ( "G" );
////        graph.traverseDepthFirstIter ( "A" );
//        graph.traverseBreadthFirst ( "A" );

////        Topological Sort;
//        Graph graph = new Graph ();
//        graph.addNode ( "X" );
//        graph.addNode ( "A" );
//        graph.addNode ( "B" );
//        graph.addNode ( "P" );
//        graph.addEdge ( "X", "A" );
//        graph.addEdge ( "X", "B" );
//        graph.addEdge ( "A", "P" );
//        graph.addEdge ( "A", "P" );
//        System.out.println (graph.topologicalSort () );

        //Cycle detection in a graph;
        Graph graph = new Graph ();
        graph.addNode ( "A" ); 
        graph.addNode ( "B" );
        graph.addNode ( "C" );
        graph.addEdge ( "B", "C" );
        graph.addEdge ( "A", "B" );
        graph.addEdge ( "A", "C" );
        System.out.println (graph.hasCycle () ); //false
        graph.addEdge ( "C", "A" );
        System.out.println (graph.hasCycle () ); //true






    }
}
