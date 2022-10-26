If there is a common code in many of the child classes, extract that behaviour,
declare those methods in an interface called strategy, let those special 
strategies can be implemented in concrete classes. 

The original class, called context, must have a field for storing a reference to one
of the strategies. The context delegates the work to a linked strategy object instead of
executing it on its own.


The context isn’t responsible for selecting an appropriate algorithm for the job. 
Instead, the client passes the desired strategy to the context. In fact, the context
doesn’t know much about strategies. It works with all strategies through the same 
generic interface, which only exposes a single method for triggering the algorithm 
encapsulated within the selected strategy.

https://refactoring.guru/design-patterns/strategy

https://www.youtube.com/watch?v=u8DttUrXtEw&list=PL6W8uoQQ2c61X_9e6Net0WdYZidm7zooW&index=21