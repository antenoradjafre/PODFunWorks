package Trees;

import java.util.HashMap;

/**
 * Created by ANTENOR on 03/05/2015.
 */
public class Node {
    public Node parent;
    public Boolean endOfWord = false; //Does this Node mark the end of a particular word?
    public HashMap<Character,Node> children = new HashMap<Character,Node>();
}
