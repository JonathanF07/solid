# Single Responsibility Principle

**Every class should have a single responsibility. There should never be more than one reason for a class to change.**

This example is derived from a problem that I think it's very common. When you receive the feature requisites about something, you usually add all responsibilities to the same class of a feature. The bad example provides a feature called AccountDebit, that's have 3 different responsibilities, which is wrong based on the Single Responsibility principle.

The good example contains 3 different classes, which one with it's own responsibility.