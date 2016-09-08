# Bridge 
> The bridge pattern is useful when both the class and what it does vary often. The class itself can be thought of as the abstraction and what the class can do as the implementation. The bridge pattern can also be thought of as two layers of abstraction.

So when we have something like:
<pre>
                   ----Shape---
                  /            \
         Rectangle              Circle
        /         \            /      \
BlueRectangle  RedRectangle BlueCircle RedCircle
 </pre>

We can refactor it to:
 <pre>
          ----Shape--- . . . . . . . . . . >  Color
         /            \                       /   \
Rectangle(Color)   Circle(Color)           Green  Red
</pre>

Here, the abstract class Shape creates a bridge with the Color interface. As a result, the two inheritance trees of shape and color can evolve independently, without heavy coupling on one another and without having a huge inheritance tree with classes such as RedRectangle and GreenCircle. 

[More](https://en.wikipedia.org/wiki/Bridge_pattern)