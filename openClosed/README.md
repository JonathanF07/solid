# Open/Closed Principle

**Software entitites should be open for extension, but closed for modification**

I choose this example because it's a mistake that a lot of guys do. This principle teaches us how coded in the right way, avoiding adding a lot of cyclomatic complexity in the code. The bad example show us the easy way to add an extension, simply adding a 'if' statement.

The good example uses an interface to control which payment method will be used, removing this responsibility from the Purchase class.