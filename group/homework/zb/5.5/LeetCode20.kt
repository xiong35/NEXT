import java.util.*
class Solution {
    fun isValid(s: String): Boolean {
        val maps = hashMapOf<Char, Char>()
        maps[')'] = '('
        maps[']'] = '['
        maps['}'] = '{'
        var stack:Stack<Char> = Stack()
        for (char in s)
        {
            if (stack.empty())
            {
                stack.push(char)
                continue
            }
            val top = stack.peek()
            if (top == maps[char])
                stack.pop()
            else
            {
                stack.push(char)
            }
        }
        return stack.empty()
    }
}