Preliminary
===========
Linked lists are among the simplest and most common data structures. Their applications can range from simple to much more challenging. In general, a good linked list implementation should provide <B>O(n)</B> for indexing, <B>O(1)</B>insertion/deletion at beginning and end, search time + <B>O(1)</B> for insertion/deletion in middle. 



Applications
============
<ol>
<li>For representing Polynimials
It means in addition/subtraction /multipication.. of two polynimials.
Eg: p1=2x^2+3x+7, p2=3x^3+5x+2 or p1+p2=3x^3+2x^2+8x+9</li>
<li>In Dynamic Memory Management
Eg: in allocation and releasing memory at runtime.</li>
<li>In Symbol Tables
Eg: in Balancing paranthesis</li>
<li>Representing Sparse Matrix</li>
</ol>



Check Balanced Parentheses
==========================
Given a string of opening and closing parentheses, check whether it’s balanced. We have 4 types of parentheses: round brackets: (), square brackets: [], curly brackets: {}, and angular brackets: <>. Assume that the string doesn’t contain any other character than these, no spaces words or numbers. Just to remind, balanced parentheses require every opening parenthesis to be closed in the reverse order opened. For example ‘([])’ is balanced but ‘([)]‘ is not.

This is another data structure question, if we use the correct one it’s pretty straightforward. We scan the string from left to right, and every time we see an opening parenthesis we push it to a stack, because we want the last opening parenthesis to be closed first. Then, when we see a closing parenthesis we check whether the last opened one is the corresponding closing match, by popping an element from the stack. If it’s a valid match, then we proceed forward, if not return false. Or if the stack is empty we also return false, because there’s no opening parenthesis associated with this closing one. In the end, we also check whether the stack is empty. If so, we return true, otherwise return false because there were some opened parenthesis that were not closed. 

