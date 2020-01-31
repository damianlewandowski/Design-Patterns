# Strategy

## Problems

1. If there are a lot of classes extending one super class and you add some behaviour to the super class, you may miss the fact, that some of the extending classes do not need this behaviour. You create this way a lot of unnecesary functionality in those classes.
   Also those classes could completely not need it and it could be downright wrong to have such behavior (Rubber duck with fly method)
2. Often changes. You always want to make changes in as few places as possible. During development there will always be changes. If you make methods abstract, or create interfaces, you will have to change code in a lot of places on every change.

## Design Principles

1. Zero on the problem
   Identify the aspects of your application that vary and seperate them from what stays the same.
   _Explaination_:
   If you have some part of application that changes often (e.g. when client asks for constant changes) you should seperate this part of application from what stays the same.

2. Program to an interface, not an implementation
   Use polymorphism. Client holds references to interfaces.
   _Explaination_:
   If you have some behaviour that varies a lot among classes from the same hierrarchy tree, you should abstract it away into seperate interface and classes that implement this interface.(QuackBehavior -> Quack, QuackSqueeze, etc.)

3. Favour composition over inheritance
   Composition is great. This is the way.
   Instead of inheriting behaviour, the ducks get their behaviour by being _composed_ with the right _behaviour_
   _It lets you encapsulate a family of algorithms into their own set of classes AND change behaviour at runtime._

## Solution

Create _Behaviour_ interfaces and classes that implement this behaviour. Then by composition add to your superclass instances of those classes. Tada!

## Pros

- Maintainability
- Composibility
- Encapsulation
- No repetition of the same logic among classes from completely different inheritance trees.

## Definition

The strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
Strategy lets the algorithms vary independently from the clients that use them.
