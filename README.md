# Decorator

## Problems

1. Need for adding behaviour to objects during runtime.

## Design Principles

1. Classes should be open to extension, but closed for modification

## Solution

Create abstract Super class. Create concrete components that extend that abstract super class. Create abstract decorator, that extends abstract super class. Create concrete decorators, that extend abstract decorator. Use constructors of those decorators, where instances of conrete components are the parameters.

## Pros

- Easy to extend
- Runtime changes to object's behavior

## Cons

- Bad if your code depends on checks for conrete types.

## Definition

The decorator pattern attaches additional responsibilities to an object _dynamically_.
Flexible alternative to subclassing for extending functionality.
