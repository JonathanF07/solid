# Interface Segregation Principle

**Clients should not be forced to depend on interfaces they do not use.**

It's easy to get caught in a trap of naming interfaces or abstract classes after real-world things. The problem with this approach is two-fold: the collection of methods defined in the interface increase as one adds more and more functionality of the object to the code (a violation of the Single Responsibility Principle), and implementations of the interface start to require exceptions to the rules of the interface. Consider the bad example here. It may seem reasonable to create a Messenger interface that outlines the basic features of a messenger app--it can attach videos and it can do a video call. It works for plenty of messengers (like an What's app), but then we want to add Snapchat to our code. The Snapchat is technically a Messenger, but if we set it to implement our Messenger interface, we have to throw an exception for the `attachVideos()` method. The Snapchat should not be forced to depend on an action it cannot perform.

Instead, make interfaces more abstract. It helps adhere to both the SRP (the interface is only responsible for one particular behavior) and this Interface Segregation Principle because specific objects (like What's App and Snapchat) only implement the functionality they need.