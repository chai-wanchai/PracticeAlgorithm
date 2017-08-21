/*
Stockbrokers are known to overreact to rumours. You have been contracted to develop a method of spreading disinformation amongst the stockbrokers 
to give your employer the tactical edge in the stock market. For maximum effect, you have to spread the rumours in the fastest possible way. 

Unfortunately for you, stockbrokers only trust information coming from their "Trusted sources" This means you have to take into account 
the structure of their contacts when starting a rumour. It takes a certain amount of time for a specific stockbroker to pass the rumour on 
to each of his colleagues. Your task will be to write a program that tells you which stockbroker to choose as your starting point for the rumour, 
as well as the time it will take for the rumour to spread throughout the stockbroker community. 
This duration is measured as the time needed for the last person to receive the information.
Input
Your program will input data for different sets of stockbrokers. Each set starts with a line with the number of stockbrokers.
Following this is a line for each stockbroker which contains the number of people who they have contact with, who these people are, 
and the time taken for them to pass the message to each person. The format of each stockbroker line is as follows: 
The line starts with the number of contacts (n), followed by n pairs of integers, one pair for each contact. 
Each pair lists first a number referring to the contact (e.g. a '1' means person number one in the set), 
followed by the time in minutes taken to pass a message to that person. There are no special punctuation symbols or spacing rules. 

Each person is numbered 1 through to the number of stockbrokers. The time taken to pass the message on will be between 1 and 10 minutes (inclusive), 
and the number of contacts will range between 0 and one less than the number of stockbrokers. The number of stockbrokers will range from 1 to 100. 
The input is terminated by a set of stockbrokers containing 0 (zero) people. 

Output
For each set of data, your program must output a single line containing the person who results in the fastest message transmission, 
and how long before the last person will receive any given message after you give it to this person, measured in integer minutes. 
It is possible that your program will receive a network of connections that excludes some persons, i.e. some people may be unreachable. 
If your program detects such a broken network, simply output the message "disjoint". 
Note that the time taken to pass the message from person A to person B is not necessarily the same as the time taken to pass it from B to A, 
if such transmission is possible at all.
Sample Input
3
2 2 4 3 5
2 1 2 3 6
2 1 2 2 2
5
3 4 4 2 8 5 3
1 5 8
4 1 6 4 10 2 7 5 2
0
2 2 5 1 5
0
Sample Output
3 2
3 10
*/
import java.util.*;

public class C_Stockbroker_Grapevine  {

    static HashMap<Integer, HashMap<Integer, Integer>> adjacencyList = new HashMap<Integer, HashMap<Integer, Integer>>();
    static int numberOfBrokers;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            numberOfBrokers = sc.nextInt();

            if (numberOfBrokers == 0) {
                break;
            }

            // goto next line
            sc.nextLine();

            for (int i = 0; i < numberOfBrokers; i++) {

                String elements[] = sc.nextLine().split(" ");
                //  String[]  = line;
                int pairs = Integer.parseInt(elements[0]);

                for (int j = 1; j < 2 * pairs; j += 2) {
                    int node = Integer.parseInt(elements[j]);
                    int cost = Integer.parseInt(elements[j + 1]);

                    addOrUpdateEdge(i, node - 1, cost);
                }
            }

            printResult();
            adjacencyList = new HashMap<Integer, HashMap<Integer, Integer>>();
        }
    }

    static void printResult() {
        double[][] shortestPaths = floydWarshall(numberOfBrokers);
        int lastNode = 0;
        double lastCost = Double.POSITIVE_INFINITY;

        for (int i = 0; i < shortestPaths.length; i++) {
            double lastCostInRow = shortestPaths[i][0];

            for (int j = 0; j < shortestPaths[i].length; j++) {
                if (shortestPaths[i][j] > lastCostInRow) {
                    lastCostInRow = shortestPaths[i][j];
                }
            }

            if (lastCostInRow < lastCost) {
                lastCost = lastCostInRow;
                lastNode = i;
            }
        }

        if (lastCost == Double.POSITIVE_INFINITY) {
            System.out.println("disjoint");
        } else {
            System.out.println((lastNode + 1) + " " + (int) lastCost);
        }
    }

    static void addOrUpdateEdge(int from, int to, int weight) {
        if (adjacencyList.containsKey(from)) {
            adjacencyList.get(from).put(to, weight);
        } else {
            HashMap<Integer, Integer> edges = new HashMap<Integer, Integer>();
            edges.put(to, weight);
            adjacencyList.put(from, edges);
        }
    }

    static double[][] floydWarshall(int n) {
        double[][] distances = new double[n][n];

        // initialize the distances matrix from the adjacencyList
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    distances[i][j] = 0;
                } else {
                    if (adjacencyList.containsKey(i)) {
                        if (adjacencyList.get(i).containsKey(j)) {
                            distances[i][j] = adjacencyList.get(i).get(j);
                        } else {
                            distances[i][j] = Double.POSITIVE_INFINITY;
                        }
                    } else {
                        distances[i][j] = Double.POSITIVE_INFINITY;
                    }
                }
            }
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    distances[i][j] = Math.min(distances[i][j], distances[i][k] + distances[k][j]);
                }
            }
        }

        return distances;
    }

}
