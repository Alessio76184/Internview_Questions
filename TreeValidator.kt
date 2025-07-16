// Given an array like ["(1,2)", "(3,2)", "(2,4)"], return "true" if this represents a valid binary tree, "false" otherwise.
//Example results: ArrayChallenge(arrayOf("(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)")) ➞ "true"
//Example results ArrayChallenge(arrayOf("(1,2)", "(3,2)", "(2,12)", "(5,2)")) ➞ "false"


fun ArrayChallenge(strArr: Array<String>): String {
    // Node structure with parent and two children (for binary tree)
    class Node(val value: Int) {
        var parent: Node? = null
        var left: Node? = null
        var right: Node? = null
    }

    val nodes = mutableMapOf<Int, Node>()

    for (pair in strArr) {
        val cleaned = pair.removePrefix("(").removeSuffix(")")
        val (childVal, parentVal) = cleaned.split(",").map { it.trim().toInt() }

        val child = nodes.getOrPut(childVal) { Node(childVal) }
        val parent = nodes.getOrPut(parentVal) { Node(parentVal) }

        // If child already has a parent, it's invalid
        if (child.parent != null) return "false"
        child.parent = parent

        // Assign left or right child
        if (parent.left == null) {
            parent.left = child
        } else if (parent.right == null) {
            parent.right = child
        } else {
            return "false" // Invalid: more than 2 children
        }
    }

    // Valid tree must have exactly one root (no parent)
    val roots = nodes.values.filter { it.parent == null }
    return if (roots.size == 1) "true" else "false"
}
