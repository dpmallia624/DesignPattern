```plantUml

@startuml
title "Strategy Pattern"
'Strategy pattern define a family of algorithms, encapsulated each one and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it'

interface TravelStrategy {
    travel()
}

TravelStrategy <|-- CarTravelStrategy
TravelStrategy <|-- CycleTravelStrategy
TravelStrategy <|-- WalkTravelStrategy


class CarTravelStrategy {
    + travel()
}

class CycleTravelStrategy {
    + travel()
}

class WalkTravelStrategy {
    + travel()
}

class TravelPlanner {
    TravelStrategy
    + planTravel()
}

TravelPlanner -right-> TravelStrategy
@enduml
```