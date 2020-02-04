# Observer

## Problem

1. When multiple entities need to be up-to-date from a single source of truth. Whenever there is a change in a state, the dependent entities need to be informed about it.

## Design Principles

1. Strive for _loosely coupled_ designs

## Solution

Create 2 entities. _Subject_ and _Observer_.

- _Subject_ is the single source of truth. This is where state is kept and from here all _observers_ are informed about changes.
  _Subject_ needs to implement at least 3 following methods:
  registerObserver()
  removeObserver()
  notifyObservers()

- _Observer_ is an entity that listens for changes from the _Subject_.
  _Observer_ must implement at least 1 method:
  update()

## Pros

- Loose coupling
- Composition

## Disadvantages

- Inheritance is required
